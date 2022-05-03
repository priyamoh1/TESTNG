package testngmultimethods;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.createtypeofwork;
import pom.deletetypeofwork;

public class logincwdw3 
{
	public WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();	
	}
	@Test(priority = 2)
	public void creatework() throws InterruptedException
	{
		
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage dc=new ActitimeHomePage(driver);
		dc.createtypeofwork();
		
		createtypeofwork ct=new createtypeofwork(driver);
		ct.createtyeofwork();
	}
	@Test(priority = 2)
	public void deletework() throws InterruptedException, AWTException
	{
		
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage dc=new ActitimeHomePage(driver);
		dc.createtypeofwork();
		
		deletetypeofwork dtw=new deletetypeofwork(driver);
		dtw.deletetoww();
	}

}
