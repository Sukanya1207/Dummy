package Pratice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DummyClass2Test {
	@Test(groups = "Smoke")
	public void A1Test()
	{
		Reporter.log("Hello from test 1", true);
	}
	@Test(groups="Regression")
	public void A2Test()
	{
		Reporter.log("Hello from  test 2", true);
	}

}
