package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo2 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest TWITTER;
	ExtentTest twitterinfo;
	
	public void twitter()
	{
		TWITTER=report.startTest("");
		TWITTER.log(LogStatus.PASS, "");
	}
	
	public void infotwitter()
	{
		twitterinfo=report.startTest("");
		twitterinfo.log(LogStatus.PASS, "");
	}
	
	public void Reports()
	{
		report.flush();
	}
}

