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

public class TC04_VerifyAllproductAddToCartFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyAllProductFunctionality() throws IOException, InterruptedException
	{
		//home page -all add to cart product
		HomePage hp = new HomePage(driver);
		hp.clickAllProducts();
		ScreenshotClass.takeScreenshot(driver);
		System.out.println("click on all products");
	    System.out.println("all product get selected");
		
      //*****************************************************************************
		//validation
        String exceptedProduct = "6";
		
		String actualProduct = hp.getTextFromallAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		if(exceptedProduct.equals(actualProduct))
		{
			System.out.println("all product add to cart case is passed");
		}
		else
		{
			System.out.println("all product add to cart case is failed");
		}
	}
		//***************************************************************************
	
	}