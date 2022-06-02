package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mrket\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\mrket\\Downloads\\operadriver_win64 (1)\\operadriver_win64\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}


}
