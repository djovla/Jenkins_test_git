package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TS_001_Toyota_Assignment_12_3 extends GenericWrappers {
	Assignment_Locators loc = new Assignment_Locators();

	@Test
	public void tc_001_Launch_Toyota_Application() {
		driver.get(getData("URL_TOYOTA"));
	}

	@Test
	public void tc_002_Click_Yes_I_Agree_Button() {
		clickByAnylocator(loc.ToyotaPage_Yes_I_Agree_Button);
		implicitWait(3000);
	}

	@Test
	public void tc_003_Click_ToyotaPage_Icon_Quick_Finance_Calculator_Link() {
		clickByAnylocator(loc.ToyotaPage_Icon_Quick_Finance_Calculator_Link);
		implicitWait(3000);
	}

	@Test
	public void tc_004_Navigate_To_Tab_And_Select_A_Random_Car_Input() {
		switchToNewTab();
		selectOptionRandomly(loc.ToyotaPage_Choose_Your_Car_Select);

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

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
