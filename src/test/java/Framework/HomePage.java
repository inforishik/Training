package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base
{
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		//System.out.println(text);
		log.info(text);
		
		lp.getLogin().click();
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricted user";
		data[0][1]="10146";
		data[0][2]="restricted user";
		
		data[1][0]="Nonrestricted user";
		data[1][1]="10146";
		data[1][2]="Restricted user";
		
		return data;
	}
	

}
