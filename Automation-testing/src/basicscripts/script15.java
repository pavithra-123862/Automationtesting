package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script15 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9953342,77.551474,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
		WebElement src=driver.findElement(By.xpath("//span[@aria-hidden='true' and @style='font-size: 24px' and @class='google-symbols NhBTye G47vBd']"));
		Thread.sleep(2000);
		src.click();
	}
}
