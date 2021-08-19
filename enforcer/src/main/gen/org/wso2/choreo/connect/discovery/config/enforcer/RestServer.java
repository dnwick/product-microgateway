// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/rest_server.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

/**
 * <pre>
 * Model for enable/ disable enforcer admin rest api
 * </pre>
 *
 * Protobuf type {@code wso2.discovery.config.enforcer.RestServer}
 */
public final class RestServer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.config.enforcer.RestServer)
    RestServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestServer.newBuilder() to construct.
  private RestServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestServer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestServer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RestServer(
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
          case 8: {

            enable_ = input.readBool();
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
    return org.wso2.choreo.connect.discovery.config.enforcer.RestServerProto.internal_static_wso2_discovery_config_enforcer_RestServer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.choreo.connect.discovery.config.enforcer.RestServerProto.internal_static_wso2_discovery_config_enforcer_RestServer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.choreo.connect.discovery.config.enforcer.RestServer.class, org.wso2.choreo.connect.discovery.config.enforcer.RestServer.Builder.class);
  }

  public static final int ENABLE_FIELD_NUMBER = 1;
  private boolean enable_;
  /**
   * <pre>
   * Enable outbound auth header
   * </pre>
   *
   * <code>bool enable = 1;</code>
   * @return The enable.
   */
  @java.lang.Override
  public boolean getEnable() {
    return enable_;
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
    if (enable_ != false) {
      output.writeBool(1, enable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enable_);
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
    if (!(obj instanceof org.wso2.choreo.connect.discovery.config.enforcer.RestServer)) {
      return super.equals(obj);
    }
    org.wso2.choreo.connect.discovery.config.enforcer.RestServer other = (org.wso2.choreo.connect.discovery.config.enforcer.RestServer) obj;

    if (getEnable()
        != other.getEnable()) return false;
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
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer parseFrom(
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
  public static Builder newBuilder(org.wso2.choreo.connect.discovery.config.enforcer.RestServer prototype) {
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
   * <pre>
   * Model for enable/ disable enforcer admin rest api
   * </pre>
   *
   * Protobuf type {@code wso2.discovery.config.enforcer.RestServer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.config.enforcer.RestServer)
      org.wso2.choreo.connect.discovery.config.enforcer.RestServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.choreo.connect.discovery.config.enforcer.RestServerProto.internal_static_wso2_discovery_config_enforcer_RestServer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.choreo.connect.discovery.config.enforcer.RestServerProto.internal_static_wso2_discovery_config_enforcer_RestServer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.choreo.connect.discovery.config.enforcer.RestServer.class, org.wso2.choreo.connect.discovery.config.enforcer.RestServer.Builder.class);
    }

    // Construct using org.wso2.choreo.connect.discovery.config.enforcer.RestServer.newBuilder()
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
      enable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.choreo.connect.discovery.config.enforcer.RestServerProto.internal_static_wso2_discovery_config_enforcer_RestServer_descriptor;
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.config.enforcer.RestServer getDefaultInstanceForType() {
      return org.wso2.choreo.connect.discovery.config.enforcer.RestServer.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.config.enforcer.RestServer build() {
      org.wso2.choreo.connect.discovery.config.enforcer.RestServer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.config.enforcer.RestServer buildPartial() {
      org.wso2.choreo.connect.discovery.config.enforcer.RestServer result = new org.wso2.choreo.connect.discovery.config.enforcer.RestServer(this);
      result.enable_ = enable_;
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
      if (other instanceof org.wso2.choreo.connect.discovery.config.enforcer.RestServer) {
        return mergeFrom((org.wso2.choreo.connect.discovery.config.enforcer.RestServer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.choreo.connect.discovery.config.enforcer.RestServer other) {
      if (other == org.wso2.choreo.connect.discovery.config.enforcer.RestServer.getDefaultInstance()) return this;
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
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
      org.wso2.choreo.connect.discovery.config.enforcer.RestServer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.choreo.connect.discovery.config.enforcer.RestServer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enable_ ;
    /**
     * <pre>
     * Enable outbound auth header
     * </pre>
     *
     * <code>bool enable = 1;</code>
     * @return The enable.
     */
    @java.lang.Override
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <pre>
     * Enable outbound auth header
     * </pre>
     *
     * <code>bool enable = 1;</code>
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {
      
      enable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable outbound auth header
     * </pre>
     *
     * <code>bool enable = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnable() {
      
      enable_ = false;
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


    // @@protoc_insertion_point(builder_scope:wso2.discovery.config.enforcer.RestServer)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.config.enforcer.RestServer)
  private static final org.wso2.choreo.connect.discovery.config.enforcer.RestServer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.choreo.connect.discovery.config.enforcer.RestServer();
  }

  public static org.wso2.choreo.connect.discovery.config.enforcer.RestServer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestServer>
      PARSER = new com.google.protobuf.AbstractParser<RestServer>() {
    @java.lang.Override
    public RestServer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RestServer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RestServer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestServer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.choreo.connect.discovery.config.enforcer.RestServer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

