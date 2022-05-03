package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class edittypeofwork 
{
	
	
	@FindBy(xpath = "//a[.='lalal']")
	private WebElement create;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement save;
	
	
	
	
	
	
	

public edittypeofwork(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	
	
	public void edittaypeofwork() throws InterruptedException
	{
		
		 create.click();
		 Thread.sleep(1000);
		 save.click();
		 
	}
}
