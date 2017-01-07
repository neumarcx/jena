/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.jena.riot.thrift.wire;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

@SuppressWarnings("all")
public class RDF_Quad implements org.apache.thrift.TBase<RDF_Quad, RDF_Quad._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RDF_Quad");

  private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("S", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField P_FIELD_DESC = new org.apache.thrift.protocol.TField("P", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField O_FIELD_DESC = new org.apache.thrift.protocol.TField("O", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField G_FIELD_DESC = new org.apache.thrift.protocol.TField("G", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RDF_QuadStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RDF_QuadTupleSchemeFactory());
  }

  public RDF_Term S; // required
  public RDF_Term P; // required
  public RDF_Term O; // required
  public RDF_Term G; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    S((short)1, "S"),
    P((short)2, "P"),
    O((short)3, "O"),
    G((short)4, "G");

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
        case 1: // S
          return S;
        case 2: // P
          return P;
        case 3: // O
          return O;
        case 4: // G
          return G;
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
  private _Fields optionals[] = {_Fields.G};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.S, new org.apache.thrift.meta_data.FieldMetaData("S", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.P, new org.apache.thrift.meta_data.FieldMetaData("P", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.O, new org.apache.thrift.meta_data.FieldMetaData("O", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    tmpMap.put(_Fields.G, new org.apache.thrift.meta_data.FieldMetaData("G", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RDF_Term.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RDF_Quad.class, metaDataMap);
  }

  public RDF_Quad() {
  }

  public RDF_Quad(
    RDF_Term S,
    RDF_Term P,
    RDF_Term O)
  {
    this();
    this.S = S;
    this.P = P;
    this.O = O;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RDF_Quad(RDF_Quad other) {
    if (other.isSetS()) {
      this.S = new RDF_Term(other.S);
    }
    if (other.isSetP()) {
      this.P = new RDF_Term(other.P);
    }
    if (other.isSetO()) {
      this.O = new RDF_Term(other.O);
    }
    if (other.isSetG()) {
      this.G = new RDF_Term(other.G);
    }
  }

  public RDF_Quad deepCopy() {
    return new RDF_Quad(this);
  }

  @Override
  public void clear() {
    this.S = null;
    this.P = null;
    this.O = null;
    this.G = null;
  }

  public RDF_Term getS() {
    return this.S;
  }

  public RDF_Quad setS(RDF_Term S) {
    this.S = S;
    return this;
  }

  public void unsetS() {
    this.S = null;
  }

  /** Returns true if field S is set (has been assigned a value) and false otherwise */
  public boolean isSetS() {
    return this.S != null;
  }

  public void setSIsSet(boolean value) {
    if (!value) {
      this.S = null;
    }
  }

  public RDF_Term getP() {
    return this.P;
  }

  public RDF_Quad setP(RDF_Term P) {
    this.P = P;
    return this;
  }

  public void unsetP() {
    this.P = null;
  }

  /** Returns true if field P is set (has been assigned a value) and false otherwise */
  public boolean isSetP() {
    return this.P != null;
  }

  public void setPIsSet(boolean value) {
    if (!value) {
      this.P = null;
    }
  }

  public RDF_Term getO() {
    return this.O;
  }

  public RDF_Quad setO(RDF_Term O) {
    this.O = O;
    return this;
  }

  public void unsetO() {
    this.O = null;
  }

  /** Returns true if field O is set (has been assigned a value) and false otherwise */
  public boolean isSetO() {
    return this.O != null;
  }

  public void setOIsSet(boolean value) {
    if (!value) {
      this.O = null;
    }
  }

  public RDF_Term getG() {
    return this.G;
  }

  public RDF_Quad setG(RDF_Term G) {
    this.G = G;
    return this;
  }

  public void unsetG() {
    this.G = null;
  }

  /** Returns true if field G is set (has been assigned a value) and false otherwise */
  public boolean isSetG() {
    return this.G != null;
  }

  public void setGIsSet(boolean value) {
    if (!value) {
      this.G = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case S:
      if (value == null) {
        unsetS();
      } else {
        setS((RDF_Term)value);
      }
      break;

    case P:
      if (value == null) {
        unsetP();
      } else {
        setP((RDF_Term)value);
      }
      break;

    case O:
      if (value == null) {
        unsetO();
      } else {
        setO((RDF_Term)value);
      }
      break;

    case G:
      if (value == null) {
        unsetG();
      } else {
        setG((RDF_Term)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case S:
      return getS();

    case P:
      return getP();

    case O:
      return getO();

    case G:
      return getG();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case S:
      return isSetS();
    case P:
      return isSetP();
    case O:
      return isSetO();
    case G:
      return isSetG();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RDF_Quad)
      return this.equals((RDF_Quad)that);
    return false;
  }

  public boolean equals(RDF_Quad that) {
    if (that == null)
      return false;

    boolean this_present_S = true && this.isSetS();
    boolean that_present_S = true && that.isSetS();
    if (this_present_S || that_present_S) {
      if (!(this_present_S && that_present_S))
        return false;
      if (!this.S.equals(that.S))
        return false;
    }

    boolean this_present_P = true && this.isSetP();
    boolean that_present_P = true && that.isSetP();
    if (this_present_P || that_present_P) {
      if (!(this_present_P && that_present_P))
        return false;
      if (!this.P.equals(that.P))
        return false;
    }

    boolean this_present_O = true && this.isSetO();
    boolean that_present_O = true && that.isSetO();
    if (this_present_O || that_present_O) {
      if (!(this_present_O && that_present_O))
        return false;
      if (!this.O.equals(that.O))
        return false;
    }

    boolean this_present_G = true && this.isSetG();
    boolean that_present_G = true && that.isSetG();
    if (this_present_G || that_present_G) {
      if (!(this_present_G && that_present_G))
        return false;
      if (!this.G.equals(that.G))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RDF_Quad other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RDF_Quad typedOther = (RDF_Quad)other;

    lastComparison = Boolean.valueOf(isSetS()).compareTo(typedOther.isSetS());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetS()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.S, typedOther.S);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetP()).compareTo(typedOther.isSetP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.P, typedOther.P);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetO()).compareTo(typedOther.isSetO());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetO()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.O, typedOther.O);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetG()).compareTo(typedOther.isSetG());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetG()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.G, typedOther.G);
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
    StringBuilder sb = new StringBuilder("RDF_Quad(");
    boolean first = true;

    sb.append("S:");
    if (this.S == null) {
      sb.append("null");
    } else {
      sb.append(this.S);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("P:");
    if (this.P == null) {
      sb.append("null");
    } else {
      sb.append(this.P);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("O:");
    if (this.O == null) {
      sb.append("null");
    } else {
      sb.append(this.O);
    }
    first = false;
    if (isSetG()) {
      if (!first) sb.append(", ");
      sb.append("G:");
      if (this.G == null) {
        sb.append("null");
      } else {
        sb.append(this.G);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (S == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'S' was not present! Struct: " + toString());
    }
    if (P == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'P' was not present! Struct: " + toString());
    }
    if (O == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'O' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class RDF_QuadStandardSchemeFactory implements SchemeFactory {
    public RDF_QuadStandardScheme getScheme() {
      return new RDF_QuadStandardScheme();
    }
  }

  private static class RDF_QuadStandardScheme extends StandardScheme<RDF_Quad> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RDF_Quad struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // S
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.S = new RDF_Term();
              struct.S.read(iprot);
              struct.setSIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // P
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.P = new RDF_Term();
              struct.P.read(iprot);
              struct.setPIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // O
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.O = new RDF_Term();
              struct.O.read(iprot);
              struct.setOIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // G
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.G = new RDF_Term();
              struct.G.read(iprot);
              struct.setGIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RDF_Quad struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.S != null) {
        oprot.writeFieldBegin(S_FIELD_DESC);
        struct.S.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.P != null) {
        oprot.writeFieldBegin(P_FIELD_DESC);
        struct.P.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.O != null) {
        oprot.writeFieldBegin(O_FIELD_DESC);
        struct.O.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.G != null) {
        if (struct.isSetG()) {
          oprot.writeFieldBegin(G_FIELD_DESC);
          struct.G.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RDF_QuadTupleSchemeFactory implements SchemeFactory {
    public RDF_QuadTupleScheme getScheme() {
      return new RDF_QuadTupleScheme();
    }
  }

  private static class RDF_QuadTupleScheme extends TupleScheme<RDF_Quad> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RDF_Quad struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.S.write(oprot);
      struct.P.write(oprot);
      struct.O.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetG()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetG()) {
        struct.G.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RDF_Quad struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.S = new RDF_Term();
      struct.S.read(iprot);
      struct.setSIsSet(true);
      struct.P = new RDF_Term();
      struct.P.read(iprot);
      struct.setPIsSet(true);
      struct.O = new RDF_Term();
      struct.O.read(iprot);
      struct.setOIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.G = new RDF_Term();
        struct.G.read(iprot);
        struct.setGIsSet(true);
      }
    }
  }

}

