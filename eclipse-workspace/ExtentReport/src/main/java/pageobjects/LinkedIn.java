package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LinkedIn extends constructor1
{
	@AndroidFindBy(id="btn_sign_up")
    private AndroidElement signUp;
    
    @AndroidFindBy(xpath="//*[text()='More Options']")
    private AndroidElement moreoptions;
    
    @AndroidFindBy(xpath="//*[text()='Continue with LinkedIn']")
    private AndroidElement linkedin;
    
    @AndroidFindBy(xpath="//*[text()='CONTINUE']")
    private AndroidElement CONTINUE;
    
    @AndroidFindBy(id="username")
    private AndroidElement name;
    
    @AndroidFindBy(id="password")
    private AndroidElement password;
    
    @AndroidFindBy(xpath="//*[text()='Sign in']")
    private AndroidElement SIGNIN;
    
    @AndroidFindBy(id="oauth__auth-form__submit-btn")
    private AndroidElement allow;
    
    @AndroidFindBy(xpath="//*[text()='Enter Mobile Number']")
    private AndroidElement mobilenumber;
    
    @AndroidFindBy(xpath="//*[text()='Enter Email Address']")
    private AndroidElement enteremail;
    
    @AndroidFindBy(xpath="//*[text()='Confirm']")
    private AndroidElement confirm;
    
    @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
    private AndroidElement navigateback;
    
    public LinkedIn(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}
    
    public void linkedin() throws InterruptedException
    {
    	signUp.click();
    	Thread.sleep(1000);
    	moreoptions.click();
    	Thread.sleep(5000);
    }
    
    public void ContinueforLinkedin() throws InterruptedException
    {
    	linkedin.click();
    	Thread.sleep(1000);
    	CONTINUE.click();
    	Thread.sleep(10000);
    	name.sendKeys("mannuru.prasanthreddy@gmail.com");
    	Thread.sleep(1000);
    	password.sendKeys("Prasu@143");
    	Thread.sleep(1000);
    	SIGNIN.click();
    	Thread.sleep(1000);
    	allow.click();
    }
   
    public void information() throws InterruptedException
    {
    	mobilenumber.sendKeys("8106128688");
    	Thread.sleep(1000);
    	enteremail.sendKeys("abc@gmail.com");
        Thread.sleep(1000);
        confirm.click();
        Thread.sleep(1000);
        navigateback.click();
    }
    
}
