package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script01 
{
	@Test
	public void Testcase()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Good Evening",true);
	}
}
