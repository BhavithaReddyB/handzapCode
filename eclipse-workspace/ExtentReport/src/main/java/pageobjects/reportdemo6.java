package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo6 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest LINKEDIN;
	ExtentTest Linkedininfo;
	ExtentTest signuplin;
	
	public void signuplinked()
	{
		LINKEDIN=report.startTest("Linkedin Account Sign Up");
		LINKEDIN.log(LogStatus.PASS, "Signup with linkedin it should be pass");
	}
	
	public void Informationlinked()
	{
		Linkedininfo=report.startTest("Information");
		Linkedininfo.log(LogStatus.PASS, "Sign Up with linkedin info");
	}
	
	public void LINKEDIN()
	{
		signuplin=report.startTest("");
		signuplin.log(LogStatus.PASS, "");
	}
	
	public void Reports()
	{
		report.flush();
	}

	
}
