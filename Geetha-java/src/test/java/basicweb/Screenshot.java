package basicweb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		/*driver.get("https://demo.guru99.com/test/newtours/");
		TakesScreenshot scrnshot = ((TakesScreenshot)driver);
		File SrcFile=scrnshot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File("C:\\Users\\Admin\\Documents\\Automation\\Geetha-java\\src\\test\\java\\Screenshot.png)");
		FileUtils.copyFile(SrcFile, DestFile);		
	}

}*/

//System.setProperty("webdriver.firefox.marionette","C://Users//HP-LAPTOP//Desktop//harika//Selenium Java Lakshmi//geckodriver");
		//WebDriver driver = new FirefoxDriver() ;
		driver.get("https://demo.guru99.com/test/newtours/");
		
		TakesScreenshot pic =((TakesScreenshot)driver);
		File SrcFile = pic.getScreenshotAs(OutputType.FILE);
		File DestFile= new File("C:\\Users\\Admin\\Documents\\Automation\\Geetha-java\\src\\test\\resources\\Screenshot1.png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
}
