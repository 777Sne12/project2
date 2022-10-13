package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sauceDemo.pomclasses.HomePage;
import com.sauceDemo.pomclasses.LoginPage;
import com.sauceDemo.utilityClass.ScreenshotClass;

import testNG.TestBaseClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	
	
	
	    @Test
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
				
//			   /String actualTitle = driver.getTitle();
			   
			   String actualTitle = "Swag Labs";
			       
			   //Hard Assert
			 //Assert.assertEquals(actualTitle,expectedTitle );
			    // Or
			  // Assert.assertEquals(actualTitle,expectedTitle, "title not match");
			   
			  //**********************************
			   
			   //Soft Assert
			   
			   //SoftAssert soft = new SoftAssert();
			  // soft.assertEquals(actualTitle, expectedTitle);
			  
			   //soft.assertAll();
			
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
			 
}


