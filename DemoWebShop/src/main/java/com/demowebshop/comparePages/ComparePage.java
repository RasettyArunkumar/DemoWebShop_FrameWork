package com.demowebshop.comparePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {

	@FindBy(xpath = "(//td[contains(text(),'Price')]/following-sibling::td[@class='a-center'])[1]")
	private WebElement price1;

	@FindBy(xpath = "(//td[contains(text(),'Price')]/following-sibling::td[@class='a-center'])[2]")
	private WebElement price2;

	@FindBy(xpath = "//img[contains(@alt,'cheap')]/preceding::p//input")
	private WebElement cheapCom_RemoveBtn;

	@FindBy(xpath = "//img[contains(@alt,'cheap')]/preceding::p//input")
	private WebElement expensiveCom_RemoveBtn;

	@FindBy(xpath = "//td[@class='a-center']//a[contains(text(),'cheap')]")
	private WebElement LessPriceItem1Link;
	
	@FindBy(xpath = "//td[@class='a-center']//a[contains(text(),'expensive')]")
	private WebElement LessPriceItem2Link;
	
	@FindBy(xpath = "//h1[contains(text(),'cheap')]/following::input[contains(@id,'add-to-cart')]")
	private WebElement lessPriceaddToCart;
	
	@FindBy(xpath = "//h1[contains(text(),'expensive')]/following::input[contains(@id,'add-to-cart')]")
	private WebElement highPriceaddToCart;
	
	public ComparePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickcheapCom_RemoveBtn() {
		cheapCom_RemoveBtn.click();
	}

	public void clickexpensiveCom_RemoveBtn() {
		expensiveCom_RemoveBtn.click();
	}
	
	public double getPriceCompare(){
		String p1 = price1.getText();
		String p2 = price2.getText();
		double item1Price = Double.parseDouble(p1);// price is in double
		double item2Price = Double.parseDouble(p2);
		return  item1Price - item2Price;
	}

	public void clicklessPriceAndATC() {
		String p1 = price1.getText();
		String p2 = price2.getText();
		double item1Price = Double.parseDouble(p1);// price is in double
		double item2Price = Double.parseDouble(p2);// price is in double
		
		if(item1Price<item2Price) {
			LessPriceItem1Link.click();
			lessPriceaddToCart.click();
		}
		else if(item1Price>item2Price) {
			LessPriceItem2Link.click();
			highPriceaddToCart.click();
		}
		
	}
	
/*	public void addLessPriceItem() {
		if(item1Price<item2Price) {
			LessPriceItem1Link.click();
			addToCart.click();
		}
		else if(item1Price>item2Price) {
			LessPriceItem2Link.click();
			addToCart.click();
		}
	}*/
}
