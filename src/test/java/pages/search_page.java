package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;

public class search_page extends Library {
	seleniumResuable se;

	public search_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@name='q']") WebElement Searchtext;
	@FindBy(xpath="//html[@lang='en-IN']")WebElement Homepage;
	@FindBy(xpath="//html[@lang='en']")WebElement Searchresult;
	@FindBy(xpath="//div[@class='col col-7-12']")List<WebElement> Entairer;
	@FindBy(xpath="(//div[@class='col col-7-12'])[3]")WebElement thirdresult;
	
	public void search(String text) {
		se = new seleniumResuable(driver);
		se.entervalue(Searchtext, text);
	}
	public void clicksearch() {
		Searchtext.sendKeys(Keys.ENTER);
	}
	public void homescreen() {
		System.out.println(Homepage.isDisplayed());
	}
	public void Result() {
		System.out.println(Searchresult.isDisplayed());
		System.out.println(driver.getTitle());
	}
	public void printentaireresult() {
		se.MultipleGettext(Entairer);
	}
	public void print3rdresult() {
		se.Getvalue(thirdresult);
	}
	
 }
