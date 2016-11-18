package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0524\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2420</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcParkedOrderField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcOrderRefType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcOrderPriceTypeType */
	@Field(5) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcOrderPriceTypeType */
	@Field(5) 
	public CThostFtdcParkedOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 5, OrderPriceType);
		return this;
	}
	/** C type : TThostFtdcDirectionType */
	@Field(6) 
	public byte Direction() {
		return this.io.getByteField(this, 6);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(6) 
	public CThostFtdcParkedOrderField Direction(byte Direction) {
		this.io.setByteField(this, 6, Direction);
		return this;
	}
	/** C type : TThostFtdcCombOffsetFlagType */
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcCombHedgeFlagType */
	@Array({5}) 
	@Field(8) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcPriceType */
	@Field(9) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/** C type : TThostFtdcPriceType */
	@Field(9) 
	public CThostFtdcParkedOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 9, LimitPrice);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(10) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 10);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(10) 
	public CThostFtdcParkedOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 10, VolumeTotalOriginal);
		return this;
	}
	/** C type : TThostFtdcTimeConditionType */
	@Field(11) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 11);
	}
	/** C type : TThostFtdcTimeConditionType */
	@Field(11) 
	public CThostFtdcParkedOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 11, TimeCondition);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcVolumeConditionType */
	@Field(13) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcVolumeConditionType */
	@Field(13) 
	public CThostFtdcParkedOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 13, VolumeCondition);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(14) 
	public int MinVolume() {
		return this.io.getIntField(this, 14);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(14) 
	public CThostFtdcParkedOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 14, MinVolume);
		return this;
	}
	/** C type : TThostFtdcContingentConditionType */
	@Field(15) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcContingentConditionType */
	@Field(15) 
	public CThostFtdcParkedOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 15, ContingentCondition);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(16) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 16);
	}
	/** C type : TThostFtdcPriceType */
	@Field(16) 
	public CThostFtdcParkedOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 16, StopPrice);
		return this;
	}
	/** C type : TThostFtdcForceCloseReasonType */
	@Field(17) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 17);
	}
	/** C type : TThostFtdcForceCloseReasonType */
	@Field(17) 
	public CThostFtdcParkedOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 17, ForceCloseReason);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(18) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 18);
	}
	/** C type : TThostFtdcBoolType */
	@Field(18) 
	public CThostFtdcParkedOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 18, IsAutoSuspend);
		return this;
	}
	/** C type : TThostFtdcBusinessUnitType */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(20) 
	public int RequestID() {
		return this.io.getIntField(this, 20);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(20) 
	public CThostFtdcParkedOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 20, RequestID);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(21) 
	public int UserForceClose() {
		return this.io.getIntField(this, 21);
	}
	/** C type : TThostFtdcBoolType */
	@Field(21) 
	public CThostFtdcParkedOrderField UserForceClose(int UserForceClose) {
		this.io.setIntField(this, 21, UserForceClose);
		return this;
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcParkedOrderIDType */
	@Array({13}) 
	@Field(23) 
	public Pointer<Byte > ParkedOrderID() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcUserTypeType */
	@Field(24) 
	public byte UserType() {
		return this.io.getByteField(this, 24);
	}
	/** C type : TThostFtdcUserTypeType */
	@Field(24) 
	public CThostFtdcParkedOrderField UserType(byte UserType) {
		this.io.setByteField(this, 24, UserType);
		return this;
	}
	/** C type : TThostFtdcParkedOrderStatusType */
	@Field(25) 
	public byte Status() {
		return this.io.getByteField(this, 25);
	}
	/** C type : TThostFtdcParkedOrderStatusType */
	@Field(25) 
	public CThostFtdcParkedOrderField Status(byte Status) {
		this.io.setByteField(this, 25, Status);
		return this;
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(26) 
	public int ErrorID() {
		return this.io.getIntField(this, 26);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(26) 
	public CThostFtdcParkedOrderField ErrorID(int ErrorID) {
		this.io.setIntField(this, 26, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(27) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 27);
	}
	/** C type : TThostFtdcBoolType */
	@Field(28) 
	public int IsSwapOrder() {
		return this.io.getIntField(this, 28);
	}
	/** C type : TThostFtdcBoolType */
	@Field(28) 
	public CThostFtdcParkedOrderField IsSwapOrder(int IsSwapOrder) {
		this.io.setIntField(this, 28, IsSwapOrder);
		return this;
	}
	public CThostFtdcParkedOrderField() {
		super();
	}
	public CThostFtdcParkedOrderField(Pointer pointer) {
		super(pointer);
	}
}
