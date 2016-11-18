package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:37</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcMdSpi extends CPPObject {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>native void OnFrontConnected()</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:2</i>
	 */
	@Virtual(0) 
	public  native void OnFrontConnected();
	/**
	 * Original signature : <code>native void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:5</i>
	 */
	@Virtual(1) 
	public  native void OnFrontDisconnected(int nReason);
	/**
	 * Original signature : <code>native void OnHeartBeatWarning(int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:8</i>
	 */
	@Virtual(2) 
	public  native void OnHeartBeatWarning(int nTimeLapse);
	/**
	 * Original signature : <code>native void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:11</i>
	 */
	@Virtual(3) 
	public native void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:14</i>
	 */
	@Virtual(4) 
	public native void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:17</i>
	 */
	@Virtual(5) 
	public native void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:20</i>
	 */
	@Virtual(6) 
	public native void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:23</i>
	 */
	@Virtual(7) 
	public native void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:26</i>
	 */
	@Virtual(8) 
	public native void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:29</i>
	 */
	@Virtual(9) 
	public native void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * Original signature : <code>native void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:32</i>
	 */
	@Virtual(10) 
	public native void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData);
	/**
	 * Original signature : <code>native void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcMdApi.h:35</i>
	 */
	@Virtual(11) 
	public native void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp);
	public CThostFtdcMdSpi() {
		super();
	}
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
	
}
