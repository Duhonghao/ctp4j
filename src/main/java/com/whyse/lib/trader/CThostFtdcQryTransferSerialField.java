package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\u05ea\ufffd\ufffd\ufffd\ufffd\u02ee<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3655</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcQryTransferSerialField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(2) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcQryTransferSerialField() {
		super();
	}
	public CThostFtdcQryTransferSerialField(Pointer pointer) {
		super(pointer);
	}
}
