package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class script24 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement src=driver.findElement(By.id("box3"));
		WebElement dst=driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(2000);
		WebElement src1=driver.findElement(By.id("box1"));
		WebElement dst1=driver.findElement(By.id("box101"));
		act.dragAndDrop(src1, dst1).perform();
		Thread.sleep(2000);
		
	}
}