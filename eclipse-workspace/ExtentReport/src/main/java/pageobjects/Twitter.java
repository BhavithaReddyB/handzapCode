package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Twitter extends constructor1
{
	@AndroidFindBy(id="btn_sign_up")
    private AndroidElement signUp;
    
    @AndroidFindBy(xpath="//*[text()='More Options']")
    private AndroidElement moreoptions;
    
    @AndroidFindBy(xpath="//*[text()='Continue with Twitter']")
    private AndroidElement twitter;
    
    @AndroidFindBy(xpath="//*[text()='CONTINUE']")
    private AndroidElement CONTINUE;
    
    /*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") 
	 * private AndroidElement cancel;
	 */
    
    @AndroidFindBy(id="username_or_email")
    private AndroidElement username;
    
    @AndroidFindBy(id="password")
    private AndroidElement passworD;
    
	/*
	 * @AndroidFindBy(
	 * xpath="(//*[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']]/*[@class='android.widget.ImageView'])[1]"
	 * ) private AndroidElement arrow;
	 */
    
    @AndroidFindBy(xpath="//*[text()='Sign In']")
    private AndroidElement signin;
    
    @AndroidFindBy(xpath="//*[text()='Enter Mobile Number']")
    private AndroidElement mobilenumber;
    
	/*
	 * @AndroidFindBy(id="et_mobile_number") 
	 * private AndroidElement entermobile;
	 */
    
	/*
	 * @AndroidFindBy(id="et_email") 
	 * private AndroidElement email;
	 */
    
    @AndroidFindBy(xpath="//*[text()='Enter Email Address']")
    private AndroidElement enteremail;
    
    @AndroidFindBy(xpath="//*[text()='Confirm']")
    private AndroidElement confirm;
    
    @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
    private AndroidElement navigateback;
    
    public Twitter(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}
    
    public void twitter() throws InterruptedException
    {
    	signUp.click();
    	moreoptions.click();
    	Thread.sleep(1000);
    }
    
    public void TWITTER() throws InterruptedException
    {
		/*
		 * Thread.sleep(2000); signUp.click(); Thread.sleep(8000); moreoptions.click();
		 * Thread.sleep(10000);
		 */
    	Thread.sleep(5000);
    	twitter.click();
    	Thread.sleep(8000);
        CONTINUE.click();
    	Thread.sleep(10000);
    	username.sendKeys("bhavithabhavi03@gmail.com");
    	Thread.sleep(6000);
    	passworD.sendKeys("bhavi123@");
    	//arrow.click();
    	Thread.sleep(4000);
    	signin.click();
    	Thread.sleep(6000);
    	mobilenumber.sendKeys("8106128688");
        Thread.sleep(5000);
        enteremail.sendKeys("abc@gmail.com");
        Thread.sleep(1000);
        confirm.click();
        Thread.sleep(1000);
        navigateback.click();
       }
}
