// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: text.proto

package com.rpc.proto;

public final class TextProto {
  private TextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rpc_proto_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rpc_proto_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rpc_proto_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rpc_proto_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntext.proto\022\rcom.rpc.proto\"\032\n\007Request\022\017" +
      "\n\007request\030\001 \001(\t\"\034\n\010Response\022\020\n\010response\030" +
      "\001 \001(\t2I\n\nTextServer\022;\n\006server\022\026.com.rpc." +
      "proto.Request\032\027.com.rpc.proto.Response\"\000" +
      "B\034\n\rcom.rpc.protoB\tTextProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_rpc_proto_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rpc_proto_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rpc_proto_Request_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_com_rpc_proto_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rpc_proto_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rpc_proto_Response_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
