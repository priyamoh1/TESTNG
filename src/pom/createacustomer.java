package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createacustomer 
{
	//@FindBy(id = "container_users")
	//private WebElement container_users;
	
	@FindBy(xpath = "//div[.='New User']")
	private WebElement NewUser;
	
	@FindBy(id = "createUserPanel_firstNameField")
	private WebElement firstname;

	@FindBy(id = "createUserPanel_lastNameField")
	private WebElement lastname;
	
	@FindBy(id = "createUserPanel_emailField")
	private WebElement email;
	
	@FindBy(xpath = "//div[.='Save & Send Invitation']")
	private WebElement save;
	
	@FindBy(xpath = "(//span[.='Close'])[1]")
	private WebElement close;
	
	
	public createacustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	public void createacustomer1() throws InterruptedException
	{
		//container_users.click();
		NewUser.click();
		Thread.sleep(2000);
		firstname.sendKeys("priyaranjan");
		Thread.sleep(1000);
		lastname.sendKeys("mohanty");
		Thread.sleep(1000);
		email.sendKeys("pxxm@gmail.com");
		Thread.sleep(2000);
		save.click();
		close.click();	
	}
}

