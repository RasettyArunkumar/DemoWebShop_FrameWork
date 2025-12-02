package com.demowebshop.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementaion extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+" is successfully executed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+" is failed and taken screenshot successfully",true);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String time=LocalDateTime.now().toString().replace(":", "-");
		File dest=new File("./screenshots"+res+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res=result.getName();
		Reporter.log(res+" has been  Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
