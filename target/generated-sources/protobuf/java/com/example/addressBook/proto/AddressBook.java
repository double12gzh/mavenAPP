// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressBook.proto

package com.example.addressBook.proto;

/**
 * Protobuf type {@code addressBook.AddressBook}
 */
public  final class AddressBook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:addressBook.AddressBook)
    AddressBookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressBook.newBuilder() to construct.
  private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressBook() {
    people_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressBook(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              people_ = new java.util.ArrayList<com.example.addressBook.proto.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            people_.add(
                input.readMessage(com.example.addressBook.proto.Person.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = java.util.Collections.unmodifiableList(people_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.addressBook.proto.AddressBookProto.internal_static_addressBook_AddressBook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.addressBook.proto.AddressBookProto.internal_static_addressBook_AddressBook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.addressBook.proto.AddressBook.class, com.example.addressBook.proto.AddressBook.Builder.class);
  }

  public static final int PEOPLE_FIELD_NUMBER = 1;
  private java.util.List<com.example.addressBook.proto.Person> people_;
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  public java.util.List<com.example.addressBook.proto.Person> getPeopleList() {
    return people_;
  }
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  public java.util.List<? extends com.example.addressBook.proto.PersonOrBuilder> 
      getPeopleOrBuilderList() {
    return people_;
  }
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  public int getPeopleCount() {
    return people_.size();
  }
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  public com.example.addressBook.proto.Person getPeople(int index) {
    return people_.get(index);
  }
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  public com.example.addressBook.proto.PersonOrBuilder getPeopleOrBuilder(
      int index) {
    return people_.get(index);
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
    for (int i = 0; i < people_.size(); i++) {
      output.writeMessage(1, people_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < people_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, people_.get(i));
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
    if (!(obj instanceof com.example.addressBook.proto.AddressBook)) {
      return super.equals(obj);
    }
    com.example.addressBook.proto.AddressBook other = (com.example.addressBook.proto.AddressBook) obj;

    boolean result = true;
    result = result && getPeopleList()
        .equals(other.getPeopleList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPeopleCount() > 0) {
      hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPeopleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.addressBook.proto.AddressBook parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.addressBook.proto.AddressBook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.addressBook.proto.AddressBook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.addressBook.proto.AddressBook parseFrom(
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
  public static Builder newBuilder(com.example.addressBook.proto.AddressBook prototype) {
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
   * Protobuf type {@code addressBook.AddressBook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:addressBook.AddressBook)
      com.example.addressBook.proto.AddressBookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.addressBook.proto.AddressBookProto.internal_static_addressBook_AddressBook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.addressBook.proto.AddressBookProto.internal_static_addressBook_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.addressBook.proto.AddressBook.class, com.example.addressBook.proto.AddressBook.Builder.class);
    }

    // Construct using com.example.addressBook.proto.AddressBook.newBuilder()
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
        getPeopleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.addressBook.proto.AddressBookProto.internal_static_addressBook_AddressBook_descriptor;
    }

    @java.lang.Override
    public com.example.addressBook.proto.AddressBook getDefaultInstanceForType() {
      return com.example.addressBook.proto.AddressBook.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.addressBook.proto.AddressBook build() {
      com.example.addressBook.proto.AddressBook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.addressBook.proto.AddressBook buildPartial() {
      com.example.addressBook.proto.AddressBook result = new com.example.addressBook.proto.AddressBook(this);
      int from_bitField0_ = bitField0_;
      if (peopleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          people_ = java.util.Collections.unmodifiableList(people_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.people_ = people_;
      } else {
        result.people_ = peopleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.addressBook.proto.AddressBook) {
        return mergeFrom((com.example.addressBook.proto.AddressBook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.addressBook.proto.AddressBook other) {
      if (other == com.example.addressBook.proto.AddressBook.getDefaultInstance()) return this;
      if (peopleBuilder_ == null) {
        if (!other.people_.isEmpty()) {
          if (people_.isEmpty()) {
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePeopleIsMutable();
            people_.addAll(other.people_);
          }
          onChanged();
        }
      } else {
        if (!other.people_.isEmpty()) {
          if (peopleBuilder_.isEmpty()) {
            peopleBuilder_.dispose();
            peopleBuilder_ = null;
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
            peopleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPeopleFieldBuilder() : null;
          } else {
            peopleBuilder_.addAllMessages(other.people_);
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
      com.example.addressBook.proto.AddressBook parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.addressBook.proto.AddressBook) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.addressBook.proto.Person> people_ =
      java.util.Collections.emptyList();
    private void ensurePeopleIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = new java.util.ArrayList<com.example.addressBook.proto.Person>(people_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.addressBook.proto.Person, com.example.addressBook.proto.Person.Builder, com.example.addressBook.proto.PersonOrBuilder> peopleBuilder_;

    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public java.util.List<com.example.addressBook.proto.Person> getPeopleList() {
      if (peopleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(people_);
      } else {
        return peopleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public int getPeopleCount() {
      if (peopleBuilder_ == null) {
        return people_.size();
      } else {
        return peopleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public com.example.addressBook.proto.Person getPeople(int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);
      } else {
        return peopleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.example.addressBook.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.set(index, value);
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.example.addressBook.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.set(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder addPeople(com.example.addressBook.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.example.addressBook.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(index, value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder addPeople(
        com.example.addressBook.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.example.addressBook.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder addAllPeople(
        java.lang.Iterable<? extends com.example.addressBook.proto.Person> values) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, people_);
        onChanged();
      } else {
        peopleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder clearPeople() {
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public Builder removePeople(int index) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.remove(index);
        onChanged();
      } else {
        peopleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public com.example.addressBook.proto.Person.Builder getPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public com.example.addressBook.proto.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);  } else {
        return peopleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public java.util.List<? extends com.example.addressBook.proto.PersonOrBuilder> 
         getPeopleOrBuilderList() {
      if (peopleBuilder_ != null) {
        return peopleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(people_);
      }
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public com.example.addressBook.proto.Person.Builder addPeopleBuilder() {
      return getPeopleFieldBuilder().addBuilder(
          com.example.addressBook.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public com.example.addressBook.proto.Person.Builder addPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().addBuilder(
          index, com.example.addressBook.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .addressBook.Person people = 1;</code>
     */
    public java.util.List<com.example.addressBook.proto.Person.Builder> 
         getPeopleBuilderList() {
      return getPeopleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.addressBook.proto.Person, com.example.addressBook.proto.Person.Builder, com.example.addressBook.proto.PersonOrBuilder> 
        getPeopleFieldBuilder() {
      if (peopleBuilder_ == null) {
        peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.addressBook.proto.Person, com.example.addressBook.proto.Person.Builder, com.example.addressBook.proto.PersonOrBuilder>(
                people_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        people_ = null;
      }
      return peopleBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:addressBook.AddressBook)
  }

  // @@protoc_insertion_point(class_scope:addressBook.AddressBook)
  private static final com.example.addressBook.proto.AddressBook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.addressBook.proto.AddressBook();
  }

  public static com.example.addressBook.proto.AddressBook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressBook>
      PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
    @java.lang.Override
    public AddressBook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressBook(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressBook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressBook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.addressBook.proto.AddressBook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

