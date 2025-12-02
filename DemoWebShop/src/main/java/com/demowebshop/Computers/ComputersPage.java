package com.demowebshop.Computers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	@FindBy(css = "a[title*='category Desktops']")
	private WebElement desktopsLink;

	@FindBy(css = "a[title*='category Notebooks']")
	private WebElement noteBooksLink;
	
	@FindBy(css = "a[title*='category Accessories']")
	private WebElement accessoriesLink;
	
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickdesktopsLink() {
		desktopsLink.click();
	}
	
	public void clickaccessoriesLink() {
		accessoriesLink.click();
	}
	
	public void clicknoteBooksLink() {
		noteBooksLink.click();
	}
}
