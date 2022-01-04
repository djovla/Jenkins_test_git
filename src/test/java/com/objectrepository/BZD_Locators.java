package com.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BZD_Locators {
	public final By BlazePage_Departure_Select =By.name("fromPort");
	public final By BlazePage_Destination_Select =By.name("toPort");
	public final By BlazePage_FindFlights_Button =By.xpath("/html/body/div[3]/form/div/input");
	public final By BlazePage_Chose_This_Fligth_Button =By.cssSelector("input[type='submit'][value='Choose This Flight']");
	public final By BlazePage_Name_Input = By.id("inputName");
	public final By BlazePage_Address_Input = By.id("address");
	public final By BlazePage_City_Input = By.id("city");
	public final By BlazePage_State_Input = By.id("state");
	public final By BlazePage_Zipcode_Input = By.id("zipCode");
	public final By BlazePage_Card_Input = By.id("cardType");
	public final By BlazePage_CardNumber_Input = By.id("creditCardNumber");
	public final By BlazePage_CardMonth_Input = By.id("creditCardMonth");
	public final By BlazePage_CardYear_Input = By.id("creditCardYear");
	public final By BlazePage_CardHolderName_Input = By.id("nameOnCard");
	public final By BlazePage_CardType_Select = By.id("cardType");
	public final By BlazePage_Purchase_Flight_Button = By.xpath("/html/body/div[2]/form/div[11]/div/input");
	public final By BlazePage_Thank_You_Message_H1 = By.xpath("/html/body/div[2]/div/h1");
	public final By BlazePage_TableData_Td = By.tagName("td");
	public Select select;
	public List<WebElement> elements;
	
}
