package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src\\test\\resources\\FeatureFile\\fblogin.feature",
		glue="StepDefinition",
		publish=true,
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target/output.html" ,"json:target/output.json","junit:target/output.xml" }
		
		
		)


public class Runner {
	
	}
