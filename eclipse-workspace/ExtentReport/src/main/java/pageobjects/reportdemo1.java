package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo1
{
	 ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	 
	 ExtentTest sign;
	 ExtentTest Validdata;
	 ExtentTest linkedinlogin;
	 
	 
	 public void signup()
	 {
		 sign=report.startTest("");
		 sign.log(LogStatus.PASS, "");
	 }
	 
	 public void Validdata()
	 {
		 Validdata=report.startTest("");
		 Validdata.log(LogStatus.PASS, "");
	 }
	 
	 public void linkedinlogin()
	 {
		 linkedinlogin=report.startTest("");
		 linkedinlogin.log(LogStatus.PASS, "");
	 }
	 
	 public void Reports()
	 {
		report.flush();
	 }
}
