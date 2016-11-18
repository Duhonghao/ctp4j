package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u03fd\ufffd\ufffd\u05fa\ufffd\u053c\ufffd\u0135\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2309</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcCombinationLegField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > CombInstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcLegIDType */
	@Field(1) 
	public int LegID() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcLegIDType */
	@Field(1) 
	public CThostFtdcCombinationLegField LegID(int LegID) {
		this.io.setIntField(this, 1, LegID);
		return this;
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > LegInstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(3) 
	public byte Direction() {
		return this.io.getByteField(this, 3);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(3) 
	public CThostFtdcCombinationLegField Direction(byte Direction) {
		this.io.setByteField(this, 3, Direction);
		return this;
	}
	/** C type : TThostFtdcLegMultipleType */
	@Field(4) 
	public int LegMultiple() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcLegMultipleType */
	@Field(4) 
	public CThostFtdcCombinationLegField LegMultiple(int LegMultiple) {
		this.io.setIntField(this, 4, LegMultiple);
		return this;
	}
	/** C type : TThostFtdcImplyLevelType */
	@Field(5) 
	public int ImplyLevel() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcImplyLevelType */
	@Field(5) 
	public CThostFtdcCombinationLegField ImplyLevel(int ImplyLevel) {
		this.io.setIntField(this, 5, ImplyLevel);
		return this;
	}
	public CThostFtdcCombinationLegField() {
		super();
	}
	public CThostFtdcCombinationLegField(Pointer pointer) {
		super(pointer);
	}
}
