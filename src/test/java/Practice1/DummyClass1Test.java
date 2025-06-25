package Practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DummyClass1Test {

	@Test(groups = "Smoke")
	public void m1Test() {
		Reporter.log("Hello from class m1 ", true);
	}
	@Test(groups = "Regression")
	public void m2Test() {
		Reporter.log("Hello from class m2", true);
	}
}