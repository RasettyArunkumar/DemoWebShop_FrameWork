package com.demowebshop.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.demowebshop.filelib.FileLib;

public class RegisterDataProvider {

	@DataProvider
	public String[][] registerData() throws EncryptedDocumentException, IOException {

		FileLib fi = new FileLib("./src/test/resources/Register_TestData.xlsx");

		int totalRows = fi.rowLength("RegisterData");
		int totalcols = fi.cellLength("RegisterData");

		String[][] data = new String[totalRows][totalcols];
		try {

			for (int i = 1; i <= totalRows; i++) {
				for (int j = 0; j < totalcols; j++) {

					data[i - 1][j] = fi.readExcelData("RegisterData", i, j);
				}

			}
		} catch (Exception e) {}
		return data;
	}
}
