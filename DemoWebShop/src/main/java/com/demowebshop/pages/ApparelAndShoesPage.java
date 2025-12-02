package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {

	@FindBy(partialLinkText = "Blue and green Sneaker")
	private WebElement sneakers;

	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement shoeAddToCartBtn;

	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to wishlist']")
	private WebElement shoeAddToWishlist;

	public ApparelAndShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSneakers() {
		return sneakers;
	}

	public WebElement getShoeAddToCartBtn() {
		return shoeAddToCartBtn;
	}

	public WebElement getShoeAddToWishlist() {
		return shoeAddToWishlist;
	}
	
	

}
