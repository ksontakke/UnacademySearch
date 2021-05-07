package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class PracticeTest 
{
	
	WebDriver driver;

	@Given("^User is on the course window$")
	public void user_is_on_the_course_window() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
        driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=1)
	@When("^User click on Test series and Practices$")
	public void user_click_on_Test_series_and_Practices() throws Throwable 
	{
		Thread.sleep(7000);
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD/test-series");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

				
//	    WebDriverWait wait = new WebDriverWait(driver, 15);
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Test series & Practice']")));
//		driver.findElement(By.xpath("//span[normalize-space()='Test series & Practice']")).click();		
//		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
//		sp.testPractice();
	}

	@Test(priority=2)
	@When("^User click on Test series$")
	public void user_click_on_Test_series() throws Throwable 
	{
		Thread.sleep(3000);
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD/test-series");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Test series']")));		
//		driver.findElement(By.xpath("//a[normalize-space()='Test series']")).click();
	}

	@Test(priority=3)
	@Then("^User should see the test pracices and series$")
	public void user_should_see_the_test_pracices_and_series() throws Throwable 
	{
		Thread.sleep(8000);
		boolean test = driver.findElement(By.xpath("//h1[contains(text(),'IIT JEE Test series')]")).isDisplayed();
	    Assert.assertTrue(test);	// Check if the user able to see the available test series or not
	    System.out.println("Test series available :"+test);
	    driver.quit();
	}
}
