package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.instagram;
import pageobjects.reportdemo4;

public class runnerInsta extends appium
{
	reportdemo4 d4=new reportdemo4();
	
	@Test(priority=1)
	public void SIGNUPINSTA() throws InterruptedException
	{
		instagram INST=new instagram(driver);
		INST.social();
		d4.insta();
	}
	
	@Test(priority=2)
	public void INSTAGRAM() throws InterruptedException
	{
		instagram INST=new instagram(driver);
		INST.instagram1();
		d4.socialinstag();
		
	}
	
	}
