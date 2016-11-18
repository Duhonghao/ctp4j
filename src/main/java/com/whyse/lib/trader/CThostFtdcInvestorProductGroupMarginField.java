package com.whyse.lib.trader;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd/\ufffd\ufffd\u01b7\ufffd\u05b1\ufffd\u05a4\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:2852</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcInvestorProductGroupMarginField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > ProductGroupID() {
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
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(4) 
	public int SettlementID() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcSettlementIDType */
	@Field(4) 
	public CThostFtdcInvestorProductGroupMarginField SettlementID(int SettlementID) {
		this.io.setIntField(this, 4, SettlementID);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(5) 
	public CThostFtdcInvestorProductGroupMarginField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 5, FrozenMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public double LongFrozenMargin() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(6) 
	public CThostFtdcInvestorProductGroupMarginField LongFrozenMargin(double LongFrozenMargin) {
		this.io.setDoubleField(this, 6, LongFrozenMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public double ShortFrozenMargin() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(7) 
	public CThostFtdcInvestorProductGroupMarginField ShortFrozenMargin(double ShortFrozenMargin) {
		this.io.setDoubleField(this, 7, ShortFrozenMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public double UseMargin() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(8) 
	public CThostFtdcInvestorProductGroupMarginField UseMargin(double UseMargin) {
		this.io.setDoubleField(this, 8, UseMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(9) 
	public double LongUseMargin() {
		return this.io.getDoubleField(this, 9);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(9) 
	public CThostFtdcInvestorProductGroupMarginField LongUseMargin(double LongUseMargin) {
		this.io.setDoubleField(this, 9, LongUseMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(10) 
	public double ShortUseMargin() {
		return this.io.getDoubleField(this, 10);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(10) 
	public CThostFtdcInvestorProductGroupMarginField ShortUseMargin(double ShortUseMargin) {
		this.io.setDoubleField(this, 10, ShortUseMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(11) 
	public double ExchMargin() {
		return this.io.getDoubleField(this, 11);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(11) 
	public CThostFtdcInvestorProductGroupMarginField ExchMargin(double ExchMargin) {
		this.io.setDoubleField(this, 11, ExchMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(12) 
	public double LongExchMargin() {
		return this.io.getDoubleField(this, 12);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(12) 
	public CThostFtdcInvestorProductGroupMarginField LongExchMargin(double LongExchMargin) {
		this.io.setDoubleField(this, 12, LongExchMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(13) 
	public double ShortExchMargin() {
		return this.io.getDoubleField(this, 13);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(13) 
	public CThostFtdcInvestorProductGroupMarginField ShortExchMargin(double ShortExchMargin) {
		this.io.setDoubleField(this, 13, ShortExchMargin);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(14) 
	public double CloseProfit() {
		return this.io.getDoubleField(this, 14);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(14) 
	public CThostFtdcInvestorProductGroupMarginField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 14, CloseProfit);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(15) 
	public double FrozenCommission() {
		return this.io.getDoubleField(this, 15);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(15) 
	public CThostFtdcInvestorProductGroupMarginField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 15, FrozenCommission);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(16) 
	public double Commission() {
		return this.io.getDoubleField(this, 16);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(16) 
	public CThostFtdcInvestorProductGroupMarginField Commission(double Commission) {
		this.io.setDoubleField(this, 16, Commission);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(17) 
	public double FrozenCash() {
		return this.io.getDoubleField(this, 17);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(17) 
	public CThostFtdcInvestorProductGroupMarginField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 17, FrozenCash);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(18) 
	public double CashIn() {
		return this.io.getDoubleField(this, 18);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(18) 
	public CThostFtdcInvestorProductGroupMarginField CashIn(double CashIn) {
		this.io.setDoubleField(this, 18, CashIn);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(19) 
	public double PositionProfit() {
		return this.io.getDoubleField(this, 19);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(19) 
	public CThostFtdcInvestorProductGroupMarginField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 19, PositionProfit);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(20) 
	public double OffsetAmount() {
		return this.io.getDoubleField(this, 20);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(20) 
	public CThostFtdcInvestorProductGroupMarginField OffsetAmount(double OffsetAmount) {
		this.io.setDoubleField(this, 20, OffsetAmount);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(21) 
	public double LongOffsetAmount() {
		return this.io.getDoubleField(this, 21);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(21) 
	public CThostFtdcInvestorProductGroupMarginField LongOffsetAmount(double LongOffsetAmount) {
		this.io.setDoubleField(this, 21, LongOffsetAmount);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(22) 
	public double ShortOffsetAmount() {
		return this.io.getDoubleField(this, 22);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(22) 
	public CThostFtdcInvestorProductGroupMarginField ShortOffsetAmount(double ShortOffsetAmount) {
		this.io.setDoubleField(this, 22, ShortOffsetAmount);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(23) 
	public double ExchOffsetAmount() {
		return this.io.getDoubleField(this, 23);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(23) 
	public CThostFtdcInvestorProductGroupMarginField ExchOffsetAmount(double ExchOffsetAmount) {
		this.io.setDoubleField(this, 23, ExchOffsetAmount);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(24) 
	public double LongExchOffsetAmount() {
		return this.io.getDoubleField(this, 24);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(24) 
	public CThostFtdcInvestorProductGroupMarginField LongExchOffsetAmount(double LongExchOffsetAmount) {
		this.io.setDoubleField(this, 24, LongExchOffsetAmount);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(25) 
	public double ShortExchOffsetAmount() {
		return this.io.getDoubleField(this, 25);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(25) 
	public CThostFtdcInvestorProductGroupMarginField ShortExchOffsetAmount(double ShortExchOffsetAmount) {
		this.io.setDoubleField(this, 25, ShortExchOffsetAmount);
		return this;
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(26) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 26);
	}
	/** C type : TThostFtdcHedgeFlagType */
	@Field(26) 
	public CThostFtdcInvestorProductGroupMarginField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 26, HedgeFlag);
		return this;
	}
	public CThostFtdcInvestorProductGroupMarginField() {
		super();
	}
	public CThostFtdcInvestorProductGroupMarginField(Pointer pointer) {
		super(pointer);
	}
}
