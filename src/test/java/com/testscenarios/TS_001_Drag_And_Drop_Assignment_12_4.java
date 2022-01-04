package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TS_001_Drag_And_Drop_Assignment_12_4 extends GenericWrappers {
	Assignment_Locators loc = new Assignment_Locators();

	@Test
	public void tc_001_Launch_Drag_And_Drop_Application() throws InterruptedException {

		driver.navigate().to(getData("URL_DRAG_DROP"));
		// Thread.sleep(3000);
		implicitWait(3000);
	}

	@Test
	public void tc_002_Drag_And_Drop_Bank_To_Account_Debit_Side_Link() {

		dragAndDrop(loc.DragDropPage_Bank_Value_Button_Link, loc.DragDropPage_Account_Debit_Side_Li);

	}

	@Test
	public void tc_003_Drag_And_Drop_50000_To_Account_Debit_Side_Link() {

		dragAndDrop(loc.DragDropPage_5000_Value_Button_Link, loc.DragDropPage_Amount_Debit_Side_Li);

	}

	@Test
	public void tc_004_Drag_And_Drop_Sales_To_Account_Credit_Side_Link() {

		dragAndDrop(loc.DragDropPage_Sales_Value_Button_Link, loc.DragDropPage_Account_Credit_Side_Li);

	}

	@Test
	public void tc_005_Drag_And_Drop_5000_To_Account_Credit_Side_Link() {

		dragAndDrop(loc.DragDropPage_5000_Value_Button_Link, loc.DragDropPage_Amount_Credit_Side_Li);

	}

	@AfterMethod
	public void scrrenshot(ITestResult res) throws Exception {
		takeScreenshot(res);
		implicitWait(3000);
	}

	@Parameters("Browser")
	@BeforeClass
	public void BrowserLaunch(@Optional("chrome") String Browser) {
		loadTestData("./src/test/resources/Assignment_input.properties");
		if (Browser.equalsIgnoreCase("Chrome")) {
			launchChromeBrowser();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			launchFirefoxBrowser();
		} else {
			System.out.println("Check your Browser");
		}

	}

	@AfterClass
	public void afterClass() {
	}

}
