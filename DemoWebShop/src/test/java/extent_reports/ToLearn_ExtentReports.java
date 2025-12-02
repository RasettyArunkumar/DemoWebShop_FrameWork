package extent_reports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearn_ExtentReports {
	
	@Test
	public void createReport() {
		String timestamp=LocalDateTime.now().toString().replace(":", "-");
		
		//step1:
		ExtentSparkReporter spark=new ExtentSparkReporter("./Html_reports/ExtentReport_"+timestamp+".html");
		
		//step2:
		ExtentReports eReport=new ExtentReports();
		
		//step3:
		eReport.attachReporter(spark);//attachReporter is a non static method
		
		//step4:
		ExtentTest test = eReport.createTest("createReport");//Provide method name and create test is a non static method
		
		//step5:
		test.log(Status.PASS, "Message Added Into Report");
		
		//step6:
		eReport.flush();
	}

}
