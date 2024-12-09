package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script14 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement src=driver.findElement(By.xpath("//div/input"));
		Thread.sleep(2000);
		src.sendKeys("movie");
		WebElement src1=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		Thread.sleep(2000);
		src1.click();
		WebElement vdo=driver.findElement(By.xpath("//h3[@id='video-title' and @class='style-scope ytd-promoted-video-renderer']"));
		Thread.sleep(2000);
		vdo.click();
		vdo.submit();
		driver.quit();
	}
}
                                   