package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;


import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;


public class TS_001_Move_To_Element extends GenericWrappers {
	Assignment_Locators loc = new Assignment_Locators();

	@Test
	public void tc_001_Invoke_Flipkart_Application() {
		driver.get(getData("URL_FLIPKART"));
	}

	@Test
	public void tc_002_Close_Popup_Window_X() {
		clickByAnylocator(loc.FlikartPage_XButton_Button);
	}

	@Test
	public void tc_003_Move_Mouse_To_Electornics_Menu() {
		moveMouseToElement(loc.FlikartPage_Electronics_Handover_Menu_Link);

	}

	@AfterMethod
	public void screenShot(ITestResult res) throws Exception {
		takeScreenshot(res);
	}

	@BeforeClass
	public void browserLaunch(@Optional("chrome") String Browser) {
		loadTestData("./src/test/resources/Assignment_input.properties");
		if (Browser.equalsIgnoreCase("Chrome")) {
			launchChromeBrowser();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			launchFirefoxBrowser();
		} else {
			System.out.println("Check your Browser");
		}
	}

}
