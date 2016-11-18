package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:453</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcDepthMarketDataField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcExchangeInstIDType */
	@Array({31}) 
	@Field(3) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcPriceType */
	@Field(4) 
	public double LastPrice() {
		return this.io.getDoubleField(this, 4);
	}
	/** C type : TThostFtdcPriceType */
	@Field(4) 
	public CThostFtdcDepthMarketDataField LastPrice(double LastPrice) {
		this.io.setDoubleField(this, 4, LastPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(5) 
	public double PreSettlementPrice() {
		return this.io.getDoubleField(this, 5);
	}
	/** C type : TThostFtdcPriceType */
	@Field(5) 
	public CThostFtdcDepthMarketDataField PreSettlementPrice(double PreSettlementPrice) {
		this.io.setDoubleField(this, 5, PreSettlementPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(6) 
	public double PreClosePrice() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : TThostFtdcPriceType */
	@Field(6) 
	public CThostFtdcDepthMarketDataField PreClosePrice(double PreClosePrice) {
		this.io.setDoubleField(this, 6, PreClosePrice);
		return this;
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(7) 
	public double PreOpenInterest() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(7) 
	public CThostFtdcDepthMarketDataField PreOpenInterest(double PreOpenInterest) {
		this.io.setDoubleField(this, 7, PreOpenInterest);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(8) 
	public double OpenPrice() {
		return this.io.getDoubleField(this, 8);
	}
	/** C type : TThostFtdcPriceType */
	@Field(8) 
	public CThostFtdcDepthMarketDataField OpenPrice(double OpenPrice) {
		this.io.setDoubleField(this, 8, OpenPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(9) 
	public double HighestPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/** C type : TThostFtdcPriceType */
	@Field(9) 
	public CThostFtdcDepthMarketDataField HighestPrice(double HighestPrice) {
		this.io.setDoubleField(this, 9, HighestPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(10) 
	public double LowestPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/** C type : TThostFtdcPriceType */
	@Field(10) 
	public CThostFtdcDepthMarketDataField LowestPrice(double LowestPrice) {
		this.io.setDoubleField(this, 10, LowestPrice);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(11) 
	public int Volume() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(11) 
	public CThostFtdcDepthMarketDataField Volume(int Volume) {
		this.io.setIntField(this, 11, Volume);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(12) 
	public double Turnover() {
		return this.io.getDoubleField(this, 12);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(12) 
	public CThostFtdcDepthMarketDataField Turnover(double Turnover) {
		this.io.setDoubleField(this, 12, Turnover);
		return this;
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(13) 
	public double OpenInterest() {
		return this.io.getDoubleField(this, 13);
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(13) 
	public CThostFtdcDepthMarketDataField OpenInterest(double OpenInterest) {
		this.io.setDoubleField(this, 13, OpenInterest);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(14) 
	public double ClosePrice() {
		return this.io.getDoubleField(this, 14);
	}
	/** C type : TThostFtdcPriceType */
	@Field(14) 
	public CThostFtdcDepthMarketDataField ClosePrice(double ClosePrice) {
		this.io.setDoubleField(this, 14, ClosePrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(15) 
	public double SettlementPrice() {
		return this.io.getDoubleField(this, 15);
	}
	/** C type : TThostFtdcPriceType */
	@Field(15) 
	public CThostFtdcDepthMarketDataField SettlementPrice(double SettlementPrice) {
		this.io.setDoubleField(this, 15, SettlementPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(16) 
	public double UpperLimitPrice() {
		return this.io.getDoubleField(this, 16);
	}
	/** C type : TThostFtdcPriceType */
	@Field(16) 
	public CThostFtdcDepthMarketDataField UpperLimitPrice(double UpperLimitPrice) {
		this.io.setDoubleField(this, 16, UpperLimitPrice);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(17) 
	public double LowerLimitPrice() {
		return this.io.getDoubleField(this, 17);
	}
	/** C type : TThostFtdcPriceType */
	@Field(17) 
	public CThostFtdcDepthMarketDataField LowerLimitPrice(double LowerLimitPrice) {
		this.io.setDoubleField(this, 17, LowerLimitPrice);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(18) 
	public double PreDelta() {
		return this.io.getDoubleField(this, 18);
	}
	/** C type : TThostFtdcRatioType */
	@Field(18) 
	public CThostFtdcDepthMarketDataField PreDelta(double PreDelta) {
		this.io.setDoubleField(this, 18, PreDelta);
		return this;
	}
	/** C type : TThostFtdcRatioType */
	@Field(19) 
	public double CurrDelta() {
		return this.io.getDoubleField(this, 19);
	}
	/** C type : TThostFtdcRatioType */
	@Field(19) 
	public CThostFtdcDepthMarketDataField CurrDelta(double CurrDelta) {
		this.io.setDoubleField(this, 19, CurrDelta);
		return this;
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(20) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 20);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(21) 
	public int UpdateMillisec() {
		return this.io.getIntField(this, 21);
	}
	/** C type : TThostFtdcMillisecType */
	@Field(21) 
	public CThostFtdcDepthMarketDataField UpdateMillisec(int UpdateMillisec) {
		this.io.setIntField(this, 21, UpdateMillisec);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(22) 
	public double BidPrice1() {
		return this.io.getDoubleField(this, 22);
	}
	/** C type : TThostFtdcPriceType */
	@Field(22) 
	public CThostFtdcDepthMarketDataField BidPrice1(double BidPrice1) {
		this.io.setDoubleField(this, 22, BidPrice1);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(23) 
	public int BidVolume1() {
		return this.io.getIntField(this, 23);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(23) 
	public CThostFtdcDepthMarketDataField BidVolume1(int BidVolume1) {
		this.io.setIntField(this, 23, BidVolume1);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(24) 
	public double AskPrice1() {
		return this.io.getDoubleField(this, 24);
	}
	/** C type : TThostFtdcPriceType */
	@Field(24) 
	public CThostFtdcDepthMarketDataField AskPrice1(double AskPrice1) {
		this.io.setDoubleField(this, 24, AskPrice1);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(25) 
	public int AskVolume1() {
		return this.io.getIntField(this, 25);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(25) 
	public CThostFtdcDepthMarketDataField AskVolume1(int AskVolume1) {
		this.io.setIntField(this, 25, AskVolume1);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(26) 
	public double BidPrice2() {
		return this.io.getDoubleField(this, 26);
	}
	/** C type : TThostFtdcPriceType */
	@Field(26) 
	public CThostFtdcDepthMarketDataField BidPrice2(double BidPrice2) {
		this.io.setDoubleField(this, 26, BidPrice2);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(27) 
	public int BidVolume2() {
		return this.io.getIntField(this, 27);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(27) 
	public CThostFtdcDepthMarketDataField BidVolume2(int BidVolume2) {
		this.io.setIntField(this, 27, BidVolume2);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(28) 
	public double AskPrice2() {
		return this.io.getDoubleField(this, 28);
	}
	/** C type : TThostFtdcPriceType */
	@Field(28) 
	public CThostFtdcDepthMarketDataField AskPrice2(double AskPrice2) {
		this.io.setDoubleField(this, 28, AskPrice2);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(29) 
	public int AskVolume2() {
		return this.io.getIntField(this, 29);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(29) 
	public CThostFtdcDepthMarketDataField AskVolume2(int AskVolume2) {
		this.io.setIntField(this, 29, AskVolume2);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(30) 
	public double BidPrice3() {
		return this.io.getDoubleField(this, 30);
	}
	/** C type : TThostFtdcPriceType */
	@Field(30) 
	public CThostFtdcDepthMarketDataField BidPrice3(double BidPrice3) {
		this.io.setDoubleField(this, 30, BidPrice3);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(31) 
	public int BidVolume3() {
		return this.io.getIntField(this, 31);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(31) 
	public CThostFtdcDepthMarketDataField BidVolume3(int BidVolume3) {
		this.io.setIntField(this, 31, BidVolume3);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(32) 
	public double AskPrice3() {
		return this.io.getDoubleField(this, 32);
	}
	/** C type : TThostFtdcPriceType */
	@Field(32) 
	public CThostFtdcDepthMarketDataField AskPrice3(double AskPrice3) {
		this.io.setDoubleField(this, 32, AskPrice3);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(33) 
	public int AskVolume3() {
		return this.io.getIntField(this, 33);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(33) 
	public CThostFtdcDepthMarketDataField AskVolume3(int AskVolume3) {
		this.io.setIntField(this, 33, AskVolume3);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(34) 
	public double BidPrice4() {
		return this.io.getDoubleField(this, 34);
	}
	/** C type : TThostFtdcPriceType */
	@Field(34) 
	public CThostFtdcDepthMarketDataField BidPrice4(double BidPrice4) {
		this.io.setDoubleField(this, 34, BidPrice4);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(35) 
	public int BidVolume4() {
		return this.io.getIntField(this, 35);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(35) 
	public CThostFtdcDepthMarketDataField BidVolume4(int BidVolume4) {
		this.io.setIntField(this, 35, BidVolume4);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(36) 
	public double AskPrice4() {
		return this.io.getDoubleField(this, 36);
	}
	/** C type : TThostFtdcPriceType */
	@Field(36) 
	public CThostFtdcDepthMarketDataField AskPrice4(double AskPrice4) {
		this.io.setDoubleField(this, 36, AskPrice4);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(37) 
	public int AskVolume4() {
		return this.io.getIntField(this, 37);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(37) 
	public CThostFtdcDepthMarketDataField AskVolume4(int AskVolume4) {
		this.io.setIntField(this, 37, AskVolume4);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(38) 
	public double BidPrice5() {
		return this.io.getDoubleField(this, 38);
	}
	/** C type : TThostFtdcPriceType */
	@Field(38) 
	public CThostFtdcDepthMarketDataField BidPrice5(double BidPrice5) {
		this.io.setDoubleField(this, 38, BidPrice5);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(39) 
	public int BidVolume5() {
		return this.io.getIntField(this, 39);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(39) 
	public CThostFtdcDepthMarketDataField BidVolume5(int BidVolume5) {
		this.io.setIntField(this, 39, BidVolume5);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(40) 
	public double AskPrice5() {
		return this.io.getDoubleField(this, 40);
	}
	/** C type : TThostFtdcPriceType */
	@Field(40) 
	public CThostFtdcDepthMarketDataField AskPrice5(double AskPrice5) {
		this.io.setDoubleField(this, 40, AskPrice5);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(41) 
	public int AskVolume5() {
		return this.io.getIntField(this, 41);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(41) 
	public CThostFtdcDepthMarketDataField AskVolume5(int AskVolume5) {
		this.io.setIntField(this, 41, AskVolume5);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(42) 
	public double AveragePrice() {
		return this.io.getDoubleField(this, 42);
	}
	/** C type : TThostFtdcPriceType */
	@Field(42) 
	public CThostFtdcDepthMarketDataField AveragePrice(double AveragePrice) {
		this.io.setDoubleField(this, 42, AveragePrice);
		return this;
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(43) 
	public Pointer<Byte > ActionDay() {
		return this.io.getPointerField(this, 43);
	}
	public CThostFtdcDepthMarketDataField() {
		super();
	}
	public CThostFtdcDepthMarketDataField(Pointer pointer) {
		super(pointer);
	}
}
