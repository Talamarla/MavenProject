package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.findElement(By.linkText("REGISTER")).click();
		

	}

}
