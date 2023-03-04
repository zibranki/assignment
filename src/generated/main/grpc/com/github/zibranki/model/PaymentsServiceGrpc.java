package com.github.zibranki.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: payment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentsServiceGrpc {

  private PaymentsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.zibranki.model.PaymentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.zibranki.model.PaymentRequest,
      com.github.zibranki.model.PaymentResponse> getProcessPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "processPayment",
      requestType = com.github.zibranki.model.PaymentRequest.class,
      responseType = com.github.zibranki.model.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.zibranki.model.PaymentRequest,
      com.github.zibranki.model.PaymentResponse> getProcessPaymentMethod() {
    io.grpc.MethodDescriptor<com.github.zibranki.model.PaymentRequest, com.github.zibranki.model.PaymentResponse> getProcessPaymentMethod;
    if ((getProcessPaymentMethod = PaymentsServiceGrpc.getProcessPaymentMethod) == null) {
      synchronized (PaymentsServiceGrpc.class) {
        if ((getProcessPaymentMethod = PaymentsServiceGrpc.getProcessPaymentMethod) == null) {
          PaymentsServiceGrpc.getProcessPaymentMethod = getProcessPaymentMethod =
              io.grpc.MethodDescriptor.<com.github.zibranki.model.PaymentRequest, com.github.zibranki.model.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "processPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zibranki.model.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zibranki.model.PaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentsServiceMethodDescriptorSupplier("processPayment"))
              .build();
        }
      }
    }
    return getProcessPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.zibranki.model.SalesRequest,
      com.github.zibranki.model.SalesResponse> getGetSalesStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSalesStats",
      requestType = com.github.zibranki.model.SalesRequest.class,
      responseType = com.github.zibranki.model.SalesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.zibranki.model.SalesRequest,
      com.github.zibranki.model.SalesResponse> getGetSalesStatsMethod() {
    io.grpc.MethodDescriptor<com.github.zibranki.model.SalesRequest, com.github.zibranki.model.SalesResponse> getGetSalesStatsMethod;
    if ((getGetSalesStatsMethod = PaymentsServiceGrpc.getGetSalesStatsMethod) == null) {
      synchronized (PaymentsServiceGrpc.class) {
        if ((getGetSalesStatsMethod = PaymentsServiceGrpc.getGetSalesStatsMethod) == null) {
          PaymentsServiceGrpc.getGetSalesStatsMethod = getGetSalesStatsMethod =
              io.grpc.MethodDescriptor.<com.github.zibranki.model.SalesRequest, com.github.zibranki.model.SalesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSalesStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zibranki.model.SalesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zibranki.model.SalesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentsServiceMethodDescriptorSupplier("getSalesStats"))
              .build();
        }
      }
    }
    return getGetSalesStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceStub>() {
        @java.lang.Override
        public PaymentsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsServiceStub(channel, callOptions);
        }
      };
    return PaymentsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceBlockingStub>() {
        @java.lang.Override
        public PaymentsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentsServiceFutureStub>() {
        @java.lang.Override
        public PaymentsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentsServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaymentsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void processPayment(com.github.zibranki.model.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.github.zibranki.model.PaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessPaymentMethod(), responseObserver);
    }

    /**
     */
    public void getSalesStats(com.github.zibranki.model.SalesRequest request,
        io.grpc.stub.StreamObserver<com.github.zibranki.model.SalesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSalesStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessPaymentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.zibranki.model.PaymentRequest,
                com.github.zibranki.model.PaymentResponse>(
                  this, METHODID_PROCESS_PAYMENT)))
          .addMethod(
            getGetSalesStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.zibranki.model.SalesRequest,
                com.github.zibranki.model.SalesResponse>(
                  this, METHODID_GET_SALES_STATS)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentsServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentsServiceStub> {
    private PaymentsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsServiceStub(channel, callOptions);
    }

    /**
     */
    public void processPayment(com.github.zibranki.model.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.github.zibranki.model.PaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSalesStats(com.github.zibranki.model.SalesRequest request,
        io.grpc.stub.StreamObserver<com.github.zibranki.model.SalesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSalesStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentsServiceBlockingStub> {
    private PaymentsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.zibranki.model.PaymentResponse processPayment(com.github.zibranki.model.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.zibranki.model.SalesResponse getSalesStats(com.github.zibranki.model.SalesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSalesStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentsServiceFutureStub> {
    private PaymentsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.zibranki.model.PaymentResponse> processPayment(
        com.github.zibranki.model.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.zibranki.model.SalesResponse> getSalesStats(
        com.github.zibranki.model.SalesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSalesStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_PAYMENT = 0;
  private static final int METHODID_GET_SALES_STATS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_PAYMENT:
          serviceImpl.processPayment((com.github.zibranki.model.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.github.zibranki.model.PaymentResponse>) responseObserver);
          break;
        case METHODID_GET_SALES_STATS:
          serviceImpl.getSalesStats((com.github.zibranki.model.SalesRequest) request,
              (io.grpc.stub.StreamObserver<com.github.zibranki.model.SalesResponse>) responseObserver);
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

  private static abstract class PaymentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.zibranki.model.Payment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentsService");
    }
  }

  private static final class PaymentsServiceFileDescriptorSupplier
      extends PaymentsServiceBaseDescriptorSupplier {
    PaymentsServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentsServiceMethodDescriptorSupplier
      extends PaymentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentsServiceFileDescriptorSupplier())
              .addMethod(getProcessPaymentMethod())
              .addMethod(getGetSalesStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
