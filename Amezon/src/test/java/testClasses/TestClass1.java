package testClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomclasses.ApplicationHeader;
import pomclasses.LoginApplication;

public class TestClass1 {
	WebDriver driver;
	ApplicationHeader applicationHeader;
	LoginApplication loginapplication;
	@Parameters   ("browserName")
	
	@BeforeTest
	public void launchBrowser(String browser)
	{
		System.out.println(browser);
		if(browser.equals("Edge "))
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
		applicationHeader.clickOnBestCeller();
		
		String url= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		Assert.assertEquals(url, "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Assert.assertEquals(title, "Amazon.in Bestsellers: The most popular items on Amazon");

	}
	@Test
	public void TestA()
	{
		
		applicationHeader.clickOnElectronics();
		 
		String url= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals(url, "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		Assert.assertEquals(title, "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in");

		
	}
	
//	@AfterMethod
//	public void logoutapplication()
//	{
//		loginapplication.clickonsignout(driver);
//	}
	
	
//	@AfterClass
//	public void clearObject()
//	{
//		applicationHeader=null;
//	}
//	
//	@AfterTest
//	public void closeBrowser()
//	{
//		driver.close();
//		driver=null;
//		System.gc();
//	}
}
