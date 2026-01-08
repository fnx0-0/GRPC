package com;

import com.javastub.grpc.UserServiceGrpc;
import com.javastub.grpc.User.LoginRequest;
import com.javastub.grpc.User.LoginResponse;
import com.javastub.grpc.UserServiceGrpc.UserServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String [] args){
        System.out.println("inside main client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
        UserServiceBlockingStub userStub =  UserServiceGrpc.newBlockingStub(channel);

        LoginRequest req = LoginRequest.newBuilder().setUsername("hello").setPassword("hello").build();
        LoginResponse resp = userStub.login(req);

        System.out.println("this is the response from the server : " + resp.getMessage() +" " + resp.getSuccess());


    }

}
