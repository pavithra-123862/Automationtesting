package basicscripts;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class script39 
{
	private static Object wins;

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement net = driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver']"));
		Thread.sleep(1000);
		WebElement rubi = driver.findElement(By.xpath("//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0']"));
		Thread.sleep(1000);
		WebElement py = driver.findElement(By.xpath("//a[@href='https://pypi.python.org/pypi/selenium']"));
		Thread.sleep(1000);
		WebElement js = driver.findElement(By.xpath("//a[@href='https://npmjs.org/package/selenium-webdriver']"));
		Thread.sleep(1000);
		ArrayList<WebElement> arr=new ArrayList<WebElement>();
		arr.add(net);
		arr.add(rubi);
		arr.add(py);
		arr.add(js);
		int count = arr.size();
		System.out.println(count);
		Actions a=new Actions(driver);
		Robot r=new Robot();
		for(int i=0;i<count;i++)
		{
			WebElement web = arr.get(i);
			a.contextClick(web).perform();
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		Set<String> wins=driver.getWindowHandles();
		for( String win:wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}
	
	}
}
