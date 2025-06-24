package Pratice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DummyClass2 {
	@Test(groups = "Smoke")
	public void Test1()
	{
		Reporter.log("Hello from test 1", true);
	}
	@Test(groups="Regression")
	public void Test2()
	{
		Reporter.log("Hello from  test 2", true);
	}

}
