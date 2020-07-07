package testRunNer;

import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.Accountbusiness;
import pageobjects.Accountpersonal;
import pageobjects.reportdemo1;
import pageobjects.reportdemo3;

public class runner3 extends appium
{
	reportdemo3 demo3=new reportdemo3();
	
	@Test(priority=1)
	public void MENU()
	{
		Accountpersonal AC=new Accountpersonal(driver);
		AC.Menu();
		demo3.Menu();
	}
	
	@Test(priority=2)
	public void PERSONAL() throws InterruptedException
	{
		Accountpersonal AC=new Accountpersonal(driver);
		AC.Personal();
		demo3.personal();
	}
	
	@Test(priority=3)
	public void BUSINESS() throws InterruptedException
	{
		Accountbusiness AB=new Accountbusiness(driver);
		AB.Business();
		demo3.business();
	}

}
