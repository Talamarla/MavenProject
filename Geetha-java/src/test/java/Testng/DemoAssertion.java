package Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoAssertion {
	@Test
	public void Homepage()
	{
		String Expectedtitle = "Selenium";
		String actualtitle = "selenium";
	//	Assert.assertEquals(Expectedtitle, actualtitle);
		//System.out.println("correct");
		try {
			Assert.assertEquals(Expectedtitle, actualtitle);
			
		}
		catch(AssertionError e){
			e.printStackTrace();
			
		}
		System.out.println("geetha");
		
	}
	

}
