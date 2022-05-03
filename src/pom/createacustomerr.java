package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createacustomerr 
{
	public WebDriver driver;
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement NewUser;
	
	
	  @FindBy(xpath = "//div[@class='item createNewCustomer']") 
	  private WebElement newc;
	  
	  @FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") 
	  private WebElement name;
	  
	  @FindBy(xpath = "//div[.='Create Customer']") 
	  private WebElement createc;
	  
	  
	  
	public createacustomerr(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	public void createacustomer1() throws InterruptedException
	{
		//container_users.click();
		Thread.sleep(1000);
		NewUser.click();
		newc.click();
		name.sendKeys("pmohantyy");
		Thread.sleep(1000);
		createc.click();
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", NewUser);
		
     }
}
