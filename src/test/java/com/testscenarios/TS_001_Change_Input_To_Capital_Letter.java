package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TS_001_Change_Input_To_Capital_Letter extends GenericWrappers {
	Assignment_Locators loc = new Assignment_Locators();
	
  @Test
  public void tc_001_launch_Tirupatibalaji_Application() {
	  driver.get(getData("URL_TIRUPATIBALAJI"));
	  implicitWait(5000);
  }
  
  @Test
  public void tc_002_Change_Input_To_Capital_In_Email() {
	  ChangeInputToCapitalOnElement(loc.tirupatibalajiPage_Email_Longin_Detail_Input,getData("TIRUPATIBALAJI_EMAIL"));
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
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

  @AfterClass
  public void afterClass() {
  }

}
