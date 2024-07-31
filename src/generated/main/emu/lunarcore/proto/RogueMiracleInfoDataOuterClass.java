// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueMiracleInfoDataOuterClass {
  /**
   * Protobuf type {@code RogueMiracleInfoData}
   */
  public static final class RogueMiracleInfoData extends ProtoMessage<RogueMiracleInfoData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 BAILOBNCIGP = 4;</code>
     */
    private int bAILOBNCIGP;

    /**
     * <code>optional uint32 BDDANOBJMEL = 8;</code>
     */
    private int bDDANOBJMEL;

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     */
    private final RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> rogueMiracleList = RepeatedMessage.newEmptyInstance(RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo.getFactory());

    private RogueMiracleInfoData() {
    }

    /**
     * @return a new empty instance of {@code RogueMiracleInfoData}
     */
    public static RogueMiracleInfoData newInstance() {
      return new RogueMiracleInfoData();
    }

    /**
     * <code>optional uint32 BAILOBNCIGP = 4;</code>
     * @return whether the bAILOBNCIGP field is set
     */
    public boolean hasBAILOBNCIGP() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 BAILOBNCIGP = 4;</code>
     * @return this
     */
    public RogueMiracleInfoData clearBAILOBNCIGP() {
      bitField0_ &= ~0x00000001;
      bAILOBNCIGP = 0;
      return this;
    }

    /**
     * <code>optional uint32 BAILOBNCIGP = 4;</code>
     * @return the bAILOBNCIGP
     */
    public int getBAILOBNCIGP() {
      return bAILOBNCIGP;
    }

    /**
     * <code>optional uint32 BAILOBNCIGP = 4;</code>
     * @param value the bAILOBNCIGP to set
     * @return this
     */
    public RogueMiracleInfoData setBAILOBNCIGP(final int value) {
      bitField0_ |= 0x00000001;
      bAILOBNCIGP = value;
      return this;
    }

    /**
     * <code>optional uint32 BDDANOBJMEL = 8;</code>
     * @return whether the bDDANOBJMEL field is set
     */
    public boolean hasBDDANOBJMEL() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 BDDANOBJMEL = 8;</code>
     * @return this
     */
    public RogueMiracleInfoData clearBDDANOBJMEL() {
      bitField0_ &= ~0x00000002;
      bDDANOBJMEL = 0;
      return this;
    }

    /**
     * <code>optional uint32 BDDANOBJMEL = 8;</code>
     * @return the bDDANOBJMEL
     */
    public int getBDDANOBJMEL() {
      return bDDANOBJMEL;
    }

    /**
     * <code>optional uint32 BDDANOBJMEL = 8;</code>
     * @param value the bDDANOBJMEL to set
     * @return this
     */
    public RogueMiracleInfoData setBDDANOBJMEL(final int value) {
      bitField0_ |= 0x00000002;
      bDDANOBJMEL = value;
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     * @return whether the rogueMiracleList field is set
     */
    public boolean hasRogueMiracleList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     * @return this
     */
    public RogueMiracleInfoData clearRogueMiracleList() {
      bitField0_ &= ~0x00000004;
      rogueMiracleList.clear();
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueMiracleList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> getRogueMiracleList(
        ) {
      return rogueMiracleList;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> getMutableRogueMiracleList(
        ) {
      bitField0_ |= 0x00000004;
      return rogueMiracleList;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     * @param value the rogueMiracleList to add
     * @return this
     */
    public RogueMiracleInfoData addRogueMiracleList(
        final RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo value) {
      bitField0_ |= 0x00000004;
      rogueMiracleList.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_list = 6;</code>
     * @param values the rogueMiracleList to add
     * @return this
     */
    public RogueMiracleInfoData addAllRogueMiracleList(
        final RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo... values) {
      bitField0_ |= 0x00000004;
      rogueMiracleList.addAll(values);
      return this;
    }

    @Override
    public RogueMiracleInfoData copyFrom(final RogueMiracleInfoData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        bAILOBNCIGP = other.bAILOBNCIGP;
        bDDANOBJMEL = other.bDDANOBJMEL;
        rogueMiracleList.copyFrom(other.rogueMiracleList);
      }
      return this;
    }

    @Override
    public RogueMiracleInfoData mergeFrom(final RogueMiracleInfoData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBAILOBNCIGP()) {
        setBAILOBNCIGP(other.bAILOBNCIGP);
      }
      if (other.hasBDDANOBJMEL()) {
        setBDDANOBJMEL(other.bDDANOBJMEL);
      }
      if (other.hasRogueMiracleList()) {
        getMutableRogueMiracleList().addAll(other.rogueMiracleList);
      }
      return this;
    }

    @Override
    public RogueMiracleInfoData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bAILOBNCIGP = 0;
      bDDANOBJMEL = 0;
      rogueMiracleList.clear();
      return this;
    }

    @Override
    public RogueMiracleInfoData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMiracleList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueMiracleInfoData)) {
        return false;
      }
      RogueMiracleInfoData other = (RogueMiracleInfoData) o;
      return bitField0_ == other.bitField0_
        && (!hasBAILOBNCIGP() || bAILOBNCIGP == other.bAILOBNCIGP)
        && (!hasBDDANOBJMEL() || bDDANOBJMEL == other.bDDANOBJMEL)
        && (!hasRogueMiracleList() || rogueMiracleList.equals(other.rogueMiracleList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(bAILOBNCIGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(bDDANOBJMEL);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < rogueMiracleList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(rogueMiracleList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bAILOBNCIGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bDDANOBJMEL);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * rogueMiracleList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueMiracleList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueMiracleInfoData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // bAILOBNCIGP
            bAILOBNCIGP = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // bDDANOBJMEL
            bDDANOBJMEL = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // rogueMiracleList
            tag = input.readRepeatedMessage(rogueMiracleList, tag);
            bitField0_ |= 0x00000004;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.bAILOBNCIGP, bAILOBNCIGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.bDDANOBJMEL, bDDANOBJMEL);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.rogueMiracleList, rogueMiracleList);
      }
      output.endObject();
    }

    @Override
    public RogueMiracleInfoData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1343202120: {
            if (input.isAtField(FieldNames.bAILOBNCIGP)) {
              if (!input.trySkipNullValue()) {
                bAILOBNCIGP = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1316239828: {
            if (input.isAtField(FieldNames.bDDANOBJMEL)) {
              if (!input.trySkipNullValue()) {
                bDDANOBJMEL = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -452426123:
          case 1925521905: {
            if (input.isAtField(FieldNames.rogueMiracleList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueMiracleList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueMiracleInfoData clone() {
      return new RogueMiracleInfoData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueMiracleInfoData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), data).checkInitialized();
    }

    public static RogueMiracleInfoData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), input).checkInitialized();
    }

    public static RogueMiracleInfoData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueMiracleInfoData messages
     */
    public static MessageFactory<RogueMiracleInfoData> getFactory() {
      return RogueMiracleInfoDataFactory.INSTANCE;
    }

    private enum RogueMiracleInfoDataFactory implements MessageFactory<RogueMiracleInfoData> {
      INSTANCE;

      @Override
      public RogueMiracleInfoData create() {
        return RogueMiracleInfoData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName bAILOBNCIGP = FieldName.forField("BAILOBNCIGP");

      static final FieldName bDDANOBJMEL = FieldName.forField("BDDANOBJMEL");

      static final FieldName rogueMiracleList = FieldName.forField("rogueMiracleList", "rogue_miracle_list");
    }
  }
}
