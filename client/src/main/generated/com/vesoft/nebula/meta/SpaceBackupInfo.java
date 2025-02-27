/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class SpaceBackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<SpaceBackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("SpaceBackupInfo");
  private static final TField SPACE_FIELD_DESC = new TField("space", TType.STRUCT, (short)1);
  private static final TField HOST_BACKUPS_FIELD_DESC = new TField("host_backups", TType.LIST, (short)2);

  public SpaceDesc space;
  public List<HostBackupInfo> host_backups;
  public static final int SPACE = 1;
  public static final int HOST_BACKUPS = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE, new FieldMetaData("space", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, SpaceDesc.class)));
    tmpMetaDataMap.put(HOST_BACKUPS, new FieldMetaData("host_backups", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, HostBackupInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(SpaceBackupInfo.class, metaDataMap);
  }

  public SpaceBackupInfo() {
  }

  public SpaceBackupInfo(
      SpaceDesc space,
      List<HostBackupInfo> host_backups) {
    this();
    this.space = space;
    this.host_backups = host_backups;
  }

  public static class Builder {
    private SpaceDesc space;
    private List<HostBackupInfo> host_backups;

    public Builder() {
    }

    public Builder setSpace(final SpaceDesc space) {
      this.space = space;
      return this;
    }

    public Builder setHost_backups(final List<HostBackupInfo> host_backups) {
      this.host_backups = host_backups;
      return this;
    }

    public SpaceBackupInfo build() {
      SpaceBackupInfo result = new SpaceBackupInfo();
      result.setSpace(this.space);
      result.setHost_backups(this.host_backups);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpaceBackupInfo(SpaceBackupInfo other) {
    if (other.isSetSpace()) {
      this.space = TBaseHelper.deepCopy(other.space);
    }
    if (other.isSetHost_backups()) {
      this.host_backups = TBaseHelper.deepCopy(other.host_backups);
    }
  }

  public SpaceBackupInfo deepCopy() {
    return new SpaceBackupInfo(this);
  }

  public SpaceDesc getSpace() {
    return this.space;
  }

  public SpaceBackupInfo setSpace(SpaceDesc space) {
    this.space = space;
    return this;
  }

  public void unsetSpace() {
    this.space = null;
  }

  // Returns true if field space is set (has been assigned a value) and false otherwise
  public boolean isSetSpace() {
    return this.space != null;
  }

  public void setSpaceIsSet(boolean __value) {
    if (!__value) {
      this.space = null;
    }
  }

  public List<HostBackupInfo> getHost_backups() {
    return this.host_backups;
  }

  public SpaceBackupInfo setHost_backups(List<HostBackupInfo> host_backups) {
    this.host_backups = host_backups;
    return this;
  }

  public void unsetHost_backups() {
    this.host_backups = null;
  }

  // Returns true if field host_backups is set (has been assigned a value) and false otherwise
  public boolean isSetHost_backups() {
    return this.host_backups != null;
  }

  public void setHost_backupsIsSet(boolean __value) {
    if (!__value) {
      this.host_backups = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE:
      if (__value == null) {
        unsetSpace();
      } else {
        setSpace((SpaceDesc)__value);
      }
      break;

    case HOST_BACKUPS:
      if (__value == null) {
        unsetHost_backups();
      } else {
        setHost_backups((List<HostBackupInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE:
      return getSpace();

    case HOST_BACKUPS:
      return getHost_backups();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof SpaceBackupInfo))
      return false;
    SpaceBackupInfo that = (SpaceBackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetSpace(), that.isSetSpace(), this.space, that.space)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetHost_backups(), that.isSetHost_backups(), this.host_backups, that.host_backups)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space, host_backups});
  }

  @Override
  public int compareTo(SpaceBackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace()).compareTo(other.isSetSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space, other.space);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetHost_backups()).compareTo(other.isSetHost_backups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host_backups, other.host_backups);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE:
          if (__field.type == TType.STRUCT) {
            this.space = new SpaceDesc();
            this.space.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case HOST_BACKUPS:
          if (__field.type == TType.LIST) {
            {
              TList _list269 = iprot.readListBegin();
              this.host_backups = new ArrayList<HostBackupInfo>(Math.max(0, _list269.size));
              for (int _i270 = 0; 
                   (_list269.size < 0) ? iprot.peekList() : (_i270 < _list269.size); 
                   ++_i270)
              {
                HostBackupInfo _elem271;
                _elem271 = new HostBackupInfo();
                _elem271.read(iprot);
                this.host_backups.add(_elem271);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.space != null) {
      oprot.writeFieldBegin(SPACE_FIELD_DESC);
      this.space.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.host_backups != null) {
      oprot.writeFieldBegin(HOST_BACKUPS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.host_backups.size()));
        for (HostBackupInfo _iter272 : this.host_backups)        {
          _iter272.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("SpaceBackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getSpace() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getSpace(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("host_backups");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost_backups() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost_backups(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

