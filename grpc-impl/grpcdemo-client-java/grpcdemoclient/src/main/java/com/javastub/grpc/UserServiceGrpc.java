package com.javastub.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.javastub.grpc.User.LoginRequest,
      com.javastub.grpc.User.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.javastub.grpc.User.LoginRequest.class,
      responseType = com.javastub.grpc.User.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.javastub.grpc.User.LoginRequest,
      com.javastub.grpc.User.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.javastub.grpc.User.LoginRequest, com.javastub.grpc.User.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.javastub.grpc.User.LoginRequest, com.javastub.grpc.User.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.javastub.grpc.User.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.javastub.grpc.User.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.javastub.grpc.User.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.javastub.grpc.User.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = UserServiceGrpc.getLogoutMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLogoutMethod = UserServiceGrpc.getLogoutMethod) == null) {
          UserServiceGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.javastub.grpc.User.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.javastub.grpc.User.StreamRequest,
      com.javastub.grpc.User.StreamResponse> getGetLiveUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLiveUpdates",
      requestType = com.javastub.grpc.User.StreamRequest.class,
      responseType = com.javastub.grpc.User.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.javastub.grpc.User.StreamRequest,
      com.javastub.grpc.User.StreamResponse> getGetLiveUpdatesMethod() {
    io.grpc.MethodDescriptor<com.javastub.grpc.User.StreamRequest, com.javastub.grpc.User.StreamResponse> getGetLiveUpdatesMethod;
    if ((getGetLiveUpdatesMethod = UserServiceGrpc.getGetLiveUpdatesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetLiveUpdatesMethod = UserServiceGrpc.getGetLiveUpdatesMethod) == null) {
          UserServiceGrpc.getGetLiveUpdatesMethod = getGetLiveUpdatesMethod = 
              io.grpc.MethodDescriptor.<com.javastub.grpc.User.StreamRequest, com.javastub.grpc.User.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getLiveUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getLiveUpdates"))
                  .build();
          }
        }
     }
     return getGetLiveUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.javastub.grpc.User.ClientStreamingReq,
      com.javastub.grpc.User.ClientStreamingResp> getClientStreamingExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStreamingExample",
      requestType = com.javastub.grpc.User.ClientStreamingReq.class,
      responseType = com.javastub.grpc.User.ClientStreamingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.javastub.grpc.User.ClientStreamingReq,
      com.javastub.grpc.User.ClientStreamingResp> getClientStreamingExampleMethod() {
    io.grpc.MethodDescriptor<com.javastub.grpc.User.ClientStreamingReq, com.javastub.grpc.User.ClientStreamingResp> getClientStreamingExampleMethod;
    if ((getClientStreamingExampleMethod = UserServiceGrpc.getClientStreamingExampleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getClientStreamingExampleMethod = UserServiceGrpc.getClientStreamingExampleMethod) == null) {
          UserServiceGrpc.getClientStreamingExampleMethod = getClientStreamingExampleMethod = 
              io.grpc.MethodDescriptor.<com.javastub.grpc.User.ClientStreamingReq, com.javastub.grpc.User.ClientStreamingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "ClientStreamingExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.ClientStreamingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.ClientStreamingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ClientStreamingExample"))
                  .build();
          }
        }
     }
     return getClientStreamingExampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void login(com.javastub.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getLiveUpdates(com.javastub.grpc.User.StreamRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLiveUpdatesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq> clientStreamingExample(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamingExampleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.javastub.grpc.User.LoginRequest,
                com.javastub.grpc.User.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.javastub.grpc.User.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getGetLiveUpdatesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.javastub.grpc.User.StreamRequest,
                com.javastub.grpc.User.StreamResponse>(
                  this, METHODID_GET_LIVE_UPDATES)))
          .addMethod(
            getClientStreamingExampleMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.javastub.grpc.User.ClientStreamingReq,
                com.javastub.grpc.User.ClientStreamingResp>(
                  this, METHODID_CLIENT_STREAMING_EXAMPLE)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void login(com.javastub.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getLiveUpdates(com.javastub.grpc.User.StreamRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetLiveUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq> clientStreamingExample(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingExampleMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.javastub.grpc.User.LoginResponse login(com.javastub.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javastub.grpc.User.LogoutResponse logout(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<com.javastub.grpc.User.StreamResponse> getLiveUpdates(
        com.javastub.grpc.User.StreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetLiveUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javastub.grpc.User.LoginResponse> login(
        com.javastub.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javastub.grpc.User.LogoutResponse> logout(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_LIVE_UPDATES = 2;
  private static final int METHODID_CLIENT_STREAMING_EXAMPLE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.javastub.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse>) responseObserver);
          break;
        case METHODID_GET_LIVE_UPDATES:
          serviceImpl.getLiveUpdates((com.javastub.grpc.User.StreamRequest) request,
              (io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_STREAMING_EXAMPLE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamingExample(
              (io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.javastub.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetLiveUpdatesMethod())
              .addMethod(getClientStreamingExampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
