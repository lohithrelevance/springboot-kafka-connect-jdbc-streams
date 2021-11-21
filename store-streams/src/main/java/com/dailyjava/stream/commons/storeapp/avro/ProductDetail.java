/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dailyjava.stream.commons.storeapp.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ProductDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3958988175060772959L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductDetail\",\"namespace\":\"com.dailyjava.stream.commons.storeapp.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"string\"},{\"name\":\"unit\",\"type\":\"int\"}],\"connect.name\":\"com.dailyjava.stream.commons.storeapp.avro.ProductDetail\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductDetail> ENCODER =
      new BinaryMessageEncoder<ProductDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductDetail> DECODER =
      new BinaryMessageDecoder<ProductDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductDetail> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductDetail>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductDetail to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductDetail from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductDetail instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private java.lang.CharSequence name;
   private java.lang.CharSequence price;
   private int unit;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductDetail() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param price The new value for price
   * @param unit The new value for unit
   */
  public ProductDetail(java.lang.Long id, java.lang.CharSequence name, java.lang.CharSequence price, java.lang.Integer unit) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.unit = unit;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return price;
    case 3: return unit;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: price = (java.lang.CharSequence)value$; break;
    case 3: unit = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.CharSequence getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.CharSequence value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'unit' field.
   * @return The value of the 'unit' field.
   */
  public int getUnit() {
    return unit;
  }


  /**
   * Sets the value of the 'unit' field.
   * @param value the value to set.
   */
  public void setUnit(int value) {
    this.unit = value;
  }

  /**
   * Creates a new ProductDetail RecordBuilder.
   * @return A new ProductDetail RecordBuilder
   */
  public static com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder newBuilder() {
    return new com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder();
  }

  /**
   * Creates a new ProductDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductDetail RecordBuilder
   */
  public static com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder newBuilder(com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder other) {
    if (other == null) {
      return new com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder();
    } else {
      return new com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder(other);
    }
  }

  /**
   * Creates a new ProductDetail RecordBuilder by copying an existing ProductDetail instance.
   * @param other The existing instance to copy.
   * @return A new ProductDetail RecordBuilder
   */
  public static com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder newBuilder(com.dailyjava.stream.commons.storeapp.avro.ProductDetail other) {
    if (other == null) {
      return new com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder();
    } else {
      return new com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductDetail instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductDetail>
    implements org.apache.avro.data.RecordBuilder<ProductDetail> {

    private long id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence price;
    private int unit;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.unit)) {
        this.unit = data().deepCopy(fields()[3].schema(), other.unit);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dailyjava.stream.commons.storeapp.avro.ProductDetail other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.unit)) {
        this.unit = data().deepCopy(fields()[3].schema(), other.unit);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder setPrice(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.price = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder clearPrice() {
      price = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'unit' field.
      * @return The value.
      */
    public int getUnit() {
      return unit;
    }


    /**
      * Sets the value of the 'unit' field.
      * @param value The value of 'unit'.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder setUnit(int value) {
      validate(fields()[3], value);
      this.unit = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'unit' field has been set.
      * @return True if the 'unit' field has been set, false otherwise.
      */
    public boolean hasUnit() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'unit' field.
      * @return This builder.
      */
    public com.dailyjava.stream.commons.storeapp.avro.ProductDetail.Builder clearUnit() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductDetail build() {
      try {
        ProductDetail record = new ProductDetail();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.price = fieldSetFlags()[2] ? this.price : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.unit = fieldSetFlags()[3] ? this.unit : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductDetail>
    READER$ = (org.apache.avro.io.DatumReader<ProductDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.name);

    out.writeString(this.price);

    out.writeInt(this.unit);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.price = in.readString(this.price instanceof Utf8 ? (Utf8)this.price : null);

      this.unit = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 2:
          this.price = in.readString(this.price instanceof Utf8 ? (Utf8)this.price : null);
          break;

        case 3:
          this.unit = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










