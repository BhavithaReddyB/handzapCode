package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class google extends constructor1
{
	@AndroidFindBy(id="btn_sign_up")
    private AndroidElement signUp;
    
    @AndroidFindBy(xpath="//*[text()='More Options']")
    private AndroidElement moreoptions;
    
    @AndroidFindBy(xpath="//*[text()='Continue with Google']")
    private AndroidElement google;
    
    @AndroidFindBy(xpath="//*[text()='CONTINUE']") 
    private AndroidElement CONTINUE;
    
    /*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") 
	 * private AndroidElement cancel;
	 */
    
    @AndroidFindBy(xpath="//*[text()='thukakula123@gmail.com']") 
    private AndroidElement account;
    
    @AndroidFindBy(xpath="//*[text()='Enter Mobile Number']")
    private AndroidElement mobilenumber;
    
	/*
	 * @AndroidFindBy(xpath="//*[text()='Enter Email Address']") private
	 * AndroidElement enteremail;
	 */
    
    @AndroidFindBy(xpath="//*[text()='Confirm']")
    private AndroidElement confirm;
    
    @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
    private AndroidElement navigateback;
    
    public google(AppiumDriver<MobileElement> driver) 
    {
		super(driver);
	}
    
    public void GMail() throws InterruptedException
    {
    	signUp.click();
    	Thread.sleep(5000);
    	moreoptions.click();
    }
    
    public void GOOGLE() throws InterruptedException
    {
    	Thread.sleep(4000);
    	google.click();
    	Thread.sleep(2000);
    	CONTINUE.click();
    	Thread.sleep(6000);
    	account.click();
    	Thread.sleep(8000);
    	mobilenumber.sendKeys("8106128688");
    	Thread.sleep(4000);
      //enteremail.sendKeys("thukakula123@gmail.com");
      //Thread.sleep(1000);
        confirm.click();
        Thread.sleep(5000);
        navigateback.click();
    }
 }
