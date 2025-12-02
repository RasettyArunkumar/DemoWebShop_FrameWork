package com.demowebshop.Computers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {
	@FindBy(xpath = "//a[contains(text(),'cheap computer')]")
	private WebElement cheapComputerLink;

	@FindBy(xpath = "//a[contains(text(),'expensive computer')]")
	private WebElement expensiveComputerLink;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addToCompareBtn;

	public DesktopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickcheapComputerLink() {
		cheapComputerLink.click();
	}

	public void clickexpensiveComputerLink() {
		expensiveComputerLink.click();
	}

	public void clickaddToCompareBtn() {
		addToCompareBtn.click();
	}
}
