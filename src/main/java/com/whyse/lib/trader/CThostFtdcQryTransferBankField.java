package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2159</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcQryTransferBankField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(0) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(1) 
	public Pointer<Byte > BankBrchID() {
		return this.io.getPointerField(this, 1);
	}
	public CThostFtdcQryTransferBankField() {
		super();
	}
	public CThostFtdcQryTransferBankField(Pointer pointer) {
		super(pointer);
	}
}
