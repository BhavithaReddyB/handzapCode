package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.Twitter;
import pageobjects.reportdemo2;

public class runnerTwi extends appium
{
	reportdemo2 demo2=new reportdemo2();
	
	@Test(priority=1)
	public void SIGNUPTWITTER() throws InterruptedException
	{
		Twitter TW=new Twitter(driver);
		TW.twitter();
		demo2.twitter();
		demo2.Reports();
	}
	
	@Test(priority=2)
	public void INFORMATIONOFTWI() throws InterruptedException
	{
		Twitter TW=new Twitter(driver);
		TW.TWITTER();
		demo2.infotwitter();
		demo2.Reports();
	}
}
