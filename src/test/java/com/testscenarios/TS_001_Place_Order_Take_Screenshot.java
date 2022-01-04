package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Assignment_Locators;

import com.utilities.GenericWrappers;


import org.testng.annotations.Optional;

import org.openqa.selenium.Keys;

import org.testng.annotations.BeforeClass;

public class TS_001_Place_Order_Take_Screenshot extends GenericWrappers{
	Assignment_Locators loc = new Assignment_Locators();
	
  @Test
  public void tc_001_Invoke_flipkart_application() {
		driver.get(getData("URL_FLIPKART"));
  }
  @Test
  public void tc_002_Click_On_Close_Icon_flipkart_application()  {
	clickByAnylocator(loc.FlikartPage_XButton_Button);
		    
  }
  @Test
	public void tc_003_goTo_Grocery_Menu() {
		implicitWait(3000);
		clickByAnylocator(loc.FlikartPage_Grocery_Menu_Link);
	}
  
	@Test
	public void tc_004_type_Pincode_Click_Enter() {
		implicitWait(3000);
		sendKeyByAnyLocator(loc.FlikartPage_Pincode_Input, "110001");
		implicitWait(3000);
		sendKeyByAnyLocator(loc.FlikartPage_Pincode_Input, Keys.ENTER);
	}
	
	@Test
	public void tc_005_goTo_Snacks_Beverages_Menu_Click_Biscuits() {
		moveToElement(loc.FlikartPage_SnacksAndBeverages_Link);
		moveToElementAndClick(loc.FlikartPage_Biscuits_Button);
	}
	@Test
	public void tc_006_add_Items_Place_Order() {
		implicitWait(3000);
		clickByAnylocator(loc.FlikartPage_AddItem_Button);
	}
	@Test
	public void tc_007_click_On_Cart() {
		implicitWait(3000);
		clickByAnylocator(loc.FlikartPage_Cart_Link);
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

}
