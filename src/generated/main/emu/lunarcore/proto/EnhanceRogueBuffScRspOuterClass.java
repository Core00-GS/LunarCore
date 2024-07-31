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

public final class EnhanceRogueBuffScRspOuterClass {
  /**
   * Protobuf type {@code EnhanceRogueBuffScRsp}
   */
  public static final class EnhanceRogueBuffScRsp extends ProtoMessage<EnhanceRogueBuffScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>optional bool is_success = 3;</code>
     */
    private boolean isSuccess;

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     */
    private final RogueBuffOuterClass.RogueBuff rogueBuff = RogueBuffOuterClass.RogueBuff.newInstance();

    private EnhanceRogueBuffScRsp() {
    }

    /**
     * @return a new empty instance of {@code EnhanceRogueBuffScRsp}
     */
    public static EnhanceRogueBuffScRsp newInstance() {
      return new EnhanceRogueBuffScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public EnhanceRogueBuffScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public EnhanceRogueBuffScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool is_success = 3;</code>
     * @return whether the isSuccess field is set
     */
    public boolean hasIsSuccess() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_success = 3;</code>
     * @return this
     */
    public EnhanceRogueBuffScRsp clearIsSuccess() {
      bitField0_ &= ~0x00000002;
      isSuccess = false;
      return this;
    }

    /**
     * <code>optional bool is_success = 3;</code>
     * @return the isSuccess
     */
    public boolean getIsSuccess() {
      return isSuccess;
    }

    /**
     * <code>optional bool is_success = 3;</code>
     * @param value the isSuccess to set
     * @return this
     */
    public EnhanceRogueBuffScRsp setIsSuccess(final boolean value) {
      bitField0_ |= 0x00000002;
      isSuccess = value;
      return this;
    }

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     * @return whether the rogueBuff field is set
     */
    public boolean hasRogueBuff() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     * @return this
     */
    public EnhanceRogueBuffScRsp clearRogueBuff() {
      bitField0_ &= ~0x00000004;
      rogueBuff.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueBuff()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffOuterClass.RogueBuff getRogueBuff() {
      return rogueBuff;
    }

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffOuterClass.RogueBuff getMutableRogueBuff() {
      bitField0_ |= 0x00000004;
      return rogueBuff;
    }

    /**
     * <code>optional .RogueBuff rogue_buff = 11;</code>
     * @param value the rogueBuff to set
     * @return this
     */
    public EnhanceRogueBuffScRsp setRogueBuff(final RogueBuffOuterClass.RogueBuff value) {
      bitField0_ |= 0x00000004;
      rogueBuff.copyFrom(value);
      return this;
    }

    @Override
    public EnhanceRogueBuffScRsp copyFrom(final EnhanceRogueBuffScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        isSuccess = other.isSuccess;
        rogueBuff.copyFrom(other.rogueBuff);
      }
      return this;
    }

    @Override
    public EnhanceRogueBuffScRsp mergeFrom(final EnhanceRogueBuffScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIsSuccess()) {
        setIsSuccess(other.isSuccess);
      }
      if (other.hasRogueBuff()) {
        getMutableRogueBuff().mergeFrom(other.rogueBuff);
      }
      return this;
    }

    @Override
    public EnhanceRogueBuffScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      isSuccess = false;
      rogueBuff.clear();
      return this;
    }

    @Override
    public EnhanceRogueBuffScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueBuff.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EnhanceRogueBuffScRsp)) {
        return false;
      }
      EnhanceRogueBuffScRsp other = (EnhanceRogueBuffScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIsSuccess() || isSuccess == other.isSuccess)
        && (!hasRogueBuff() || rogueBuff.equals(other.rogueBuff));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeBoolNoTag(isSuccess);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(rogueBuff);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueBuff);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnhanceRogueBuffScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // isSuccess
            isSuccess = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // rogueBuff
            input.readMessage(rogueBuff);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isSuccess, isSuccess);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueBuff, rogueBuff);
      }
      output.endObject();
    }

    @Override
    public EnhanceRogueBuffScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1848018809:
          case -366859794: {
            if (input.isAtField(FieldNames.isSuccess)) {
              if (!input.trySkipNullValue()) {
                isSuccess = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655607117:
          case -1124785256: {
            if (input.isAtField(FieldNames.rogueBuff)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueBuff);
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
    public EnhanceRogueBuffScRsp clone() {
      return new EnhanceRogueBuffScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnhanceRogueBuffScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnhanceRogueBuffScRsp(), data).checkInitialized();
    }

    public static EnhanceRogueBuffScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnhanceRogueBuffScRsp(), input).checkInitialized();
    }

    public static EnhanceRogueBuffScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnhanceRogueBuffScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnhanceRogueBuffScRsp messages
     */
    public static MessageFactory<EnhanceRogueBuffScRsp> getFactory() {
      return EnhanceRogueBuffScRspFactory.INSTANCE;
    }

    private enum EnhanceRogueBuffScRspFactory implements MessageFactory<EnhanceRogueBuffScRsp> {
      INSTANCE;

      @Override
      public EnhanceRogueBuffScRsp create() {
        return EnhanceRogueBuffScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName isSuccess = FieldName.forField("isSuccess", "is_success");

      static final FieldName rogueBuff = FieldName.forField("rogueBuff", "rogue_buff");
    }
  }
}
