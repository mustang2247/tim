/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tim.packet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-22")
public class TimRoster implements org.apache.thrift.TBase<TimRoster, TimRoster._Fields>, java.io.Serializable, Cloneable, Comparable<TimRoster> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimRoster");

  private static final org.apache.thrift.protocol.TField SUBSCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("subscription", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TID_FIELD_DESC = new org.apache.thrift.protocol.TField("tid", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimRosterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimRosterTupleSchemeFactory());
  }

  /**
   * none表示用户和contact之前没有任何的关系（虽然在server的buddy list中存在）
   * to表示用户能看到contact的presence，但是contact看不到用户的Presence
   * from和to的含义相反，指用户看不到contact的presence，但是contact可以看到
   * both表示相关之间都能看到对方的presence
   */
  public String subscription; // required
  public Tid tid; // required
  /**
   * 用户名
   */
  public String name; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * none表示用户和contact之前没有任何的关系（虽然在server的buddy list中存在）
     * to表示用户能看到contact的presence，但是contact看不到用户的Presence
     * from和to的含义相反，指用户看不到contact的presence，但是contact可以看到
     * both表示相关之间都能看到对方的presence
     */
    SUBSCRIPTION((short)1, "subscription"),
    TID((short)2, "tid"),
    /**
     * 用户名
     */
    NAME((short)3, "name"),
    EXTRA_MAP((short)4, "extraMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUBSCRIPTION
          return SUBSCRIPTION;
        case 2: // TID
          return TID;
        case 3: // NAME
          return NAME;
        case 4: // EXTRA_MAP
          return EXTRA_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUBSCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("subscription", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TID, new org.apache.thrift.meta_data.FieldMetaData("tid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Tid.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimRoster.class, metaDataMap);
  }

  public TimRoster() {
  }

  public TimRoster(
    String subscription,
    Tid tid)
  {
    this();
    this.subscription = subscription;
    this.tid = tid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimRoster(TimRoster other) {
    if (other.isSetSubscription()) {
      this.subscription = other.subscription;
    }
    if (other.isSetTid()) {
      this.tid = new Tid(other.tid);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>(other.extraMap);
      this.extraMap = __this__extraMap;
    }
  }

  public TimRoster deepCopy() {
    return new TimRoster(this);
  }

  @Override
  public void clear() {
    this.subscription = null;
    this.tid = null;
    this.name = null;
    this.extraMap = null;
  }

  /**
   * none表示用户和contact之前没有任何的关系（虽然在server的buddy list中存在）
   * to表示用户能看到contact的presence，但是contact看不到用户的Presence
   * from和to的含义相反，指用户看不到contact的presence，但是contact可以看到
   * both表示相关之间都能看到对方的presence
   */
  public String getSubscription() {
    return this.subscription;
  }

  /**
   * none表示用户和contact之前没有任何的关系（虽然在server的buddy list中存在）
   * to表示用户能看到contact的presence，但是contact看不到用户的Presence
   * from和to的含义相反，指用户看不到contact的presence，但是contact可以看到
   * both表示相关之间都能看到对方的presence
   */
  public TimRoster setSubscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

  public void unsetSubscription() {
    this.subscription = null;
  }

  /** Returns true if field subscription is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscription() {
    return this.subscription != null;
  }

  public void setSubscriptionIsSet(boolean value) {
    if (!value) {
      this.subscription = null;
    }
  }

  public Tid getTid() {
    return this.tid;
  }

  public TimRoster setTid(Tid tid) {
    this.tid = tid;
    return this;
  }

  public void unsetTid() {
    this.tid = null;
  }

  /** Returns true if field tid is set (has been assigned a value) and false otherwise */
  public boolean isSetTid() {
    return this.tid != null;
  }

  public void setTidIsSet(boolean value) {
    if (!value) {
      this.tid = null;
    }
  }

  /**
   * 用户名
   */
  public String getName() {
    return this.name;
  }

  /**
   * 用户名
   */
  public TimRoster setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public TimRoster setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUBSCRIPTION:
      if (value == null) {
        unsetSubscription();
      } else {
        setSubscription((String)value);
      }
      break;

    case TID:
      if (value == null) {
        unsetTid();
      } else {
        setTid((Tid)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBSCRIPTION:
      return getSubscription();

    case TID:
      return getTid();

    case NAME:
      return getName();

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUBSCRIPTION:
      return isSetSubscription();
    case TID:
      return isSetTid();
    case NAME:
      return isSetName();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimRoster)
      return this.equals((TimRoster)that);
    return false;
  }

  public boolean equals(TimRoster that) {
    if (that == null)
      return false;

    boolean this_present_subscription = true && this.isSetSubscription();
    boolean that_present_subscription = true && that.isSetSubscription();
    if (this_present_subscription || that_present_subscription) {
      if (!(this_present_subscription && that_present_subscription))
        return false;
      if (!this.subscription.equals(that.subscription))
        return false;
    }

    boolean this_present_tid = true && this.isSetTid();
    boolean that_present_tid = true && that.isSetTid();
    if (this_present_tid || that_present_tid) {
      if (!(this_present_tid && that_present_tid))
        return false;
      if (!this.tid.equals(that.tid))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_subscription = true && (isSetSubscription());
    list.add(present_subscription);
    if (present_subscription)
      list.add(subscription);

    boolean present_tid = true && (isSetTid());
    list.add(present_tid);
    if (present_tid)
      list.add(tid);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_extraMap = true && (isSetExtraMap());
    list.add(present_extraMap);
    if (present_extraMap)
      list.add(extraMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimRoster other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSubscription()).compareTo(other.isSetSubscription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscription, other.subscription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTid()).compareTo(other.isSetTid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tid, other.tid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(other.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, other.extraMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimRoster(");
    boolean first = true;

    sb.append("subscription:");
    if (this.subscription == null) {
      sb.append("null");
    } else {
      sb.append(this.subscription);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tid:");
    if (this.tid == null) {
      sb.append("null");
    } else {
      sb.append(this.tid);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (subscription == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subscription' was not present! Struct: " + toString());
    }
    if (tid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tid' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (tid != null) {
      tid.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimRosterStandardSchemeFactory implements SchemeFactory {
    public TimRosterStandardScheme getScheme() {
      return new TimRosterStandardScheme();
    }
  }

  private static class TimRosterStandardScheme extends StandardScheme<TimRoster> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimRoster struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUBSCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subscription = iprot.readString();
              struct.setSubscriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tid = new Tid();
              struct.tid.read(iprot);
              struct.setTidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map186 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map186.size);
                String _key187;
                String _val188;
                for (int _i189 = 0; _i189 < _map186.size; ++_i189)
                {
                  _key187 = iprot.readString();
                  _val188 = iprot.readString();
                  struct.extraMap.put(_key187, _val188);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimRoster struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subscription != null) {
        oprot.writeFieldBegin(SUBSCRIPTION_FIELD_DESC);
        oprot.writeString(struct.subscription);
        oprot.writeFieldEnd();
      }
      if (struct.tid != null) {
        oprot.writeFieldBegin(TID_FIELD_DESC);
        struct.tid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter190 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter190.getKey());
              oprot.writeString(_iter190.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimRosterTupleSchemeFactory implements SchemeFactory {
    public TimRosterTupleScheme getScheme() {
      return new TimRosterTupleScheme();
    }
  }

  private static class TimRosterTupleScheme extends TupleScheme<TimRoster> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimRoster struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.subscription);
      struct.tid.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter191 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter191.getKey());
            oprot.writeString(_iter191.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimRoster struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.subscription = iprot.readString();
      struct.setSubscriptionIsSet(true);
      struct.tid = new Tid();
      struct.tid.read(iprot);
      struct.setTidIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map192 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map192.size);
          String _key193;
          String _val194;
          for (int _i195 = 0; _i195 < _map192.size; ++_i195)
          {
            _key193 = iprot.readString();
            _val194 = iprot.readString();
            struct.extraMap.put(_key193, _val194);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

