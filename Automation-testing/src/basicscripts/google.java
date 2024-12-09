package basicscripts;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class google 
{
	private static final String Downloads = null;

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement txt = driver.findElement(By.id("APjFqb"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		txt.sendKeys("Dogs");
		WebElement src=driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']"));
		src.submit();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement img=driver.findElement(By.xpath("//div[.='Images']"));
		img.click();
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		WebElement imgs = driver.findElement(By.xpath("(//img[@class='YQ4gaf'])[28]"));
		Thread.sleep(5000);
		imgs.click();
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.contextClick(imgs).perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
	
	}
		
		}

