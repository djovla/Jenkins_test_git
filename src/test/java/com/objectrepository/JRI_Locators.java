package com.objectrepository;

import org.openqa.selenium.By;

public class JRI_Locators {

	public final By JRIHomePage_CreateNewAccount_HyperLink = By.id("signup-link");

	public final By CreateNewAccountPage_Name_EditBox = By.name("signup_name");
	public final By CreateNewAccountPage_Mobile_EditBox = By.name("signup_mobileno");
	public final By CreateNewAccountPage_Email_EditBox = By.name("signup_email");
	public final By CreateNewAccountPage_Password_EditBox = By.name("signup_password");
	public final By CreateNewAccountPage_newsletters_CheckBox = By.name("checkbox1");
	public final By CreateNewAccountPage_terms_CheckBox = By.name("checkbox");
	public final By CreateNewAccountPage_CreateAccount_Button = By.name("imgbtnSubmit");

	// Blank page Error messages
	public final By CreateNewAccountPage_Name_ErrorMsg = By.xpath("//span[text()='Enter your name']");
	public final By CreateNewAccountPage_Mobile_ErrorMsg = By.xpath("//span[text()='Enter mobile no.']");
	public final By CreateNewAccountPage_Email_ErrorMsg = By.xpath("//span[text()='Enter your email id']");
	public final By CreateNewAccountPage_Password_ErrorMsg = By.xpath("//span[text()='Enter your password']");
	public final By CreateNewAccountPage_Terms_ErrorMsg = By
			.xpath("//*[text()='Please agree to the terms & conditions']");

	// Invalid test data error messages
	public final By CreateNewAccountPage_Name_InvalidData_ErrorMsg = By.xpath("//*[text()='Enter correct name']");
	public final By CreateNewAccountPage_Mobile_InvalidData_ErrorMsg = By
			.xpath("//*[text()='Enter valid 10 digit mobile no.']");
	public final By CreateNewAccountPage_Email_InvalidData_ErrorMsg = By.xpath("//*[text()='Enter valid email id']");
	public final By CreateNewAccountPage_Password_InvalidData_ErrorMsg = By
			.xpath("//*[text()='Enter 6-digit numeric characters only']");
	
	//toyota locators
	public final By PopupBoxText = (By.className("tgbgdpr-overlay-content"));
	public final By PopupBoxClick = (By.id("tgbgdpr-overlay-agree"));
	public final By CookiSetting = (By.name("tgbgdpr-overlay-settings"));
	public final By ClickRadioButton = (By.linkText("Download"));
	public final By CalculateButton = (By.xpath("//*[@id=\"ctaBar\"]/a[4]"));
	public final By text = (By.className("section-title"));
	

}
