package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	@Test
	public void signup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String expectedtitle="Facebook – log in or sign up";
		String actualtitle=driver.getTitle();
		Thread.sleep(1000);
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println(actualtitle);
		driver.quit();
		
	}
}
