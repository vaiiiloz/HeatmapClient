// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller/Renderserver.proto

package com.proto.render_server;

/**
 * Protobuf type {@code controller.ServerRequest}
 */
public  final class ServerRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ServerRequest, ServerRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:controller.ServerRequest)
    ServerRequestOrBuilder {
  private ServerRequest() {
    deviceId_ = "";
  }
  public static final int USERID_FIELD_NUMBER = 1;
  private int userid_;
  /**
   * <code>int32 userid = 1;</code>
   * @return The userid.
   */
  @java.lang.Override
  public int getUserid() {
    return userid_;
  }
  /**
   * <code>int32 userid = 1;</code>
   * @param value The userid to set.
   */
  private void setUserid(int value) {
    
    userid_ = value;
  }
  /**
   * <code>int32 userid = 1;</code>
   */
  private void clearUserid() {
    
    userid_ = 0;
  }

  public static final int TIMEREQUEST_FIELD_NUMBER = 2;
  private com.proto.common.TimeRequest timeRequest_;
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.Override
  public boolean hasTimeRequest() {
    return timeRequest_ != null;
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.Override
  public com.proto.common.TimeRequest getTimeRequest() {
    return timeRequest_ == null ? com.proto.common.TimeRequest.getDefaultInstance() : timeRequest_;
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  private void setTimeRequest(com.proto.common.TimeRequest value) {
    value.getClass();
  timeRequest_ = value;
    
    }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeRequest(com.proto.common.TimeRequest value) {
    value.getClass();
  if (timeRequest_ != null &&
        timeRequest_ != com.proto.common.TimeRequest.getDefaultInstance()) {
      timeRequest_ =
        com.proto.common.TimeRequest.newBuilder(timeRequest_).mergeFrom(value).buildPartial();
    } else {
      timeRequest_ = value;
    }
    
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  private void clearTimeRequest() {  timeRequest_ = null;
    
  }

  public static final int DEVICEID_FIELD_NUMBER = 3;
  private java.lang.String deviceId_;
  /**
   * <code>string deviceId = 3;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    return deviceId_;
  }
  /**
   * <code>string deviceId = 3;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(deviceId_);
  }
  /**
   * <code>string deviceId = 3;</code>
   * @param value The deviceId to set.
   */
  private void setDeviceId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    deviceId_ = value;
  }
  /**
   * <code>string deviceId = 3;</code>
   */
  private void clearDeviceId() {
    
    deviceId_ = getDefaultInstance().getDeviceId();
  }
  /**
   * <code>string deviceId = 3;</code>
   * @param value The bytes for deviceId to set.
   */
  private void setDeviceIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    deviceId_ = value.toStringUtf8();
    
  }

  public static com.proto.render_server.ServerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.render_server.ServerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.render_server.ServerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.render_server.ServerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.render_server.ServerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.render_server.ServerRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.render_server.ServerRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code controller.ServerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.render_server.ServerRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:controller.ServerRequest)
      com.proto.render_server.ServerRequestOrBuilder {
    // Construct using com.proto.render_server.ServerRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int32 userid = 1;</code>
     * @return The userid.
     */
    @java.lang.Override
    public int getUserid() {
      return instance.getUserid();
    }
    /**
     * <code>int32 userid = 1;</code>
     * @param value The userid to set.
     * @return This builder for chaining.
     */
    public Builder setUserid(int value) {
      copyOnWrite();
      instance.setUserid(value);
      return this;
    }
    /**
     * <code>int32 userid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserid() {
      copyOnWrite();
      instance.clearUserid();
      return this;
    }

    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    @java.lang.Override
    public boolean hasTimeRequest() {
      return instance.hasTimeRequest();
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    @java.lang.Override
    public com.proto.common.TimeRequest getTimeRequest() {
      return instance.getTimeRequest();
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder setTimeRequest(com.proto.common.TimeRequest value) {
      copyOnWrite();
      instance.setTimeRequest(value);
      return this;
      }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder setTimeRequest(
        com.proto.common.TimeRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder mergeTimeRequest(com.proto.common.TimeRequest value) {
      copyOnWrite();
      instance.mergeTimeRequest(value);
      return this;
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder clearTimeRequest() {  copyOnWrite();
      instance.clearTimeRequest();
      return this;
    }

    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      return instance.getDeviceId();
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      return instance.getDeviceIdBytes();
    }
    /**
     * <code>string deviceId = 3;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeviceId(value);
      return this;
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      copyOnWrite();
      instance.clearDeviceId();
      return this;
    }
    /**
     * <code>string deviceId = 3;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeviceIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:controller.ServerRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.render_server.ServerRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "userid_",
            "timeRequest_",
            "deviceId_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\t" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.render_server.ServerRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.render_server.ServerRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.render_server.ServerRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:controller.ServerRequest)
  private static final com.proto.render_server.ServerRequest DEFAULT_INSTANCE;
  static {
    ServerRequest defaultInstance = new ServerRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ServerRequest.class, defaultInstance);
  }

  public static com.proto.render_server.ServerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ServerRequest> PARSER;

  public static com.google.protobuf.Parser<ServerRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

