package stepdefination;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;
import io.cucumber.java.en.*;
import pages.Multiplesearch_page;

public class MultipleSearch_stepdef extends Library {
	
	Multiplesearch_page ms;
	
	
	@Given("Enter the {string} in the field")
	public void enter_the_in_the_field(String Searchtext) {
		ms = new Multiplesearch_page(driver);
		ms.Entersearch(Searchtext);
		
	}

	@When("click the search button")
	public void click_the_search_button() {
		ms.Clicksearch();
		
	    
	}

	@Then("it should navigates to the text page and display the corresponding page")
	public void it_should_navigates_to_the_text_page_and_display_the_corresponding_page() {
	    seleniumResuable sr = new seleniumResuable(driver);
	    sr.gettitle();
	    System.out.println("********************************************"); 
	    sr.screenshot("C:\\Users\\moinu\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Screenshots\\Multiplesearch"+System.currentTimeMillis()+".png");
	    
	}



}
