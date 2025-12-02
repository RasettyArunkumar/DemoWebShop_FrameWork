package com.demowebshop.FromCompareCheapProductAddToCart;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demowebshop.Computers.ComputersPage;
import com.demowebshop.Computers.DesktopsPage;
import com.demowebshop.compare.ComparePage;
import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.ShoppingPage;

public class Compare_LessCostToAddToCart extends BaseClass{
	@Test
	public void addLessCostItem() {
	HomePage hp=new HomePage(driver);
	hp.clickComputersLink();
	ComputersPage cp=new ComputersPage(driver);
	cp.clickdesktopsLink();
	DesktopsPage dp=new DesktopsPage(driver);
	dp.clickcheapComputerLink();
	dp.clickaddToCompareBtn();
	
	driver.navigate().back();
	
	dp.clickexpensiveComputerLink();
	
	dp.clickaddToCompareBtn();
	
	ComparePage compare=new ComparePage(driver);
	int  priceDiff=(int)compare.getPriceCompare();
	Reporter.log("the price difference between item1 and item2 is: "+priceDiff,true);
	
	compare.clicklessPriceAndATC();
	
	hp.clickShoppingCart();
	
	ShoppingPage sp=new ShoppingPage(driver);
	sp.setRemoveItem();
	
}
}