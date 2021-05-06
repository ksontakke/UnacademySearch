package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseDetailsTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User is on the Course page$")
	public void user_is_on_the_Course_page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	     
	}
	
	@Test(priority=2)
	@When("^User click on free classes and test$")
	public void user_click_on_free_classes_and_test() throws Throwable 
	{	
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD/classes");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//a[normalize-space()='Free classes & tests']")).click();
//		Thread.sleep(5000);
//		Actions actions = new Actions(driver);
//     	WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Free classes & tests']"));
//     	actions.click(element).perform();
	}
	
	@Test(priority=3)
	@Then("^User should see the free courses$")
	public void user_should_see_the_free_courses() throws Throwable 
	{
		Thread.sleep(6000);
	    boolean live=driver.findElement(By.xpath("//h2[contains(text(),'IIT JEE')]")).isDisplayed();
	    Assert.assertTrue(live);
	    Thread.sleep(6000);
	    driver.close();
	}
	
	@Test(priority=4)
	@When("^User click on Quick cources$")
	public void user_click_on_Quick_cources() throws Throwable 
	{	
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD/free-platform");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick courses')]")));
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//a[contains(text(),'Quick courses')]")).click();
	}
	
	@Test(priority=5)
	@Then("^User should see the Quick cources$")
	public void user_should_see_the_Quick_cources() throws Throwable 
	{
		boolean quick=driver.getPageSource().contains("Popular Courses");
	    System.out.println("Courses available :"+quick);
	    Thread.sleep(5000);
	    driver.close();
	}
	
	@Test(priority=6)
	@When("^User click on Syllabus$")
	public void user_click_on_Syllabus() throws Throwable 
	{
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD/topics");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
//		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
//		sp.courseSyllabus();
//		driver.findElement(By.xpath("//a[contains(text(),'Syllabus')]")).click();
	}
	
	@Test(priority=7)
	@Then("^User should see the course syllabus$")
	public void user_should_see_the_course_syllabus() throws Throwable 
	{
		boolean syllabus=driver.findElement(By.xpath("//h1[normalize-space()='IIT JEE Syllabus']")).isDisplayed();
		Assert.assertTrue(syllabus);
		System.out.println(syllabus);
	    Thread.sleep(5000);
	    driver.close();
	}
}