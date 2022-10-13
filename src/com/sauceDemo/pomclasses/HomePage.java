package com.sauceDemo.pomclasses;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage
{
	//POM Class steps
			//1.WebDriver driver declare
			//2.ele find by @FindBy Annotation
			//3.created a method to perform a action on element
			//4.Constructor create
		
		//1.
		WebDriver driver;
	
		
		//*********************************************************
		//2.menuButton
		@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
		WebElement menuButton;
		
		//3.
		public void clickMenuButton()
		{
			menuButton.click();
		}
		//**********************************************************
		//2.logout
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		WebElement logOutButton;
		
		//3. 
		public void clickLogOutButton()
		{
			logOutButton.click();
		}
		//********************************************************
		//4.constructor
		public HomePage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//******************************************************
		//bag element
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
		 WebElement bagButton;
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		//********************************************************
		
		//addToCart bag element
		 @FindBy(xpath = "//a[@class='shopping_cart_link']")
		 private WebElement addToCart;
				
		 public String getTextFromAddToCart()
			{
				String totalProducts= addToCart.getText();
				return totalProducts;
			}
		
		  //******************************************************
		
		//multiple element
		
		 @FindBy(xpath="//button[text()='Add to cart']") 
          List<WebElement> allElements;
		
          public void clickAllProducts()
         {

          for(WebElement i : allElements)
         {
    	   i.click();
  	     }
        }
          
        //******************************************

  		//addToCart all element
  		 @FindBy(xpath = "//a[@class='shopping_cart_link']")
  		 private WebElement alladdToCart;
  				
  		 public String getTextFromallAddToCart()
  			{
  				String totalProducts= alladdToCart.getText();
  				return totalProducts;
  			}
          
          //***************************************************
  		 
  		 //filter
  		 
          @FindBy(xpath="//select[@class='product_sort_container']")
          WebElement DropDown;
          
          public void clickDropDownFilter()
          {
        	  DropDown.click();
        	  Select s = new Select(DropDown);
        	  s.selectByValue("lohi");
          }
         //******************************************************
          //about
          @FindBy(xpath = "//a[@id='about_sidebar_link']")
  		WebElement aboutButton;
  		
  	    public void clickaboutButton()
  		{
  			aboutButton.click();
  		}
       //********************************************************** 
       }
		
		
	


