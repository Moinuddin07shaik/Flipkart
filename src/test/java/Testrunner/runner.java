package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\moinu\\eclipse-workspace\\Flipkart\\src\\test\\resources\\features\\searchfunctionality.feature",
glue="stepdefination",
tags="@tc004",
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, monochrome =true
)

public class runner {
	

}
