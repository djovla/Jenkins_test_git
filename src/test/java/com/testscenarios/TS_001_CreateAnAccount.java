package com.testscenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TS_001_CreateAnAccount extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();

	@Test
	public void tc_002_Verify_the_Create_New_Account_hyperlink_will_be_enable_state() {
		ValidateWebelementIsEnabledOrNot(loc.JRIHomePage_CreateNewAccount_HyperLink);
	}

	@Test
	public void tc_001_Invoke_the_JRI_application() {
		launchChromeBrowser();
		driver.get("https://www.justrechargeit.com/");

	}

	@AfterMethod
	public void screenshot(ITestResult res) throws Exception {
		takeScreenshot(res);
	}

	@Test
	public void tc_003_Verify_user_will_navigate_to_Create_New_Account_page() throws Exception {
		// Read the data from property file
		loadTestData("./src/test/resources/JRI_inputdata.properties");

		clickByAnylocator(loc.JRIHomePage_CreateNewAccount_HyperLink);
		implicitWait(10);
		if (!getData("JRI_HomePage_URL").equals(getData("CreateNewAccountPageURL"))) {
			System.out.println("Application has navigated successfully to the Create_New_Account_page");
		} else {
			System.out.println("Application has NOT navigated to the Create_New_Account_page, pleae check the error");
		}

	}

	@Test
	public void tc_004_Verify_the_Create_New_Account_page_elements_visibility() throws Exception {
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Name_EditBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Mobile_EditBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Email_EditBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Password_EditBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_newsletters_CheckBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_terms_CheckBox);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_CreateAccount_Button);
	}

	@Test
	public void tc_005and006_Check_the_Name_Error_messages_in_Create_New_Account_page() throws Exception {
		// Read the data from property file
		loadTestData("./src/test/resources/JRI_inputdata.properties");

		clickByAnylocator(loc.CreateNewAccountPage_CreateAccount_Button);
		implicitWait(10);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Name_ErrorMsg);
		refreshScreen();
		// type invalid data into name editbox
		sendKeyByAnyLocator(loc.CreateNewAccountPage_Name_EditBox, getData("InvalidName"));
		clickByAnylocator(loc.CreateNewAccountPage_CreateAccount_Button);
		implicitWait(10);
		findTheWebelementByAnyLocator(loc.CreateNewAccountPage_Name_InvalidData_ErrorMsg);
	}

	@Test
	public void tc_007_Check_the_Mobile_Error_messages_in_Create_New_Account_page() throws Exception {

	}

}
