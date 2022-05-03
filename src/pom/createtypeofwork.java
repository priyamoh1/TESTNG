package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createtypeofwork 
{
	public WebDriver driver;
	//@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	//private WebElement settings;
	
	//@FindBy(xpath = "//a[.='Types of Work']")
	//private WebElement typeofwork;
	
	@FindBy(xpath = "//span[@unselectable='on']")
	private WebElement createtypeofwork;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	
	public createtypeofwork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	
	public void createtyeofwork() throws InterruptedException
	{
		//settings.click();
		//Thread.sleep(2000);
		//typeofwork.click();
		//Thread.sleep(1000);
		createtypeofwork.click();
		Thread.sleep(1000);
		name.sendKeys("lalal");
		Thread.sleep(1000);
		submit.click();
		
	}
	public void error()
	{
		WebElement errormessage=driver.findElement(By.xpath("//span[@class='errorFieldLabel']"));
		String errortext=errormessage.getAttribute("title");
		System.out.println(errormessage.getAttribute("title"));
		if(errortext.equals("Type of Work \"lalal\" already exists. Please choose other name for Type of Work."))
		{
			System.out.println("text is matching");
		}
		else
		{
			System.out.println("text is not matching");
		}
	}
}
