package TEST;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.createacustomer;
import pom.createleavetype;
import pom.createtypeofwork;

public class ActitimeTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		//login.forgotyourpasswordMethod();
		
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.newuser();
		
		  createacustomer cac=new createacustomer(driver); 
		  cac.createacustomer1();
		  
		  ActitimeHomePage home2=new ActitimeHomePage(driver);
		  home2.createtypeofwork();
		  
		  createtypeofwork ctw=new createtypeofwork(driver); 
		  ctw.createtyeofwork();
		  
		  ActitimeHomePage home3=new ActitimeHomePage(driver);
		  home3.leavetype();
		  
		  createleavetype clt=new createleavetype(driver); 
		  clt.createaleavetype();
		  
		  
		  ActitimeHomePage home1=new ActitimeHomePage(driver); 
		  home1.logoutMethod();
		 
		
		
	}
}