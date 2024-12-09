package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script23 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/Administrator/Desktop/selenium/checkbox.html");
		List<WebElement> eles=driver.findElements(By.xpath("//input"));
		int count=eles.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele=eles.get(i);
			ele.click();
		}
		Thread.sleep(2000);
		
		int count1=eles.size();
		for(int i=0;i<count1;i++)
		{
			if(i%2==1) 
			{
				WebElement ele=eles.get(i);
				ele.click();
		    }
		}
		int count2=eles.size();
				for(int i=count2-1;i>=0;i--)
				{
					WebElement ele1=eles.get(i);
					ele1.click();
			
	}	
				Thread.sleep(2000);
				driver.close();
	}
	}

