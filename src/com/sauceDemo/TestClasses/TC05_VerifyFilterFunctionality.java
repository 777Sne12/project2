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

public class TC05_VerifyFilterFunctionality extends TestBaseClass
{
	
    @Test
	public void verifyFilterFunctionality() throws IOException
	{
    	//home page
		HomePage hp= new HomePage(driver);
		hp.clickDropDownFilter();
		ScreenshotClass.takeScreenshot(driver);
		System.out.println("filter activity is perform");
      //******************************************************************************
		 //validation
		System.out.println("apply the validation");
		
		   //String expectedUrl = "https://www.saucedemo.com/inventory.html";    
			
		   //String actualCurrentUrl = driver.getCurrentUrl();
		
		 // if(expectedUrl.equals(actualCurrentUrl))
//		   /{
			//   System.out.println("filter functionality test case is passed");
		   //}
		   //else
		  // {
			//   System.out.println("filter functionality test case is failed");
		   //}
	
		  //*******************************************************
    
    
    
    
}
}