// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller/controller.proto

package com.proto.controller;

public interface ControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:controller.ControllerRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string userid = 1;</code>
   * @return The userid.
   */
  java.lang.String getUserid();
  /**
   * <code>string userid = 1;</code>
   * @return The bytes for userid.
   */
  com.google.protobuf.ByteString
      getUseridBytes();

  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   * @return Whether the timeRequest field is set.
   */
  boolean hasTimeRequest();
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   * @return The timeRequest.
   */
  com.proto.common.TimeRequest getTimeRequest();

  /**
   * <code>string deviceId = 3;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <code>string deviceId = 3;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <code>int32 width = 4;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>int32 height = 5;</code>
   * @return The height.
   */
  int getHeight();
}
