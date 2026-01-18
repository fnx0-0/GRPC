package com.userImpl;


import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import io.grpc.Status;

import com.javastub.grpc.User.BidirectionalStreamReq;
import com.javastub.grpc.User.BidirectionalStreamResp;
import com.javastub.grpc.User.ClientStreamingReq;
import com.javastub.grpc.User.ClientStreamingResp;
import com.javastub.grpc.User.LoginResponse;
import com.javastub.grpc.User.LogoutResponse;
import com.javastub.grpc.User.StreamResponse;
import com.javastub.grpc.User.StreamResponseOrBuilder;
import com.javastub.grpc.UserServiceGrpc.UserServiceImplBase;

public class UserServiceImpl extends UserServiceImplBase {


    @Override
    public void login(com.javastub.grpc.User.LoginRequest request,  io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver){

        System.out.println("Entering login");
        String username = request.getUsername();
        String password = request.getPassword();

        LoginResponse.Builder response  = LoginResponse.newBuilder();
        
        
        if(password.length() > 0 && username.length()>0)
        {
             response.setMessage("Login Success ").setSuccess(true);
        //   wont be possible as this is used under blocking stub used for unary calls(Sync)  
        //   try{
        //     for(int i=0 ; i<3 ; i++){
        //         response.setMessage("Login Success " + i).setSuccess(true);
        //         responseObserver.onNext(response.build());
        //         TimeUnit.SECONDS.sleep(1);
        //     }
        // }catch(Exception e){
        //     response.setMessage("Login Failed").setSuccess(false);
        //     responseObserver.onNext(response.build());
        // }
        }
             
        else{
            response.setMessage("Login Failed").setSuccess(false);
        }

        responseObserver.onNext(response.build());// onNext is used to send the response back to client


        responseObserver.onCompleted(); // specify this when the response is completed or sent back to client to close the call
    }

    @Override
    public void logout(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {

            LogoutResponse msg = LogoutResponse.newBuilder().setMessage("Logout Success").build();

            responseObserver.onNext(msg);
            responseObserver.onCompleted();
    }
    
    @Override
    public void getLiveUpdates(com.javastub.grpc.User.StreamRequest request, io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse> responseObserver){

        String name = request.getName();
        Boolean start = request.getStart();
        

        try{
                if(name.length() >0 && start){

                    for(int i=0; i<5; i++){
                        StreamResponse resp = StreamResponse.newBuilder().setData("number of stream sent--> " + (i+1)).setStatus(true).build();
                        responseObserver.onNext(resp);
                        TimeUnit.SECONDS.sleep(1);
                    }

                }
                else{
                    StreamResponse resp = StreamResponse.newBuilder().setData("stream not started").setStatus(false).build();
                    responseObserver.onNext(resp);
                }
                responseObserver.onCompleted();
        }catch(Exception e){
            responseObserver.onError(e);
        }
    }

    @Override
    public io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq> clientStreamingExample(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp> responseObserver){

            return new io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq>(){

                private int totalVal = 0;                
                private Boolean status = false;

                @Override
                public void onNext(ClientStreamingReq req){
                    System.out.println("Data received " + req);

                    if(req.getStatus()){
                        totalVal += req.getQuantity() * req.getPrice();
                        if(totalVal > 0) status = true;
                    }
                    else{
                        responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Request status is false")
                            .asRuntimeException()); 

                            return;
                            }
                }

                @Override
                public void onCompleted(){
        
                    ClientStreamingResp resp = ClientStreamingResp.newBuilder().setTotalValue(totalVal).setStatus(status).build();
                    responseObserver.onNext(resp);
                    //System.out.println("Evaluation done from server side");
                    responseObserver.onCompleted();
                }

                @Override
                public void onError(Throwable e){
                    System.out.println("Error on processing the request " + e.getMessage());
                }

            };

        }


        @Override
        public io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamReq> bidirectionalStream(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamResp> responseObserver){
            
            return new io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamReq>(){

                @Override
                public void onNext(BidirectionalStreamReq req){
                    System.out.println("Data received " + req + req.getRequestData());
                    boolean status = true;
                    String respData = "this is chunk number : " + req.getRequestData();
                    BidirectionalStreamResp resp = BidirectionalStreamResp.newBuilder().setResponseData(respData).setStatus(status).setTimestamp(LocalDateTime.now().toString()).build();
                    responseObserver.onNext(resp);

                }

                @Override
                public void onCompleted(){
                    responseObserver.onCompleted();
                }

                @Override
                public void onError(Throwable e){
                    System.out.println("Error on processing the request " + e.getMessage());
                }

            };
        }
    
}
