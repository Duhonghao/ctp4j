package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u01f0\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:1341</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcOptionInstrMarginAdjustField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcInvestorRangeType */
	@Field(1) 
	public CThostFtdcOptionInstrMarginAdjustField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcRatioType */
	@Field(4) 
	public double SShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcRatioType */
	@Field(4) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByMoney(double SShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 4, SShortMarginRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public double SShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByVolume(double SShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 5, SShortMarginRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public double HShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcRatioType */
	@Field(6) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByMoney(double HShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 6, HShortMarginRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public double HShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByVolume(double HShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 7, HShortMarginRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public double AShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcRatioType */
	@Field(8) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByMoney(double AShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 8, AShortMarginRatioByMoney);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(9) 
	public double AShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(9) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByVolume(double AShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 9, AShortMarginRatioByVolume);
		return this;
	}
	/** C type : TThostFtdcBoolType */
	@Field(10) 
	public int IsRelative() {
		return this.io.getIntField(this, 10);
	}
	/** C type : TThostFtdcBoolType */
	@Field(10) 
	public CThostFtdcOptionInstrMarginAdjustField IsRelative(int IsRelative) {
		this.io.setIntField(this, 10, IsRelative);
		return this;
	}
	public CThostFtdcOptionInstrMarginAdjustField() {
		super();
	}
	public CThostFtdcOptionInstrMarginAdjustField(Pointer pointer) {
		super(pointer);
	}
}
