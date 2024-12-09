package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script20 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/selenium/Frames/mainframesrc.html");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		usn.sendKeys("pavithra");
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		WebElement pwd=driver.findElement(By.xpath("//input[@type='text']"));
		pwd.sendKeys("pavi@12344");
}
	
}
