package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script02 
{
	@Test
	public void Testcase()
	{
		Reporter.log("good morning",true);
	}
	@Test
	public void Testcase2()
	{
		Reporter.log("good afternoon",true);
	}
}
