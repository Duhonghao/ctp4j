package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2666</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcExchangeSequenceField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(1) 
	public int SequenceNo() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(1) 
	public CThostFtdcExchangeSequenceField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 1, SequenceNo);
		return this;
	}
	/** C type : TThostFtdcInstrumentStatusType */
	@Field(2) 
	public byte MarketStatus() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcInstrumentStatusType */
	@Field(2) 
	public CThostFtdcExchangeSequenceField MarketStatus(byte MarketStatus) {
		this.io.setByteField(this, 2, MarketStatus);
		return this;
	}
	public CThostFtdcExchangeSequenceField() {
		super();
	}
	public CThostFtdcExchangeSequenceField(Pointer pointer) {
		super(pointer);
	}
}
