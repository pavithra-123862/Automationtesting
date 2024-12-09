package basicscripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class script40 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		 Date d=new Date();
		 WebElement ele= driver.findElement(By.xpath(""));
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File tem = ele.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(2000);
		 File perm = new File("./screenshots/defect5.png");
		Thread.sleep(2000);
		 FileHandler.copy(tem, perm);
		 driver.quit();
		
		
	}

}

