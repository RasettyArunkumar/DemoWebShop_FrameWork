package com.demowebshop.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.demowebshop.filelib.FileLib;

public class LoginDataPovider {
	
	@DataProvider
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		FileLib fi=new FileLib("./src/test/resources/Login_TestData.xlsx");
		int totalRows=fi.rowLength("LoginData");
		int totalCols=fi.cellLength("LoginData");
		String [] [] data=new String[totalRows][totalCols];
		try {
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalCols;j++) {
				data[i-1][j]=fi.readExcelData("LoginData", i, j);
			}
		}}catch(Exception e) {}
				return data;
	}
}
