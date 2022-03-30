// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package com.proto.common;

/**
 * Protobuf type {@code common.TimeRequest}
 */
public  final class TimeRequest extends
    com.google.protobuf.GeneratedMessageLite<
        TimeRequest, TimeRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:common.TimeRequest)
    TimeRequestOrBuilder {
  private TimeRequest() {
  }
  public static final int START_FIELD_NUMBER = 1;
  private long start_;
  /**
   * <code>int64 start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public long getStart() {
    return start_;
  }
  /**
   * <code>int64 start = 1;</code>
   * @param value The start to set.
   */
  private void setStart(long value) {
    
    start_ = value;
  }
  /**
   * <code>int64 start = 1;</code>
   */
  private void clearStart() {
    
    start_ = 0L;
  }

  public static final int END_FIELD_NUMBER = 2;
  private long end_;
  /**
   * <code>int64 end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public long getEnd() {
    return end_;
  }
  /**
   * <code>int64 end = 2;</code>
   * @param value The end to set.
   */
  private void setEnd(long value) {
    
    end_ = value;
  }
  /**
   * <code>int64 end = 2;</code>
   */
  private void clearEnd() {
    
    end_ = 0L;
  }

  public static com.proto.common.TimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.common.TimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.common.TimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.common.TimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.common.TimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.common.TimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.common.TimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.common.TimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.common.TimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.common.TimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.common.TimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.common.TimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.common.TimeRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code common.TimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.common.TimeRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:common.TimeRequest)
      com.proto.common.TimeRequestOrBuilder {
    // Construct using com.proto.common.TimeRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int64 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public long getStart() {
      return instance.getStart();
    }
    /**
     * <code>int64 start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(long value) {
      copyOnWrite();
      instance.setStart(value);
      return this;
    }
    /**
     * <code>int64 start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      copyOnWrite();
      instance.clearStart();
      return this;
    }

    /**
     * <code>int64 end = 2;</code>
     * @return The end.
     */
    @java.lang.Override
    public long getEnd() {
      return instance.getEnd();
    }
    /**
     * <code>int64 end = 2;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(long value) {
      copyOnWrite();
      instance.setEnd(value);
      return this;
    }
    /**
     * <code>int64 end = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      copyOnWrite();
      instance.clearEnd();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:common.TimeRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.common.TimeRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "start_",
            "end_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.common.TimeRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.common.TimeRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.common.TimeRequest>(
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


  // @@protoc_insertion_point(class_scope:common.TimeRequest)
  private static final com.proto.common.TimeRequest DEFAULT_INSTANCE;
  static {
    TimeRequest defaultInstance = new TimeRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TimeRequest.class, defaultInstance);
  }

  public static com.proto.common.TimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TimeRequest> PARSER;

  public static com.google.protobuf.Parser<TimeRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

