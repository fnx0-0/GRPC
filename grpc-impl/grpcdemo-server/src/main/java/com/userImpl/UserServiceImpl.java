package com.userImpl;


import com.javastub.grpc.User.LoginResponse;
import com.javastub.grpc.User.LogoutResponse;
import com.javastub.grpc.UserServiceGrpc.UserServiceImplBase;

public class UserServiceImpl extends UserServiceImplBase {


    @Override
    public void login(com.javastub.grpc.User.LoginRequest request,  io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver){

        System.out.println("Entering login");
        String username = request.getUsername();
        String password = request.getPassword();

        LoginResponse.Builder response  = LoginResponse.newBuilder();
        
        
        if(password.length() > 0 && username.length()>0)
             response.setMessage("Login Success").setSuccess(true);
        else
            response.setMessage("Login Failed").setSuccess(false);


        responseObserver.onNext(response.build());// onNext is used to send the response back to client


        responseObserver.onCompleted(); // specify this when the response is completed or sent back to client to close the call
    }

    @Override
    public void logout(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {

            LogoutResponse msg = LogoutResponse.newBuilder().setMessage("Logout Success").build();

            responseObserver.onNext(msg);
            responseObserver.onCompleted();
    }
    
}
