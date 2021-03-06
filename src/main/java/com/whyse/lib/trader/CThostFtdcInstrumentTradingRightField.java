package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\u07fa\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:461</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcInstrumentTradingRightField extends StructObject {
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
	public CThostFtdcInstrumentTradingRightField InvestorRange(byte InvestorRange) {
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
	/** C type : TThostFtdcTradingRightType */
	@Field(4) 
	public byte TradingRight() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcTradingRightType */
	@Field(4) 
	public CThostFtdcInstrumentTradingRightField TradingRight(byte TradingRight) {
		this.io.setByteField(this, 4, TradingRight);
		return this;
	}
	public CThostFtdcInstrumentTradingRightField() {
		super();
	}
	public CThostFtdcInstrumentTradingRightField(Pointer pointer) {
		super(pointer);
	}
}
