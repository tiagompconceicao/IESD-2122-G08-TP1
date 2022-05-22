// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ICoordinator.proto

package ICoordinator;

/**
 * Protobuf type {@code forum.VectorServices}
 */
public  final class VectorServices extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:forum.VectorServices)
    VectorServicesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VectorServices.newBuilder() to construct.
  private VectorServices(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VectorServices() {
    vectors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VectorServices();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VectorServices(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vectors_ = new java.util.ArrayList<ICoordinator.ServiceEndpoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            vectors_.add(
                input.readMessage(ICoordinator.ServiceEndpoint.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        vectors_ = java.util.Collections.unmodifiableList(vectors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ICoordinator.ICoordinatorOuterClass.internal_static_forum_VectorServices_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ICoordinator.ICoordinatorOuterClass.internal_static_forum_VectorServices_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ICoordinator.VectorServices.class, ICoordinator.VectorServices.Builder.class);
  }

  public static final int VECTORS_FIELD_NUMBER = 1;
  private java.util.List<ICoordinator.ServiceEndpoint> vectors_;
  /**
   * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
   */
  public java.util.List<ICoordinator.ServiceEndpoint> getVectorsList() {
    return vectors_;
  }
  /**
   * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
   */
  public java.util.List<? extends ICoordinator.ServiceEndpointOrBuilder> 
      getVectorsOrBuilderList() {
    return vectors_;
  }
  /**
   * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
   */
  public int getVectorsCount() {
    return vectors_.size();
  }
  /**
   * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
   */
  public ICoordinator.ServiceEndpoint getVectors(int index) {
    return vectors_.get(index);
  }
  /**
   * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
   */
  public ICoordinator.ServiceEndpointOrBuilder getVectorsOrBuilder(
      int index) {
    return vectors_.get(index);
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
    for (int i = 0; i < vectors_.size(); i++) {
      output.writeMessage(1, vectors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vectors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vectors_.get(i));
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
    if (!(obj instanceof ICoordinator.VectorServices)) {
      return super.equals(obj);
    }
    ICoordinator.VectorServices other = (ICoordinator.VectorServices) obj;

    if (!getVectorsList()
        .equals(other.getVectorsList())) return false;
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
    if (getVectorsCount() > 0) {
      hash = (37 * hash) + VECTORS_FIELD_NUMBER;
      hash = (53 * hash) + getVectorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ICoordinator.VectorServices parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ICoordinator.VectorServices parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ICoordinator.VectorServices parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ICoordinator.VectorServices parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ICoordinator.VectorServices parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ICoordinator.VectorServices parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ICoordinator.VectorServices parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ICoordinator.VectorServices parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ICoordinator.VectorServices parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ICoordinator.VectorServices parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ICoordinator.VectorServices parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ICoordinator.VectorServices parseFrom(
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
  public static Builder newBuilder(ICoordinator.VectorServices prototype) {
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
   * Protobuf type {@code forum.VectorServices}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:forum.VectorServices)
      ICoordinator.VectorServicesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ICoordinator.ICoordinatorOuterClass.internal_static_forum_VectorServices_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ICoordinator.ICoordinatorOuterClass.internal_static_forum_VectorServices_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ICoordinator.VectorServices.class, ICoordinator.VectorServices.Builder.class);
    }

    // Construct using ICoordinator.VectorServices.newBuilder()
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
        getVectorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (vectorsBuilder_ == null) {
        vectors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        vectorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ICoordinator.ICoordinatorOuterClass.internal_static_forum_VectorServices_descriptor;
    }

    @java.lang.Override
    public ICoordinator.VectorServices getDefaultInstanceForType() {
      return ICoordinator.VectorServices.getDefaultInstance();
    }

    @java.lang.Override
    public ICoordinator.VectorServices build() {
      ICoordinator.VectorServices result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ICoordinator.VectorServices buildPartial() {
      ICoordinator.VectorServices result = new ICoordinator.VectorServices(this);
      int from_bitField0_ = bitField0_;
      if (vectorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vectors_ = java.util.Collections.unmodifiableList(vectors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vectors_ = vectors_;
      } else {
        result.vectors_ = vectorsBuilder_.build();
      }
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
      if (other instanceof ICoordinator.VectorServices) {
        return mergeFrom((ICoordinator.VectorServices)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ICoordinator.VectorServices other) {
      if (other == ICoordinator.VectorServices.getDefaultInstance()) return this;
      if (vectorsBuilder_ == null) {
        if (!other.vectors_.isEmpty()) {
          if (vectors_.isEmpty()) {
            vectors_ = other.vectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVectorsIsMutable();
            vectors_.addAll(other.vectors_);
          }
          onChanged();
        }
      } else {
        if (!other.vectors_.isEmpty()) {
          if (vectorsBuilder_.isEmpty()) {
            vectorsBuilder_.dispose();
            vectorsBuilder_ = null;
            vectors_ = other.vectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vectorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVectorsFieldBuilder() : null;
          } else {
            vectorsBuilder_.addAllMessages(other.vectors_);
          }
        }
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
      ICoordinator.VectorServices parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ICoordinator.VectorServices) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ICoordinator.ServiceEndpoint> vectors_ =
      java.util.Collections.emptyList();
    private void ensureVectorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vectors_ = new java.util.ArrayList<ICoordinator.ServiceEndpoint>(vectors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ICoordinator.ServiceEndpoint, ICoordinator.ServiceEndpoint.Builder, ICoordinator.ServiceEndpointOrBuilder> vectorsBuilder_;

    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public java.util.List<ICoordinator.ServiceEndpoint> getVectorsList() {
      if (vectorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vectors_);
      } else {
        return vectorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public int getVectorsCount() {
      if (vectorsBuilder_ == null) {
        return vectors_.size();
      } else {
        return vectorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public ICoordinator.ServiceEndpoint getVectors(int index) {
      if (vectorsBuilder_ == null) {
        return vectors_.get(index);
      } else {
        return vectorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder setVectors(
        int index, ICoordinator.ServiceEndpoint value) {
      if (vectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVectorsIsMutable();
        vectors_.set(index, value);
        onChanged();
      } else {
        vectorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder setVectors(
        int index, ICoordinator.ServiceEndpoint.Builder builderForValue) {
      if (vectorsBuilder_ == null) {
        ensureVectorsIsMutable();
        vectors_.set(index, builderForValue.build());
        onChanged();
      } else {
        vectorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder addVectors(ICoordinator.ServiceEndpoint value) {
      if (vectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVectorsIsMutable();
        vectors_.add(value);
        onChanged();
      } else {
        vectorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder addVectors(
        int index, ICoordinator.ServiceEndpoint value) {
      if (vectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVectorsIsMutable();
        vectors_.add(index, value);
        onChanged();
      } else {
        vectorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder addVectors(
        ICoordinator.ServiceEndpoint.Builder builderForValue) {
      if (vectorsBuilder_ == null) {
        ensureVectorsIsMutable();
        vectors_.add(builderForValue.build());
        onChanged();
      } else {
        vectorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder addVectors(
        int index, ICoordinator.ServiceEndpoint.Builder builderForValue) {
      if (vectorsBuilder_ == null) {
        ensureVectorsIsMutable();
        vectors_.add(index, builderForValue.build());
        onChanged();
      } else {
        vectorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder addAllVectors(
        java.lang.Iterable<? extends ICoordinator.ServiceEndpoint> values) {
      if (vectorsBuilder_ == null) {
        ensureVectorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vectors_);
        onChanged();
      } else {
        vectorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder clearVectors() {
      if (vectorsBuilder_ == null) {
        vectors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vectorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public Builder removeVectors(int index) {
      if (vectorsBuilder_ == null) {
        ensureVectorsIsMutable();
        vectors_.remove(index);
        onChanged();
      } else {
        vectorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public ICoordinator.ServiceEndpoint.Builder getVectorsBuilder(
        int index) {
      return getVectorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public ICoordinator.ServiceEndpointOrBuilder getVectorsOrBuilder(
        int index) {
      if (vectorsBuilder_ == null) {
        return vectors_.get(index);  } else {
        return vectorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public java.util.List<? extends ICoordinator.ServiceEndpointOrBuilder> 
         getVectorsOrBuilderList() {
      if (vectorsBuilder_ != null) {
        return vectorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vectors_);
      }
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public ICoordinator.ServiceEndpoint.Builder addVectorsBuilder() {
      return getVectorsFieldBuilder().addBuilder(
          ICoordinator.ServiceEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public ICoordinator.ServiceEndpoint.Builder addVectorsBuilder(
        int index) {
      return getVectorsFieldBuilder().addBuilder(
          index, ICoordinator.ServiceEndpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .forum.ServiceEndpoint vectors = 1;</code>
     */
    public java.util.List<ICoordinator.ServiceEndpoint.Builder> 
         getVectorsBuilderList() {
      return getVectorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ICoordinator.ServiceEndpoint, ICoordinator.ServiceEndpoint.Builder, ICoordinator.ServiceEndpointOrBuilder> 
        getVectorsFieldBuilder() {
      if (vectorsBuilder_ == null) {
        vectorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ICoordinator.ServiceEndpoint, ICoordinator.ServiceEndpoint.Builder, ICoordinator.ServiceEndpointOrBuilder>(
                vectors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vectors_ = null;
      }
      return vectorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:forum.VectorServices)
  }

  // @@protoc_insertion_point(class_scope:forum.VectorServices)
  private static final ICoordinator.VectorServices DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ICoordinator.VectorServices();
  }

  public static ICoordinator.VectorServices getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VectorServices>
      PARSER = new com.google.protobuf.AbstractParser<VectorServices>() {
    @java.lang.Override
    public VectorServices parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VectorServices(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VectorServices> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VectorServices> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ICoordinator.VectorServices getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

