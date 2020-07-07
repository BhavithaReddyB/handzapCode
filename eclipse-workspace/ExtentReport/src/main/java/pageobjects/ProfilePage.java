package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends constructor1
{
	public ProfilePage(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		
	}

	/* @AndroidFindBy(id ="tv_user_name")
	 private AndroidElement UserName;*/
	
	@AndroidFindBy(xpath = "//*[@contentDescription='Open navigation drawer']")
	private AndroidElement Menubar;
	
	@AndroidFindBy(id ="iv_user_profile")
	private AndroidElement ProfilePic;
	
	@AndroidFindBy(id ="action_edit")
	private AndroidElement Edit;
	
	@AndroidFindBy(xpath ="//*[text()='Delete Photo']")
    private AndroidElement DeletePhoto;
	 
	 public void DeletethePicture() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 Menubar.click();
		 Thread.sleep(6000);
		 ProfilePic.click();
		 Thread.sleep(2000);
		 Edit.click();
		 Thread.sleep(5000);
		 DeletePhoto.click();
		 Thread.sleep(5000);
	 }
	 

}
