package com.whyse.myLiangHua.test;

import com.whyse.main.TimeUtil;


public class TraderLHOptImport {
	/**
	 * 1:买开状态  0：平仓状态   -1：卖开状态
	 */
	static volatile int byOrSell = 0;
	static volatile double openP = 0;
	static volatile double closeP = 0;
	/**
	 * @param args
	 * author:xumin 
	 * 2016-11-15 下午5:00:57
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 行情更新了，均线已经重新计算完毕，看本次策略情况，是否做出动作
	 * author:xumin 
	 * 2016-11-17 下午5:01:40
	 */
	public static void doOrNot() {
		
		double l5_10_0 = MDLHHelper.list5[0] - MDLHHelper.list10[0];
		double l5_10_1 = MDLHHelper.list5[1] - MDLHHelper.list10[1];
		double l5_10_2 = MDLHHelper.list5[2] - MDLHHelper.list10[2];
		double l5_10_3 = MDLHHelper.list5[3] - MDLHHelper.list10[3];
		
		double l10_20_0 = MDLHHelper.list10[0] - MDLHHelper.list20[0];
		double l10_20_1 = MDLHHelper.list10[1] - MDLHHelper.list20[1];
		double l10_20_2 = MDLHHelper.list10[2] - MDLHHelper.list20[2];
		double l10_20_3 = MDLHHelper.list10[3] - MDLHHelper.list20[3];
		
		double l20_30_0 = MDLHHelper.list20[0] - MDLHHelper.list30[0];
		double l20_30_1 = MDLHHelper.list20[1] - MDLHHelper.list30[1];
		double l20_30_2 = MDLHHelper.list20[2] - MDLHHelper.list30[2];
		double l20_30_3 = MDLHHelper.list20[3] - MDLHHelper.list30[3];
		
		//--------------------------------------------------------------
		Double AskPrice1 = (Double) MDLHHelper.LastMdMap.get("AskPrice1");//申卖价一
		Double BidPrice1 = (Double) MDLHHelper.LastMdMap.get("BidPrice1");// 申买价一
		Double ma20CK = MDLHHelper.list20[0]/250 ;
		Double ma21CK = ma20CK*1.2;
		
		
		String time = TimeUtil.getTodayDayTime();
		
		if(byOrSell==0 && l20_30_0>0 && l20_30_1>0 && l10_20_3<0 && l10_20_2<0 && l10_20_1<0
				&& (l10_20_0>0 || Math.abs(l10_20_0)<ma20CK)  && (l5_10_0>0 || Math.abs(l5_10_0)<ma21CK) ){
			//20报价均线已经上穿30； 10报价均线即将上穿20；5报价均线已经上穿或者即将上穿10  ->判断买入
			byOrSell = 1;
			openP = MDLHHelper.LastPrice;
			doAction(2,openP);
			System.out.println(MDLHHelper.mainSym+" - "+time+"+++++买开价钱:"+openP);//AskPrice1
			printLastPrice();
			return;
		}
		
		if(byOrSell==1 && l5_10_2>0 && l5_10_1>0 && (l5_10_0<0)){
			// 5均价即将下穿10，警告。多头行情运行中时，这是卖平信号
			closeP = MDLHHelper.LastPrice;
			doAction(1,closeP);
			System.err.println(time+"####卖平价钱:"+closeP);//BidPrice1
			
			
			if(openP<closeP){
				System.err.println("赚钱:"+(closeP-openP));
			}else{
				System.err.println("亏损:"+(closeP-openP));
			}
			
			//-------------
			byOrSell = 0;
			openP = 0;
			closeP = 0;
			printLastPrice();
			return;
		}
		
		//==============下面是空头===================
		if(byOrSell ==0 && l20_30_0<0 && l20_30_1<0 && l10_20_3>0 && l10_20_2>0 && l10_20_1>0
				&& (l10_20_0<0 || Math.abs(l10_20_0)<ma20CK) && (l5_10_0<0 || Math.abs(l5_10_0)<ma21CK)){
			//30均线已经在上面；10均线即将下穿20 ;5均价已经下穿  -->判断卖空
			byOrSell = -1;
			openP = MDLHHelper.LastPrice;
			doAction(-2,openP);
			System.out.println(MDLHHelper.mainSym+" - "+time+"---卖开价钱:"+openP);//BidPrice1
			printLastPrice();
			return;
		}
		
		if(byOrSell==-1 && l5_10_2<0 && l5_10_1<0 && (l5_10_0>0)){
			// 
			closeP = MDLHHelper.LastPrice;
			doAction(-1,closeP);
			System.err.println(time+"####买平价钱:"+closeP);//AskPrice1
			if(openP>closeP){
				System.err.println("赚钱:"+(openP-closeP));
			}else{
				System.err.println("亏损:"+(openP-closeP));
			}
			
			openP = 0;
			closeP = 0;
			byOrSell = 0;
			printLastPrice();
			return;
		}
		
	}
	
	//============================================================
	/**
	 * 
	 * @param flag 2买开  1卖平  -1 买平   -2卖开
	 * author:xumin 
	 * 2016-11-18 下午4:41:01
	 */
	private static void doAction(int flag,double price) {
//		TraderHelper.enterOrder(flag,price);
	}
	private static void printLastPrice() {
		Double[] array = new Double[5];
		array = MDLHHelper.que5.toArray(array);
		System.out.print("最近几次报价");
		for(int i=0;i<4;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("=================================");
	}


}
