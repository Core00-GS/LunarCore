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

public final class RogueActionResultDataOuterClass {
  /**
   * Protobuf type {@code RogueActionResultData}
   */
  public static final class RogueActionResultData extends ProtoMessage<RogueActionResultData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     */
    private final RogueVirtualItemDataOuterClass.RogueVirtualItemData addItemList = RogueVirtualItemDataOuterClass.RogueVirtualItemData.newInstance();

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     */
    private final RogueVirtualItemDataOuterClass.RogueVirtualItemData removeItemList = RogueVirtualItemDataOuterClass.RogueVirtualItemData.newInstance();

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     */
    private final RogueMiracleDataOuterClass.RogueMiracleData addMiracleList = RogueMiracleDataOuterClass.RogueMiracleData.newInstance();

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     */
    private final RogueBuffDataOuterClass.RogueBuffData removeBuffList = RogueBuffDataOuterClass.RogueBuffData.newInstance();

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     */
    private final RogueBuffDataOuterClass.RogueBuffData addBuffList = RogueBuffDataOuterClass.RogueBuffData.newInstance();

    private RogueActionResultData() {
    }

    /**
     * @return a new empty instance of {@code RogueActionResultData}
     */
    public static RogueActionResultData newInstance() {
      return new RogueActionResultData();
    }

    public boolean hasResultAction() {
      return (((bitField0_ & 0x0000001f)) != 0);
    }

    public RogueActionResultData clearResultAction() {
      if (hasResultAction()) {
        clearAddItemList();
        clearRemoveItemList();
        clearAddMiracleList();
        clearRemoveBuffList();
        clearAddBuffList();
      }
      return this;
    }

    private void clearResultActionOtherAddItemList() {
      if ((((bitField0_ & 0x0000001e)) != 0)) {
        clearRemoveItemList();
        clearAddMiracleList();
        clearRemoveBuffList();
        clearAddBuffList();
      }
    }

    private void clearResultActionOtherRemoveItemList() {
      if ((((bitField0_ & 0x0000001d)) != 0)) {
        clearAddItemList();
        clearAddMiracleList();
        clearRemoveBuffList();
        clearAddBuffList();
      }
    }

    private void clearResultActionOtherAddMiracleList() {
      if ((((bitField0_ & 0x0000001b)) != 0)) {
        clearAddItemList();
        clearRemoveItemList();
        clearRemoveBuffList();
        clearAddBuffList();
      }
    }

    private void clearResultActionOtherRemoveBuffList() {
      if ((((bitField0_ & 0x00000017)) != 0)) {
        clearAddItemList();
        clearRemoveItemList();
        clearAddMiracleList();
        clearAddBuffList();
      }
    }

