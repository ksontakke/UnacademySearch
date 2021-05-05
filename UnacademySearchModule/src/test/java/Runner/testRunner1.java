package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Search.feature",glue= {"stepDefinition"},tags= {"smoke"},plugin= {"pretty","junit: target/junit-report/cucumberlogin.xml"})

public class testRunner1 
{

}
