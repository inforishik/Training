package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	By email=By.cssSelector("input[id='login1']");
	By password=By.cssSelector("input[id='password']");
	By login=By.cssSelector("input[class='signinbtn']");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}


}