    private void clearResultActionOtherAddBuffList() {
      if ((((bitField0_ & 0x0000000f)) != 0)) {
        clearAddItemList();
        clearRemoveItemList();
        clearAddMiracleList();
        clearRemoveBuffList();
      }
    }

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     * @return whether the addItemList field is set
     */
    public boolean hasAddItemList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     * @return this
     */
    public RogueActionResultData clearAddItemList() {
      bitField0_ &= ~0x00000001;
      addItemList.clear();
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAddItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueVirtualItemDataOuterClass.RogueVirtualItemData getAddItemList() {
      return addItemList;
    }

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueVirtualItemDataOuterClass.RogueVirtualItemData getMutableAddItemList() {
      clearResultActionOtherAddItemList();
      bitField0_ |= 0x00000001;
      return addItemList;
    }

    /**
     * <code>optional .RogueVirtualItemData add_item_list = 4;</code>
     * @param value the addItemList to set
     * @return this
     */
    public RogueActionResultData setAddItemList(
        final RogueVirtualItemDataOuterClass.RogueVirtualItemData value) {
      clearResultActionOtherAddItemList();
      bitField0_ |= 0x00000001;
      addItemList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     * @return whether the removeItemList field is set
     */
    public boolean hasRemoveItemList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     * @return this
     */
    public RogueActionResultData clearRemoveItemList() {
      bitField0_ &= ~0x00000002;
      removeItemList.clear();
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRemoveItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueVirtualItemDataOuterClass.RogueVirtualItemData getRemoveItemList() {
      return removeItemList;
    }

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueVirtualItemDataOuterClass.RogueVirtualItemData getMutableRemoveItemList() {
      clearResultActionOtherRemoveItemList();
      bitField0_ |= 0x00000002;
      return removeItemList;
    }

    /**
     * <code>optional .RogueVirtualItemData remove_item_list = 10;</code>
     * @param value the removeItemList to set
     * @return this
     */
    public RogueActionResultData setRemoveItemList(
        final RogueVirtualItemDataOuterClass.RogueVirtualItemData value) {
      clearResultActionOtherRemoveItemList();
      bitField0_ |= 0x00000002;
      removeItemList.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     * @return whether the addMiracleList field is set
     */
    public boolean hasAddMiracleList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     * @return this
     */
    public RogueActionResultData clearAddMiracleList() {
      bitField0_ &= ~0x00000004;
      addMiracleList.clear();
      return this;
    }

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAddMiracleList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleDataOuterClass.RogueMiracleData getAddMiracleList() {
      return addMiracleList;
    }

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleDataOuterClass.RogueMiracleData getMutableAddMiracleList() {
      clearResultActionOtherAddMiracleList();
      bitField0_ |= 0x00000004;
      return addMiracleList;
    }

    /**
     * <pre>
     *  idk
     * </pre>
     *
     * <code>optional .RogueMiracleData add_miracle_list = 11;</code>
     * @param value the addMiracleList to set
     * @return this
     */
    public RogueActionResultData setAddMiracleList(
        final RogueMiracleDataOuterClass.RogueMiracleData value) {
      clearResultActionOtherAddMiracleList();
      bitField0_ |= 0x00000004;
      addMiracleList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     * @return whether the removeBuffList field is set
     */
    public boolean hasRemoveBuffList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     * @return this
     */
    public RogueActionResultData clearRemoveBuffList() {
      bitField0_ &= ~0x00000008;
      removeBuffList.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRemoveBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffDataOuterClass.RogueBuffData getRemoveBuffList() {
      return removeBuffList;
    }

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffDataOuterClass.RogueBuffData getMutableRemoveBuffList() {
      clearResultActionOtherRemoveBuffList();
      bitField0_ |= 0x00000008;
      return removeBuffList;
    }

    /**
     * <code>optional .RogueBuffData remove_buff_list = 1544;</code>
     * @param value the removeBuffList to set
     * @return this
     */
    public RogueActionResultData setRemoveBuffList(
        final RogueBuffDataOuterClass.RogueBuffData value) {
      clearResultActionOtherRemoveBuffList();
      bitField0_ |= 0x00000008;
      removeBuffList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     * @return whether the addBuffList field is set
     */
    public boolean hasAddBuffList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     * @return this
     */
    public RogueActionResultData clearAddBuffList() {
      bitField0_ &= ~0x00000010;
      addBuffList.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAddBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffDataOuterClass.RogueBuffData getAddBuffList() {
      return addBuffList;
    }

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffDataOuterClass.RogueBuffData getMutableAddBuffList() {
      clearResultActionOtherAddBuffList();
      bitField0_ |= 0x00000010;
      return addBuffList;
    }

    /**
     * <code>optional .RogueBuffData add_buff_list = 1884;</code>
     * @param value the addBuffList to set
     * @return this
     */
    public RogueActionResultData setAddBuffList(final RogueBuffDataOuterClass.RogueBuffData value) {
      clearResultActionOtherAddBuffList();
      bitField0_ |= 0x00000010;
      addBuffList.copyFrom(value);
      return this;
    }

    @Override
    public RogueActionResultData copyFrom(final RogueActionResultData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        addItemList.copyFrom(other.addItemList);
        removeItemList.copyFrom(other.removeItemList);
        addMiracleList.copyFrom(other.addMiracleList);
        removeBuffList.copyFrom(other.removeBuffList);
        addBuffList.copyFrom(other.addBuffList);
      }
      return this;
    }

    @Override
    public RogueActionResultData mergeFrom(final RogueActionResultData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAddItemList()) {
        getMutableAddItemList().mergeFrom(other.addItemList);
      }
      if (other.hasRemoveItemList()) {
        getMutableRemoveItemList().mergeFrom(other.removeItemList);
      }
      if (other.hasAddMiracleList()) {
        getMutableAddMiracleList().mergeFrom(other.addMiracleList);
      }
      if (other.hasRemoveBuffList()) {
        getMutableRemoveBuffList().mergeFrom(other.removeBuffList);
      }
      if (other.hasAddBuffList()) {
        getMutableAddBuffList().mergeFrom(other.addBuffList);
      }
      return this;
    }

    @Override
    public RogueActionResultData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      addItemList.clear();
      removeItemList.clear();
      addMiracleList.clear();
      removeBuffList.clear();
      addBuffList.clear();
      return this;
    }

    @Override
    public RogueActionResultData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      addItemList.clearQuick();
      removeItemList.clearQuick();
      addMiracleList.clearQuick();
      removeBuffList.clearQuick();
      addBuffList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueActionResultData)) {
        return false;
      }
      RogueActionResultData other = (RogueActionResultData) o;
      return bitField0_ == other.bitField0_
        && (!hasAddItemList() || addItemList.equals(other.addItemList))
        && (!hasRemoveItemList() || removeItemList.equals(other.removeItemList))
        && (!hasAddMiracleList() || addMiracleList.equals(other.addMiracleList))
        && (!hasRemoveBuffList() || removeBuffList.equals(other.removeBuffList))
        && (!hasAddBuffList() || addBuffList.equals(other.addBuffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(addItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(removeItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(addMiracleList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawLittleEndian16((short) 24770);
        output.writeMessageNoTag(removeBuffList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawLittleEndian16((short) 30178);
        output.writeMessageNoTag(addBuffList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(addItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(removeItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(addMiracleList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(removeBuffList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(addBuffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueActionResultData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // addItemList
            clearResultActionOtherAddItemList();
            input.readMessage(addItemList);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // removeItemList
            clearResultActionOtherRemoveItemList();
            input.readMessage(removeItemList);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // addMiracleList
            clearResultActionOtherAddMiracleList();
            input.readMessage(addMiracleList);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 12354) {
              break;
            }
          }
          case 12354: {
            // removeBuffList
            clearResultActionOtherRemoveBuffList();
            input.readMessage(removeBuffList);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 15074) {
              break;
            }
          }
          case 15074: {
            // addBuffList
            clearResultActionOtherAddBuffList();
            input.readMessage(addBuffList);
            bitField0_ |= 0x00000010;
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
        output.writeMessage(FieldNames.addItemList, addItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.removeItemList, removeItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.addMiracleList, addMiracleList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.removeBuffList, removeBuffList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.addBuffList, addBuffList);
      }
      output.endObject();
    }

    @Override
    public RogueActionResultData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 203000338:
          case -1308770260: {
            if (input.isAtField(FieldNames.addItemList)) {
              if (!input.trySkipNullValue()) {
                clearResultActionOtherAddItemList();
                input.readMessage(addItemList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -417171723:
          case -293666737: {
            if (input.isAtField(FieldNames.removeItemList)) {
              if (!input.trySkipNullValue()) {
                clearResultActionOtherRemoveItemList();
                input.readMessage(removeItemList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1381554510:
          case -850648438: {
            if (input.isAtField(FieldNames.addMiracleList)) {
              if (!input.trySkipNullValue()) {
                clearResultActionOtherAddMiracleList();
                input.readMessage(addMiracleList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1177726005:
          case 1903522575: {
            if (input.isAtField(FieldNames.removeBuffList)) {
              if (!input.trySkipNullValue()) {
                clearResultActionOtherRemoveBuffList();
                input.readMessage(removeBuffList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1797898066:
          case 888419052: {
            if (input.isAtField(FieldNames.addBuffList)) {
              if (!input.trySkipNullValue()) {
                clearResultActionOtherAddBuffList();
                input.readMessage(addBuffList);
                bitField0_ |= 0x00000010;
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
    public RogueActionResultData clone() {
      return new RogueActionResultData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueActionResultData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueActionResultData(), data).checkInitialized();
    }

    public static RogueActionResultData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueActionResultData(), input).checkInitialized();
    }

    public static RogueActionResultData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueActionResultData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueActionResultData messages
     */
    public static MessageFactory<RogueActionResultData> getFactory() {
      return RogueActionResultDataFactory.INSTANCE;
    }

    private enum RogueActionResultDataFactory implements MessageFactory<RogueActionResultData> {
      INSTANCE;

      @Override
      public RogueActionResultData create() {
        return RogueActionResultData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName addItemList = FieldName.forField("addItemList", "add_item_list");

      static final FieldName removeItemList = FieldName.forField("removeItemList", "remove_item_list");

      static final FieldName addMiracleList = FieldName.forField("addMiracleList", "add_miracle_list");

      static final FieldName removeBuffList = FieldName.forField("removeBuffList", "remove_buff_list");

      static final FieldName addBuffList = FieldName.forField("addBuffList", "add_buff_list");
    }
  }
}
