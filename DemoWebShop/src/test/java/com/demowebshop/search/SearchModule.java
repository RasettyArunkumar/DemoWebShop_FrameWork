package com.demowebshop.search;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.demowebshop.filelib.FileLib;
import com.demowebshop.generic.BaseClass;
import com.demowebshop.pages.HomePage;

public class SearchModule extends BaseClass {

	/*
	 * @Test(dataProvider = "data",dataProviderClass =
	 * generic.SearchDataProvider.class) public void searchTest(String values) {
	 * HomePage hp=new HomePage(driver); hp.setSearchtbx(values); }
	 */

	@Test
	public void searchTest() throws EncryptedDocumentException, IOException {
		FileLib fi = new FileLib("./src/test/resources/testdata/searchdata.xlsx");
		int lastrow = fi.rowLength("data");
		int lastcell = fi.cellLength("data");

		HomePage hp = new HomePage(driver);

		for (int i = 0; i < lastrow; i++) {
			String value = fi.readExcelData("data", i, 0);

			hp.setSearchtbx(value);
		}
	}
}
