package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editlt 
{
	@FindBy(xpath = "(//span[.='–'])[3]")
	private WebElement edit;
	
	@FindBy(xpath = "//input[@id='processLeaveTimeCheckbox_affectedBalancePopup']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//span[.='Apply']")
	private WebElement save;
	
	public editlt(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	
	public void editltlogut() throws InterruptedException
	{
		edit.click();
		 Thread.sleep(1000);
		 checkbox.click();
		 Thread.sleep(1000);
		 save.click();
	}
	
	
}
