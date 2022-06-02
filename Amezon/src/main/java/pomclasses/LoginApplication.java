package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginApplication {

	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement accountlogin;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement phonenumber;
	@FindBy(xpath="//input[@id='continue']")private WebElement continuebutton;
	@FindBy(xpath="//input[@id='ap_password']")private WebElement password ;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signin;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signout;
	
	public LoginApplication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonaccountlogin()
	{
		accountlogin.click();
	}
	public void sendphonenumber()
	{
		phonenumber.sendKeys("7058585978");
	}
	public void clickoncontinue()
	{
		continuebutton.click();
	}
	public void sendpassword()
	{
		password.sendKeys("Kunal@15091998");
	}
	public void clickonsignin()
	{
		signin.click();
	}
	public void clickonsignout(WebDriver driver)
	{
		Actions act =new Actions(driver);
		act.moveToElement(accountlogin).moveToElement(signout).click().build().perform();
	}
	
}
