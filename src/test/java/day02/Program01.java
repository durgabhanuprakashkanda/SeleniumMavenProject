package day02;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Program01 {
	
	
	static ExtentReports report;
	static ExtentTest test;

	public static void main(String[] args) {
		
		report = new ExtentReports(".\\src\\test\\resources\\march23.html");
		test = report.startTest("LogIn-1", "Verify that User Can able to Login with valid data");
		
		test.log(LogStatus.INFO, "Open Chrome browser");
		
		test.log(LogStatus.INFO, "Open application url");
		
		test.log(LogStatus.INFO, "Enter Username");
		
		test.log(LogStatus.INFO, "Enter Password");
		
		test.log(LogStatus.INFO, "Click LogIn");
		
		report.endTest(test);
		
		
		test = report.startTest("LogIn-2", "Verify that User Can able to Login with valid data");
		
		test.log(LogStatus.INFO, "Open Chrome browser");
		
		test.log(LogStatus.INFO, "Open application url");
		
		test.log(LogStatus.INFO, "Enter Username");
		
		test.log(LogStatus.INFO, "Enter Password");
		
		test.log(LogStatus.INFO, "Click LogIn");
		
		report.endTest(test);		
		
		report.flush();
		
	
	}

}