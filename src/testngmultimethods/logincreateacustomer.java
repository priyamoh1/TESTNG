package testngmultimethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.createacustomerr;

public class logincreateacustomer
{
	public WebDriver driver;
@Test
public void a() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	
	ActitimeLoginPage login=new ActitimeLoginPage(driver);
	login.loginMethod();	
}

@Test
public void b() throws InterruptedException
{
	
	ActitimeHomePage cac1=new ActitimeHomePage(driver);
	cac1.newuser();
	

	createacustomerr cac=new createacustomerr(driver);
	cac.createacustomer1();
}
}
