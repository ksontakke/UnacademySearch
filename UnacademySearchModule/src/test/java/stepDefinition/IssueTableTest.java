package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IssueTableTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User is on the search Page$")
	public void user_is_on_the_search_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=2)
	@When("^User clicks on Report an issue$")
	public void user_clicks_on_Report_an_issue() throws Throwable 
	{
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Report an issue')]")));
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.issueReport();
	}

	@Test(priority=3)
	@Then("^User navigates to Report an issue page$")
	public void user_navigates_to_Report_an_issue_page() throws Throwable 
	{
		Thread.sleep(5000);
		boolean issuereport= driver.findElement(By.xpath("//h2[contains(text(),'Report an issue')]")).isDisplayed();
		Assert.assertTrue(issuereport);		// check if the user is on report page or not
		System.out.println("You are on issue report page");
	}

	@Test(priority=4)
	@Then("^User Reports an Issue$")
	public void user_Reports_an_Issue() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.writeIssue("Some content was not loading");		// Write an issue in text area
		System.out.println("Issue is :"+driver.findElement(By.xpath("//textarea[@placeholder='Type in your query']")).getAttribute("value"));
		// Print the issue
	}

	@Test(priority=5)
	@Then("^Submits it$")
	public void submits_it() throws Throwable 
	{
	    Thread.sleep(6000);
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.sendIssue();		// Submit issue
	    Thread.sleep(4000);
	    driver.close();
	    System.out.println("Issue submited successfully");
	}

	@Test(priority=6)
	@When("^User clicks on issue hyperlink$")
	public void user_clicks_on_issue_hyperlink() throws Throwable 
	{
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Report an issue')]")));
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.issueReport();
	}

	@Test(priority=7)
	@Then("^User navigates to report an issue window$")
	public void user_navigates_to_report_an_issue_window() throws Throwable 
	{
		Thread.sleep(5000);
		boolean issuereport1= driver.findElement(By.xpath("//h2[contains(text(),'Report an issue')]")).isDisplayed();
		Assert.assertTrue(issuereport1);		// check if the user is on report page or not
		System.out.println("You are on issue report page");
		
	}

	@Test(priority=8)
	@Then("^User Reports an Issue using table$")
	public void user_Reports_an_Issue_using_table(DataTable arg1) throws Throwable 
	{
		List<List<String>> data = arg1.raw();
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.writeIssue(data.get(0).get(0));		// get the issue text from data table  
		Thread.sleep(3000);
		System.out.println("Issue is :"+driver.findElement(By.xpath("//textarea[@placeholder='Type in your query']")).getAttribute("value"));
	}

	@Test(priority=9)
	@Then("^Submit$")
	public void submit() throws Throwable 
	{
		Thread.sleep(6000);
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.sendIssue();		// Submit issue
	    Thread.sleep(4000);
	    driver.close();
	    System.out.println("Issue submited successfully");
	}
}
