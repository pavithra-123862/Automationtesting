package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script22 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		 int count=links.size();
		 for(int i=0;i<count;i++)
		 {
			WebElement link=links.get(i);
			String txt=link.getText();
			System.out.println(txt);
		 }
		Thread.sleep(2000);
		driver.quit();
	}
}
