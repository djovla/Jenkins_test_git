package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.JRI_Locators;
import com.utilities.GenericWrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTemplate extends GenericWrappers {
	JRI_Locators loc = new JRI_Locators();

	@BeforeClass
	public void beforeClass() {

	}

	@Test
	public void f() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterClass() {

	}

}
