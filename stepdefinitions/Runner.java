package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\adhvi\\eclipse-workspace\\SDFCCucumberFramework\\src\\main\\java\\featurefiles\\Accounts.feature",
glue="stepdefinitions",
plugin= {"pretty","html:target/report.html"})

public class Runner {
	
	
}

