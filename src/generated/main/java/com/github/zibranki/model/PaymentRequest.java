// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package com.github.zibranki.model;

/**
 * Protobuf type {@code com.github.zibranki.model.PaymentRequest}
 */
public final class PaymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.zibranki.model.PaymentRequest)
    PaymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentRequest.newBuilder() to construct.
  private PaymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentRequest() {
    price_ = "";
    paymentMethod_ = "";
    datetime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.zibranki.model.Payment.internal_static_com_github_zibranki_model_PaymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.zibranki.model.Payment.internal_static_com_github_zibranki_model_PaymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.zibranki.model.PaymentRequest.class, com.github.zibranki.model.PaymentRequest.Builder.class);
  }

  public static final int PRICE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object price_ = "";
  /**
   * <pre>
   * typo in types either here or with priceModifier
   * </pre>
   *
   * <code>string price = 1;</code>
   * @return The price.
   */
  @java.lang.Override
  public java.lang.String getPrice() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      price_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * typo in types either here or with priceModifier
   * </pre>
   *
   * <code>string price = 1;</code>
   * @return The bytes for price.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPriceBytes() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      price_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICEMODIFIER_FIELD_NUMBER = 2;
  private double priceModifier_ = 0D;
  /**
   * <code>double priceModifier = 2;</code>
   * @return The priceModifier.
   */
  @java.lang.Override
  public double getPriceModifier() {
    return priceModifier_;
  }

  public static final int PAYMENTMETHOD_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object paymentMethod_ = "";
  /**
   * <code>string paymentMethod = 3;</code>
   * @return The paymentMethod.
   */
  @java.lang.Override
  public java.lang.String getPaymentMethod() {
    java.lang.Object ref = paymentMethod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentMethod_ = s;
      return s;
    }
  }
  /**
   * <code>string paymentMethod = 3;</code>
   * @return The bytes for paymentMethod.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPaymentMethodBytes() {
    java.lang.Object ref = paymentMethod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentMethod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATETIME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object datetime_ = "";
  /**
   * <code>string datetime = 4;</code>
   * @return The datetime.
   */
  @java.lang.Override
  public java.lang.String getDatetime() {
    java.lang.Object ref = datetime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datetime_ = s;
      return s;
    }
  }
  /**
   * <code>string datetime = 4;</code>
   * @return The bytes for datetime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatetimeBytes() {
    java.lang.Object ref = datetime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datetime_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, price_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceModifier_) != 0) {
      output.writeDouble(2, priceModifier_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(paymentMethod_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, paymentMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datetime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, datetime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, price_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceModifier_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, priceModifier_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(paymentMethod_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, paymentMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datetime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, datetime_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.zibranki.model.PaymentRequest)) {
      return super.equals(obj);
    }
    com.github.zibranki.model.PaymentRequest other = (com.github.zibranki.model.PaymentRequest) obj;

    if (!getPrice()
        .equals(other.getPrice())) return false;
    if (java.lang.Double.doubleToLongBits(getPriceModifier())
        != java.lang.Double.doubleToLongBits(
            other.getPriceModifier())) return false;
    if (!getPaymentMethod()
        .equals(other.getPaymentMethod())) return false;
    if (!getDatetime()
        .equals(other.getDatetime())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice().hashCode();
    hash = (37 * hash) + PRICEMODIFIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPriceModifier()));
    hash = (37 * hash) + PAYMENTMETHOD_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentMethod().hashCode();
    hash = (37 * hash) + DATETIME_FIELD_NUMBER;
    hash = (53 * hash) + getDatetime().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.zibranki.model.PaymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.zibranki.model.PaymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.zibranki.model.PaymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.zibranki.model.PaymentRequest parseFrom(
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
  public static Builder newBuilder(com.github.zibranki.model.PaymentRequest prototype) {
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
   * Protobuf type {@code com.github.zibranki.model.PaymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.zibranki.model.PaymentRequest)
      com.github.zibranki.model.PaymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.zibranki.model.Payment.internal_static_com_github_zibranki_model_PaymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.zibranki.model.Payment.internal_static_com_github_zibranki_model_PaymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.zibranki.model.PaymentRequest.class, com.github.zibranki.model.PaymentRequest.Builder.class);
    }

    // Construct using com.github.zibranki.model.PaymentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      price_ = "";
      priceModifier_ = 0D;
      paymentMethod_ = "";
      datetime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.zibranki.model.Payment.internal_static_com_github_zibranki_model_PaymentRequest_descriptor;
    }

    @java.lang.Override
    public com.github.zibranki.model.PaymentRequest getDefaultInstanceForType() {
      return com.github.zibranki.model.PaymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.zibranki.model.PaymentRequest build() {
      com.github.zibranki.model.PaymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.zibranki.model.PaymentRequest buildPartial() {
      com.github.zibranki.model.PaymentRequest result = new com.github.zibranki.model.PaymentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.zibranki.model.PaymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.priceModifier_ = priceModifier_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.paymentMethod_ = paymentMethod_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.datetime_ = datetime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.zibranki.model.PaymentRequest) {
        return mergeFrom((com.github.zibranki.model.PaymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.zibranki.model.PaymentRequest other) {
      if (other == com.github.zibranki.model.PaymentRequest.getDefaultInstance()) return this;
      if (!other.getPrice().isEmpty()) {
        price_ = other.price_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPriceModifier() != 0D) {
        setPriceModifier(other.getPriceModifier());
      }
      if (!other.getPaymentMethod().isEmpty()) {
        paymentMethod_ = other.paymentMethod_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDatetime().isEmpty()) {
        datetime_ = other.datetime_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              price_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              priceModifier_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 26: {
              paymentMethod_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              datetime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object price_ = "";
    /**
     * <pre>
     * typo in types either here or with priceModifier
     * </pre>
     *
     * <code>string price = 1;</code>
     * @return The price.
     */
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * typo in types either here or with priceModifier
     * </pre>
     *
     * <code>string price = 1;</code>
     * @return The bytes for price.
     */
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * typo in types either here or with priceModifier
     * </pre>
     *
     * <code>string price = 1;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      price_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * typo in types either here or with priceModifier
     * </pre>
     *
     * <code>string price = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      price_ = getDefaultInstance().getPrice();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * typo in types either here or with priceModifier
     * </pre>
     *
     * <code>string price = 1;</code>
     * @param value The bytes for price to set.
     * @return This builder for chaining.
     */
    public Builder setPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      price_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double priceModifier_ ;
    /**
     * <code>double priceModifier = 2;</code>
     * @return The priceModifier.
     */
    @java.lang.Override
    public double getPriceModifier() {
      return priceModifier_;
    }
    /**
     * <code>double priceModifier = 2;</code>
     * @param value The priceModifier to set.
     * @return This builder for chaining.
     */
    public Builder setPriceModifier(double value) {

      priceModifier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double priceModifier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriceModifier() {
      bitField0_ = (bitField0_ & ~0x00000002);
      priceModifier_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object paymentMethod_ = "";
    /**
     * <code>string paymentMethod = 3;</code>
     * @return The paymentMethod.
     */
    public java.lang.String getPaymentMethod() {
      java.lang.Object ref = paymentMethod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentMethod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string paymentMethod = 3;</code>
     * @return The bytes for paymentMethod.
     */
    public com.google.protobuf.ByteString
        getPaymentMethodBytes() {
      java.lang.Object ref = paymentMethod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentMethod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string paymentMethod = 3;</code>
     * @param value The paymentMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentMethod(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      paymentMethod_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string paymentMethod = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPaymentMethod() {
      paymentMethod_ = getDefaultInstance().getPaymentMethod();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string paymentMethod = 3;</code>
     * @param value The bytes for paymentMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      paymentMethod_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object datetime_ = "";
    /**
     * <code>string datetime = 4;</code>
     * @return The datetime.
     */
    public java.lang.String getDatetime() {
      java.lang.Object ref = datetime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datetime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string datetime = 4;</code>
     * @return The bytes for datetime.
     */
    public com.google.protobuf.ByteString
        getDatetimeBytes() {
      java.lang.Object ref = datetime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datetime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string datetime = 4;</code>
     * @param value The datetime to set.
     * @return This builder for chaining.
     */
    public Builder setDatetime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      datetime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string datetime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatetime() {
      datetime_ = getDefaultInstance().getDatetime();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string datetime = 4;</code>
     * @param value The bytes for datetime to set.
     * @return This builder for chaining.
     */
    public Builder setDatetimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      datetime_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:com.github.zibranki.model.PaymentRequest)
  }

  // @@protoc_insertion_point(class_scope:com.github.zibranki.model.PaymentRequest)
  private static final com.github.zibranki.model.PaymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.zibranki.model.PaymentRequest();
  }

  public static com.github.zibranki.model.PaymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<PaymentRequest>() {
    @java.lang.Override
    public PaymentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PaymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.zibranki.model.PaymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

