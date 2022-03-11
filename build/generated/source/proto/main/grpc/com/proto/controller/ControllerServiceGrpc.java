package com.proto.controller;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: controller/controller.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ControllerServiceGrpc {

  private ControllerServiceGrpc() {}

  public static final String SERVICE_NAME = "controller.ControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeatmap",
      requestType = com.proto.render_server.ServerRequest.class,
      responseType = com.proto.render_server.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapMethod() {
    io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse> getGetHeatmapMethod;
    if ((getGetHeatmapMethod = ControllerServiceGrpc.getGetHeatmapMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getGetHeatmapMethod = ControllerServiceGrpc.getGetHeatmapMethod) == null) {
          ControllerServiceGrpc.getGetHeatmapMethod = getGetHeatmapMethod =
              io.grpc.MethodDescriptor.<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeatmap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHeatmapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceStub>() {
        @java.lang.Override
        public ControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceStub(channel, callOptions);
        }
      };
    return ControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceBlockingStub>() {
        @java.lang.Override
        public ControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return ControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceFutureStub>() {
        @java.lang.Override
        public ControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceFutureStub(channel, callOptions);
        }
      };
    return ControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ControllerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHeatmap(com.proto.render_server.ServerRequest request,
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeatmapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeatmapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.render_server.ServerRequest,
                com.proto.render_server.ServerResponse>(
                  this, METHODID_GET_HEATMAP)))
          .build();
    }
  }

  /**
   */
  public static final class ControllerServiceStub extends io.grpc.stub.AbstractAsyncStub<ControllerServiceStub> {
    private ControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHeatmap(com.proto.render_server.ServerRequest request,
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ControllerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ControllerServiceBlockingStub> {
    private ControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.render_server.ServerResponse getHeatmap(com.proto.render_server.ServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeatmapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ControllerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ControllerServiceFutureStub> {
    private ControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.render_server.ServerResponse> getHeatmap(
        com.proto.render_server.ServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEATMAP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ControllerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ControllerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEATMAP:
          serviceImpl.getHeatmap((com.proto.render_server.ServerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetHeatmapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
