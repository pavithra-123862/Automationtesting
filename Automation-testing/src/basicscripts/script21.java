package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class script21 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		 WebElement f1=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		 WebElement f2=driver.findElement(By.xpath("//input[@id='email']"));
		 f2.sendKeys("pavithra@1234");
		
		
		
	}
	
	}
