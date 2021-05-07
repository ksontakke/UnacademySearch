package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSearchTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority=2)
	@Given("^User is on unacademy Search course Page$")
	public void user_is_on_unacademy_Search_course_Page() throws Throwable 
	{
        driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=3)
	@When("^User enters invalid search data$")
	public void user_enters_invalid_search_data() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.name("$5t6%)(");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
	}

	@Test(priority=4)
	@Then("^User should see blank window$")
	public void user_should_see_blank_window() throws Throwable 
	{
		boolean invalid = driver.findElement(By.xpath("//h4[normalize-space()='Showing results for \"$5t6%)(\"']")).isDisplayed();
		Assert.assertEquals(true, invalid);
	}
	
	@Test(priority=5)
	@After
	public void closeBrowser() throws Throwable
	{
		Thread.sleep(5000);
		driver.close();
	}
}
