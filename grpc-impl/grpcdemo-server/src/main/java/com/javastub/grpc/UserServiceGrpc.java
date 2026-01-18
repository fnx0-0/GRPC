package com.javastub.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UserService";

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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLiveUpdates"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientStreamingExample"))
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

  private static volatile io.grpc.MethodDescriptor<com.javastub.grpc.User.BidirectionalStreamReq,
      com.javastub.grpc.User.BidirectionalStreamResp> getBidirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidirectionalStream",
      requestType = com.javastub.grpc.User.BidirectionalStreamReq.class,
      responseType = com.javastub.grpc.User.BidirectionalStreamResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.javastub.grpc.User.BidirectionalStreamReq,
      com.javastub.grpc.User.BidirectionalStreamResp> getBidirectionalStreamMethod() {
    io.grpc.MethodDescriptor<com.javastub.grpc.User.BidirectionalStreamReq, com.javastub.grpc.User.BidirectionalStreamResp> getBidirectionalStreamMethod;
    if ((getBidirectionalStreamMethod = UserServiceGrpc.getBidirectionalStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getBidirectionalStreamMethod = UserServiceGrpc.getBidirectionalStreamMethod) == null) {
          UserServiceGrpc.getBidirectionalStreamMethod = getBidirectionalStreamMethod =
              io.grpc.MethodDescriptor.<com.javastub.grpc.User.BidirectionalStreamReq, com.javastub.grpc.User.BidirectionalStreamResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.BidirectionalStreamReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javastub.grpc.User.BidirectionalStreamResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("BidirectionalStream"))
              .build();
        }
      }
    }
    return getBidirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    default void login(com.javastub.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    default void getLiveUpdates(com.javastub.grpc.User.StreamRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLiveUpdatesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq> clientStreamingExample(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamingExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamReq> bidirectionalStream(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamResp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void login(com.javastub.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.LogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getLiveUpdates(com.javastub.grpc.User.StreamRequest request,
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.StreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLiveUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingReq> clientStreamingExample(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.ClientStreamingResp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingExampleMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamReq> bidirectionalStream(
        io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamResp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingV2Stub> {
    private UserServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.javastub.grpc.User.LoginResponse login(com.javastub.grpc.User.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javastub.grpc.User.LogoutResponse logout(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.javastub.grpc.User.StreamResponse>
        getLiveUpdates(com.javastub.grpc.User.StreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetLiveUpdatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.javastub.grpc.User.ClientStreamingReq, com.javastub.grpc.User.ClientStreamingResp>
        clientStreamingExample() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getClientStreamingExampleMethod(), getCallOptions());
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.javastub.grpc.User.BidirectionalStreamReq, com.javastub.grpc.User.BidirectionalStreamResp>
        bidirectionalStream() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getBidirectionalStreamMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.javastub.grpc.User.LoginResponse login(com.javastub.grpc.User.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javastub.grpc.User.LogoutResponse logout(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<com.javastub.grpc.User.StreamResponse> getLiveUpdates(
        com.javastub.grpc.User.StreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLiveUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javastub.grpc.User.LoginResponse> login(
        com.javastub.grpc.User.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javastub.grpc.User.LogoutResponse> logout(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_LIVE_UPDATES = 2;
  private static final int METHODID_CLIENT_STREAMING_EXAMPLE = 3;
  private static final int METHODID_BIDIRECTIONAL_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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
        case METHODID_BIDIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStream(
              (io.grpc.stub.StreamObserver<com.javastub.grpc.User.BidirectionalStreamResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.javastub.grpc.User.LoginRequest,
              com.javastub.grpc.User.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.javastub.grpc.User.LogoutResponse>(
                service, METHODID_LOGOUT)))
        .addMethod(
          getGetLiveUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.javastub.grpc.User.StreamRequest,
              com.javastub.grpc.User.StreamResponse>(
                service, METHODID_GET_LIVE_UPDATES)))
        .addMethod(
          getClientStreamingExampleMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.javastub.grpc.User.ClientStreamingReq,
              com.javastub.grpc.User.ClientStreamingResp>(
                service, METHODID_CLIENT_STREAMING_EXAMPLE)))
        .addMethod(
          getBidirectionalStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.javastub.grpc.User.BidirectionalStreamReq,
              com.javastub.grpc.User.BidirectionalStreamResp>(
                service, METHODID_BIDIRECTIONAL_STREAM)))
        .build();
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
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getBidirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
