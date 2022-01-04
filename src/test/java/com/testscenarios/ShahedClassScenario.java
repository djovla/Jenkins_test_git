package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

public class ShahedClassScenario extends GenericWrappers {

	JRI_Locators loc = new JRI_Locators();

	@Parameters("Browser")
	@BeforeClass
	public void BrowserLaunch(@Optional("chrome") String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {
			launchChromeBrowser();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			launchFirefoxBrowser();
		}

		else {
			System.out.println("Check your Browser");
		}

	}

	@Test
	public void launch() {
		
		driver.get("https://www.toyota.co.uk");
		String winHandleBefore = driver.getWindowHandle();

		System.out.println("Parent page " + driver.getCurrentUrl() + " " + driver.getTitle());

		// Calling ClickAction method twice for different scenarios
		clickByAnylocator(loc.PopupBoxClick);
		clickByAnylocator(loc.CalculateButton);

		// calling WindowHandler method from GenericWrappers
		WindowHandler();
		GetText(loc.text);
		
		//Close the child tab (Curreent tab)
		driver.close();
		//then move to parent tab then do some actions on parent tab
		driver.switchTo().window(winHandleBefore);
		//click on Userd Cars button
		clickByAnylocator(By.xpath("//*[@id=\"pagecontent\"]/div[2]/div/div[1]/section/div/ul[1]/li[3]/a"));
	
		

	}

}