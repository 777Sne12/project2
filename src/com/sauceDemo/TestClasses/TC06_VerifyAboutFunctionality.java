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

public class TC06_VerifyAboutFunctionality  extends TestBaseClass
{
	
	
	@Test
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