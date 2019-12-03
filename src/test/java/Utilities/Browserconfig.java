package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserconfig {
	
public static WebDriver driver;
	
	public WebDriver choosebrowser(String key,String url)
	{
		if(key.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			
//			C:\Program Files (x86)\Google\Chrome\Application\chrome.exe
			opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			
			driver = new ChromeDriver(opt);
		}
		else if(key.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "Drivers/chromedriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(key.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}


}
