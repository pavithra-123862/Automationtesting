package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class cupple 
{
	@Test
	public void signup()
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String expectedtitle="Facebook – log in or sign up";
		String actualtitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		System.out.println(actualtitle);
		driver.quit();
		s.assertAll();
	}
}
