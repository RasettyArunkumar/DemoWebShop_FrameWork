package extent_reports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddsScreenshotIntoReport {
	@Test
public void addScreenshot() {
	String timestamp = LocalDateTime.now().toString().replace(":", "-");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	ExtentSparkReporter spark=new ExtentSparkReporter("./Html_reports/ScreenshotReport_"+timestamp+".html");
	ExtentReports eReport=new ExtentReports();
	eReport.attachReporter(spark);
	ExtentTest test = eReport.createTest("addScreenshot");
	
	test.log(Status.PASS, "Screenshot is Added Into Report");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	String screenshot = ts.getScreenshotAs(OutputType.BASE64);
	

	
	test.addScreenCaptureFromBase64String(screenshot);
	
	eReport.flush();
}
}
