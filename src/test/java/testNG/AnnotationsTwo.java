package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsTwo {
	@Test // Actual Test case
	public void k() {
		System.out.println("@Test k");
	}

	@Test
	public void z() {
		System.out.println("@Test z");
	}

	@AfterClass // Post-condition
	public void afterClass() {
		System.out.println("@AfterClass");

	}

	@BeforeClass // Pre-Condition
	public void beforeClass() {
		System.out.println("@BeforeClass");

	}

}
