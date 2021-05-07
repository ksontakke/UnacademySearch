package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

public class CourseEducator 
{
	WebDriver driver;
	
	@Test(priority=1)
	@Given("^User is on Search Page$")
	public void user_is_on_Search_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();	
	}
	
	@Test(priority=2)
	@When("^User enters course name$")
	public void user_enters_course_name() throws Throwable 
	{
		Thread.sleep(5000);
//		driver.findElement(By.id("searchInput")).sendKeys("chemistry");
		
		
		File credentials=new File("C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chemistry.xlsx");
        FileInputStream fis = new FileInputStream(credentials);	//get the data from External file
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String CourseName=sheet1.getRow(0).getCell(0).getStringCellValue();
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.name(CourseName);

        
//		driver.findElement(By.id("searchInput")).sendKeys(CourseName);        
	}
	
	@Test(priority=3)
	@When("^User clicks on Course Hyperlink$")
	public void user_clicks_on_Course_Hyperlink() throws Throwable 
	{
		Thread.sleep(3000);
		Actions act = new Actions(driver);		// Click using keyboard action
		act.sendKeys(Keys.ENTER).perform();	
	}
	
	@Test(priority=4)
	@Then("^User navigates to the Course page$")
	public void user_navigates_to_the_Course_page() throws Throwable 
	{
		Thread.sleep(7000);
		boolean course=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h4[1]")).isDisplayed();
		Assert.assertTrue(course);		// check if you are on correct page or not
		Thread.sleep(7000);
	    driver.close();
	}
	
	@Test(priority=5)
	@Given("^user is on the Unacademy Home Page$")
	public void user_is_on_the_Unacademy_Home_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	@Test(priority=6)
	@When("^User enters Educators name$")
	public void user_enters_Educators_name(DataTable arg1) throws Throwable 
	{
		List<List<String>> data = arg1.raw();		//get the data from feature file
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.name(data.get(0).get(0));
		
//		driver.findElement(By.id("searchInput")).sendKeys(data.get(0).get(0));
	}
	
	@Test(priority=7)
	@When("^User clicks on Educators Hyperlink$")
	public void user_clicks_on_Educators_Hyperlink() throws Throwable 
	{
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
	}
	
	@Test(priority=8)
	@Then("^User navigates to Educators profile page$")
	public void user_navigates_to_Educators_profile_page() throws Throwable 
	{
		Thread.sleep(7000);
		boolean course=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h4[1]")).isDisplayed();
		Assert.assertTrue(course);		// check if you are on correct page or not
		Thread.sleep(7000);
		driver.close();
	}
}
