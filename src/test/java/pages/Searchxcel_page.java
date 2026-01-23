package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;
import utilitys.excellutility;

public class Searchxcel_page extends Library {
	
	excellutility excel;
	seleniumResuable se;
	public Searchxcel_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(xpath="//input[@name='q']")  WebElement searchbox;
    
    public void Searchwithexcel() throws Throwable {
    	excel = new excellutility();
    	
    	for(int i=1; i<=6;i++) {
    		se = new seleniumResuable(driver);
    		se.entervalue(searchbox, excel.excelread("Sheet1", i, 0));
    		searchbox.sendKeys(Keys.ENTER);
    		se.waits();
    		se.navigateback();
    	}
    }
}
