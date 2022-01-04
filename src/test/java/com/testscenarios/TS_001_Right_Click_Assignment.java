package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TS_001_Right_Click_Assignment extends GenericWrappers{
	Assignment_Locators loc = new Assignment_Locators();
	
  @Test
  public void tc_001_Invoke_Demo_Guru99_Application() {
	  driver.get(getData("URL_GURU99"));
  }
  
  @Test
  public void tc_002_Right_Click_On_Right_Click_Button() {
	  rightClickOnElement(loc.DemoGuru99Page_Right_Click_Me_Button);
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
