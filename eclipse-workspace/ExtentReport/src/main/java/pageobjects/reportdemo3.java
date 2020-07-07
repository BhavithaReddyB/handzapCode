package pageobjects;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo3 
{
	ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest menu;
	ExtentTest person;
	ExtentTest businessprofile;
	
	public void Menu()
	{
		menu=report.startTest("");
		menu.log(LogStatus.PASS, "");
	}
	
	public void personal()
	{
		person=report.startTest("");
		person.log(LogStatus.PASS, "");
	}
	
	public void business()
	{
		businessprofile=report.startTest("");
		businessprofile.log(LogStatus.PASS, "");
	}
	

}
