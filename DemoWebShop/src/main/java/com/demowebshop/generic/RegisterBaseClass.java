package com.demowebshop.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.demowebshop.filelib.FileLib;
import com.demowebshop.pages.DashBoardPage;

public class RegisterBaseClass {
	public static WebDriver driver;

	public FileLib fi = new FileLib("./src/test/resources/commondata.properties");

	@BeforeTest
	public void openBrowser() throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(fi.readPropertiesData("url"));

	}

	@BeforeMethod
	public void login() throws IOException {
		DashBoardPage dbp = new DashBoardPage(driver);

		dbp.clickRegisterLink();
	}

	

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
