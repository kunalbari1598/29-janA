package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomclasses.ApplicationHeader;
import pomclasses.LoginApplication;

public class TestClass2 {

	WebDriver driver;
	ApplicationHeader applicationHeader;
	LoginApplication loginapplication;
	@Parameters   ("browserName")
	
	@BeforeTest
	public void launchBrowser(String browser)
	{
		System.out.println(browser);
		if(browser.equals("Edge"))
		{
			driver=Base.openChromeBrowser();
		}
		if(browser.equals("Opera"))
		{
			driver=Base.openOperaBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void createPOMObjects()
	{
		loginapplication=new LoginApplication(driver);
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void openApplication()
	{
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
//        loginapplication.clickonaccountlogin();
//		loginapplication.sendphonenumber();
//		loginapplication.clickoncontinue();
//		loginapplication.sendpassword();
//		loginapplication.clickonsignin();
		 
	}
	
	@Test
	public void test()
	{
		applicationHeader.clickOnFashion();
		
		String url= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		Assert.assertEquals(url, "https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion");
		Assert.assertEquals(title, "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids");

	}
	@Test
	public void TestA()
	{
		
		applicationHeader.clickOnCustomerCervice();
		 
		String url= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals(url, "https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		Assert.assertEquals(title, "Help - Amazon Customer Service");

		
	}
	
//	@AfterMethod
//	public void logoutapplication()
//	{
//		loginapplication.clickonsignout(driver);
//	}
	
	
	@AfterClass
	public void clearObject()
	{
		applicationHeader=null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
}


