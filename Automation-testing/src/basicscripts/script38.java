package basicscripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

import jakarta.xml.bind.Element;

public class script38 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	    ele.sendKeys("iphone11");
	    Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//button[@type='submit']"));
		ele1.click();
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		link.click();
		Thread.sleep(1000); 
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String>  arr=new ArrayList<String>();
		int count = arr.size();
		for(int i=0;i<count;i++)
		{
		 String st = arr.get(count);
		driver.switchTo().window(st);
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		button.click();
		}
		
	}	
}

