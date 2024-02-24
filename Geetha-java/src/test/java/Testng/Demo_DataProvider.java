package Testng;

import org.testng.annotations.*;

public class Demo_DataProvider {
	
	@Test(dataProvider="Data")
	
	public void Student(String name, String mailid)
	{
		System.out.println(name);
		System.out.println(mailid);
	}
	
	
	@DataProvider(name="Data1")
	public Object[][] Data1()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "geetha";
		data[0][1] = "abc@hmail.com";
		return data;
		
	}

	@DataProvider(name="Data")
	public Object[][] Data()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "lohitha";
		data[0][1] = "def@gmail.com";
		return data;
				
	
	}
		
}
