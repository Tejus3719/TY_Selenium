package learnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseClass {

	@Test(priority = 1)
	public void m1() {

		System.out.println("Method1");
	}

	@Test(priority = 2)
	public void m2() {
		System.out.println("Method2");
	}

	@Test(priority = 3)
	public void m3() {
		Assert.fail();
	}

	@Test(priority = 4)
	public void m4() {
		Reporter.log("passed");
	}

	@Test(priority = 5)
	public void m5() {
		Reporter.log("method5");
	}

}
