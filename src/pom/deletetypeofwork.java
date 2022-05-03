package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deletetypeofwork 
{
	
	
	@FindBy(xpath = "//a[@href='javascript:deleteType(21);']")
	private WebElement delete;
	
	
	
	
	
	public deletetypeofwork(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	public void deletetoww() throws AWTException 
	{
		delete.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
