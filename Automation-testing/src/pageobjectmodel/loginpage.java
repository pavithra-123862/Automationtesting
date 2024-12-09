package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
    @FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Enterusn()
	{
		usn.sendKeys("pavithra");
	}
	public void Enterpwd()
	{
		pwd.sendKeys("pavi@123");
	}
	
	
}
