package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u00fb\ufffd\u0228\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2253</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcUserRightField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcUserRightTypeType */
	@Field(2) 
	public byte UserRightType() {
		return this.io.getByteField(this, 2);
	}
	/** C type : TThostFtdcUserRightTypeType */
	@Field(2) 
	public CThostFtdcUserRightField UserRightType(byte UserRightType) {
		this.io.setByteField(this, 2, UserRightType);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(3) 
	public int IsForbidden() {
		return this.io.getIntField(this, 3);
	}
	/** C type : TThostFtdcBoolType */
	@Field(3) 
	public CThostFtdcUserRightField IsForbidden(int IsForbidden) {
		this.io.setIntField(this, 3, IsForbidden);
		return this;
	}
	public CThostFtdcUserRightField() {
		super();
	}
	public CThostFtdcUserRightField(Pointer pointer) {
		super(pointer);
	}
}
