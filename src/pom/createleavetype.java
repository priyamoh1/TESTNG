package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createleavetype 
{
	//@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	//private WebElement settings;
	
	//@FindBy(xpath = "//a[.='Leave Types']")
	//private WebElement leavetypes;
	
	@FindBy(xpath = "//span[@unselectable='on']")
	private WebElement createleavetype;
	
	@FindBy(id = "leaveTypeLightBox_nameField")
	private WebElement namefield;
	
	@FindBy(xpath = "//span[@class='buttonTitle']")
	private WebElement submitbutton;
	
	
	public createleavetype(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	public void createaleavetype() throws InterruptedException
	{
		//settings.click();
		//Thread.sleep(1000);
		//leavetypes.click();
		//Thread.sleep(1000);
		createleavetype.click();
		Thread.sleep(1000);
		namefield.sendKeys("lalalal");
		Thread.sleep(1000);
		submitbutton.click();
		
		
		
	}
}
