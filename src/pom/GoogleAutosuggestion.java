package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAutosuggestion 
{
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchTextfield;
	
	@FindBy(xpath = "//span[contains(text(),'selenium')]")
	private List<WebElement> suggestions;
	
	public GoogleAutosuggestion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchMethod() throws InterruptedException
	{
		searchTextfield.sendKeys("selenium");
		Thread.sleep(3000);
	}
	
	public void selectsuggestionMethod()
	{
		for(int i=0;i<suggestions.size();i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				suggestions.get(i).click();
				break;
			}
		}
	}
}