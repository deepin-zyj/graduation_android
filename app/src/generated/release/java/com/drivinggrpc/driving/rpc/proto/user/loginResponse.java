// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.drivinggrpc.driving.rpc.proto.user;

/**
 * Protobuf type {@code com.drivinggrpc.driving.rpc.proto.user.loginResponse}
 */
public  final class loginResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.drivinggrpc.driving.rpc.proto.user.loginResponse)
    loginResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use loginResponse.newBuilder() to construct.
  private loginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private loginResponse() {
    state_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new loginResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private loginResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            state_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.drivinggrpc.driving.rpc.proto.user.UserProto.internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.drivinggrpc.driving.rpc.proto.user.UserProto.internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.drivinggrpc.driving.rpc.proto.user.loginResponse.class, com.drivinggrpc.driving.rpc.proto.user.loginResponse.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object state_;
  /**
   * <code>string state = 1;</code>
   * @return The state.
   */
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <code>string state = 1;</code>
   * @return The bytes for state.
   */
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.drivinggrpc.driving.rpc.proto.user.loginResponse)) {
      return super.equals(obj);
    }
    com.drivinggrpc.driving.rpc.proto.user.loginResponse other = (com.drivinggrpc.driving.rpc.proto.user.loginResponse) obj;

    if (!getState()
        .equals(other.getState())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + getState().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.drivinggrpc.driving.rpc.proto.user.loginResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.drivinggrpc.driving.rpc.proto.user.loginResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.drivinggrpc.driving.rpc.proto.user.loginResponse)
      com.drivinggrpc.driving.rpc.proto.user.loginResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.drivinggrpc.driving.rpc.proto.user.UserProto.internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.drivinggrpc.driving.rpc.proto.user.UserProto.internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.drivinggrpc.driving.rpc.proto.user.loginResponse.class, com.drivinggrpc.driving.rpc.proto.user.loginResponse.Builder.class);
    }

    // Construct using com.drivinggrpc.driving.rpc.proto.user.loginResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.drivinggrpc.driving.rpc.proto.user.UserProto.internal_static_com_drivinggrpc_driving_rpc_proto_user_loginResponse_descriptor;
    }

    @java.lang.Override
    public com.drivinggrpc.driving.rpc.proto.user.loginResponse getDefaultInstanceForType() {
      return com.drivinggrpc.driving.rpc.proto.user.loginResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.drivinggrpc.driving.rpc.proto.user.loginResponse build() {
      com.drivinggrpc.driving.rpc.proto.user.loginResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.drivinggrpc.driving.rpc.proto.user.loginResponse buildPartial() {
      com.drivinggrpc.driving.rpc.proto.user.loginResponse result = new com.drivinggrpc.driving.rpc.proto.user.loginResponse(this);
      result.state_ = state_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.drivinggrpc.driving.rpc.proto.user.loginResponse) {
        return mergeFrom((com.drivinggrpc.driving.rpc.proto.user.loginResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.drivinggrpc.driving.rpc.proto.user.loginResponse other) {
      if (other == com.drivinggrpc.driving.rpc.proto.user.loginResponse.getDefaultInstance()) return this;
      if (!other.getState().isEmpty()) {
        state_ = other.state_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.drivinggrpc.driving.rpc.proto.user.loginResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.drivinggrpc.driving.rpc.proto.user.loginResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object state_ = "";
    /**
     * <code>string state = 1;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string state = 1;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }
    /**
     * <code>string state = 1;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      state_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.drivinggrpc.driving.rpc.proto.user.loginResponse)
  }

  // @@protoc_insertion_point(class_scope:com.drivinggrpc.driving.rpc.proto.user.loginResponse)
  private static final com.drivinggrpc.driving.rpc.proto.user.loginResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.drivinggrpc.driving.rpc.proto.user.loginResponse();
  }

  public static com.drivinggrpc.driving.rpc.proto.user.loginResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<loginResponse>
      PARSER = new com.google.protobuf.AbstractParser<loginResponse>() {
    @java.lang.Override
    public loginResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new loginResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<loginResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<loginResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.drivinggrpc.driving.rpc.proto.user.loginResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

