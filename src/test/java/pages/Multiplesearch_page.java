package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;

public class Multiplesearch_page  extends Library{
	
	seleniumResuable se;
	
	public Multiplesearch_page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='q']") WebElement SearchField;
	
	public void Entersearch(String Searchtext) {
		
		se= new seleniumResuable(driver);
		se.entervalue(SearchField, Searchtext);
		
	}
	public void Clicksearch() {
		SearchField.sendKeys(Keys.ENTER);
	}
	
	

}
