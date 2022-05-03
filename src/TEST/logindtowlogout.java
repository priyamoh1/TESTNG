package TEST;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.deletetypeofwork;

public class logindtowlogout 
{
	@Test
	public void createatowandlogout() throws InterruptedException, AWTException
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
		
		deletetypeofwork dtw=new deletetypeofwork(driver);
		dtw.deletetoww();
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
}
