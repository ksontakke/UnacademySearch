package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OtherLinksTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User is on search window$")
	public void user_is_on_search_window() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=2)
	@When("^User clicks on Other Links$")
	public void user_clicks_on_Other_Links() throws Throwable 
	{
		Thread.sleep(5000);
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.links();
		Thread.sleep(3000);
	}

	@Test(priority=3)
	@Then("^User clicks on Facebook logo$")
	public void user_clicks_on_Facebook_logo() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.faceBook();		// navigates to the Unacademy facebook page
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test(priority=4)
	@Then("^User navigates to facebook page of the Unacademy website$")
	public void user_navigates_to_facebook_page_of_the_Unacademy_website() throws Throwable 
	{
		Thread.sleep(5000);
	    driver.quit();
	}

	@Test(priority=5)
	@When("^User clicks on See All$")
	public void user_clicks_on_See_All() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		Thread.sleep(6000);
		sp.seeMore();		// Checking for more results	
	}

	@Test(priority=6)
	@Then("^User Gets all the Educators name$")
	public void user_Gets_all_the_Educators_name() throws Throwable 
	{
	  Thread.sleep(5000);
	}

	@Test(priority=7)
	@Then("^User Clicks on particular Educator$")
	public void user_Clicks_on_particular_Educator() throws Throwable 
	{
	   driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2)")).click();
	   Thread.sleep(6000);
	}
	
	@Test(priority=8)
	@Then("^User Clicks on a video$")
	public void user_Clicks_on_a_video() throws Throwable 
	{
	    driver.findElement(By.xpath("//div[@class='EducatorProfile__Wrapper-sc-1eikreg-0 bcHiYv']//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//h6[contains(text(),'PREVIEW')]")).click();	// play preview video
	    Thread.sleep(25000);
	    boolean hindi=driver.findElement(By.xpath("//span[contains(text(),'Hindi')]")).isDisplayed();
	    Assert.assertTrue(hindi);		// check if the user is on report page or not
	    System.out.println("Preview video available :"+hindi);
	    driver.close();
	}
}