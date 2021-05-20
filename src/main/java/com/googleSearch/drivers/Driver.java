package com.googleSearch.drivers;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import javax.annotation.CheckForNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.googleSearch.constants.FrameworkConstant;

public  class Driver  {
	public static WebDriver driver;
	
	@BeforeMethod
	public static void initDriver()
	{
		if(Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromeDriverPath());
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://google.com");
		}
	}
	
	@AfterMethod
	@CheckForNull
	public static void quitDriver()
	{		
		driver.quit();
	}
	
}
