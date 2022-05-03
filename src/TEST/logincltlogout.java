package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.createleavetype;

public class logincltlogout 
{
	@Test
	public void loginandlogout() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage clt1=new ActitimeHomePage(driver);
		clt1.leavetype();
		
		createleavetype clt=new createleavetype(driver);
		clt.createaleavetype();
		
	
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
}
