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

public class TC03_VerifyBagAddToCartFuctionality extends TestBaseClass
{
	
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
	
}



