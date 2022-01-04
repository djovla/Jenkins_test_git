package com.testscenarios;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

public class ActionsSample extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();

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

	@Test
	public void actionsFromSelenium() throws Exception {

		Actions act = new Actions(driver);
//		driver.get("https://www.platformqedu.com/cwl/");
//		Thread.sleep(5000);
//		WebElement produt = driver.findElement(By.xpath("//*[@id='menu-item-147']/a/div"));
//		// move mouse pointer to product menu
//		act.moveToElement(produt).perform();
//		Thread.sleep(3000);
//		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
//		Thread.sleep(3000);
//		
//		WebElement dbclk = driver.findElement(By.xpath("//*[@id='authentication']/button"));
//		act.doubleClick(dbclk).perform();
//		Thread.sleep(3000);
//		//alert will come, to handle alert call reusable method
//		alertHandleByAccept();
//		Thread.sleep(3000);
//		//RightClick: 
//		//Performs a context-click at middle of the given element.
//		//First performs a mouseMoveto the location of the element.
//		WebElement rgtclk = driver.findElement(By.xpath("//*[@id='authentication']/span"));
//		act.contextClick(rgtclk).perform();	
		
		Thread.sleep(3000);		
		//driver.navigate().to("https://stqatools.com/demo/Drag&Drop.php#");
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		   
        Thread.sleep(6000);
 
        WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li")); 
        //Perform drag and drop
        //act.dragAndDrop(from, to).perform();
        act.dragAndDrop(from, to).build().perform();

        
        //act.sendKeys(Keys.SHIFT)
	}

	@AfterMethod
	public void screenshot(ITestResult res) throws Exception {
		takeScreenshot(res);
	}
}
