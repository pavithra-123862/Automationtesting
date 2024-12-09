package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script35 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Administrator/Desktop/selenium/demo2.html");
		WebElement un = driver.findElement(By.xpath("//input[@class='c1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=' '",un);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='pavi'",un);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
