package com.pranay.automation.dineshautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pranay.automation.dineshautomation.Pages.ShoppingCartPage;

public class SearchResultPage extends BasePage{

	public SearchResultPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//div[@class='caption']/p)[1]")
	private WebElement _getItemDescription;

	@FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
	private WebElement _clickOnAddToCart;

	@FindBy(xpath = "//div[@id='cart']")
	private WebElement _cartButton;
	
	@FindBy(xpath = "//a/i[@class=\"fa fa-shopping-cart\"]")
	private WebElement _clickOnViewCart;

	
	
	public String getItemDescription() {
		return _getItemDescription.getText();

	}

	public void clickCartButton() {
		_clickOnAddToCart.click();

	}

	public ShoppingCartPage clickOnViewCart() {
		_clickOnViewCart.click();
		return new ShoppingCartPage(getDriver());

	}
}
