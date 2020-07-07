package pageobjects;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportdemo 
{
	 ExtentReports report=new ExtentReports("./Reports/ExtentReport.html");
	 
	 ExtentTest post;
	 ExtentTest edit;
	/*
	 * ExtentTest attachments; 
	 * ExtentTest document;
	 */
	 ExtentTest disable;
	 ExtentTest enable;
	 ExtentTest pause;
	 ExtentTest resume;
	 ExtentTest invite;
	 ExtentTest deletepost;
	 ExtentTest cancelpost;
	 
		
	 public void login()
		{
			post=report.startTest("Login Successfully created");
			post.log(LogStatus.PASS, "");
		}
	 
	public void EDITPOST()
	{
		post=report.startTest("Edit Post");
		post.log(LogStatus.PASS, "Successfully changed post title");
		
	}
	
	public void EDIT()
	{
		edit=report.startTest("More Options");
		edit.log(LogStatus.PASS, "More options is selected");
	}
	
	/*
	 * public void Attachments() { attachments=report.startTest("Post Attachments");
	 * attachments.log(LogStatus.PASS, "Attachments should be added"); }
	 * 
	 * public void DOCUMENT() { document=report.startTest("Documents");
	 * document.log(LogStatus.PASS, "Documents should be added"); }
	 */
	
	public void MoreDisableNotif()
	{
		disable=report.startTest("Disable Notofications");
		disable.log(LogStatus.PASS, "Notififications is in diable");
	}
	
	public void MoreEnableNotif()
	{
		enable=report.startTest("Enable Notofications");
		enable.log(LogStatus.PASS, "Notififications is in enable");
	}
	
	public void PAUSE()
	{
		pause=report.startTest("PAUSE POST");
		pause.log(LogStatus.PASS, "Post should not be show");
	}
	
	public void RESUME()
	{
		resume=report.startTest("RESUME POST");
		resume.log(LogStatus.PASS, "Post should be visible");
	}
	
	public void INVITEFAVORITES()
	{
		invite=report.startTest("INVITE FAVORITES");
		invite.log(LogStatus.PASS, "Favorites should be visible");
	}
	
	public void deletepost()
	{
		deletepost=report.startTest("Delete");
		deletepost.log(LogStatus.PASS, "post  should be deleted");
	}	
	
	public void cancelpost()
	{
		cancelpost=report.startTest("Cancel");
		cancelpost.log(LogStatus.PASS, "post should be cancel");
	}
	
	public void Reports()
	{
		report.flush();
	}
}
	
 