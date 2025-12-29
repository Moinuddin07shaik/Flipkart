package ResusabilityFunctions;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Library;

public class seleniumResuable extends Library {
	
	public seleniumResuable(WebDriver driver) {
		this.driver=driver;
	}
	
	public void entervalue(WebElement element, String text) {
		try {
			element.sendKeys(text);
		}catch(Exception e) {
			System.out.println("No such Element exception");
		
		}
	}
	public void Click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println("No such Element exception");
		}
	}
	public void gettitle() {
		try {
			System.out.println(driver.getTitle());
		}catch(Exception e) {
			System.out.println("Not found get title");
		}
	}
	public void screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		}catch(Exception e) {
			System.out.println("screenshot not capture");
		}
	}
	public void MultipleGettext(List<WebElement> element) {
		List<WebElement> text=element;
		System.out.println(text.size());
		
		for(WebElement textcount: text) {
			String totallist = textcount.getText();
			System.out.println("*************************************************");
			System.out.println(totallist);
		}
	}
	public void Getvalue(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

}
