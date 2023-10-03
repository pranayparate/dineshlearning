package com.pranay.automation.dineshautomation.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pranay.automation.dineshautomation.Pages.HomePage;
import com.pranay.automation.dineshautomation.Pages.SearchResultPage;
import com.pranay.automation.dineshautomation.Utils.Basetest;

public class Smoketest extends Basetest {
	WebDriver driver;
	HomePage homepage;
	SearchResultPage searchresultpage;
	@BeforeClass
	public void setup()
	{
		
		homepage =new HomePage(getDriver());
		
	}
	
	@Test
	public void verifySearchItem()
	{
		homepage.clearSearchText();
		homepage.enterTextOnSearchTextBox("iphone");
		searchresultpage=homepage.clickOnSearchButton();
		searchresultpage.getItemDescription();
		
	}
	
	

}
