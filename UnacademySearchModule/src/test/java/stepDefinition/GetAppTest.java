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



public class GetAppTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User on search$")
	public void user_on_search() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=2)
	@When("^User clicks on Get the learning App$")
	public void user_clicks_on_Get_the_learning_App() throws Throwable 
	{
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Get the learning app')]")));
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.dwdApp();	   
	}

	@Test(priority=3)
	@Then("^User navigates to Learning App page$")
	public void user_navigates_to_Learning_App_page() throws Throwable 
	{
		Thread.sleep(6000);
	    boolean appPage=driver.findElement(By.xpath("//h4[contains(text(),'Download lessons and learn anytime, anywhere with ')]")).isDisplayed();
	    Assert.assertTrue(appPage);		// Check if download options available or not
	    System.out.println("Download options available :"+appPage);
	    driver.close();		// Close the driver
	}
}
