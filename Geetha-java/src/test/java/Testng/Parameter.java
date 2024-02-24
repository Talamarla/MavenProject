package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter{
	@Test
	@Parameters({"Username","Password"})
	
	public void login(String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);
	}
	

}
