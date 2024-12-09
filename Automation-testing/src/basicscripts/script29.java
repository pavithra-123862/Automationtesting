package basicscripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script29 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int optscount=opt.size();
		System.out.println(optscount);
		ArrayList<String> arr=new ArrayList<String>();
		for( int i=0;i<optscount;i++)
		{
			WebElement opts=opt.get(i);
			String txt=opts.getText();
			arr.add(txt);
		}
			Collections.sort(arr);
			
				for(String ar:arr)
				{
					System.out.println(ar);
				}
				
				Thread.sleep(1000);
				
			Collections.sort(arr,Collections.reverseOrder());
			
				for( String ar:arr)
				{
					System.out.println(ar);
				}
			Thread.sleep(1000);
			driver.quit();
			
		}
	
}

