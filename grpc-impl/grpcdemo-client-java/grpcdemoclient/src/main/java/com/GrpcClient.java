package com;

import com.javastub.grpc.UserServiceGrpc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;


import com.javastub.grpc.User;
import com.javastub.grpc.User.LoginRequest;
import com.javastub.grpc.User.LoginResponse;
import com.javastub.grpc.User.StreamRequest;
import com.javastub.grpc.User.StreamResponse;
import com.javastub.grpc.UserServiceGrpc.UserServiceBlockingStub;
import com.javastub.grpc.UserServiceGrpc.UserServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GrpcClient {

    public static void main(String [] args) throws InterruptedException{
        System.out.println("inside main client");
        CountDownLatch latch = new CountDownLatch(1);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
        // UserServiceBlockingStub userStub =  UserServiceGrpc.newBlockingStub(channel); //blocking stub for unary (sync) call

        // LoginRequest req = LoginRequest.newBuilder().setUsername("hello").setPassword("hello").build();
        // LoginResponse resp = userStub.login(req);

        // System.out.println("this is the response from the server : " + resp.getMessage() +" " + resp.getSuccess());

        UserServiceStub userStreamStub = UserServiceGrpc.newStub(channel);
        StreamRequest req = StreamRequest.newBuilder().setName("Test").setStart(true).build();
        userStreamStub.getLiveUpdates(req, new StreamObserver<User.StreamResponse>() {

            @Override
            public void onCompleted() {
                System.out.println("Server completed");
                latch.countDown();
            }

            @Override
            public void onError(Throwable resp) {
                System.out.println("this is the stream error message : " + resp);
                latch.countDown();
            }

            @Override
            public void onNext(User.StreamResponse resp) {

                System.out.println("this is the stream message with success : "  + resp.getStatus() + " : " + resp.getData());

            }

        });
            // latch.await(30, TimeUnit.SECONDS);
            latch.await();
            channel.shutdown();
    }

}
