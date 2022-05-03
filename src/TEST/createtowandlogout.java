package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.createtypeofwork;

public class createtowandlogout 
{
	@Test
	public void createatowandlogout() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		 
		ActitimeHomePage dc=new ActitimeHomePage(driver);
		dc.createtypeofwork();
		
		createtypeofwork ct=new createtypeofwork(driver);
		ct.createtyeofwork();
		
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
}
