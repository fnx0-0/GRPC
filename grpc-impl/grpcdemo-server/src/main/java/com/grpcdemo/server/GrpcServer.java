package com.grpcdemo.server;
import java.io.IOException;

import com.userImpl.UserServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.NettyServerBuilder;

public class GrpcServer {

    public static void main(String[] args) throws InterruptedException{

        // Use NettyServerBuilder to allow configuring HTTP/2-related limits to mitigate HTTP/2 attacks
        Server server = NettyServerBuilder.forPort(8083)
            .addService(new UserServiceImpl())
            .maxConcurrentCallsPerConnection(100)
            .build();

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
