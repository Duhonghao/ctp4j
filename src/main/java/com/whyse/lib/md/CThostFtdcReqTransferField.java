package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:3059</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcReqTransferField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
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
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9) 
	public CThostFtdcReqTransferField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10) 
	public CThostFtdcReqTransferField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public CThostFtdcReqTransferField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcIndividualNameType */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/** C type : TThostFtdcIdCardTypeType */
	@Field(13) 
	public CThostFtdcReqTransferField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/** C type : TThostFtdcIdentifiedCardNoType */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/** C type : TThostFtdcCustTypeType */
	@Field(15) 
	public CThostFtdcReqTransferField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(16) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(17) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcAccountIDType */
	@Array({13}) 
	@Field(18) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcPasswordType */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(20) 
	public int InstallID() {
		return this.io.getIntField(this, 20);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(20) 
	public CThostFtdcReqTransferField InstallID(int InstallID) {
		this.io.setIntField(this, 20, InstallID);
		return this;
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(21) 
	public int FutureSerial() {
		return this.io.getIntField(this, 21);
	}
	/** C type : TThostFtdcFutureSerialType */
	@Field(21) 
	public CThostFtdcReqTransferField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 21, FutureSerial);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16}) 
	@Field(22) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(23) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 23);
	}
	/** C type : TThostFtdcYesNoIndicatorType */
	@Field(23) 
	public CThostFtdcReqTransferField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 23, VerifyCertNoFlag);
		return this;
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(24) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 24);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(25) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 25);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(25) 
	public CThostFtdcReqTransferField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 25, TradeAmount);
		return this;
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(26) 
	public double FutureFetchAmount() {
		return this.io.getDoubleField(this, 26);
	}
	/** C type : TThostFtdcTradeAmountType */
	@Field(26) 
	public CThostFtdcReqTransferField FutureFetchAmount(double FutureFetchAmount) {
		this.io.setDoubleField(this, 26, FutureFetchAmount);
		return this;
	}
	/** C type : TThostFtdcFeePayFlagType */
	@Field(27) 
	public byte FeePayFlag() {
		return this.io.getByteField(this, 27);
	}
	/** C type : TThostFtdcFeePayFlagType */
	@Field(27) 
	public CThostFtdcReqTransferField FeePayFlag(byte FeePayFlag) {
		this.io.setByteField(this, 27, FeePayFlag);
		return this;
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(28) 
	public double CustFee() {
		return this.io.getDoubleField(this, 28);
	}
	/** C type : TThostFtdcCustFeeType */
	@Field(28) 
	public CThostFtdcReqTransferField CustFee(double CustFee) {
		this.io.setDoubleField(this, 28, CustFee);
		return this;
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(29) 
	public double BrokerFee() {
		return this.io.getDoubleField(this, 29);
	}
	/** C type : TThostFtdcFutureFeeType */
	@Field(29) 
	public CThostFtdcReqTransferField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 29, BrokerFee);
		return this;
	}
	/** C type : TThostFtdcAddInfoType */
	@Array({129}) 
	@Field(30) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 30);
	}
	/** C type : TThostFtdcDigestType */
	@Array({36}) 
	@Field(31) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 31);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(32) 
	public byte BankAccType() {
		return this.io.getByteField(this, 32);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(32) 
	public CThostFtdcReqTransferField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 32, BankAccType);
		return this;
	}
	/** C type : TThostFtdcDeviceIDType */
	@Array({3}) 
	@Field(33) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 33);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(34) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 34);
	}
	/** C type : TThostFtdcBankAccTypeType */
	@Field(34) 
	public CThostFtdcReqTransferField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 34, BankSecuAccType);
		return this;
	}
	/** C type : TThostFtdcBankCodingForFutureType */
	@Array({33}) 
	@Field(35) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 35);
	}
	/** C type : TThostFtdcBankAccountType */
	@Array({41}) 
	@Field(36) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 36);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(37) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 37);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(37) 
	public CThostFtdcReqTransferField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 37, BankPwdFlag);
		return this;
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(38) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 38);
	}
	/** C type : TThostFtdcPwdFlagType */
	@Field(38) 
	public CThostFtdcReqTransferField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 38, SecuPwdFlag);
		return this;
	}
	/** C type : TThostFtdcOperNoType */
	@Array({17}) 
	@Field(39) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 39);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(40) 
	public int RequestID() {
		return this.io.getIntField(this, 40);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(40) 
	public CThostFtdcReqTransferField RequestID(int RequestID) {
		this.io.setIntField(this, 40, RequestID);
		return this;
	}
	/** C type : TThostFtdcTIDType */
	@Field(41) 
	public int TID() {
		return this.io.getIntField(this, 41);
	}
	/** C type : TThostFtdcTIDType */
	@Field(41) 
	public CThostFtdcReqTransferField TID(int TID) {
		this.io.setIntField(this, 41, TID);
		return this;
	}
	/** C type : TThostFtdcTransferStatusType */
	@Field(42) 
	public byte TransferStatus() {
		return this.io.getByteField(this, 42);
	}
	/** C type : TThostFtdcTransferStatusType */
	@Field(42) 
	public CThostFtdcReqTransferField TransferStatus(byte TransferStatus) {
		this.io.setByteField(this, 42, TransferStatus);
		return this;
	}
	public CThostFtdcReqTransferField() {
		super();
	}
	public CThostFtdcReqTransferField(Pointer pointer) {
		super(pointer);
	}
}
