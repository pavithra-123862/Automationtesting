package basicscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.close();
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.netflix.com");
		Thread.sleep(2000);
		driver1.quit();
		
	}
}
