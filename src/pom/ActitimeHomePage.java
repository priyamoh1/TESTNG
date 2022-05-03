package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	
	@FindBy(id = "container_tasks")
	private WebElement container_tasks;
	
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetypes;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settings1;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typeofwork;
	
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
	
	public void newuser() throws InterruptedException
	{
		container_tasks.click();
		Thread.sleep(1000);
	}
	 public void leavetype() throws InterruptedException
	 {
		 settings.click();
		 Thread.sleep(1000);
		 leavetypes.click();
		 Thread.sleep(1000);
			 
	 }
	 public void createtypeofwork() throws InterruptedException
	 {
		 settings1.click();
		 Thread.sleep(2000);
		 typeofwork.click();
		 Thread.sleep(2000);
		 
	 }
	
	
}