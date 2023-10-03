package com.pranay.automation.dineshautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
private WebDriver driver;
	
public WebDriver getDriver() {
	return driver;
}

public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}

}
