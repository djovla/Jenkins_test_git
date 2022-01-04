package testNG;

import org.testng.annotations.Test;

public class AnnotationsOne {
	@Test(priority = 1)
	public void k() {
		System.out.println("@Test k");
	}

	@Test(priority = 3)
	public void z() {
		System.out.println("@Test z");
	}

	@Test(priority = 2)
	public void b() {
		System.out.println("@Test b");
	}

	@Test(priority = 4)
	public void a() {
		System.out.println("@Test a");
	}

}
