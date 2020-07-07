package pageobjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class morep extends constructor1
{
	@AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
	private WebElement Set;
	
	
	@AndroidFindBy(xpath="//*[text()='Disable Notifications']") 
	private WebElement Dn;
	
	@AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
	private WebElement Set3;
	
	
	@AndroidFindBy(xpath="//*[text()='Enable Notifications']") 
	private WebElement EN;
	
	@AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
	private WebElement Set1;

    @AndroidFindBy(xpath="//*[text()='Edit Post']") 
    private WebElement EP;
	  
    @AndroidFindBy(id="et_title") 
    private WebElement ST;
    
    @AndroidFindBy(id="action_post")
    private WebElement done;
    

    @AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
    private WebElement Sett;
    
    @AndroidFindBy(xpath="//*[text()='Pause Post']")
    private WebElement pause;
    
    @AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
    private WebElement Sett1;
    
    @AndroidFindBy(xpath="//*[text()='Resume Post']")
    private WebElement resume;
    
    @AndroidFindBy(xpath="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
    private WebElement Se1;
    
    @AndroidFindBy(xpath="//*[text()='Delete Post']")
    private WebElement delete;
    
	@AndroidFindBy(xpath="//*[text()='DELETE']") 
	private WebElement DELETE;
	 
	/*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") 
	 * private WebElement CANCEL;
	 */
    
	 
	public morep(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	public void DisableNotificationsforPost() throws InterruptedException
	{
		Thread.sleep(5000);
		Set.click();
		Thread.sleep(5000);
		Dn.click();
		
	}
	public void EnableNotificationsforPost() throws InterruptedException
	{
		Thread.sleep(5000);
		Set.click();
		Thread.sleep(5000);
		EN.click();
		
	}
}
