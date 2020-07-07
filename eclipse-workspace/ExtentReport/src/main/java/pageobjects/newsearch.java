package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class newsearch extends constructor1
{
	@AndroidFindBy(xpath ="//*[text()='Find a Job']")
    private AndroidElement FindaJob;

    @AndroidFindBy(id ="btn_new_search")
    private AndroidElement NewSearch;

    @AndroidFindBy(id ="et_keywords")
    private AndroidElement Entersearchtitle;
 
    @AndroidFindBy(xpath ="//*[text()='Select Search Categories']")
    private AndroidElement SelectSearchCategory;
 
    @AndroidFindBy(xpath ="//*[text()='Electrical']")
    private AndroidElement ElectricalCategory;
 
    @AndroidFindBy(id ="action_select")
    private AndroidElement Select;
 
    @AndroidFindBy(xpath ="//*[text()='Enter Search Location']")
    private AndroidElement EntersearchLocation;
 
    @AndroidFindBy(xpath ="//*[text()='Brigade irv Center, Nallurhalli Road, Nallurhalli, Whitefield, Bengaluru, Karnataka, India']")
    private AndroidElement Location;
  
    @AndroidFindBy(id ="action_find")
    private AndroidElement Find;
    
    @AndroidFindBy(xpath ="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement back1;
 
   public newsearch(AppiumDriver<MobileElement> driver) 
  {
        super(driver);
  }	

 public void CreateaNewSearch() throws InterruptedException
 {
	 
	 FindaJob.click();

	 Thread.sleep(2000);
	 
	 NewSearch.click();
	 Thread.sleep(2000);
	 
	 Entersearchtitle.sendKeys("Electrician Ac");
	 Thread.sleep(2000);
 
	 SelectSearchCategory.click();
	 Thread.sleep(2000);
 
	 ElectricalCategory.click();
 
	 Select.click();
	 Thread.sleep(2000);
	 EntersearchLocation.click();
	 Thread.sleep(2000);
	 Location.click();
     Find.click();
     Thread.sleep(2000);
     back1.click();
 }
	
}
