package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo7 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest signupface;
	ExtentTest INFORMATIONOFFACEBOOK;
	
	
	public void facebook1()
	{
		signupface=report.startTest("Sign up with facebook");
		signupface.log(LogStatus.PASS, "Create facebook account");
	}
	
	public void FACEBOOKINFO()
	{
		INFORMATIONOFFACEBOOK=report.startTest("Data Given for facebook");
		INFORMATIONOFFACEBOOK.log(LogStatus.PASS, "");
	}
	
	public void Reports()
	{
		report.flush();
	}

}
