package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script27 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Administrator/Desktop/selenium/dropdown.html");
	WebElement dd=driver.findElement(By.id("celebrities"));
	Select s=new Select(dd);
	if(s.isMultiple())
	{
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("j");
		Thread.sleep(1000);
		s.selectByVisibleText("Anushka");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		Thread.sleep(1000);
		s.deselectByValue("k");
	}
	Thread.sleep(2000);
	driver.quit();
	}
}
