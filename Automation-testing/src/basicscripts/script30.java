package basicscripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class script30 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByIndex(3);
		WebElement act=driver.findElement(By.xpath("//button[text()='Add']"));
		act.click();
		Thread.sleep(2000);
		driver.quit();	
			
		
	}

	
		
}
