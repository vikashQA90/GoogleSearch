package com.googleSearch.constants;

public final class FrameworkConstant {

	private FrameworkConstant()
	{

	}
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executable/chromedriver.exe";


	public static String getChromeDriverPath() {
		// TODO Auto-generated method stub
		return CHROMEDRIVERPATH;
	}
}
