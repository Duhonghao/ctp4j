package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd/\ufffd\ufffd\u01b7\ufffd\u05b1\ufffd\u05a4\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2876</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcProductGroupField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > ProductGroupID() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcProductGroupField() {
		super();
	}
	public CThostFtdcProductGroupField(Pointer pointer) {
		super(pointer);
	}
}
