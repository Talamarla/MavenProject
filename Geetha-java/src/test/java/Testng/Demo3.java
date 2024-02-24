package Testng;

import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority=2,groups="B")
	public void Login(){
		System.out.println("login");
		
	}

}
