package com.googleSearch.TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseTest;
import com.googleSearch.pageObjects.SearchPageObject;

public class GooglePageTests extends BaseTest{
	SearchPageObject srch=new SearchPageObject();
	public static String searchvalue="Car";
	
	@Test
	public void SearhItemsTest()
	{
      srch.SendData(searchvalue);
      Assert.assertEquals(srch.ValidateResults(searchvalue, srch.getResults()), true);
		
	}
}
