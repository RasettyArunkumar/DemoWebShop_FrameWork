package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {

	@FindBy(name = "removefromcart")
	private WebElement removeItem;

	@FindBy(className = "update-cart-button")
	private WebElement updateCart;

	@FindBy(id  = "checkout")
	private WebElement checkOutBtn;
	
	@FindBy(id="termsofservice")
	private WebElement termsCheckBox;
	
	public ShoppingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicktermsCheckBox() {
		termsCheckBox.click();
	}
	public void clickcheckOutBtn() {
		checkOutBtn.click();
	}
	public void setRemoveItem() {
		removeItem.click();
		updateCart.click();
	}

}
