package Testng;

import org.testng.annotations.*;

public class Demo {
@Test(priority=1, groups="A")
public void update(){
		System.out.println("update");
		
	}


}
