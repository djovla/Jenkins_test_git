package com.testscenarios;
import org.testng.annotations.Test;
import com.objectrepository.BZD_Locators;
import com.utilities.GenericWrappers;
import org.testng.annotations.Parameters;
import java.util.List;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class TS_001_Book_Flight_In_BlazeDemo extends GenericWrappers {
	BZD_Locators loc = new BZD_Locators();
	/* <<<<<<< HEAD */

	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional("chrome")String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			launchChromeBrowser();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			launchFirefoxBrowser();
		} else {
			System.out.println("Not supported Bwoser");
		}
	}

	@Test
	public void tc_001_Invoke_BlazeDemo_application() {
		driver.get(getData("Blaze_URL"));
	}

	@Test
	public void tc_002_Choose_Your_Departure_Randomly_City() {

		selectOptionRandomly(loc.BlazePage_Departure_Select);
	}

	@Test
	public void tc_003_Choose_Your_Destination_Randomly_City() throws InterruptedException {

		selectOptionRandomly(loc.BlazePage_Destination_Select);
		Thread.sleep(2000);
	}

	@Test
	public void tc_004_Click_Find_Flights_Button() throws InterruptedException {

		clickByAnylocator(loc.BlazePage_FindFlights_Button);
		Thread.sleep(2000);
	}

	@Test
	public void tc_005_Click_Random_One_Of_Choose_Flights_Button() throws InterruptedException {
		List<WebElement> buttons = driver.findElements(loc.BlazePage_Chose_This_Fligth_Button);
		RandomClickOneButton(buttons);
	}

	@Test
	public void tc_006_Type_Name_Input() {
		sendKeyByAnyLocator(loc.BlazePage_Name_Input, getData("Name"));

	}

	@Test
	public void tc_007_Type_Name_Input() {
		sendKeyByAnyLocator(loc.BlazePage_Name_Input, getData("Name"));

	}

	@Test
	public void tc_008_Type_Address_Input() {
		sendKeyByAnyLocator(loc.BlazePage_Address_Input, getData("Address"));

	}

	@Test
	public void tc_009_Type_City_Input() {
		sendKeyByAnyLocator(loc.BlazePage_City_Input, getData("City"));

	}

	@Test
	public void tc_010_Type_State_Input() {
		sendKeyByAnyLocator(loc.BlazePage_State_Input, getData("State"));

	}

	@Test
	public void tc_011_Type_Zipcode_Input() {
		sendKeyByAnyLocator(loc.BlazePage_Zipcode_Input, getData("Zipcode"));

	}

	@Test
	public void tc_012_Select_Card_Type_Randomly_Select() {
		selectOptionRandomly(loc.BlazePage_CardType_Select);

	}

	@Test
	public void tc_013_Type_Card_Number_Input() {
		sendKeyByAnyLocator(loc.BlazePage_CardNumber_Input, getData("CardNumber"));

	}

	@Test
	public void tc_014_Type_Card_Month_Input() {
		sendKeyByAnyLocator(loc.BlazePage_CardMonth_Input, getData("Month"));

	}

	@Test
	public void tc_015_Type_Card_Year_Input() {
		sendKeyByAnyLocator(loc.BlazePage_CardYear_Input, getData("Year"));

	}

	@Test
	public void tc_016_Type_Card_Holder_Name_Input() throws InterruptedException {
		sendKeyByAnyLocator(loc.BlazePage_CardHolderName_Input, getData("CardName"));
		Thread.sleep(2000);

	}

	@Test
	public void tc_017_Click_Purchase_Flight_Button() throws InterruptedException {

		clickByAnylocator(loc.BlazePage_Purchase_Flight_Button);
	}

	@Test
	public void tc_018_Get_Message_Thank_You_Print_To_Console_H1() {

		System.out.println(getTextByLocator(loc.BlazePage_Thank_You_Message_H1));
	}

	@Test
	public void tc_019_Get_Input_From_Table_Print_To_Console_Td() {

		printListElementConsole(getListElementByLocator(loc.BlazePage_TableData_Td));
	}

	@BeforeMethod
	public void beforeTest() {
		loadTestData("./src/test/resources/blazedemo.properties");
	}

	/*
	 * @AfterTest public void afterTest() { } =======
	 * 
	 * @Parameters("browserName")
	 * 
	 * @BeforeClass // Pre-Condition public void beforeClass(String browserName) {
	 * if (browserName.equalsIgnoreCase("Chrome")) { launchChromeBrowser(); } else
	 * if (browserName.equalsIgnoreCase("firefox")) { launchFirefoxBrowser(); } else
	 * if (browserName.equalsIgnoreCase("edge")) { launchEdgeBrowser(); } else {
	 * System.out.println("Please type valid browserName***"); } }
	 * 
	 * 
	 * @Test public void tc_001_Invoke_BlazeDemo_application() {
	 * 
	 * driver.get(getData("Blaze_URL")); }
	 * 
	 * @Test public void tc_002_Choose_Your_Departure_Randomly_City() {
	 * 
	 * selectOptionRandomly(loc.BlazePage_Departure_Select); }
	 * 
	 * @Test public void tc_003_Choose_Your_Destination_Randomly_City() throws
	 * InterruptedException {
	 * 
	 * selectOptionRandomly(loc.BlazePage_Destination_Select); Thread.sleep(2000); }
	 * 
	 * @Test public void tc_004_Click_Find_Flights_Button() throws
	 * InterruptedException {
	 * 
	 * clickByAnylocator(loc.BlazePage_FindFlights_Button); Thread.sleep(2000); }
	 * 
	 * @Test public void tc_005_Click_Random_One_Of_Choose_Flights_Button() throws
	 * InterruptedException { List<WebElement> buttons =
	 * driver.findElements(loc.BlazePage_Chose_This_Fligth_Button);
	 * RandomClickOneButton(buttons); }
	 * 
	 * @Test public void tc_006_Type_Name_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_Name_Input, getData("Name"));
	 * 
	 * }
	 * 
	 * @Test public void tc_007_Type_Name_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_Name_Input, getData("Name"));
	 * 
	 * }
	 * 
	 * @Test public void tc_008_Type_Address_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_Address_Input, getData("Address"));
	 * 
	 * }
	 * 
	 * @Test public void tc_009_Type_City_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_City_Input, getData("City"));
	 * 
	 * }
	 * 
	 * @Test public void tc_010_Type_State_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_State_Input, getData("State"));
	 * 
	 * }
	 * 
	 * @Test public void tc_011_Type_Zipcode_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_Zipcode_Input, getData("Zipcode"));
	 * 
	 * }
	 * 
	 * @Test public void tc_012_Select_Card_Type_Randomly_Select() {
	 * selectOptionRandomly(loc.BlazePage_CardType_Select);
	 * 
	 * }
	 * 
	 * @Test public void tc_013_Type_Card_Number_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_CardNumber_Input, getData("CardNumber"));
	 * 
	 * }
	 * 
	 * @Test public void tc_014_Type_Card_Month_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_CardMonth_Input, getData("Month"));
	 * 
	 * }
	 * 
	 * @Test public void tc_015_Type_Card_Year_Input() {
	 * sendKeyByAnyLocator(loc.BlazePage_CardYear_Input, getData("Year"));
	 * 
	 * }
	 * 
	 * @Test public void tc_016_Type_Card_Holder_Name_Input() throws
	 * InterruptedException {
	 * sendKeyByAnyLocator(loc.BlazePage_CardHolderName_Input, getData("CardName"));
	 * Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @Test public void tc_017_Click_Purchase_Flight_Button() throws
	 * InterruptedException {
	 * 
	 * clickByAnylocator(loc.BlazePage_Purchase_Flight_Button); }
	 * 
	 * @Test public void tc_018_Get_Message_Thank_You_Print_To_Console_H1() {
	 * 
	 * System.out.println(getTextByLocator(loc.BlazePage_Thank_You_Message_H1)); }
	 * 
	 * @Test public void tc_019_Get_Input_From_Table_Print_To_Console_Td() {
	 * 
	 * printListElementConsole(getListElementByLocator(loc.BlazePage_TableData_Td));
	 * }
	 * 
	 * @BeforeTest public void beforeTest() {
	 * loadTestData("./src/test/resources/blazedemo.properties"); }
	 * 
	 * @AfterTest public void afterTest() { } >>>>>>>
	 * 92edfcabaa12623a786dba2a7124dead28741945
	 */

}
