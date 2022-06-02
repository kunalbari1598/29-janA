package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	@FindBy (xpath="//a[@id='nav-hamburger-menu']")private WebElement all ;
    
    @FindBy (xpath="(//a[text()='Best Sellers'])[1]")private WebElement bestCeller ;
    
    @FindBy (xpath="(//a[text()='Mobiles'])[1]")private WebElement mobile ;
    
    @FindBy (xpath="(//a[text()='Customer Service'])[1]")private WebElement customerCervice ;
    
    @FindBy (xpath="//a[@href='/deals?ref_=nav_cs_gb']")private WebElement todaysdeal ;
    
    @FindBy (xpath=" //a[text()='Fashion']")private WebElement fashion ;
    
    @FindBy (xpath=" //a[text()=' Electronics ']")private WebElement electronics ;
    
    @FindBy (xpath="//a[@id='nav-cart']")private WebElement cart ;

    @FindBy (xpath="//a[@aria-label='Choose a language for shopping.']")private WebElement flag ;

    @FindBy (xpath="//a[@id='nav-global-location-popover-link']")private WebElement selectYourAddress ;

    @FindBy (xpath="//a[@id='nav-orders']")private WebElement returnAndOrders ;
    
    @FindBy (xpath="(//a[@class='nav-a  '])[12]")private WebElement books ;
    
    @FindBy (xpath="(//a[@class='nav-a  '])[20]")private WebElement videoGames ;
    
    public ApplicationHeader(WebDriver driver)
    {
   	 PageFactory.initElements(driver, this);
    }
    public void clickOnAll()
    {
   	 all.click();
    }
    public void clickOnBestCeller()
    {
   	 bestCeller.click();
    }
    public void clickOnTodaysdeal()
    {
   	 todaysdeal.click();
    }
    public void clickOnCustomerCervice()
    {
   	 customerCervice.click();
    }
    public void clickOnFashion()
    {
   	 fashion.click();
    }
    public void clickOnElectronics()
    {
   	 electronics.click();
    }
    public void clickOnCart()
    {
   	 cart.click();
    }
    public void clickOnFlag()
    {
   	 flag.click();
    }
    public void clickOnSelectYourAddress()
    {
   	 selectYourAddress.click();
    }
    public void clickOnReturnAndOrders()
    {
   	 returnAndOrders.click();
    }
    public void clickOnMobile()
    {
   	 mobile.click();
    }
    public void clickOnVideogames()
    {
   	 videoGames.click();
    }
}
