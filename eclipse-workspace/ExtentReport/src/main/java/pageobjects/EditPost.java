package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditPost extends constructor1
{
	@AndroidFindBy(id="iv_settings")
	private AndroidElement moreoptions;
	
	@AndroidFindBy(xpath="//*[text()='Edit Post']")
	private AndroidElement editpost;
	
	@AndroidFindBy(xpath="//*[@id='et_title']")
	private AndroidElement posttitle;
	
	@AndroidFindBy(xpath="//*[@id='et_title']")
	private AndroidElement editpostt;
	
	@AndroidFindBy(xpath="//*[text()='Done']")
	private AndroidElement done;
	
	/*
	 * @AndroidFindBy(
	 * xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']"
	 * ) private AndroidElement BACKBUTTON;
	 */
	
	@AndroidFindBy(xpath="//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_start_date']]]")
	private AndroidElement date;
	
	@AndroidFindBy(xpath="//*[text()='12']")
	private AndroidElement DATE;
	
	@AndroidFindBy(xpath="//*[text()='OK']")
	private AndroidElement OK;
	
	@AndroidFindBy(xpath="//*[text()='Done']")
	private AndroidElement DONE;
	
	/*
	 * @AndroidFindBy(xpath="//*[@id='iv_add']") private AndroidElement posticon;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Photos & Videos']") private AndroidElement
	 * photos;
	 */
	
	/*
	 * @AndroidFindBy(
	 * xpath="//*[@id='transparent_bg' and (./preceding-sibling::* | ./following-sibling::*)[@text='WhatsApp Images']]"
	 * ) private AndroidElement images;
	 */
	
	/* @AndroidFindBy(xpath="(//*[@id='recyclerviews']/[@id='iv_photo'])[1]")
	//private AndroidElement IMAGES;*/
	
	/*
	 * @AndroidFindBy(
	 * xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']"
	 * ) private AndroidElement BACKBUTTON;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Attach']") 
	 * private AndroidElement attach;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Done']") private AndroidElement done1;
	 * 
	 * @AndroidFindBy(id="//*[@id='iv_add']") private AndroidElement addcamera;
	 * 
	 * @AndroidFindBy(xpath="//*[text()='Document']") private AndroidElement
	 * document;
	 * 
	 * @AndroidFindBy(xpath="//*[text()='Attach']") private AndroidElement attach1;
	 */	
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") 
	 * private AndroidElement cancel;
	 */
	
	/*
	 * @AndroidFindBy(
	 * xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']"
	 * ) private AndroidElement backbutton;
	 */
	
	@AndroidFindBy(xpath="//*[text()='Disable Notifications']") private
	WebElement disablenotifications;
	 
	
	@AndroidFindBy(xpath="//*[text()='Enable Notifications']")
	private AndroidElement enablenotifications;
	
	@AndroidFindBy(xpath="//*[text()='Pause Post']")
	private AndroidElement PAUSE;
	
	@AndroidFindBy(xpath="//*[text()='Resume Post']")
	private AndroidElement RESUME;
	
	@AndroidFindBy(xpath="//*[text()='Invite Favorites']")
	private AndroidElement invite;
	
	@AndroidFindBy(xpath="//*[text()='Invite Favorites']")
	private AndroidElement invitefavorite;
	
	@AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
	private AndroidElement backbutt;
	
	@AndroidFindBy(xpath="//*[text()='Delete Post']")
	private AndroidElement delete;
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='DELETE']") 
	 * private AndroidElement DELETE;
	 */
	
	@AndroidFindBy(xpath="//*[text()='CANCEL']")
	private AndroidElement CANCEL;

	

	
	
	
	public EditPost(AppiumDriver<MobileElement> driver) {
		super(driver);
	}


	public void EDITPOST() throws InterruptedException
	{
		Thread.sleep(10000);
		moreoptions.click();
		Thread.sleep(1000);
		editpost.click();
		Thread.sleep(1000);
		posttitle.clear();
		Thread.sleep(1000);
		editpostt.sendKeys("Need a Electrician");
		Thread.sleep(1000);
		done.click();
		Thread.sleep(1000);
		//BACKBUTTON.click();
	}
	
	public void EDIT() throws InterruptedException
	{
	    Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
        editpost.click();
		Thread.sleep(1000);	
        date.click();
		//Thread.sleep(1000);	
        DATE.click();
		//Thread.sleep(1000);	
        OK.click();
		//Thread.sleep(1000);
		DONE.click();
		//cancel.click();
		Thread.sleep(2000);	
		//backbutton.click();
		//Thread.sleep(1000);	
    }
	
	/*
	 * public void postattachments() throws InterruptedException {
	 * Thread.sleep(2000); moreoptions.click(); Thread.sleep(1000);
	 * editpost.click(); Thread.sleep(2000);
	 * 
	 * MobileElement list=(MobileElement)
	 * driver.findElement(MobileBy.AndroidUIAutomator
	 * ("new UiScrollable(new UiSelector()).scrollIntoView" +
	 * "("+"new UiSelector().description(\"Switches\"));")); Thread.sleep(8000);
	 * posticon.click(); Thread.sleep(1000); photos.click(); Thread.sleep(1000);
	 * images.click(); Thread.sleep(1000); IMAGES.click(); Thread.sleep(1000);
	 * BACKBUTTON.click(); //attach.click(); done1.click();
	 * 
	 * }
	 * 
	 * public void postattachmentsdocuments() throws InterruptedException {
	 * Thread.sleep(2000); moreoptions.click(); Thread.sleep(1000);
	 * editpost.click(); Thread.sleep(1000); addcamera.click(); Thread.sleep(1000);
	 * document.click(); Thread.sleep(1000); attach1.click(); Thread.sleep(1000);
	 * BACKBUTTON.click(); }
	 */
	public void More() throws InterruptedException
	{
		Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
		disablenotifications.click();
		Thread.sleep(1000);
	}
	 
	public void Enable() throws InterruptedException
	{
		Thread.sleep(1000);	
		moreoptions.click();
		Thread.sleep(1000);	
		enablenotifications.click();
		Thread.sleep(1000);
	}
	
	public void pause() throws InterruptedException
	{
		Thread.sleep(1000);	
		moreoptions.click();
		Thread.sleep(1000);	
		PAUSE.click();
		Thread.sleep(1000);
	}
	
	public void resume() throws InterruptedException
	{
		Thread.sleep(1000);	
		moreoptions.click();
		Thread.sleep(1000);	
		RESUME.click();
		Thread.sleep(1000);
	}
	
	public void invitefavorites() throws InterruptedException
	{
		Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
		invite.click();
		Thread.sleep(1000);
		String invite=invitefavorite.getText();
		System.out.println("invitefavorite text should be verify"+invite);
		Thread.sleep(1000);
		backbutt.click();
		Thread.sleep(1000);
	}
	
	public void Delete() throws InterruptedException
	{
		Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
		delete.click();
		Thread.sleep(1000);
	}
	
	public void DELETE() throws InterruptedException
	{
		Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
		//DELETE.click();
		Thread.sleep(1000);
	}
	
	public void cancel() throws InterruptedException
	{
		Thread.sleep(2000);	
		moreoptions.click();
		Thread.sleep(1000);	
		CANCEL.click();
		Thread.sleep(1000);
	}
	
}
