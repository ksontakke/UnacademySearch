package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPOM.SearchPOM;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseInfo 
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
	@Given("^User is on unacademy course page$")
	public void user_is_on_unacademy_course_page() throws Throwable 
	{
		driver.get("https://unacademy.com/search/sahil%20khandelwal");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@Test(priority=3)
	@When("^User click on Schedule$")
	public void user_click_on_Schedule() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		boolean sch = driver.findElement(By.cssSelector("li[data-id='schedule'] div[class='Link__StyledDiv-sc-1n9f3wx-1 kAeEiz']")).isEnabled();
		System.out.println(sch);
		Assert.assertTrue(sch);
		sp.CourseSchdule();
	}

	@Test(priority=4)
	@Then("^User should see course schedule$")
	public void user_should_see_course_schedule() throws Throwable 
	{
		Thread.sleep(5000);
		boolean schdule = driver.getPageSource().contains("Course Schedule");
		System.out.println(schdule);
		Assert.assertTrue(schdule);
	}

	@Test(priority=5)
	@When("^User click on Saved$")
	public void user_click_on_Saved() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		boolean save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]")).isEnabled();
		System.out.println(save);
		Assert.assertTrue(save);
		sp.savedCourse();
	}

	@Test(priority=6)
	@Then("^User should see saved course$")
	public void user_should_see_saved_course() throws Throwable 
	{
		Thread.sleep(5000);
		boolean scourse = driver.getPageSource().contains("Saved Courses");
		System.out.println(scourse);
		Assert.assertTrue(scourse);
	}

	@Test(priority=7)
	@When("^User click on Enrollments$")
	public void user_click_on_Enrollments() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		boolean enroll = driver.findElement(By.xpath("//div[normalize-space()='Enrollments']")).isEnabled();
		System.out.println(enroll);
		Assert.assertTrue(enroll);
		sp.courseEnrolled();
	}

	@Test(priority=8)
	@Then("^User should see enrolled courses$")
	public void user_should_see_enrolled_courses() throws Throwable 
	{
		Thread.sleep(5000);
		boolean enr = driver.getPageSource().contains("Enrolled Courses");
		System.out.println(enr);
		Assert.assertTrue(enr);
	}

	@Test(priority=9)
	@When("^User click on My Library$")
	public void user_click_on_My_Library() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		boolean lb = driver.findElement(By.xpath("//a[normalize-space()='My library']")).isEnabled();
		System.out.println(lb);
		Assert.assertTrue(lb);
		Thread.sleep(8000);
		sp.courseLibrary();
		Thread.sleep(7000);
		sp.enterMobile("8007802608");
	    sp.Login();
	    Thread.sleep(30000);
	    sp.verifyOTP();
	}

	@Test(priority=10)
	@Then("^User should see course information$")
	public void user_should_see_course_information() throws Throwable 
	{
		Thread.sleep(8000);
		boolean lab = driver.findElement(By.xpath("//h2[normalize-space()='My library']")).isDisplayed();
		Assert.assertTrue(lab);
		System.out.println("Here uou can see your library data!");
	}
	
	@Test(priority=11)
	@After
	public void closeBrowser() throws Throwable
	{
		Thread.sleep(5000);
		driver.close();
	}
}
