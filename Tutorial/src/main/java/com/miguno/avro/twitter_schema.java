/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.miguno.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class twitter_schema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema S$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"twitter_schema\",\"namespace\":\"com.miguno.avro\",\"fields\":[{\"name\":\"username\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Name of the user account on Twitter.com\"},{\"name\":\"tweet\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The content of the user's Twitter message\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Unix epoch time in seconds\"}],\"doc:\":\"A basic schema for storing Twitter messages\"}");
//  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Name of the user account on Twitter.com */
  @Deprecated public java.lang.String username;
  /** The content of the user's Twitter message */
  @Deprecated public java.lang.String tweet;
  /** Unix epoch time in seconds */
  @Deprecated public long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public twitter_schema() {}

  /**
   * All-args constructor.
   */
//  public twitter_schema(java.lang.String username, java.lang.String tweet, java.lang.Long timestamp) {
//    this.username = username;
//    this.tweet = tweet;
//    this.timestamp = timestamp;
//  }



  public org.apache.avro.Schema getSchema() { return S$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return username;
    case 1: return tweet;
    case 2: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 

  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: username = (java.lang.String)value$; break;
    case 1: tweet = (java.lang.String)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }



  /**
   * Gets the value of the 'username' field.
   * Name of the user account on Twitter.com   */
//  public java.lang.String getUsername() {
//    return username;
//  }

  /**
   * Sets the value of the 'username' field.
   * Name of the user account on Twitter.com   * @param value the value to set.
   */
//  public void setUsername(java.lang.String value) {
//    this.username = value;
//  }

  /**
   * Gets the value of the 'tweet' field.
   * The content of the user's Twitter message   */
//  public java.lang.String getTweet() {
//    return tweet;
//  }

  /**
   * Sets the value of the 'tweet' field.
   * The content of the user's Twitter message   * @param value the value to set.
   */
//  public void setTweet(java.lang.String value) {
//    this.tweet = value;
//  }

  /**
   * Gets the value of the 'timestamp' field.
   * Unix epoch time in seconds   */
//  public java.lang.Long getTimestamp() {
//    return timestamp;
//  }

  /**
   * Sets the value of the 'timestamp' field.
   * Unix epoch time in seconds   * @param value the value to set.
   */
//  public void setTimestamp(java.lang.Long value) {
//    this.timestamp = value;
//  }

  /** Creates a new twitter_schema RecordBuilder */
//  public static com.miguno.avro.twitter_schema.Builder newBuilder() {
//    return new com.miguno.avro.twitter_schema.Builder();
//  }
  
  /** Creates a new twitter_schema RecordBuilder by copying an existing Builder */
//  public static com.miguno.avro.twitter_schema.Builder newBuilder(com.miguno.avro.twitter_schema.Builder other) {
//    return new com.miguno.avro.twitter_schema.Builder(other);
//  }
  
  /** Creates a new twitter_schema RecordBuilder by copying an existing twitter_schema instance */
//  public static com.miguno.avro.twitter_schema.Builder newBuilder(com.miguno.avro.twitter_schema other) {
//    return new com.miguno.avro.twitter_schema.Builder(other);
//  }
  
  /**
   * RecordBuilder for twitter_schema instances.
   */

  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<twitter_schema> {
   // implements org.apache.avro.data.RecordBuilder<twitter_schema> {

    private java.lang.String username;
    private java.lang.String tweet;
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(com.miguno.avro.twitter_schema.S$);
    }
   

    /** Creates a Builder by copying an existing Builder */
/*
    private Builder(com.miguno.avro.twitter_schema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.username)) {
        this.username = data().deepCopy(fields()[0].schema(), other.username);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tweet)) {
        this.tweet = data().deepCopy(fields()[1].schema(), other.tweet);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
    }
    


    /** Creates a Builder by copying an existing twitter_schema instance */
/*
    private Builder(com.miguno.avro.twitter_schema other) {
//            super(com.miguno.avro.twitter_schema.SCHEMA$);
            super(com.miguno.avro.twitter_schema.S$);
      if (isValidValue(fields()[0], other.username)) {
        this.username = data().deepCopy(fields()[0].schema(), other.username);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tweet)) {
        this.tweet = data().deepCopy(fields()[1].schema(), other.tweet);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
    }



    /** Gets the value of the 'username' field */
//    public java.lang.String getUsername() {
//      return username;
//    }
    
    /** Sets the value of the 'username' field */
//    public com.miguno.avro.twitter_schema.Builder setUsername(java.lang.String value) {
//      validate(fields()[0], value);
//      this.username = value;
//      fieldSetFlags()[0] = true;
//      return this; 
//    }
    
    /** Checks whether the 'username' field has been set */
//    public boolean hasUsername() {
 //     return fieldSetFlags()[0];
//    }
    
    /** Clears the value of the 'username' field */
//    public com.miguno.avro.twitter_schema.Builder clearUsername() {
//      username = null;
//      fieldSetFlags()[0] = false;
//      return this;
//    }

//    /** Gets the value of the 'tweet' field */
//    public java.lang.String getTweet() {
//      return tweet;
//    }
    
//    /** Sets the value of the 'tweet' field */
//    public com.miguno.avro.twitter_schema.Builder setTweet(java.lang.String value) {
//      validate(fields()[1], value);
//      this.tweet = value;
//      fieldSetFlags()[1] = true;
//      return this; 
//    }
    
    /** Checks whether the 'tweet' field has been set */
//    public boolean hasTweet() {
//      return fieldSetFlags()[1];
//    }
    
    /** Clears the value of the 'tweet' field */
//    public com.miguno.avro.twitter_schema.Builder clearTweet() {
//      tweet = null;
//      fieldSetFlags()[1] = false;
//      return this;
//    }

    /** Gets the value of the 'timestamp' field */
//    public java.lang.Long getTimestamp() {
//      return timestamp;
//    }
    
//    /** Sets the value of the 'timestamp' field */
//    public com.miguno.avro.twitter_schema.Builder setTimestamp(long value) {
//      validate(fields()[2], value);
//      this.timestamp = value;
//      fieldSetFlags()[2] = true;
//      return this; 
//    }
    
//    /** Checks whether the 'timestamp' field has been set */
//    public boolean hasTimestamp() {
//      return fieldSetFlags()[2];
//    }
    
    /** Clears the value of the 'timestamp' field */
//    public com.miguno.avro.twitter_schema.Builder clearTimestamp() {
//      fieldSetFlags()[2] = false;
//      return this;
//    }

    @Override
    public twitter_schema build() {
      try {
        twitter_schema record = new twitter_schema();
        record.username = fieldSetFlags()[0] ? this.username : (java.lang.String) defaultValue(fields()[0]);
        record.tweet = fieldSetFlags()[1] ? this.tweet : (java.lang.String) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }

  }
}