package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	public void  clickRegisterLink() {
		registerLink.click();
	}
}
