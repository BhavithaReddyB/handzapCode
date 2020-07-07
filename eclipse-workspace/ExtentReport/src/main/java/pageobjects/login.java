package pageobjects;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class login extends constructor1
{
	@AndroidFindBy(xpath="//*[text()='Log In']")
	private AndroidElement l1;
	
	@AndroidFindBy(id="et_phone_number")
	private AndroidElement MN;
	
	@AndroidFindBy(id="et_password")
	private AndroidElement Pas;
	
    @AndroidFindBy(id="action_next")
    private AndroidElement Nex;
    
    
   
    
    public login(AppiumDriver<MobileElement> driver)
    {
    	super(driver);
    }
    
    public void data1() throws InterruptedException
    {
    	Thread.sleep(5000);
		l1.click();	
		Thread.sleep(2000);
		MN.sendKeys("8549817445");
		Pas.sendKeys("Password");
		Nex.click();
    }


}

