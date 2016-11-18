package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffdTradeCode=204002<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:123</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcTransferQryBankReqField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcFuturePwdFlagType */
	@Field(1) 
	public byte FuturePwdFlag() {
		return this.io.getByteField(this, 1);
	}
	/** C type : TThostFtdcFuturePwdFlagType */
	@Field(1) 
	public CThostFtdcTransferQryBankReqField FuturePwdFlag(byte FuturePwdFlag) {
		this.io.setByteField(this, 1, FuturePwdFlag);
		return this;
	}
	/** C type : TThostFtdcFutureAccPwdType */
	@Array({17}) 
	@Field(2) 
	public Pointer<Byte > FutureAccPwd() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcCurrencyCodeType */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcTransferQryBankReqField() {
		super();
	}
	public CThostFtdcTransferQryBankReqField(Pointer pointer) {
		super(pointer);
	}
}
