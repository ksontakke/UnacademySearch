package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/TestPractice.feature",glue= {"stepDefinition"})
public class testRunner extends AbstractTestNGCucumberTests
{
	
}