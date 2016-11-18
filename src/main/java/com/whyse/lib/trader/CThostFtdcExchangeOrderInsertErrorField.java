package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02a7\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:765</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcExchangeOrderInsertErrorField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcParticipantIDType */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcTraderIDType */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(3) 
	public int InstallID() {
		return this.io.getIntField(this, 3);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(3) 
	public CThostFtdcExchangeOrderInsertErrorField InstallID(int InstallID) {
		this.io.setIntField(this, 3, InstallID);
		return this;
	}
	/** C type : TThostFtdcOrderLocalIDType */
	@Array({13}) 
	@Field(4) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(5) 
	public int ErrorID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(5) 
	public CThostFtdcExchangeOrderInsertErrorField ErrorID(int ErrorID) {
		this.io.setIntField(this, 5, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(6) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcExchangeOrderInsertErrorField() {
		super();
	}
	public CThostFtdcExchangeOrderInsertErrorField(Pointer pointer) {
		super(pointer);
	}
}
