package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:251</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcInvestorField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > InvestorID() {
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
	public Pointer<Byte > InvestorGroupID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcPartyNameType */
	@Array({81}) 
	@Field(3) 
	public Pointer<Byte > InvestorName() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(4) 
	public byte IdentifiedCardType() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(4) 
	public CThostFtdcInvestorField IdentifiedCardType(byte IdentifiedCardType) {
		this.io.setByteField(this, 4, IdentifiedCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(5) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcBoolType */
	@Field(6) 
	public int IsActive() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcBoolType */
	@Field(6) 
	public CThostFtdcInvestorField IsActive(int IsActive) {
		this.io.setIntField(this, 6, IsActive);
		return this;
	}
	/** C type : TThostFtdcTelephoneType */
	@Array({41}) 
	@Field(7) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcAddressType */
	@Array({101}) 
	@Field(8) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(9) 
	public Pointer<Byte > OpenDate() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcMobileType */
	@Array({41}) 
	@Field(10) 
	public Pointer<Byte > Mobile() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(11) 
	public Pointer<Byte > CommModelID() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(12) 
	public Pointer<Byte > MarginModelID() {
		return this.io.getPointerField(this, 12);
	}
	public CThostFtdcInvestorField() {
		super();
	}
	public CThostFtdcInvestorField(Pointer pointer) {
		super(pointer);
	}
}
