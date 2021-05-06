package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/GetApp.feature",glue= {"stepDefinition"}				,
				plugin= {"pretty","html:TestNGReports/htmlreport","json:TestNGReports/jsonreport.json",
				"junit:TestNGReports/xmlreport.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:TestNGReports/cucumber-reports/report.html"})
public class testRunner extends AbstractTestNGCucumberTests
{
	
}