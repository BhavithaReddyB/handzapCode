package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo4 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest SOCIAL;
	ExtentTest INSTAGRAM;
	
	public void insta()
	{
		SOCIAL=report.startTest("");
		SOCIAL.log(LogStatus.PASS, "");
	}
	
	public void socialinstag()
	{
		INSTAGRAM=report.startTest("");
		INSTAGRAM.log(LogStatus.PASS, "");
	}
	
	public void Reports()
	{
		report.flush();
	}
	
	

}
