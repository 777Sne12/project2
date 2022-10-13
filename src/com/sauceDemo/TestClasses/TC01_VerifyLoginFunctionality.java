package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.pomclasses.HomePage;
import com.sauceDemo.pomclasses.LoginPage;
import com.sauceDemo.utilityClass.ScreenshotClass;

import testNG.TestBaseClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass

{
	
	
	@Test(priority=1)
	public void verifyLoginFunctionality() throws IOException
	{
		
       System.out.println("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
	   }
	}
     //***************************************************************************
	
	 @Test(invocationCount=0)
		public void verifyLogoutFunctionality() throws InterruptedException, IOException
		{
			//home-page
			HomePage y = new HomePage(driver);
			y.clickMenuButton();
			System.out.println("click on menu button");
			y.clickLogOutButton();
			System.out.println("click on logout button");
			ScreenshotClass.takeScreenshot(driver);
			//************************************************************************
         // validation
			System.out.println("apply the validation");
			
			   String expectedTitle = "Swag Labs";    //dev/BA
				
			   String actualTitle = driver.getTitle();
			
			   if(expectedTitle.equals(actualTitle))
			   {
				   System.out.println("logOut functionality test case is passed");
			   }
			   else
			   {
				   System.out.println("logOut functionality test case is failed");
			   }
		}
         //*****************************************************************
	

		@Test(dependsOnMethods= {"verifyLoginFunctionality"})
		public void verifyAboutFuctionality() throws IOException, InterruptedException
		{
		//home-page
		HomePage y = new HomePage(driver);
		y.clickMenuButton();
		Thread.sleep(1000);
		ScreenshotClass.takeScreenshot(driver);
		System.out.println("click on menu button");
		y.clickaboutButton();
		Thread.sleep(1000);
		ScreenshotClass.takeScreenshot(driver);
		System.out.println("click on about button");
		//*******************************************************************
	    //validation
		System.out.println("apply the validation");
		
		   String expectedUrl = "https://saucelabs.com/";    //dev/BA
			
		   String actualCurrentUrl = driver.getCurrentUrl();
		
		  if(expectedUrl.equals(actualCurrentUrl))
		   {
			   System.out.println("about functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("about functionality test case is failed");
		   }
		}
		   //***********************************************************************
	
}


