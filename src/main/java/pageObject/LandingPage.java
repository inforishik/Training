package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='login.cgi']");
	By title=By.cssSelector("a[href='https://realtime.rediff.com']");
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	


}
