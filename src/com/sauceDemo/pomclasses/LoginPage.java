package com.sauceDemo.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	   //1.driver declared
		private WebDriver driver;
		
		//**************************************************
		//2.username
		
		@FindBy(xpath = "//input[@id='user-name']")
		private WebElement username;
		
		public void sendUsername()
		{
			username.sendKeys("standard_user");
		}
		//****************************************************
		//3.password
		
		@FindBy(xpath = "//input[@id='password']")
		private WebElement password;
		
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
		//*****************************************************
		//4.loginButton
		
		@FindBy(xpath = "//input[@id='login-button']")
		private WebElement loginButton;
		
		//3.
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		//**********************************************************
		//5.create a constructor
		
		public LoginPage(WebDriver driver)
		{
			//global       local
			this.driver = driver;
			
			//sele class
			PageFactory.initElements(driver, this);
			
		//***********************************************************
		}
        }