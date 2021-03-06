package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2108</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcMarketDataUpdateTimeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(2) 
	public int UpdateMillisec() {
		return this.io.getIntField(this, 2);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(2) 
	public CThostFtdcMarketDataUpdateTimeField UpdateMillisec(int UpdateMillisec) {
		this.io.setIntField(this, 2, UpdateMillisec);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ActionDay() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcMarketDataUpdateTimeField() {
		super();
	}
	public CThostFtdcMarketDataUpdateTimeField(Pointer pointer) {
		super(pointer);
	}
}
