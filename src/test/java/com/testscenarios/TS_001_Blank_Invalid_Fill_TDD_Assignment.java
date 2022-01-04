package com.testscenarios;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.objectrepository.TDD_Locators;
import com.utilities.GenericWrappers;

public class TS_001_Blank_Invalid_Fill_TDD_Assignment extends GenericWrappers{
  TDD_Locators loc = new TDD_Locators();
 
  @Test
  public void tc_001_launch_TDD_application() throws Exception{
		driver.get(getData("TDD_URL"));
		Thread.sleep(3000);
		
  }
  @Test
  public void tc_002_Click_Institution_Radion_Button(){
	  	clickByAnylocatorButton(loc.TDDPage_Institution_RadioButton);
  }
  @Test
  public void tc_003_Click_Institution_Continue_GetMessage_Button(){
	  	clickByAnylocator(loc.TDDPage_Continue_Button);
	  	clickByAnylocator(loc.TDDPage_Ok_Alert_Button);
	  	System.out.println("=================================");
	  	System.out.println(driver.findElement(loc.TDDPage_Error_Message_Div).getText());
	  	System.out.println("=================================");
  }
  @Test
  public void tc_004_Refresh_Page(){
	  refreshScreen();
		
  }
  @Test
  public void tc_005_Type_Invalid_Address_Line2_Input(){
	  sendKeyByAnyLocator(loc.TDDPage_AddressLine2_Input,getData("ADDR_INV"));
		
  }
  @Test
  public void tc_006_Type_Invalid_ZIPPIN_Input(){
	  sendKeyByAnyLocator(loc.TDDPage_ZipPin_Input,getData("ZIPPIN_INV"));
		
  }

	
  @Test
  public void tc_007_Click_Continue_Button(){
	  clickByAnylocator(loc.TDDPage_Continue_Button);
		
  }

	
  @BeforeMethod
  public void beforeTest() {
	  loadTestData("./src/test/resources/TDD_inputdata.properties");
  }
 @AfterMethod
 public void scrrenshot(ITestResult res) throws Exception {
	 takeScreenshot(res);
	 implicitWait(3000);
 }
 
 @Parameters("Browser")
	@BeforeClass
	public void BrowserLaunch(@Optional("chrome") String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {
			launchChromeBrowser();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			launchFirefoxBrowser();
		} else {
			System.out.println("Check your Browser");
		}
	}

 
 

}
