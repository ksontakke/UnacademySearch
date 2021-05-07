package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportIssue 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User is on the particular course Page$")
	public void user_is_on_the_particular_course_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=2)
	@When("^User clicks on Report an issue link$")
	public void user_clicks_on_Report_an_issue_link() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Report an issue')]")));
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.issueReport();
	}

	@Test(priority=3)
	@Then("^User navigates to Report page$")
	public void user_navigates_to_Report_page() throws Throwable 
	{
		Thread.sleep(5000);
		boolean issuereport= driver.findElement(By.xpath("//h2[contains(text(),'Report an issue')]")).isDisplayed();
		Assert.assertTrue(issuereport);
		System.out.println("You are on issue report page");
	}

	@Test(priority=4)
	@Then("^User Reports an Issue without any message$")
	public void user_Reports_an_Issue_without_any_message() throws Throwable 
	{
		Thread.sleep(5000);
//		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
//		sp.writeIssue("");
//		System.out.println("Issue is :"+driver.findElement(By.xpath("//textarea[@placeholder='Type in your query']")).getAttribute("value"));
	}

	@Test(priority=5)
	@Then("^Click on submit$")
	public void click_on_submit() throws Throwable 
	{
	    boolean sendbutton=driver.findElement(By.xpath("//button[contains(text(),'Send')]")).isEnabled();
	    System.out.println(sendbutton);
	    Assert.assertFalse(sendbutton);
	    driver.close(); 
	}
}
