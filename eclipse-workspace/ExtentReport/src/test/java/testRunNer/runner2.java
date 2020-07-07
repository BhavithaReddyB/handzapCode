package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.LinkedIn;
import pageobjects.Twitter;
import pageobjects.reportdemo1;
import pageobjects.reportdemo6;

public class runner2 extends appium
{
	reportdemo6 demo6=new reportdemo6();
	
	
	@Test(priority=1)
	public void linkedin() throws InterruptedException
	{
		LinkedIn LI=new LinkedIn(driver);
		LI.linkedin();
		demo6.signuplinked();
	}
	
	@Test(priority=2)
	public void linkedcontinue() throws InterruptedException
	{
		LinkedIn LI=new LinkedIn(driver);
		LI.ContinueforLinkedin();
		demo6.Informationlinked();
	}
	
	@Test
	public void LinkedinLogin() throws InterruptedException
	{
		LinkedIn LI=new LinkedIn(driver);
		LI.information();
		demo6.LINKEDIN();
		demo6.Reports();
	}
	
}
