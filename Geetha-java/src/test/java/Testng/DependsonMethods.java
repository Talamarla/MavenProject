package Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsonMethods {
	@Test
	public void Homepage()
	{
		String Expectedtitle = "Geetha";
		String Actualtitle = "Geetha";
		
		
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.println(Expectedtitle);
		System.out.println(Actualtitle);
	}
	
	@Test(dependsOnMethods = "Homepage")
	
	public void login()
	{
		System.out.println("click here to login");
	}
	
	@Test(dependsOnMethods = {"Homepage", "login"})
	public void logout()
	{
		System.out.println("click here to logout");
	}
	

}
