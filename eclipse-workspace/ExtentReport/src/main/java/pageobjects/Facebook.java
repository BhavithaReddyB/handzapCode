package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Facebook extends constructor1
{
	@AndroidFindBy(id="btn_sign_up")
    private AndroidElement signUp;
    
    @AndroidFindBy(xpath="//*[text()='More Options']")
    private AndroidElement moreoptions;
    
    @AndroidFindBy(xpath="//*[text()='Continue with Facebook']")
    private AndroidElement Face;
    
    @AndroidFindBy(xpath="//*[text()='CONTINUE']")
    private AndroidElement CONTINUE;
    
    @AndroidFindBy(id="m_login_email")
    private AndroidElement login;
    
    @AndroidFindBy(id="m_login_password")
    private AndroidElement password;
    
    @AndroidFindBy(xpath="//*[text()='Log In']")
    private AndroidElement Login;
    
    @AndroidFindBy(xpath="//*[text()='Continue']")
    private AndroidElement log;
    
    @AndroidFindBy(xpath="//*[text()='Enter Mobile Number']")
    private AndroidElement mobilenumber;
    
    @AndroidFindBy(xpath="//*[text()='Enter Email Address']")
    private AndroidElement enteremail;
    
    @AndroidFindBy(xpath="//*[text()='Confirm']")
    private AndroidElement confirm;
    
    @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
    private AndroidElement navigateback;
    
    
    public Facebook(AppiumDriver<MobileElement> driver) 
    {
		super(driver);
	}
    
    public void facebook() throws InterruptedException
    {
    	Thread.sleep(5000);
    	signUp.click();
    	Thread.sleep(3000);
    	moreoptions.click();
    	Thread.sleep(3000);
    	Face.click();
    	Thread.sleep(8000);
    	CONTINUE.click();
    	Thread.sleep(7000);
    	login.clear();
    	Thread.sleep(3000);
    	login.sendKeys("8978210714");
    	Thread.sleep(2000);
    	password.clear();
    	Thread.sleep(3000);
    	password.sendKeys("qwerty@");
    	Thread.sleep(3000);
    	Login.click();
    	Thread.sleep(1000);
    	log.click();
    }
    
    public void INFO() throws InterruptedException
    {
    	mobilenumber.sendKeys("8978210714");
    	Thread.sleep(1000);
    	enteremail.sendKeys("abc@gmail.com");
        Thread.sleep(1000);
        confirm.click();
        Thread.sleep(1000);
        navigateback.click();
    }

}
