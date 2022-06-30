package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "Com.StepDefn",monochrome = true,publish = false,dryRun = false)
public class TestRun {

	
	
}
