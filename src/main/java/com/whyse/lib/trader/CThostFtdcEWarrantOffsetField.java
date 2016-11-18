package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u05b5\ufffd\ufffd\u06f5\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2808</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcEWarrantOffsetField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(5) 
	public byte Direction() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcDirectionType */
	@Field(5) 
	public CThostFtdcEWarrantOffsetField Direction(byte Direction) {
		this.io.setByteField(this, 5, Direction);
		return this;
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(6) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 6);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(6) 
	public CThostFtdcEWarrantOffsetField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 6, HedgeFlag);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(7) 
	public int Volume() {
		return this.io.getIntField(this, 7);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(7) 
	public CThostFtdcEWarrantOffsetField Volume(int Volume) {
		this.io.setIntField(this, 7, Volume);
		return this;
	}
	public CThostFtdcEWarrantOffsetField() {
		super();
	}
	public CThostFtdcEWarrantOffsetField(Pointer pointer) {
		super(pointer);
	}
}
