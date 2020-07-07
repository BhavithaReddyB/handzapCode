package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.Facebook;
import pageobjects.reportdemo7;

public class runnerface extends appium
{
	reportdemo7 d7=new reportdemo7();
	
	@Test(priority=1)
	public void FACEBBOKSIGNUP() throws InterruptedException
	{
		Facebook fb=new Facebook(driver);
		fb.facebook();
		d7.facebook1();
	}
	
	@Test(priority=2)
	public void FACEBBOKInfo() throws InterruptedException
	{
	   Facebook fb=new Facebook(driver);
	   fb.INFO();
	   d7.FACEBOOKINFO();
	   d7.Reports();
	}
}
