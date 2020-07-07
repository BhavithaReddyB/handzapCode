package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.google;
import pageobjects.reportdemo5;

public class runnergoogle extends appium
{
	reportdemo5 d5=new reportdemo5();
	
	@Test(priority=1)
	public void gmail() throws InterruptedException
	{
		google Goo=new google(driver);
		Goo.GMail();
		d5.GMAILACCOUNT();
	}
	
	@Test(priority=2)
	public void gmailinfo() throws InterruptedException
	{
		google Goo=new google(driver);
		Goo.GOOGLE();
		d5.accountg();
		d5.Reports();
	}
}
