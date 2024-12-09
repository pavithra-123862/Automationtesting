package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script13 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name=driver.findElement(By.cssSelector("input[placeholder='Enter your name']"));
		Thread.sleep(2000);
		name.sendKeys("pavithra");
		WebElement id=driver.findElement(By.cssSelector("input[type='email']"));
		Thread.sleep(2000);
		id.sendKeys("pavithragagan20012004@gmail.com");
		WebElement pwd=driver.findElement(By.cssSelector("input[name='password']"));
		Thread.sleep(2000);
		pwd.sendKeys("pavithra1234");
		WebElement bt=driver.findElement(By.cssSelector("button[type='submit']"));
		Thread.sleep(2000);
		bt.click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
