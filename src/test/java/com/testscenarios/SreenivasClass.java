package com.testscenarios;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

public class SreenivasClass extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();

	@Test
	public void tc_001_Invoke_the_JRI_application() throws IOException {
		launchChromeBrowser();

		driver.get("https://www.fb.com/");

		// Click on Forgotten password? link
		driver.findElement(By.linkText("Forgotten password?")).click();
		implicitWait(10);
		// Screenshot

		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);

		String path = ".\\Screenshots\\";
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(path + "Test" + timeStamp + ".JPEG"));
	}
}
