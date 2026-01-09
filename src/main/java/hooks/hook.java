package hooks;

import java.io.IOException;

import Baseclass.Library;
import ResusabilityFunctions.seleniumResuable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook extends Library {
	
	seleniumResuable se;
	public static Scenario scenario;
	
	@Before
	public void test(Scenario cucumberscenario) throws IOException {
		scenario=cucumberscenario;
		launchapplication();
		
	}
	@After
	public void cleanup(Scenario  scenario) {
		se= new seleniumResuable(driver);
		se.attachscreenshot(scenario);
		se.closeapp();
	}

}
