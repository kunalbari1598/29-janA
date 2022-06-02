package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pomclasses.LoginApplication;

public class VerifyLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mrket\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		LoginApplication loginapplication=new LoginApplication(driver);
		
		loginapplication.clickonaccountlogin();
		loginapplication.sendphonenumber();
		loginapplication.clickoncontinue();
		loginapplication.sendpassword();
		loginapplication.clickonsignin();
		
		loginapplication.clickonsignout(driver);
}
}