package com.demowebshop.wishlist;

import org.testng.annotations.Test;

import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.ApparelAndShoesPage;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.ShoppingPage;
import com.demowebshop.pages.WishListpage;

public class WishList extends BaseClass{
	
	@Test
public void wishlist() {
	HomePage hp = new HomePage(driver);
	hp.clickApparelAndShoesLink();
	
	ApparelAndShoesPage asp=new ApparelAndShoesPage(driver);
	asp.getSneakers().click();
	asp.getShoeAddToWishlist().click();
	
	hp.clickWishlistLink();
	
	WishListpage wlp=new WishListpage(driver);
	wlp.setWishlistATCcheckbox();
	wlp.setWishListATC();
	
	hp.clickShoppingCart();
	
	ShoppingPage sp = new ShoppingPage(driver);
	sp.setRemoveItem();
	
}
}
