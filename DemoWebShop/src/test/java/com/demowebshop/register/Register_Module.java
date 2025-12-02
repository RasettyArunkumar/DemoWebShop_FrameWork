package com.demowebshop.register;

import org.testng.annotations.Test;

import com.demowebshop.generic.RegisterBaseClass;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.RegisterPage;

public class Register_Module extends RegisterBaseClass {

	@Test(dataProvider = "registerData", dataProviderClass = com.demowebshop.generic.RegisterDataProvider.class)
	public void registerTest(String gender, String fname, String lname, String email, String pwd, String cpwd) {

		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		try {
				rp.enterRegisterData(gender, fname, lname, email, pwd, cpwd);
				if(rp.registerMsgCheck()) {
					hp.clickLogoutLink();
				}
		} catch (Exception e) {
		}

	}
}
