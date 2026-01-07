package com.grpcdemo.server;
import java.io.IOException;

import com.userImpl.UserServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

    public static void main(String[] args) throws InterruptedException{

        Server server = ServerBuilder.forPort(8083).addService(new UserServiceImpl()).build();

        try {
            server.start();
            System.out.println("Started server at 8083");
        } catch (IOException e) {
            System.out.println("Problem in starting server");
            e.printStackTrace();
        }

        server.awaitTermination();

    }
    
}
