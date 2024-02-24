package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		boolean isEnabled=driver.findElement(By.id("vfb-7-1")).isEnabled();
		System.out.println(isEnabled);
		
		boolean isSelected=driver.findElement(By.id("vfb-7-1")).isSelected();
		System.out.println(isSelected);
		driver.findElement(By.id("vfb-7-1")).click();
		

	}

}