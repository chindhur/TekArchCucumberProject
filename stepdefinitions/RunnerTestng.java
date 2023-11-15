package stepdefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"C:\\Users\\adhvi\\eclipse-workspace\\SDFCCucumberFramework\\src\\main\\java\\featurefiles"},glue="stepdefinitions",
plugin= {"pretty","html:target/report.html"},tags="@test")

public class RunnerTestng extends AbstractTestNGCucumberTests{

}
