/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NotificationSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"responseStatus\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseStatus\",\"symbols\":[\"NO_DELTA\",\"DELTA\",\"RESYNC\"]}},{\"name\":\"notifications\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Notification\",\"fields\":[{\"name\":\"topicId\",\"type\":\"long\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"NotificationType\",\"symbols\":[\"SYSTEM\",\"CUSTOM\"]}},{\"name\":\"uid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"seqNumber\",\"type\":[\"int\",\"null\"]},{\"name\":\"body\",\"type\":\"bytes\"}],\"direction\":\"in\"}},\"null\"]},{\"name\":\"availableTopics\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Topic\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"subscriptionType\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionType\",\"symbols\":[\"MANDATORY_SUBSCRIPTION\",\"OPTIONAL_SUBSCRIPTION\"]}}],\"direction\":\"in\"}},\"null\"]}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> notifications;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> availableTopics;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public NotificationSyncResponse() {}

  /**
   * All-args constructor.
   */
  public NotificationSyncResponse(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus, java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> notifications, java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> availableTopics) {
    this.responseStatus = responseStatus;
    this.notifications = notifications;
    this.availableTopics = availableTopics;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return responseStatus;
    case 1: return notifications;
    case 2: return availableTopics;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: responseStatus = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus)value$; break;
    case 1: notifications = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification>)value$; break;
    case 2: availableTopics = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'responseStatus' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus getResponseStatus() {
    return responseStatus;
  }

  /**
   * Sets the value of the 'responseStatus' field.
   * @param value the value to set.
   */
  public void setResponseStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus value) {
    this.responseStatus = value;
  }

  /**
   * Gets the value of the 'notifications' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> getNotifications() {
    return notifications;
  }

  /**
   * Sets the value of the 'notifications' field.
   * @param value the value to set.
   */
  public void setNotifications(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> value) {
    this.notifications = value;
  }

  /**
   * Gets the value of the 'availableTopics' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> getAvailableTopics() {
    return availableTopics;
  }

  /**
   * Sets the value of the 'availableTopics' field.
   * @param value the value to set.
   */
  public void setAvailableTopics(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> value) {
    this.availableTopics = value;
  }

  /** Creates a new NotificationSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder();
  }
  
  /** Creates a new NotificationSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder(other);
  }
  
  /** Creates a new NotificationSyncResponse RecordBuilder by copying an existing NotificationSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for NotificationSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NotificationSyncResponse>
    implements org.apache.avro.data.RecordBuilder<NotificationSyncResponse> {

    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus responseStatus;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> notifications;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> availableTopics;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.responseStatus)) {
        this.responseStatus = data().deepCopy(fields()[0].schema(), other.responseStatus);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.notifications)) {
        this.notifications = data().deepCopy(fields()[1].schema(), other.notifications);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.availableTopics)) {
        this.availableTopics = data().deepCopy(fields()[2].schema(), other.availableTopics);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing NotificationSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.responseStatus)) {
        this.responseStatus = data().deepCopy(fields()[0].schema(), other.responseStatus);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.notifications)) {
        this.notifications = data().deepCopy(fields()[1].schema(), other.notifications);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.availableTopics)) {
        this.availableTopics = data().deepCopy(fields()[2].schema(), other.availableTopics);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus getResponseStatus() {
      return responseStatus;
    }
    
    /** Sets the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder setResponseStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus value) {
      validate(fields()[0], value);
      this.responseStatus = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'responseStatus' field has been set */
    public boolean hasResponseStatus() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'responseStatus' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder clearResponseStatus() {
      responseStatus = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'notifications' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> getNotifications() {
      return notifications;
    }
    
    /** Sets the value of the 'notifications' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder setNotifications(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification> value) {
      validate(fields()[1], value);
      this.notifications = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'notifications' field has been set */
    public boolean hasNotifications() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'notifications' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder clearNotifications() {
      notifications = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'availableTopics' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> getAvailableTopics() {
      return availableTopics;
    }
    
    /** Sets the value of the 'availableTopics' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder setAvailableTopics(java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic> value) {
      validate(fields()[2], value);
      this.availableTopics = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'availableTopics' field has been set */
    public boolean hasAvailableTopics() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'availableTopics' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse.Builder clearAvailableTopics() {
      availableTopics = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public NotificationSyncResponse build() {
      try {
        NotificationSyncResponse record = new NotificationSyncResponse();
        record.responseStatus = fieldSetFlags()[0] ? this.responseStatus : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseStatus) defaultValue(fields()[0]);
        record.notifications = fieldSetFlags()[1] ? this.notifications : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Notification>) defaultValue(fields()[1]);
        record.availableTopics = fieldSetFlags()[2] ? this.availableTopics : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.Topic>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
