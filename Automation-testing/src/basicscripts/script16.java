package basicscripts;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class script16 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Administrator/Desktop/selenium/webelement.html");
		WebElement us=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(us.isDisplayed())
		{
			if(us.isEnabled())
			{
				us.sendKeys("admin");
			}
			else
			{
				System.out.println("us is disabled");
			}
		}
		else
		{
			System.out.println("us is not displayed");
			{
			
			}
		}
		WebElement pwd=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
	}

}

