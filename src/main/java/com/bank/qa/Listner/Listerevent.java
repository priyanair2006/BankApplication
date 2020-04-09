package com.bank.qa.Listner;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bank.qa.utils.GetCurrenttimeStamp;
import com.bank.qa.utils.GetSS;

public class Listerevent implements ITestListener{

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
	     
		
		
	}

	public void onTestSuccess(ITestResult result) {
	    test= extent.createTest(result.getName());
	    test.log(Status.PASS,MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN) );
	    
		
	}

	public void onTestFailure(ITestResult result) {
	    test= extent.createTest(result.getName());
	    test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(), ExtentColor.RED) );
	    String sourcepath = GetSS.TakeScreenShot();
	
	
	     try {
			test.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(sourcepath).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	    
		
	}

	public void onTestSkipped(ITestResult result) {
		test= extent.createTest(result.getName());
	    test.log(Status.SKIP,MarkupHelper.createLabel(result.getName(), ExtentColor.AMBER) );
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		String curdt=GetCurrenttimeStamp.GetTimeStamp();
		htmlreporter  = new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/"+"/extent_"+curdt+".html");
		htmlreporter.loadConfig(System.getProperty("user.dir")+"/extent.xml");
	    extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Environemt", "SIT");
		extent.setSystemInfo("Tester", "Priya");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
