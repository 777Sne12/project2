package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pomclasses.HomePage;
import com.sauceDemo.utilityClass.ScreenshotClass;

import testNG.TestBaseClass;

public class AllCombination extends TestBaseClass
{

	@Test
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
	 @Test
		public void verifyBagAddToCartFunctionality() throws IOException 
		{
			//--homePage--bag product
			HomePage hp = new HomePage(driver);
			hp.clickBagButton();
			System.out.println("Bag product will get selected");
			ScreenshotClass.takeScreenshot(driver);
			//******************************************************************
			//--validation--//
			String exceptedProduct = "1";
			
			String actualProduct = hp.getTextFromAddToCart();
			System.out.println("actual product->"+actualProduct);
			
			System.out.println("apply validation");
			
			if(exceptedProduct.equals(actualProduct))
			{
				System.out.println("Bag product add to cart case is passed");
			}
			else
			{
				System.out.println("Bag product add to cart case is failed");
			}
		}
			//***************************************************************************
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
			
			   String expectedUrl = "https://www.saucedemo.com/inventory.html";    
				
			   String actualCurrentUrl = driver.getCurrentUrl();
			
			  if(expectedUrl.equals(actualCurrentUrl))
			   {
				   System.out.println("filter functionality test case is passed");
			   }
			   else
			   {
				   System.out.println("filter functionality test case is failed");
			   }
		}
			  //*******************************************************
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
