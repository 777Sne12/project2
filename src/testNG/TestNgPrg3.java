package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPrg3 
{
	@BeforeMethod
	public static void method1() 
	{
		System.out.println("method1");
	}
    
	@Test
	public static void method2() 
	{
		System.out.println("method2");
	}
    
	@AfterMethod
	public static void method3() 
	{
		System.out.println("method3");
	}

}
