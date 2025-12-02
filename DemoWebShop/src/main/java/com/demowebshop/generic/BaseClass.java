package com.demowebshop.generic;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demowebshop.filelib.FileLib;
import com.demowebshop.pages.DashBoardPage;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports eReport;
	public FileLib fi=new FileLib("./src/test/resources/commondata.properties");
	
	/*@BeforeSuite
	public void reportConfiguration() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter spark=new ExtentSparkReporter("./Html_reports/ExtentReport_"+timestamp+".html");
		 eReport=new ExtentReports();
		eReport.attachReporter(spark);
	}*/
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

		dbp.clickLoginLink();

		LoginPage lp = new LoginPage(driver);

		String un = fi.readPropertiesData("un");
		String pwd = fi.readPropertiesData("pwd");

		lp.setLogin(un, pwd);
	}

	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.clickLogoutLink();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	/*@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}*/
}
