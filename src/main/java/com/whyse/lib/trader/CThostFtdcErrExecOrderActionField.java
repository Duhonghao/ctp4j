package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:1609</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcErrExecOrderActionField extends StructObject {
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
	/** C type : TThostFtdcOrderActionRefType */
	@Field(2) 
	public int ExecOrderActionRef() {
		return this.io.getIntField(this, 2);
	}
	/** C type : TThostFtdcOrderActionRefType */
	@Field(2) 
	public CThostFtdcErrExecOrderActionField ExecOrderActionRef(int ExecOrderActionRef) {
		this.io.setIntField(this, 2, ExecOrderActionRef);
		return this;
	}
	/** C type : TThostFtdcOrderRefType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > ExecOrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(4) 
	public CThostFtdcErrExecOrderActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5) 
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5) 
	public CThostFtdcErrExecOrderActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6) 
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6) 
	public CThostFtdcErrExecOrderActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcExecOrderSysIDType */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > ExecOrderSysID() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(9) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}
	/** C type : TThostFtdcActionFlagType */
	@Field(9) 
	public CThostFtdcErrExecOrderActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(10) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(11) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(12) 
	public int ErrorID() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(12) 
	public CThostFtdcErrExecOrderActionField ErrorID(int ErrorID) {
		this.io.setIntField(this, 12, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81}) 
	@Field(13) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 13);
	}
	public CThostFtdcErrExecOrderActionField() {
		super();
	}
	public CThostFtdcErrExecOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
