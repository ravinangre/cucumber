package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Maven_cucumber\\src\\main\\resources\\Feature",
		glue = {"stepDefinition"}
		)
public class TestRunner {

}
