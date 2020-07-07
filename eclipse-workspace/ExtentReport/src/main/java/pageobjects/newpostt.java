package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class newpostt extends constructor1
{
	@AndroidFindBy(id ="btn_new_post")
	private AndroidElement NewPost;
	
	 @AndroidFindBy(id ="et_title")
	 private AndroidElement Enterposttitle;
	
	 @AndroidFindBy(id ="et_categories")
	 private AndroidElement SelectCategories;
	 
	 @AndroidFindBy(xpath ="//*[text()='Electrical']")
	 private AndroidElement ElectricalCategory;
	 
	 @AndroidFindBy(id ="action_select")
	 private AndroidElement Select;
	 
	 @AndroidFindBy(xpath ="//*[text()='Enter Post Location']")
	 private AndroidElement EnterPostLocation;
	 
	 @AndroidFindBy(xpath ="//*[text()='Brigade irv Center, Nallurhalli Road, Nallurhalli, Whitefield, Bengaluru, Karnataka, India']")
	 private AndroidElement Location;
	 
	 @AndroidFindBy(xpath ="//*[text()='Start Date']")
	 private AndroidElement StartDate;
	 
	 @AndroidFindBy(id ="button1")
	 private AndroidElement OK;
	 
	 @AndroidFindBy(id ="action_post")
	 private AndroidElement Post;
	 
	 @AndroidFindBy(xpath ="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement back;
	
	 
	 public newpostt(AppiumDriver<MobileElement> driver) 
	 {
	   super(driver);
	  }
	 
	 public void createnew() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 NewPost.click();
		 Thread.sleep(3000);
		 Enterposttitle.sendKeys("Need a Electrician to fix AC");
		 
		 Thread.sleep(3000);
		 SelectCategories.click();
		 Thread.sleep(3000);
		 ElectricalCategory.click();
		 Thread.sleep(3000);
		 Select.click();
		 Thread.sleep(3000);
		 EnterPostLocation.click();
		 Thread.sleep(3000);
		 Location.click();
		 Thread.sleep(3000);
		 StartDate.click();
		 Thread.sleep(3000);
		 OK.click();
		 Thread.sleep(3000);
		 Post.click();
		 Thread.sleep(3000);
		 back.click();
	 }
	 
	 
}
