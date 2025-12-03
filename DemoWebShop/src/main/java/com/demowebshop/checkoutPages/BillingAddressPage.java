package com.demowebshop.checkoutPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressPage {
	public BillingAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fNameTBX;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lNameTBX;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTBX;

	@FindBy(id = "BillingNewAddress_Company")
	private WebElement companyTBX;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement countryDropDown;
	
	@FindBy(css = "#BillingNewAddress_StateProvinceId")
	private WebElement stateDropDown;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTBX;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TBX;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pinTBX;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNoTBX;
	
	@FindBy(css = ".new-address-next-step-button")
	private WebElement continueBtn;
	
	public void enterBillingDetails(String fn,String ln,String email,String company,String country,String city,String add1,String pin,String phone) {
		fNameTBX.sendKeys(fn);
		lNameTBX.sendKeys(ln);
		emailTBX.sendKeys(email);
		companyTBX.sendKeys(company);
		Select sel=new Select(countryDropDown);
		sel.selectByContainsVisibleText(country);
		cityTBX.sendKeys(city);
		address1TBX.sendKeys(add1);
		pinTBX.sendKeys(pin);
		phoneNoTBX.sendKeys(phone);
		continueBtn.click();
		
	}
	
}
