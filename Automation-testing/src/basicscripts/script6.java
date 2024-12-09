package basicscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script6 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		
	}
}
