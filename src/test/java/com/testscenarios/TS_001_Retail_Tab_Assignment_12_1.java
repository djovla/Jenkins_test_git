package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TS_001_Retail_Tab_Assignment_12_1 extends GenericWrappers{
	Assignment_Locators loc = new Assignment_Locators();
	
  @Test
  public void tc_001_Launch_Retail_Application() {
		driver.get(getData("URL_RETAIL"));

  }
  @Test
  public void tc_002_Click_Continue_Login_Button() throws InterruptedException {
	  clickByAnylocator(loc.RetailPage_Continue_Login_Button);
      Thread.sleep(3000);
  }
  @Test
  public void tc_003_Click_New_User_Link() {
	  clickByAnylocator(loc.RetailPage_New_User_Link);

  }
  @Test
  public void tc_004_Click__Ok_Confirmation_Button() {
	  alertHandleByAccept();

  }
  @Test
  public void tc_005_Click__On_Next_From_Popup_Window_Button() throws InterruptedException {
	  navigateToPopupWindow();
	  clickByAnylocator(loc.retailPage_Next_From_Popup_Button);

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
