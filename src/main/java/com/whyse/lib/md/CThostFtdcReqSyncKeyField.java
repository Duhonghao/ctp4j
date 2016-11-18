package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u05fa\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06b1\ufffd\ufffd\u0337\ufffd\ufffd\ufffd\ufffd\ufffd\u053f\u036c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3549</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcReqSyncKeyField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public CThostFtdcReqSyncKeyField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public CThostFtdcReqSyncKeyField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public CThostFtdcReqSyncKeyField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(12) 
	public int InstallID() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(12) 
	public CThostFtdcReqSyncKeyField InstallID(int InstallID) {
		this.io.setIntField(this, 12, InstallID);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(13) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcAddInfoType */
	@Array({129}) 
	@Field(14) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcDeviceIDType */
	@Array({3}) 
	@Field(15) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcBankCodingForFutureType */
	@Array({33}) 
	@Field(16) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcOperNoType */
	@Array({17}) 
	@Field(17) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(18) 
	public int RequestID() {
		return this.io.getIntField(this, 18);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(18) 
	public CThostFtdcReqSyncKeyField RequestID(int RequestID) {
		this.io.setIntField(this, 18, RequestID);
		return this;
	}
	/** C type : TThostFtdcTIDType */
	@Field(19) 
	public int TID() {
		return this.io.getIntField(this, 19);
	}
	/** C type : TThostFtdcTIDType */
	@Field(19) 
	public CThostFtdcReqSyncKeyField TID(int TID) {
		this.io.setIntField(this, 19, TID);
		return this;
	}
	public CThostFtdcReqSyncKeyField() {
		super();
	}
	public CThostFtdcReqSyncKeyField(Pointer pointer) {
		super(pointer);
	}
}
