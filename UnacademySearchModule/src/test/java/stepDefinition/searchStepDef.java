package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UnacademySearchPOM.SearchPOM;
import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStepDef 
{
	WebDriver driver;
	
	@Test
	@Given("^User is on Search Page$")
	public void user_is_on_Search_Page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	@When("^User enters course name$")
	public void user_enters_course_name() throws Throwable 
	{
	    driver.findElement(By.id("searchInput")).sendKeys("Chemistry");
	}

	@Test(priority=2)
	@When("^User clicks on Course Hyperlink$")
	public void user_clicks_on_Course_Hyperlink() throws Throwable 
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
	}

	@Test(priority=3)
	@Then("^User navigates to the Course page$")
	public void user_navigates_to_the_Course_page() throws Throwable 
	{
	   boolean text= driver.getPageSource().contains("Showing results for");
	   System.out.println("Courses avilable? :"+text);
	   Thread.sleep(5000);
	   driver.close();
	}

	@Test
	@Given("^user is on the Unacademy Home Page$")
	public void user_is_on_the_Unacademy_Home_Page() throws Throwable 
	{
        driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        Thread.sleep(5000);
	}

	@Test(priority=1)
	@When("^User enters Educators name$")
	public void user_enters_Educators_name(DataTable name) throws Throwable 
	{
		List<List<String>> data = name.raw();
	    driver.findElement(By.id("searchInput")).sendKeys(data.get(0).get(0));
	}

	@Test(priority=2)
	@When("^User clicks on Educators Hyperlink$")
	public void user_clicks_on_Educators_Hyperlink() throws Throwable 
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
	}

	@Test(priority=3)
	@Then("^User navigates to Educators profile page$")
	public void user_navigates_to_Educators_profile_page() throws Throwable 
	{
		boolean text= driver.getPageSource().contains("Showing results for");
		System.out.println("Educator avilable? :"+text);
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	@Given("^User is on the Course page$")
	public void user_is_on_the_Course_page() throws Throwable 
	{
	    driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    Thread.sleep(5000);
	}

	@Test(priority=1)
	@When("^User click on free classes and test$")
	public void user_click_on_free_classes_and_test() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Free classes & tests']")));
		sp.freeClass();	
	}

	@Test(priority=2)
	@Then("^User should see the free courses$")
	public void user_should_see_the_free_courses() throws Throwable 
	{
	    Thread.sleep(5000);
	    driver.close();
	}

	@Test
	@Given("^User is on a Course page$")
	public void user_is_on_a_Course_page() throws Throwable 
	{
		driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    Thread.sleep(5000);
	}

	@Test(priority=1)
	@When("^User click on Quick cources$")
	public void user_click_on_Quick_cources() throws Throwable 
	{
		driver.findElement(By.xpath("//li[@data-id='free-platform']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=2)
	@Then("^User should see the Quick cources$")
	public void user_should_see_the_Quick_cources() throws Throwable 
	{
	   boolean quick= driver.findElement(By.xpath("//h4[contains(text(),'Popular Courses')]")).isDisplayed();
	   System.out.println(quick);
	   driver.close();
	}

	@Test
	@Given("^User is on a Course window$")
	public void user_is_on_a_Course_window() throws Throwable 
	{
        driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        Thread.sleep(10000);
	}

	@Test(priority=1)
	@When("^User click on Syllabus$")
	public void user_click_on_Syllabus() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Syllabus']")));
		sp.courseSyllabus();
	}

	@Test(priority=2)
	@Then("^User should see the course syllabus$")
	public void user_should_see_the_course_syllabus() throws Throwable 
	{
	    boolean res=driver.findElement(By.cssSelector("h1[class='H1-sc-1ohcf9-0 PlusTopology__Title-c5rte2-1 JiUEP eFdhHl']")).isDisplayed();
	    Assert.assertTrue(res);
	    driver.close();
	}

	@Test
	@Given("^User is on the course window$")
	public void user_is_on_the_course_window() throws Throwable 
	{
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
        Thread.sleep(10000);
	}

	@Test(priority=1)
	@When("^User click on Test series and Practices$")
	public void user_click_on_Test_series_and_Practices() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.testPractice();
		Thread.sleep(5000);
	}

	@Test(priority=2)
	@When("^User click on Test series$")
	public void user_click_on_Test_series() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.testSeries();
		Thread.sleep(5000);
	}

	@Test(priority=3)
	@Then("^User should see the test pracices and series$")
	public void user_should_see_the_test_pracices_and_series() throws Throwable 
	{
	    boolean test=driver.findElement(By.xpath("//h1[contains(text(),'IIT JEE Test series')]")).isDisplayed();
	    Assert.assertTrue(test);
	    System.out.println("Here is your test series...!");
	    driver.close();
	}

	@Test
	@Given("^User on the Search Page$")
	public void user_on_the_Search_Page() throws Throwable 
	{
	    driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    Thread.sleep(6000);
	}

	@Test(priority=1)
	@When("^User clicks on any Related Search$")
	public void user_clicks_on_any_Related_Search() throws Throwable 
	{
	    driver.findElement(By.cssSelector("div[class='RelatedSearches__Flex-sc-1up5go5-0 eVrZzt'] a:nth-child(1) p:nth-child(1)")).click();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority=2)
	@When("^user clicks on Particular course$")
	public void user_clicks_on_Particular_course() throws Throwable 
	{
	    driver.findElement(By.xpath("//a[@href='/@wifistudy']")).click();
	}

	@Test(priority=3)
	@Then("^User navigates to course page$")
	public void user_navigates_to_course_page() throws Throwable 
	{
	    Thread.sleep(5000);
	    driver.close();
	}

	@Test
	@Given("^User is on the search Page$")
	public void user_is_on_the_search_Page() throws Throwable 
	{
        driver.get("https://unacademy.com/search/sahil%20khandelwal");
        Thread.sleep(5000);
	}

	@Test(priority=1)
	@When("^User clicks on Report an issue$")
	public void user_clicks_on_Report_an_issue() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.issueReport();
	}

	@Test(priority=2)
	@Then("^User navigates to Report an issue page$")
	public void user_navigates_to_Report_an_issue_page() throws Throwable 
	{
	    boolean issue=driver.findElement(By.xpath("//h2[contains(text(),'Report an issue')]")).isDisplayed();
	    Thread.sleep(5000);
	    Assert.assertTrue(issue);
	    System.out.println(issue);
	    driver.close();
	}

	@Test(priority=3)
	@Then("^User Reports an Issue$")
	public void user_Reports_an_Issue() throws Throwable 
	{
		driver.findElement(By.xpath("//textarea[@placeholder='Type in your query']")).sendKeys("I am reporting an issue");	
	}

	@Test(priority=4)
	@Then("^Submits it$")
	public void submits_it() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send')]")));
		sp.sendIssue();
	    Thread.sleep(5000);
	    driver.close();
	}

	@Test
	@Given("^User on the Search window$")
	public void user_on_the_Search_window() throws Throwable 
	{
		driver.get("https://unacademy.com/search/sahil%20khandelwal");
        Thread.sleep(5000);
	}

	@Test(priority=1)
	@Then("^User navigates to report an issue window$")
	public void user_navigates_to_report_an_issue_window() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.issueReport();
	}

	@Test(priority=2)
	@Then("^User Reports an Issue using data table$")
	public void user_Reports_an_Issue_using_data_table(DataTable issuewrite) throws Throwable 
	{
	    List<List<String>> textissue=issuewrite.raw();
	    driver.findElement(By.xpath("//textarea[@placeholder='Type in your query']")).sendKeys(textissue.get(0).get(0));
	    System.out.println(textissue.get(0).get(0));
	}

	@Test(priority=3)
	@Then("^Submit$")
	public void submit() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send')]")));
		sp.sendIssue();
	    Thread.sleep(5000);
	    driver.close();
	}

	@Test
	@Given("^User is on search window$")
	public void user_is_on_search_window() throws Throwable 
	{
	    driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	@When("^User clicks on Other Links$")
	public void user_clicks_on_Other_Links() throws Throwable 
	{
	    driver.findElement(By.xpath("li:nth-child(3) span:nth-child(1)")).click();
	    Thread.sleep(3000);
	}

	@Test(priority=2)
	@Then("^User clicks on Facebook logo$")
	public void user_clicks_on_Facebook_logo() throws Throwable 
	{
	    driver.findElement(By.xpath("//a[@href='https://www.facebook.com/unacademy/']")).click();
	}

	@Test(priority=3)
	@Then("^User navigates to facebook page of the Unacademy website$")
	public void user_navigates_to_facebook_page_of_the_Unacademy_website() throws Throwable 
	{
	    boolean fblogo=driver.findElement(By.xpath("//i[@class='fb_logo img sp_RDCRqPHx6LQ_1_5x sx_51e836']")).isDisplayed();
	    Assert.assertTrue(fblogo);
	    System.out.println(fblogo);
	    Thread.sleep(6000);
	    driver.quit();
	}

	@Test
	@Given("^user is on a search window$")
	public void user_is_on_a_search_window() throws Throwable 
	{
		driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	@When("^User clicks on See All$")
	public void user_clicks_on_See_All() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(3) > p:nth-child(1)")));
		sp.seeMore();
	}

	@Test(priority=2)
	@Then("^User Gets all the Educators name$")
	public void user_Gets_all_the_Educators_name() throws Throwable 
	{
	    Thread.sleep(6000);
	}

	@Test(priority=3)
	@Then("^User Clicks on particular Educator$")
	public void user_Clicks_on_particular_Educator() throws Throwable 
	{
	    driver.findElement(By.xpath("//div[@class='Content-v4b5dl-0 layout__Content-yt2anf-3 kOTUQT kouZiE']//a[1]")).click();
	    Thread.sleep(5000);
	}

	@Test(priority=4)
	@Then("^User Clicks on a video$")
	public void user_Clicks_on_a_video() throws Throwable 
	{
	    driver.findElement(By.xpath("//div[@class='EducatorProfile__Wrapper-sc-1eikreg-0 bcHiYv']//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//h6[contains(text(),'PREVIEW')]")).click();
	    Thread.sleep(20000);
	    driver.close();
	}

	@Test
	@Given("^User on search$")
	public void user_on_search() throws Throwable 
	{
	    driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	@When("^User clicks on Get the learning App$")
	public void user_clicks_on_Get_the_learning_App() throws Throwable 
	{
		SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
		sp.dwdApp();
	}

	@Test(priority=2)
	@Then("^User navigates to Learning App page$")
	public void user_navigates_to_Learning_App_page() throws Throwable 
	{
	    boolean app=driver.findElement(By.xpath("//h4[contains(text(),'Download lessons and learn anytime, anywhere with ')]")).isDisplayed();
	    Assert.assertTrue(app);
	    System.out.println(app);
	    driver.close();
	}

	@Test
	@Given("^User on a Search Page$")
	public void user_on_a_Search_Page() throws Throwable 
	{
	    driver.get("https://unacademy.com/search/sahil%20khandelwal");
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	@When("^User clicks on Home$")
	public void user_clicks_on_Home() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Home')]")));	
	    driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}

	@Test(priority=2)
	@Then("^User navigates to Unacademy Home page$")
	public void user_navigates_to_Unacademy_Home_page() throws Throwable 
	{
		Thread.sleep(5000);
		boolean homelogo= driver.findElement(By.xpath("//img[@class='Logo__LogoStyled-ccjsak-0 koLPRa']")).isDisplayed();
		System.out.println(homelogo);
		Thread.sleep(5000);
		driver.close();    
	}
}
