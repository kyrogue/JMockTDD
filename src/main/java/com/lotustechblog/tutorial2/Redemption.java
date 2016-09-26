package com.lotustechblog.tutorial2;

import org.junit.runner.RunWith;


public class Redemption {

	//classes to test with in integration.
	private ICheckStock giftStockChecker;
	private IPayment paymentChecker;

	public void setCheckStock(ICheckStock cs){
		this.giftStockChecker = cs;
	}

	public void setPaymentCheck(IPayment cp){
		this.paymentChecker = cp;
	}

	public String redeemGift(double spendings){
//		//-1 for no stock
//		//0 for no gift
//		//1 for gift 1
//		//2 for gift 2
//		//3 for gift 3
//		double nettSpending = paymentChecker.calculateNettAmount(spendings);
//		int giftType = 0;//initially no gift
//
//		//determine gift types
//		if(nettSpending < 100){
//			giftType = 1;
//		}else if(nettSpending >= 101 && nettSpending <= 200){
//			giftType = 2;
//		}else if(nettSpending > 200){
//			giftType = 3;
//		}
//
//		//determine gift avail	
//		if(giftStockChecker.isGiftStockAvail(giftType)){
//			return "You can redeem gift "+giftType;
//		}else{
//			return "There is no more stock for gift "+giftType;
//		}
		return null;
	}

}
