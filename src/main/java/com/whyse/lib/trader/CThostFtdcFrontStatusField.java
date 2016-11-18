package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u01f0\ufffd\ufffd\u05f4\u032c<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:617</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcFrontStatusField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public CThostFtdcFrontStatusField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > LastReportDate() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > LastReportTime() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBoolType */
	@Field(3) 
	public int IsActive() {
		return this.io.getIntField(this, 3);
	}
	/** C type : TThostFtdcBoolType */
	@Field(3) 
	public CThostFtdcFrontStatusField IsActive(int IsActive) {
		this.io.setIntField(this, 3, IsActive);
		return this;
	}
	public CThostFtdcFrontStatusField() {
		super();
	}
	public CThostFtdcFrontStatusField(Pointer pointer) {
		super(pointer);
	}
}
