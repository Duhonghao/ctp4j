package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3762</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcAccountregisterField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradeDay() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(5) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(6) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(7) 
	public byte IdCardType() {
		return this.io.getByteField(this, 7);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(7) 
	public CThostFtdcAccountregisterField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 7, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(8) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(9) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(10) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcOpenOrDestroyType */
	@Field(11) 
	public byte OpenOrDestroy() {
		return this.io.getByteField(this, 11);
	}
	/** C type : TThostFtdcOpenOrDestroyType */
	@Field(11) 
	public CThostFtdcAccountregisterField OpenOrDestroy(byte OpenOrDestroy) {
		this.io.setByteField(this, 11, OpenOrDestroy);
		return this;
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > RegDate() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > OutDate() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcTIDType */
	@Field(14) 
	public int TID() {
		return this.io.getIntField(this, 14);
	}
	/** C type : TThostFtdcTIDType */
	@Field(14) 
	public CThostFtdcAccountregisterField TID(int TID) {
		this.io.setIntField(this, 14, TID);
		return this;
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(15) 
	public CThostFtdcAccountregisterField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(16) 
	public byte BankAccType() {
		return this.io.getByteField(this, 16);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(16) 
	public CThostFtdcAccountregisterField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 16, BankAccType);
		return this;
	}
	public CThostFtdcAccountregisterField() {
		super();
	}
	public CThostFtdcAccountregisterField(Pointer pointer) {
		super(pointer);
	}
}
