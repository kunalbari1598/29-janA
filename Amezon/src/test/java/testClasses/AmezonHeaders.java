package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pomclasses.ApplicationHeader;

public class AmezonHeaders {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.edge.driver", "C:\\Users\\mrket\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.amazon.in/");

	ApplicationHeader applicationHeader = new ApplicationHeader(driver);
	
	applicationHeader.clickOnBestCeller();
	
	String url= driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers")&&
			title.equals("Amazon.in Bestsellers: The most popular items on Amazon"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	 applicationHeader = new ApplicationHeader(driver);
	 applicationHeader.clickOnElectronics();
	 
	 url= driver.getCurrentUrl();
	 title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics")&&
			title.equals("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	
	driver.get("https://www.amazon.in/");
	
	
	
	 applicationHeader = new ApplicationHeader(driver);
	 Thread.sleep(3000);
	 applicationHeader.clickOnMobile();
	 url= driver.getCurrentUrl();
	 title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books")&&
			title.equals("Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
   driver.get("https://www.amazon.in/");
	
	
	
	 applicationHeader = new ApplicationHeader(driver);
	 applicationHeader.clickOnCustomerCervice();
	 
	 url= driver.getCurrentUrl();
	 title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help")&&
			title.equals("Help - Amazon Customer Service"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

}

}

