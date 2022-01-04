package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

public class PopupHandle extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();
  @Test
  public void f() throws Exception {
	  launchChromeBrowser();
	  driver.get("https://www.naukri.com/");
	  
	 //close the child windows
	  popupHandleToCloseTheChildWindow();
	  
	  
  }
}
