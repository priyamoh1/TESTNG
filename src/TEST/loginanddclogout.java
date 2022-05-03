package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.deleteacustomer;

public class loginanddclogout 
{
	@Test
	public void logindclogout() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		 
		ActitimeHomePage dc=new ActitimeHomePage(driver);
		dc.newuser();
		
		deleteacustomer dc1=new deleteacustomer(driver);
		dc1.deletec();
		

		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
}
