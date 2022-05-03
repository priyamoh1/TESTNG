package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteacustomer 
{

	@FindBy(xpath = "(//div[.='pmohantyx'])[1]")
	private WebElement cc;
	
	@FindBy(xpath = "(//div[@class='editButton'])[6]")
	private WebElement cc1;
	
	@FindBy(xpath = "((//div[contains(text(),\"ACTIONS\")])[1]")
	private WebElement cc2;
	
	@FindBy(xpath = "((//div[.='Delete'])[2]")
	private WebElement cc3;
	
	@FindBy(xpath = "(//span[.='Delete permanently']")
	private WebElement cc4;
	
	
	
	
	
	
	
	public deleteacustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void deletec() throws InterruptedException
	{
		cc.click();
		Thread.sleep(1000);
		cc1.click();
		Thread.sleep(1000);
		cc2.click();
		Thread.sleep(1000);
		cc3.click();
		Thread.sleep(1000);
		cc4.click();
		
		
	}
}
