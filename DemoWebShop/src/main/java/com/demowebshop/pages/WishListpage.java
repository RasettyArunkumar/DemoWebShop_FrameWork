package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListpage {

	@FindBy(xpath = "//input[@name='addtocart']")
	private WebElement wishlistATCcheckbox;

	public void setWishlistATCcheckbox() {
		 wishlistATCcheckbox.click();
	}

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement wishListATC;

	public WishListpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setWishListATC() {
		 wishListATC.click();;
	}

}
