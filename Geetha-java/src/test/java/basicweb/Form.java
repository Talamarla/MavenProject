package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				WebDriver driver = new EdgeDriver();
				
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				
				driver.findElement(By.name("firstName")).sendKeys("Geetha");
				driver.findElement(By.name("lastName")).sendKeys("Talamarla");
				driver.findElement(By.name("phone")).sendKeys("12345678");
				driver.findElement(By.name("userName")).sendKeys("geethatalamarla@gmail.com");
				
				driver.findElement(By.name("address1")).sendKeys("DMM");
				driver.findElement(By.name("city")).sendKeys("Dharmavaram");
				driver.findElement(By.name("state")).sendKeys("AP");
				driver.findElement(By.name("postalCode")).sendKeys("515671");
				Select sel = new Select(driver.findElement(By.name("country")));
				sel.selectByValue("INDIA");
				
				driver.findElement(By.name("email")).sendKeys("geethatalamarla@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Geetha@12345");
				driver.findElement(By.name("confirmPassword")).sendKeys("Geetha@12345");
				driver.findElement(By.name("submit")).click();
			}

		}
