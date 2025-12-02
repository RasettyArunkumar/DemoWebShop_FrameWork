package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	@FindBy(linkText = "Fiction")
	private WebElement fictionBook;

	@FindBy(xpath = "//div[@class='overview']//input[@value='Add to cart']")
	private WebElement bookaddToCart;

	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setFictionBookLink() {
		 fictionBook.click();;
	}

	public void setBookaddToCart() {
		 bookaddToCart.click();
	}

}
