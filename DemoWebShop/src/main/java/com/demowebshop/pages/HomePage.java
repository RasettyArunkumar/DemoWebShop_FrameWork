package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	@FindBy(xpath="//div[@class='master-wrapper-main']//a[contains(text(),'Books')]")
	private WebElement booksLink;
	
	@FindBy(partialLinkText="Shopping cart")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Shoes')]")
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTBX;
	
	@FindBy(className ="search-box-button")
	private WebElement searchBtn;
	
	@FindBy(css = ".master-wrapper-content")
	private WebElement homePageCheck;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;
	
	public void clickComputersLink() {
		computersLink.click();
	}
	public boolean homePageCheck() {
		return homePageCheck.isDisplayed();
	}
	public void clickWishlistLink() {
		 wishlistLink.click();
	}


	public void clickApparelAndShoesLink() {
		 apparelAndShoesLink.click();
	}


	public void clickBooksLink() {
		 booksLink.click();
	}


	public void clickShoppingCart() {
		shoppingCart.click();
		
	}

	public void clickLogoutLink() {
		 logoutLink.click();
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSearchtbx(Object keys) {
		searchTBX.sendKeys((String)keys);
		searchBtn.click();
	}


}
