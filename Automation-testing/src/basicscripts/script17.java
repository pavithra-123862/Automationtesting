package basicscripts;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class script17 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Administrator/Desktop/selenium/demo.html");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		usn.sendKeys("pavithra");
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usn.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(1000);
		pwd.sendKeys("pavi@123");
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		pwd.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
