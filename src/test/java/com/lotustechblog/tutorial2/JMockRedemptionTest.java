package com.lotustechblog.tutorial2;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.lotustechblog.tutorial2.IPayment;
import com.lotustechblog.tutorial2.ICheckStock;
import com.lotustechblog.tutorial2.Redemption;

@RunWith(JMock.class)
public class JMockRedemptionTest {

	//Create Mock object
	Mockery context = new JUnit4Mockery();

	@Test
	public void ShowGiftRedemptionMessage(){
		//setup mock objects through JMock
		final IPayment payment = context.mock(IPayment.class);
		final ICheckStock stockChecker = context.mock(ICheckStock.class);

		//init my module for integration
		Redemption redeem = new Redemption();
		redeem.setPaymentCheck(payment);
		redeem.setCheckStock(stockChecker);

		//Define "expectations" or test conditions
		context.checking(new Expectations(){{
			allowing(payment).calculateNettAmount(100.00); will(returnValue(45.4));
			allowing(stockChecker).isGiftStockAvail(1); will(returnValue(true));
		}});

		//Confirm test with mock object
		String msg = redeem.redeemGift(100);
		assertEquals("You can redeem gift 1",msg);
	}
}
