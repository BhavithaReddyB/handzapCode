package testRunNer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.appium;
import pageobjects.CreateAccount;
import pageobjects.EditPost;
import pageobjects.ProfilePage;
import pageobjects.Screen;
import pageobjects.SignupPage;
import pageobjects.login;
import pageobjects.morep;
import pageobjects.newpostt;
import pageobjects.newsearch;
import pageobjects.reportdemo;

public class runner1 extends appium
{
	reportdemo d1=new reportdemo();
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
	login log=new login(driver);
	log.data1();
	d1.login();
	}
	
	@Test(priority=2)
	public void editpost() throws InterruptedException
	{
		EditPost post=new EditPost(driver);
		post.EDITPOST();
		d1.EDITPOST();
	}
	
	@Test(priority=3)
	public void EditP() throws InterruptedException
	{
		EditPost edit=new EditPost(driver);
		edit.EDIT();
		d1.EDIT();
		
	}
	
	/*
	 * @Test(priority=4) public void POSTPHOTOS() throws InterruptedException {
	 * EditPost photo=new EditPost(driver); photo.postattachments();
	 * d1.Attachments();
	 * 
	 * }
	 * 
	 * @Test(priority=5) public void POSTDOCUMENTS() throws InterruptedException {
	 * EditPost document=new EditPost(driver); document.postattachmentsdocuments();
	 * d1.DOCUMENT();
	 * 
	 * }
	 */
	
	@Test(priority=6)
	public void DisableNotifi() throws InterruptedException
	{
		EditPost edit=new EditPost(driver);
		edit.More();
		d1.MoreDisableNotif();
	}
	
	@Test(priority=7)
	public void enableNotifi() throws InterruptedException
	{
		EditPost edit=new EditPost(driver);
		edit.Enable();
		d1.MoreEnableNotif();
	}
	
	@Test(priority=8)
	public void pausepost() throws InterruptedException
	{
		EditPost pause=new EditPost(driver);
		pause.pause();
		d1.PAUSE();
	}
	
	@Test(priority=9)
	public void resumepost() throws InterruptedException
	{
		EditPost resume=new EditPost(driver);
		resume.resume();
		d1.RESUME();
	}
	
	@Test(priority=10)
	public void inviteFavorites() throws InterruptedException
	{
		EditPost invite=new EditPost(driver);
		invite.invitefavorites();
		d1.INVITEFAVORITES();
		d1.Reports();
	}
	
	@Test(priority=11)
	public void deletepost() throws InterruptedException
	{
		EditPost delete=new EditPost(driver);
		delete.Delete();
		d1.deletepost();
		d1.Reports();
	}
	
	@Test(priority=12)
	public void delete() throws InterruptedException
	{
		EditPost del=new EditPost(driver);
		del.DELETE();
		d1.deletepost();
		d1.Reports();
	}
	
	@Test(priority=13)
	public void CANCEL() throws InterruptedException
	{
		EditPost canc=new EditPost(driver);
		canc.cancel();
		d1.cancelpost();
		d1.Reports();
	}
	
	
	
	
}
