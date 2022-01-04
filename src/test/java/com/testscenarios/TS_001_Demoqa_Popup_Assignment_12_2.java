package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TS_001_Demoqa_Popup_Assignment_12_2 extends GenericWrappers {
	Assignment_Locators loc = new Assignment_Locators();

	@Test
	public void tc_001_Invoke_Demoqa_Application() {
		driver.get(getData("URL_DEMOQA"));
	}

	@Test
	public void tc_002_Click_New_Window_Button() {
		trackingOfWindow();
		clickByAnylocator(loc.DemoqaPage_New_Window_Button);
	}

	@Test
	public void tc_003_Get_Message_Window_Popup() throws InterruptedException {
		navigateToPopupWindow();
		System.out.println(getTextByLocator(loc.DemoqaPage_Message_Window_H1)); //
		popupHandleToCloseAllChildWindow(); //
		implicitWait(3000);

	}

	@Test
	public void tc_004_Click_New_Message_Window_Get_Message_Button() throws InterruptedException {
		trackingOfWindow();
		clickByAnylocator(loc.DemoqaPage_New_Message_Window_Button);
		navigateToPopupWindow();
		//problem gettin the text from the body tag popup
		//System.out.println(driver.findElement(By.tagName("body")).getText());
		popupHandleToCloseAllChildWindow();
	}

	@Test
	public void tc_005_Click_New_Tab_And_Close_Tab_Button() throws InterruptedException {
		trackingOfWindow();
		clickByAnylocator(loc.DemoqaPage_New_Tab_Button);
		implicitWait(6000);
		switchAndCloseNewTab();

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void browserLaunch(@Optional("chrome") String Browser){
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
