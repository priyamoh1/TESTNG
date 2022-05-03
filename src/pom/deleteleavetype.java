package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteleavetype 
{

	@FindBy(xpath = "//span[contains(text(),'lalalal')]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement delete;
	
	
	
	
	public deleteleavetype(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void deletelt() throws InterruptedException, AWTException
	{
		delete.click();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
}
