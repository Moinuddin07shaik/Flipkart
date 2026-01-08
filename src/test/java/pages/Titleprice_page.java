package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;

public class Titleprice_page extends Library {
	
	   seleniumResuable se;
	   
	public Titleprice_page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='q']")WebElement Search;
	@FindBy(xpath="//button[@type='submit']")WebElement searchicon;
	
	public void entersearch(String text) {
		se= new seleniumResuable(driver);
		se.entervalue(Search, text);
		
	}
	public void clicksearchicon() {
		se.Click(searchicon);
	}

}
