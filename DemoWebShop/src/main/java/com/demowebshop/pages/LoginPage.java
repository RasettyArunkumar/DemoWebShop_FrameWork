package com.demowebshop.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailtxt;

	@FindBy(id = "Password")
	private WebElement passwordtxt;

	@FindBy(className = "login-button")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void setLogin(String userName, String password) throws IOException {

		emailtxt.sendKeys(userName);
		passwordtxt.sendKeys(password);
		loginBtn.click();
	}
	
	public void setLogin(String userName, String password,String status) throws IOException {
		HomePage hp=new HomePage(null);
		emailtxt.sendKeys(userName);
		passwordtxt.sendKeys(password);
		if(status.equalsIgnoreCase("success")) {
			System.out.println("success");
		}
		if(status.equalsIgnoreCase("failure")) {
			System.out.println("failure");
		}
			
		
		loginBtn.click();
	}
}
