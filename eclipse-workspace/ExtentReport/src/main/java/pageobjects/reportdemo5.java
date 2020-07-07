package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo5 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest gmailaccount;
	ExtentTest google;
	
	public void GMAILACCOUNT()
	{
		gmailaccount=report.startTest("");
		gmailaccount.log(LogStatus.PASS, "");
	}
	
	public void accountg()
	{
		google=report.startTest("");
		google.log(LogStatus.PASS, "");
	}
	
	public void Reports()
	{
		report.flush();
	}

}
