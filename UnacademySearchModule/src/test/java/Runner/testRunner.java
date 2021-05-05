package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

@CucumberOptions(features="src/test/resources/Feature/Search.feature",glue= {"stepDefinition"},tags= {"@smoke"})
public class testRunner extends AbstractTestNGCucumberTests
{
	
}