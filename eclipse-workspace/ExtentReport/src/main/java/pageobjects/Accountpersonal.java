package pageobjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Accountpersonal extends constructor1
{
    @AndroidFindBy(xpath="//*[@contentDescription='Open navigation drawer']")
	private WebElement menu;
	
	@AndroidFindBy(id="tv_account")
	private WebElement account;
	
	@AndroidFindBy(id="tv_profile")
	private WebElement profile;
	
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
	
	@AndroidFindBy(id="search_close_btn")
	private WebElement close;
	
	
	@AndroidFindBy(id="tv_location_map")
	private WebElement setlocation;
	
	@AndroidFindBy(id="btn_select_location")
	private WebElement selectlocation;
	
	@AndroidFindBy(id="action_save")
	private WebElement save;
	
	@AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
	private WebElement backbutton;
	 
	@AndroidFindBy(id="tv_summary_placeholder")
	private WebElement addsummary;
	
	@AndroidFindBy(id="et_summary")
	private WebElement summary;
	
	@AndroidFindBy(id="action_save")
	private WebElement SAVE;
	
	/*
	 * @AndroidFindBy(id="action_edit")
	 *  private WebElement edit;
	 */
	
	public Accountpersonal(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	public void Menu()
	{
		menu.click();
		account.click();
		profile.click();
	}
	
	public void Personal() throws InterruptedException
	{
		savenewaddress.click();
		Thread.sleep(5000);
		addressname.sendKeys("Tirupathi");
		Thread.sleep(7000);
		addresslocation.click();
		Thread.sleep(7000);
	  //enterlocation.sendKeys("Tirupathi");
	  //Title.click();
	  //close.click();
		setlocation.click();
		Thread.sleep(4000);
		selectlocation.click();
	    Thread.sleep(5000);
		save.click();
		Thread.sleep(4000);
		addsummary.click();
		Thread.sleep(2000);
		summary.sendKeys("hellohaiihjkdjk");
		summary.clear();
		Thread.sleep(1000);
		SAVE.click();
		backbutton.click();
		
	  //edit.click();
	}
	
	
	
	
	
	

}
