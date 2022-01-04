package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

public class FramesHandle extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();

	@Test
	public void f() {
		launchChromeBrowser();
		driver.get("http://mis.nyiso.com/public/");
		implicitWait(20);
		//Switch to Frame By given locator
		loopAllFramesForElement(By.name("P-24Alist"));
		
		clickByAnylocator(By.name("P-24Alist"));

	}
}
