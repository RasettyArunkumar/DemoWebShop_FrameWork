package com.demowebshop.extentreports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demowebshop.generic.BaseClass;

public class ExtentReportManager extends BaseClass implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	public static TakesScreenshot ts;
	public void onStart(ITestContext context) {

		sparkReporter = new ExtentSparkReporter("./reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional testing");
		sparkReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Computer name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester name", "Arun");
		extent.setSystemInfo("Browser name", "Chrome");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());// create a new entry in the report
		test.log(Status.PASS, "test case PASSED is: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		// test = extent.createTest(result.getName());// create a new entry in the
		// report
		 ts = (TakesScreenshot) driver;
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		test = extent.createTest(result.getName());
		
		test.log(Status.FAIL, "test case FAILED is: " + result.getName());
		test.log(Status.FAIL, "test case FAILED cause is: " + result.getThrowable());
		
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));

		extent.flush();
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());// create a new entry in the report
		test.log(Status.SKIP, "test case SKIPPED is: " + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush(); // mandatory
	}
}
