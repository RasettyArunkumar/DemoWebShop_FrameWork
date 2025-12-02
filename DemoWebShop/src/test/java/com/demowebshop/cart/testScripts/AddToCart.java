package com.demowebshop.cart.testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.BooksPage;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.ShoppingPage;

@Listeners(com.demowebshop.generic.ListenerImplementaion.class)
public class AddToCart extends BaseClass {
	
	@Test
	public void addToCart() {
		HomePage hp=new HomePage(driver);
		hp.clickBooksLink();
		
		BooksPage books=new BooksPage(driver);
		books.setFictionBookLink();
		books.setBookaddToCart();
		
		hp.clickShoppingCart();
		
	
		ShoppingPage sp=new ShoppingPage(driver);
		sp.setRemoveItem();
		
		
	}
}
