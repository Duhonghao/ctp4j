 package com.whyse.lib.test;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * Class<br>
 * <i>native declaration : src\main\resources\lib\headfile\test1.h:15</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("test") 
public class Math extends CPPObject {
	//静态方法在调用这个类的任何函数之前初始化
	static {
		BridJ.register();
		System.err.println("Math匹配方法结束+++++++++");
	}
	/**
	 * Original signature : <code>Math* CreateMath(const char*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\test1.h:12</i>
	 */
	@SuppressWarnings({ "deprecation", "unchecked", "unused", "rawtypes" })
	public static Pointer<Math > CreateMath(Pointer<Byte > pszFlowPath) {
		long peer = Pointer.getPeer(pszFlowPath);
		long peerM = CreateMath(peer);
		Object ob = Pointer.pointerToAddress(peerM, Math.class);
		Pointer<Math> math = (Pointer<Math>) ob;
		return math;
	}
	@Ptr 
	protected native static long CreateMath(@Ptr long pszFlowPath);//@Ptr long pszFlowPath
	/**
	 * Original signature : <code>int Multiply(int, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\test1.h:14</i>
	 */
	public native int Multiply(int a, int b);
	public Math() {
		super();
	}
	public Math(Pointer pointer) {
		super(pointer);
	}
}
