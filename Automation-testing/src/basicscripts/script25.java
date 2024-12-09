package basicscripts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script25 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Administrator/Desktop/selenium/dropdown.html");
		WebElement dropdown=driver.findElement(By.id("celebrities"));
		Select s=new Select(dropdown);
		List<WebElement> opts=s.getOptions();
		int optscount =opts.size();
		System.out.println(optscount);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<optscount;i++) 
		{
			WebElement opt=opts.get(i);
			String txt=opt.getText();
			System.out.println(txt);
			
		}
		Thread.sleep(1000);
		driver.quit();
	}
}
