package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script37
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//h3[.='8. Complaints']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='60%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='160%'");
		Thread.sleep(2000);
		driver.quit();
}
}