package com.demowebshop.login;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demowebshop.generic.LoginBaseClass;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;

public class Login_Module extends LoginBaseClass {

	@Test(dataProvider = "loginData",dataProviderClass = com.demowebshop.generic.LoginDataPovider.class)
	public void loginTest(String email,String pwd,String status) throws IOException {
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(email, pwd,status);
		HomePage hp=new HomePage(driver);
		try {
		if(hp.homePageCheck()) {
			hp.clickLogoutLink();
		}}catch(Exception e) {}
	}
}
