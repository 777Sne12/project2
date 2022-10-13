package testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.pomclasses.LoginPage;
import com.sauceDemo.utilityClass.ScreenshotClass;

public class TestBaseClass 
{
  public WebDriver driver;
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException 
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		System.out.println("browser is opened");
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe"); 
			driver = new FirefoxDriver();
			System.out.println("browser is opened");
		}
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    //*******************************************************************
		//loginPage elements find +action perform
		
		LoginPage x = new LoginPage(driver);
		
		//LoginPage x = new LoginPage(driver);
		
		x.sendUsername();
		System.out.println("username is entered");
		
		x.sendPassword();
		System.out.println("Password is entered");
		
		x.clickOnLoginButton();
		System.out.println("Clicked on login button");
		//***************************************************************************
		//--homePage--
		ScreenshotClass.takeScreenshot(driver);
	}
	

	@AfterMethod
	public void tearDown()
	{
	   driver.quit();
       System.out.println("browser is closed");
       
       System.out.println("end of Program");

		
	}
}
