package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsThree {
	@Test // Actual Test case
	public void k() {
		System.out.println("@Test k");
	}

	@Test // Actual Test case
	public void a() {
		System.out.println("@Test a");
	}

	@Test
	public void z() {
		System.out.println("@Test z");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");

	}

}
