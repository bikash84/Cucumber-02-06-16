package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@Runwith(Cucumber.class)
@Cucumber.options(
		format={"pretty","json:target/cucumber.json"},
		features={"src/cucumber/"}
		)
public class CucumberRunner {

}
