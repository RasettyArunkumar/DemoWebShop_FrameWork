package com.demowebshop.filelib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Properties prop;
	String path;
	public FileLib(String path) {
		this.path=path;
	}
	public String readExcelData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {

		fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
	}

	public String readPropertiesData(String key) throws IOException {

		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	public void writeExcelData( String sheetName, int rowIndex, int cellIndex, String value)
			throws EncryptedDocumentException, IOException {

		fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex).setCellValue(value);

		fos = new FileOutputStream(path);
		wb.write(fos);

	}

	public int rowLength(String sheetName) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int lastrowvalue = wb.getSheet(sheetName).getLastRowNum();
		return lastrowvalue;
	}

	public int cellLength(String sheetName) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int lastcellvalue = wb.getSheet(sheetName).getRow(0).getLastCellNum();
		return lastcellvalue;
	}
}
