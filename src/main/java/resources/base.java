package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base 
{
	
	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\Rishi\\Training\\src\\main\\java\\resources\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	WebDriverManager.chromedriver().setup();
	 //System.setProperty("webdriver.chrome.driver", "C://chromed//chromedriver.exe");
	driver= new ChromeDriver();
		
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	
}
else if (browserName.equals("IE"))
{
	driver=new InternetExplorerDriver();
}

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
return driver;

	
	}

}
