// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.quarkus.example;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_UserAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_UserAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_UserAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_UserAccountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\022\nhelloworld\032\037google/p" +
      "rotobuf/timestamp.proto\"\034\n\014HelloRequest\022" +
      "\014\n\004text\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001" +
      " \001(\t\"9\n\022UserAccountRequest\022\014\n\004name\030\002 \001(\t" +
      "\022\025\n\raccountdetail\030\003 \001(\t\"{\n\023UserAccountRe" +
      "sponse\022-\n\ttimestamp\030\002 \001(\0132\032.google.proto" +
      "buf.Timestamp\0225\n\raccountdetail\030\003 \001(\0132\036.h" +
      "elloworld.UserAccountRequest2\241\001\n\007Greeter" +
      "\022>\n\010SayHello\022\030.helloworld.HelloRequest\032\026" +
      ".helloworld.HelloReply\"\000\022V\n\017ListUserAcco" +
      "unt\022\036.helloworld.UserAccountRequest\032\037.he" +
      "lloworld.UserAccountResponse(\0010\001B\'\n\022io.q" +
      "uarkus.exampleB\017HelloWorldProtoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_helloworld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_helloworld_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_helloworld_UserAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_helloworld_UserAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_UserAccountRequest_descriptor,
        new java.lang.String[] { "Name", "Accountdetail", });
    internal_static_helloworld_UserAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_helloworld_UserAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_UserAccountResponse_descriptor,
        new java.lang.String[] { "Timestamp", "Accountdetail", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
