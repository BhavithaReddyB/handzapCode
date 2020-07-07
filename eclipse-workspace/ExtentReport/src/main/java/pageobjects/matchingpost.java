package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class matchingpost extends constructor1
{
	@AndroidFindBy(xpath="//*[text()='Find a Job']")
	private AndroidElement FindaJob;
	
	@AndroidFindBy(id="btn_action1")
	private AndroidElement matc;
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='shop']") 
	 * private AndroidElement Mprofile;
	 */
	/*
	 * @AndroidFindBy(id="btn_delete") 
	 * private AndroidElement delete;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Just Apply']") 
	 * private AndroidElement JA;
	 */
    
	/*
	 * @AndroidFindBy(id="action_share") 
	 * private AndroidElement share;
	 */
    
	/*
	 * @AndroidFindBy(xpath="//*[text()='Gmail']") 
	 * private AndroidElement gmail;
	 */
    
	 @AndroidFindBy(id="action_filter")
	 private AndroidElement filter;
	 
	 @AndroidFindBy(id="text1")
	 private AndroidElement text;
	 
	 @AndroidFindBy(xpath="//*[text()='Start Date (Earliest)']")
	 private AndroidElement date;
	 
	 @AndroidFindBy(xpath="//*[text()='All Profiles']")
	 private AndroidElement text1;
	 
	 @AndroidFindBy(xpath="//*[text()='Personal Only']")
	 private AndroidElement per;
	 
	 @AndroidFindBy(xpath="//*[text()='All Posts']")
	 private AndroidElement all;
	 
	 @AndroidFindBy(xpath="//*[text()='Active Posts Only']")
	 private AndroidElement acv;
    
	 @AndroidFindBy(xpath="//*[text()='APPLY']")
	 private AndroidElement apply;
    
	
	public matchingpost(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	public void data1() throws InterruptedException
	{
		Thread.sleep(3000);
		FindaJob.click();
		matc.click();
		Thread.sleep(2000);
		//Mprofile.click();
		Thread.sleep(2000);
		//JA.click();
		//Thread.sleep(2000);
		//delete.click();
		//share.click();
		Thread.sleep(3000);
		//gmail.click();
		filter.click();
		text.click();
		date.click();
		text1.click();
		per.click();
		all.click();
		Thread.sleep(1000);
		acv.click();
		Thread.sleep(2000);
		apply.click();
		
	}
}
