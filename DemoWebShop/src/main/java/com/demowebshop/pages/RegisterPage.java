package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(id = "gender-male")
	private WebElement maleRadioBtn;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioBtn;
	
	@FindBy(id="FirstName")
	private WebElement fNameTB;
	
	@FindBy(id="LastName")
	private WebElement lNameTB;
	
	@FindBy(name="Email")
	private WebElement emailTB;
	
	@FindBy(id="Password")
	private WebElement pwdTB;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpwdTB;
	
	@FindBy(id="register-button")
	private WebElement registerBtn;
	
	
	@FindBy(xpath = "//div[contains(text(),'registration completed')]")
	private WebElement registerMsg;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterRegisterData(String gender,String fname,String lname,String email,String pwd,String cpwd) {
		if(gender.equalsIgnoreCase("male")) {
			maleRadioBtn.click();
		}
		if(gender.equalsIgnoreCase("female")) {
			femaleRadioBtn.click();
		}
		fNameTB.sendKeys(fname);
		lNameTB.sendKeys(lname);
		emailTB.sendKeys(email);
		pwdTB.sendKeys(pwd);
		confirmpwdTB.sendKeys(cpwd);
		registerBtn.click();
	}

	public boolean registerMsgCheck() {
		return registerMsg.isDisplayed();
	}
}
