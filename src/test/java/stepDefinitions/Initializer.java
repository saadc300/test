package stepDefinitions;

import org.junit.After;
import org.junit.Before;

import core.Base;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	// in this class we will define before Hooks and after Hooks of Cucumber
	// Before Hooks will run before each scenario
	// After Hooks will run after each scenario
	
	@Before
	public void beforeHooks(Scenario scenario) {
		
		browser();
		openBrowser();
		
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		
		tearDown();
		
	}
}
