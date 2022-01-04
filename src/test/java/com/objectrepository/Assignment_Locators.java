package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilities.GenericWrappers;

public class Assignment_Locators {
	// TS_001_Retail_Tab_Assignment_12_1 Locators
	public final By RetailPage_Continue_Login_Button = By.xpath("//*[@id='banner']/div[2]/a");
	public final By RetailPage_New_User_Link = By.xpath("//*[@id='login_fields']/div[1]/div[2]/ul/li[1]/a");
	public final By retailPage_Next_From_Popup_Button = By.xpath("//*[@id='nextStep']");

	// TS_001_Demoqa_Popup_Assignment_12_2 Locators
	public final By DemoqaPage_New_Window_Button = By.id("windowButton");
	public final By DemoqaPage_Message_Window_H1 = By.id("sampleHeading");
	public final By DemoqaPage_New_Message_Window_Button = By.id("messageWindowButton");
	public final By DemoqaPage_New_Message_Window_Body = By.tagName("body");
	public final By DemoqaPage_New_Tab_Button = By.id("tabButton");

	// TS_001_Toyota_Assignment_12_3 Locators
	public final By ToyotaPage_Yes_I_Agree_Button = By.id("tgbgdpr-overlay-agree");
	public final By ToyotaPage_Icon_Quick_Finance_Calculator_Link = By.xpath("//*[@id=\"ctaBar\"]/a[4]/span[1]");
	public final By ToyotaPage_Choose_Your_Car_Select = By.id("codeweaversModels");

	// TS_001_Drag_And_Drop_Assignment_12_4
	public final By DragDropPage_Bank_Value_Button_Link = By.xpath("//*[@id='credit2']/a");
	public final By DragDropPage_5000_Value_Button_Link = By.xpath("//*[@id=\"fourth\"]/a");
	public final By DragDropPage_Sales_Value_Button_Link = By.xpath("//*[@id=\"credit1\"]/a");

	public final By DragDropPage_Account_Debit_Side_Li = By.xpath("//*[@id='bank']/li");
	public final By DragDropPage_Amount_Debit_Side_Li = By.xpath("//*[@id=\"amt7\"]");
	public final By DragDropPage_Account_Credit_Side_Li = By.xpath("//*[@id=\"loan\"]");
	public final By DragDropPage_Amount_Credit_Side_Li = By.xpath("//*[@id=\"amt8\"]");

	// TS_001_Place_Order_Take_Screenshot_FlipKart
	public final By FlikartPage_XButton_Button = By.xpath("/html/body/div[2]/div/div/button");
	public final By FlikartPage_Pincode_Input = By.name("pincode");
	public final By FlikartPage_Grocery_Menu_Link = By
			.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[2]");
	public final By FlikartPage_SnacksAndBeverages_Link = By
			.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[2]/div/div");
	public final By FlikartPage_Biscuits_Button = By.className("_6WOcW9");
	public final By FlikartPage_AddItem_Button = By
			.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[4]/button[2]");
	public final By FlikartPage_Cart_Link = By
			.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a");
	public final By FlikartPage_Electronics_Handover_Menu_Link = By
			.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div");
	
   //TS_001_Right_Click_Assignment
	public final By DemoGuru99Page_Right_Click_Me_Button = By.xpath("//*[@id=\"authentication\"]/span");
	
  //TS_001_Change_Input_To_Capital_Letter extends GenericWrappers
	public final By tirupatibalajiPage_Email_Longin_Detail_Input = By.xpath("//*[@id=\"container\"]/div/div[9]/div[2]/div/div[1]/form/fieldset[2]/input");
}
