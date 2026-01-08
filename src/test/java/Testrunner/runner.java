package Testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\moinu\\eclipse-workspace\\Flipkart\\src\\test\\resources\\features\\searchfunctionality.feature",
glue="stepdefination",
tags="@tc005",
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, monochrome =true
)

public class runner extends AbstractTestNGCucumberTests {
	
	
	

}
