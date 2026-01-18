package com;

import com.javastub.grpc.UserServiceGrpc;

import java.util.concurrent.CountDownLatch;


import com.javastub.grpc.User;
import com.javastub.grpc.User.BidirectionalStreamReq;
import com.javastub.grpc.User.BidirectionalStreamResp;
import com.javastub.grpc.User.ClientStreamingReq;
import com.javastub.grpc.User.ClientStreamingResp;
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
    

        //unary
        UserServiceBlockingStub userStub =  UserServiceGrpc.newBlockingStub(channel); //blocking stub for unary (sync) call
        LoginRequest req = LoginRequest.newBuilder().setUsername("hello").setPassword("hello").build();
        LoginResponse resp = userStub.login(req);
        System.out.println("this is the response from the server : " + resp.getMessage() +" " + resp.getSuccess());



        //server streaming
        UserServiceStub userStreamStub = UserServiceGrpc.newStub(channel); //async new stub
        // StreamRequest streamReq = StreamRequest.newBuilder().setName("Test").setStart(true).build();
        // userStreamStub.getLiveUpdates(streamReq, new StreamObserver<StreamResponse>() {

        //     @Override
        //     public void onCompleted() {
        //         System.out.println("Server completed");
        //         latch.countDown();
        //     }

        //     @Override
        //     public void onError(Throwable r) {
        //         System.out.println("this is the stream error message : " + r);
        //         latch.countDown();
        //     }

        //     @Override
        //     public void onNext(StreamResponse r) {
        //         System.out.println("this is the stream data with success : "  + r.getStatus() + " : " + r.getData());
        //     }

        // });
        //     latch.await();
        //     channel.shutdown();



        // // client streaming
        // StreamObserver<ClientStreamingResp> resObserver = new StreamObserver<ClientStreamingResp>() {

        //     @Override
        //     public void onCompleted() {
        //         System.out.println("Stream completed");
        //         latch.countDown();
        //         channel.shutdown();
        //     }

        //     @Override
        //     public void onError(Throwable arg0) {
        //         latch.countDown();
        //         channel.shutdown();
        //         System.out.println("Error from the server : " + arg0.getMessage());
        //     }

        //     @Override
        //     public void onNext(ClientStreamingResp arg0) {
        //         System.out.println("the total value is = " + arg0.getTotalValue());
        //         System.out.println("the status is = " + arg0.getStatus());
        //     }
            
        // };
        
        // StreamObserver<ClientStreamingReq> streamObsReq =  userStreamStub.clientStreamingExample(resObserver);

        // // send the stream of req
        // try{
        //     streamObsReq.onNext(ClientStreamingReq.newBuilder().setPrice(10).setQuantity(1).setStatus(true).build());
        //     streamObsReq.onNext(ClientStreamingReq.newBuilder().setPrice(20).setQuantity(2).setStatus(true).build());
        //     streamObsReq.onNext(ClientStreamingReq.newBuilder().setPrice(30).setQuantity(3).setStatus(true).build());
        //     streamObsReq.onCompleted();
        //     latch.await();
            
        // }catch(Exception e)
        // {
        //     System.out.println("Error in sending request");
        // }



        //bi-directional streaming
        StreamObserver<BidirectionalStreamResp> resObserver = new StreamObserver<BidirectionalStreamResp>() {

            @Override
            public void onCompleted() {
                System.out.println("Stream completed");
                latch.countDown();
                channel.shutdown();
            }

            @Override
            public void onError(Throwable arg0) {
                latch.countDown();
                channel.shutdown();
                System.out.println("Error from the server : " + arg0.getMessage());
            }

            @Override
            public void onNext(BidirectionalStreamResp arg0) {
                System.out.println("the data is = " + arg0.getResponseData());
                System.out.println("the time of receiving is = " + arg0.getTimestamp());
                System.out.println("the status is = " + arg0.getStatus()+"\n");

            }
            
        };

        StreamObserver<BidirectionalStreamReq> biStreamObsReq = userStreamStub.bidirectionalStream(resObserver);

        try{

            biStreamObsReq.onNext(BidirectionalStreamReq.newBuilder().setRequestData("1").build());
            biStreamObsReq.onNext(BidirectionalStreamReq.newBuilder().setRequestData("2").build());
            biStreamObsReq.onNext(BidirectionalStreamReq.newBuilder().setRequestData("3").build());
            biStreamObsReq.onCompleted();
            latch.await();
        }catch(Exception e){System.out.println("Error : " + e.getMessage());}


    }

}
