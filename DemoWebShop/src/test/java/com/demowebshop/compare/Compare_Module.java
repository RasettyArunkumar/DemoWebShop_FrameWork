package com.demowebshop.compare;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demowebshop.ComputersPages.ComputersPage;
import com.demowebshop.ComputersPages.DesktopsPage;
import com.demowebshop.comparePages.ComparePage;
import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.HomePage;

public class Compare_Module extends BaseClass{

	@Test
	public void compareTest() {
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
	}
}
