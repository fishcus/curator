/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.curator.generated;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathChildrenCacheProjection implements org.apache.thrift.TBase<PathChildrenCacheProjection, PathChildrenCacheProjection._Fields>, java.io.Serializable, Cloneable, Comparable<PathChildrenCacheProjection> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PathChildrenCacheProjection");

  private static final org.apache.thrift.protocol.TField PROJECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("projection", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PathChildrenCacheProjectionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PathChildrenCacheProjectionTupleSchemeFactory());
  }

  public GenericProjection projection; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROJECTION((short)1, "projection");

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
        case 1: // PROJECTION
          return PROJECTION;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROJECTION, new org.apache.thrift.meta_data.FieldMetaData("projection", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GenericProjection.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PathChildrenCacheProjection.class, metaDataMap);
  }

  public PathChildrenCacheProjection() {
  }

  public PathChildrenCacheProjection(
    GenericProjection projection)
  {
    this();
    this.projection = projection;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PathChildrenCacheProjection(PathChildrenCacheProjection other) {
    if (other.isSetProjection()) {
      this.projection = new GenericProjection(other.projection);
    }
  }

  public PathChildrenCacheProjection deepCopy() {
    return new PathChildrenCacheProjection(this);
  }

  @Override
  public void clear() {
    this.projection = null;
  }

  public GenericProjection getProjection() {
    return this.projection;
  }

  public PathChildrenCacheProjection setProjection(GenericProjection projection) {
    this.projection = projection;
    return this;
  }

  public void unsetProjection() {
    this.projection = null;
  }

  /** Returns true if field projection is set (has been assigned a value) and false otherwise */
  public boolean isSetProjection() {
    return this.projection != null;
  }

  public void setProjectionIsSet(boolean value) {
    if (!value) {
      this.projection = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROJECTION:
      if (value == null) {
        unsetProjection();
      } else {
        setProjection((GenericProjection)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROJECTION:
      return getProjection();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROJECTION:
      return isSetProjection();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PathChildrenCacheProjection)
      return this.equals((PathChildrenCacheProjection)that);
    return false;
  }

  public boolean equals(PathChildrenCacheProjection that) {
    if (that == null)
      return false;

    boolean this_present_projection = true && this.isSetProjection();
    boolean that_present_projection = true && that.isSetProjection();
    if (this_present_projection || that_present_projection) {
      if (!(this_present_projection && that_present_projection))
        return false;
      if (!this.projection.equals(that.projection))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PathChildrenCacheProjection other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProjection()).compareTo(other.isSetProjection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.projection, other.projection);
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
    StringBuilder sb = new StringBuilder("PathChildrenCacheProjection(");
    boolean first = true;

    sb.append("projection:");
    if (this.projection == null) {
      sb.append("null");
    } else {
      sb.append(this.projection);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (projection != null) {
      projection.validate();
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

  private static class PathChildrenCacheProjectionStandardSchemeFactory implements SchemeFactory {
    public PathChildrenCacheProjectionStandardScheme getScheme() {
      return new PathChildrenCacheProjectionStandardScheme();
    }
  }

  private static class PathChildrenCacheProjectionStandardScheme extends StandardScheme<PathChildrenCacheProjection> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PathChildrenCacheProjection struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROJECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.projection = new GenericProjection();
              struct.projection.read(iprot);
              struct.setProjectionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PathChildrenCacheProjection struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.projection != null) {
        oprot.writeFieldBegin(PROJECTION_FIELD_DESC);
        struct.projection.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PathChildrenCacheProjectionTupleSchemeFactory implements SchemeFactory {
    public PathChildrenCacheProjectionTupleScheme getScheme() {
      return new PathChildrenCacheProjectionTupleScheme();
    }
  }

  private static class PathChildrenCacheProjectionTupleScheme extends TupleScheme<PathChildrenCacheProjection> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PathChildrenCacheProjection struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProjection()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetProjection()) {
        struct.projection.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PathChildrenCacheProjection struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.projection = new GenericProjection();
        struct.projection.read(iprot);
        struct.setProjectionIsSet(true);
      }
    }
  }

}

