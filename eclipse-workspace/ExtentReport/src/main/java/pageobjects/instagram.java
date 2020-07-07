package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class instagram extends constructor1
{
    
    @AndroidFindBy(id="btn_sign_up")
    private AndroidElement signUp;
    
    @AndroidFindBy(xpath="//*[text()='More Options']")
    private AndroidElement moreoptions;
    
    @AndroidFindBy(xpath="//*[text()='Continue with Instagram']")
    private AndroidElement instagram;
    
    @AndroidFindBy(xpath="//*[text()='CONTINUE']") 
    private AndroidElement CONTINUE;
    
    /*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") 
	 * private AndroidElement cancel;
	 */
    
    @AndroidFindBy(xpath="//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Phone number, username, or email']]")
    private AndroidElement phonenumber;
    
    @AndroidFindBy(xpath="//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Phone number, username, or email']]")
    private AndroidElement enternumber;
    
    @AndroidFindBy(xpath="//*[text()='Password']")
    private AndroidElement password;
    
    @AndroidFindBy(xpath="//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password']]")
    private AndroidElement enterpassword;
    
	/*
	 * @AndroidFindBy(xpath="//*[@text='Log In']") 
	 * private AndroidElement login;
	 */
    
    @AndroidFindBy(xpath="(//*[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']]/*[@class='android.widget.ImageView'])[1]")
    private AndroidElement arrow;
    
    @AndroidFindBy(xpath="//*[text()='Not Now']")
    private AndroidElement notnow;
    
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
    
    
    public instagram(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}
    
    
    public void social() throws InterruptedException
    {
    	Thread.sleep(5000);
    	signUp.click();
    	moreoptions.click();
    	Thread.sleep(1000);
    }
    
    public void instagram1() throws InterruptedException
    {
    	Thread.sleep(6000);
    	instagram.click();
    	Thread.sleep(9000);
        CONTINUE.click();
    	Thread.sleep(7000);
    	phonenumber.click();
    	Thread.sleep(6000);
    	enternumber.sendKeys("bhavithabhavi03");
    	password.click();
    	Thread.sleep(5000);
    	enterpassword.sendKeys("bhavi123@");
    	Thread.sleep(8000);
    	//login.click();
    	arrow.click();
    	Thread.sleep(9000);
    	notnow.click();
    	Thread.sleep(3000);
    	mobilenumber.sendKeys("8106128688");
        Thread.sleep(5000);
        enteremail.sendKeys("abc@gmail.com");
        Thread.sleep(1000);
        confirm.click();
        Thread.sleep(1000);
        navigateback.click();
       }
}
