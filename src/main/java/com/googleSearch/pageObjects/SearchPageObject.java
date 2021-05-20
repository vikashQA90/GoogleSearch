package com.googleSearch.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseTest;
import com.googleSearch.drivers.Driver;


public class SearchPageObject extends BaseTest{
	
	
	private static String searchValue;
	
	
	public List<String> getResults(){
		List<WebElement> lstCollectResults=Driver.driver.findElements(By.xpath("//div[@class='g']//h3"));
		List<String> Lst_result=new ArrayList<String>();
		
		for(WebElement ele:lstCollectResults)
		{
			String result=ele.getText();
			Lst_result.add(result);
		}
		return Lst_result;
	
		}
	
	//div[@class="g"]//h3
	public void SendData(String Searchvalue)
	{
		Driver.driver.findElement(By.name("q")).sendKeys(Searchvalue, Keys.ENTER);
	}
	
	
	public boolean ValidateResults(String Searchvalue, List<String> Lst){
		boolean isFound=false;
		List<String> Lst_result=Lst;
		
		for(int i=0;i<Lst_result.size()-1;i++)
		{
			if(Lst_result.get(i).contains(Searchvalue))
			{
				System.out.println(Lst_result.get(i).toString());
				System.out.println("Match Found");
				
				isFound=true;
				
			}
		}
		return isFound;
		

		}
	

}
