package com.baseclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.googleSearch.drivers.Driver;


public class BaseTest {
	
	
	@BeforeMethod
	public void setUp() {
		
		Driver.initDriver();
	}


	@AfterMethod
	public void tearDown()
	{
		Driver.quitDriver();
	}
}

