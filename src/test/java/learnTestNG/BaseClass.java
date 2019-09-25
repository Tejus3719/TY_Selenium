package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeSuite
	public void bSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void bTest() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void bClass() {
		System.out.println("Before CLass");
	}

	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method");
	}

	@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}

	@AfterMethod
	public void aMethod() {
		System.out.println("After MEthod");
	}

	@AfterSuite
	public void aSuite() {
		System.out.println("After Suite");
	}

	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}

}
