package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script12 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Administrator/Desktop/selenium/utube.html");
		WebElement usn=driver.findElement(By.cssSelector("input[ type='text']"));
		Thread.sleep(2000);
		usn.sendKeys("pavithra");
		WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(2000);
		cb.click();
		WebElement rb=driver.findElement(By.cssSelector("input[type='radio']"));
		Thread.sleep(2000);
		rb.click();
		WebElement link=driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
		Thread.sleep(2000);
	    link.click();
	    Thread.sleep(2000);
	    driver.quit();
	    
		
		
		
	}
}
