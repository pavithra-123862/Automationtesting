package runnerscript;

import org.testng.annotations.Test;
import Genericscript.basepage;
import pageobjectmodel.loginpage;

public class testcase01 extends basepage
{
	@Test
	public void login() throws InterruptedException
	{
		loginpage lp = new loginpage(driver);
		lp.Enterusn();
		lp.Enterpwd();
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.Enterusn();
		lp.Enterpwd();
	}
}
