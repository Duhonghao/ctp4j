package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:133</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcTransferQryBankRspField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcRetCodeType */
	@Array({5}) 
	@Field(0) 
	public Pointer<Byte > RetCode() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcRetInfoType */
	@Array({129}) 
	@Field(1) 
	public Pointer<Byte > RetInfo() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(3) 
	public double TradeAmt() {
		return this.io.getDoubleField(this, 3);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(3) 
	public CThostFtdcTransferQryBankRspField TradeAmt(double TradeAmt) {
		this.io.setDoubleField(this, 3, TradeAmt);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(4) 
	public double UseAmt() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(4) 
	public CThostFtdcTransferQryBankRspField UseAmt(double UseAmt) {
		this.io.setDoubleField(this, 4, UseAmt);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public double FetchAmt() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public CThostFtdcTransferQryBankRspField FetchAmt(double FetchAmt) {
		this.io.setDoubleField(this, 5, FetchAmt);
		return this;
	}
	/** C type : TThostFtdcCurrencyCodeType */
	@Array({4}) 
	@Field(6) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcTransferQryBankRspField() {
		super();
	}
	public CThostFtdcTransferQryBankRspField(Pointer pointer) {
		super(pointer);
	}
}
