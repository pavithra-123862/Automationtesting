package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script18 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Administrator/Desktop/selenium/admin.html");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usn.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.quit();
	}
}
