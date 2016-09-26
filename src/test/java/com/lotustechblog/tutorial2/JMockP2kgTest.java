package com.lotustechblog.tutorial2;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

public class JMockP2kgTest {

	
	@RunWith(JMock.class)	
	public class TestUsingJMockP2Kg{
		Mockery context = new JUnit4Mockery();
		
		@Test
		public void ShowweightTestP2Kg(){
			
			final IConvert convt = context.mock(IConvert.class);
			
			Showeight sw = new Showeight();
			sw.setWeightValue(convt);
			
			context.checking(new Expectations(){{
				allowing(convt).convertP2Kg(100.0);will(returnValue(45.4));
			}});
			
			String out = sw.PrintWeight("Pack1", 100.0, true);
			assertEquals("Weight for Pack1 is 45.4 kg",out);
		}
	}
}
