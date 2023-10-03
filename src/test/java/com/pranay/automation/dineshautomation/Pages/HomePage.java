package com.pranay.automation.dineshautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pranay.automation.dineshautomation.Pages.SearchResultPage;

public class HomePage extends BasePage{

	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement _enterTextOnSearchTextBox;
	
	@FindBy(xpath = "//span[@class='input-group-btn']")
	private WebElement _clickOnSearchButton;

	public void clearSearchText() {
		_enterTextOnSearchTextBox.clear();
	}

	public void enterTextOnSearchTextBox(String item) {
		_enterTextOnSearchTextBox.sendKeys(item);
	}
	public SearchResultPage clickOnSearchButton() {
		_clickOnSearchButton.click();
		return  new SearchResultPage(getDriver());
	}


	
}
