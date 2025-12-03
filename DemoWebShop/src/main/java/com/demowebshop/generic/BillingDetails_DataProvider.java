package com.demowebshop.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.demowebshop.filelib.FileLib;

public class BillingDetails_DataProvider {

	@DataProvider(name = "billing")
	public String[][] billingData() throws EncryptedDocumentException, IOException {
		FileLib fi=new FileLib("./src/test/resources/Checkout_TestData.xlsx");
		int totalRows = fi.rowLength("CheckoutData");
		int totalCols=fi.cellLength("CheckoutData");
		String [][] data=new String[totalRows][totalCols];
		try {
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalCols;j++) {
				data[i-1][j]=fi.readExcelData("CheckoutData", i, j);
			}
		}
		}catch(Exception e) {}
		return data;
	}
}
