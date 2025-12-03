package com.demowebshop.endToend;

import org.testng.annotations.Test;

import com.demowebshop.checkoutPages.BillingAddressPage;
import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.BooksPage;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.ShoppingPage;

public class Checkout_Module extends BaseClass{

	@Test(dataProvider = "billing",dataProviderClass = com.demowebshop.generic.BillingDetails_DataProvider.class)
	public void testcheckOut(String fn,String ln,String email,String company,String country,String city,String add1,String pin,String phone) {
		HomePage hp=new HomePage(driver);
		hp.clickBooksLink();
		
		BooksPage books=new BooksPage(driver);
		books.setFictionBookLink();
		books.setBookaddToCart();
		
		hp.clickShoppingCart();
		
	
		ShoppingPage sp=new ShoppingPage(driver);
		
		sp.clicktermsCheckBox();
		sp.clickcheckOutBtn();
		
		BillingAddressPage bap=new BillingAddressPage(driver);
		bap.enterBillingDetails(fn, ln, email, company, country, city, add1, pin, phone);
		

	}
}
