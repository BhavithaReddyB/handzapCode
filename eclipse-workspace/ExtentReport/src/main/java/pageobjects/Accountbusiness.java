package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Accountbusiness extends constructor1
{
	@AndroidFindBy(id="rb_business")
	private WebElement business;
	
	@AndroidFindBy(id="et_business_name")
	private WebElement businessname;
	
	@AndroidFindBy(id="et_website_address")
	private WebElement businesswebsite;
	
	/*
	 * @AndroidFindBy(id="iv_drop_down") 
	 * private WebElement dropdown;
	 * 
	 * @AndroidFindBy(id="action_search") 
	 * private WebElement selectcountry;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']"
	 * ) private WebElement backbutton;
	 */
	
	@AndroidFindBy(id="et_phone_number")
	private WebElement phonenumber;
	
	@AndroidFindBy(id="et_address")
	private WebElement businessloc;
	
	@AndroidFindBy(id="tv_location_map")
	private WebElement setlocation;
	
	@AndroidFindBy(id="btn_select_location")
	private WebElement selectlocation;
	
	@AndroidFindBy(id="action_save")
	private WebElement save;
	
	
	/*
	 * @AndroidFindBy(id="action_search")
	 *  private WebElement enterlocation;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Tirupati, Andhra Pradesh, India']") 
	 * private WebElement Title;
	 */
	
	@AndroidFindBy(id="tv_saved_new_address")
	private WebElement savenewaddress;
	
	@AndroidFindBy(id="et_address_name")
	private WebElement addressname;
	
	@AndroidFindBy(xpath="//*[text()='Enter Address Location']")
	private WebElement addresslocation;
	
	/*
	 * @AndroidFindBy(id="action_search")
	 *  private WebElement enterlocation;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Tirupati, Andhra Pradesh, India']") 
	 * private WebElement Title;
	 */
	
	/*
	 * @AndroidFindBy(id="search_close_btn") 
	 * private WebElement close;
	 */
	
	/*
	 * @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']"
	 * ) private WebElement backbutton;
	 */
 {
	AndroidElement list=(AndroidElement) driver.findElement(By.id("tv_summary_placeholder"));
	MobileElement addsummary=list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
			+ "new UiSelector().text(\"List View:50\"));"));
	
	assertNotNull(addsummary.getLocation());
	addsummary.click();
  }
	/*@AndroidFindBy(id="tv_summary_placeholder")
	private WebElement addsummary;*/
	
	@AndroidFindBy(id="et_summary")
	private WebElement summary;
	
	@AndroidFindBy(id="action_save")
	private WebElement SAVE;
	
	/*
	 * @AndroidFindBy(id="action_edit")
	 *  private WebElement edit;
	 */
	
	public Accountbusiness(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
	}
	
	private void assertNotNull(Point location) {
		// TODO Auto-generated method stub
		
	}

	public void Business() throws InterruptedException
	{
		business.click();
		businessname.sendKeys("Handzap");
		businesswebsite.sendKeys("https://handzap.com");
		phonenumber.sendKeys("8549817445");
		businessloc.click();
		setlocation.click();
		Thread.sleep(5000);
		selectlocation.click();
		Thread.sleep(8000);
		save.click();
		savenewaddress.click();
	  //close.click();
	    addressname.sendKeys("Tirupathi"); 
	    Thread.sleep(3000);
		addresslocation.click();
		Thread.sleep(5000);
		//addsummary.click(); 
		Thread.sleep(5000);
		summary.sendKeys("hellohaiihjkdjk"); 
		Thread.sleep(9000);
		SAVE.click();
	  
	  //edit.click();
		
	}
	
	
	
	
}
