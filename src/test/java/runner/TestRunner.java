package runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ("classpath:features"),//links Cucumber with feature files located
		glue = ("com.tekschool.us.retail.hawks.stepDefinitions"),//tells cucumber where stepDefinitions located
		tags = "@smokeTest", //to run one scenario or multiple scenarios
		dryRun = false, //checks if there are any missing steps for each scenario 
		plugin = {"pretty",
				"html:target/htmlReports/cucumber-pretty.html",
				"json:target/jsonReports/cucumber.json"
				},
		snippets = CAMELCASE,
		monochrome = true)
		
		
		

public class TestRunner {

	
}
