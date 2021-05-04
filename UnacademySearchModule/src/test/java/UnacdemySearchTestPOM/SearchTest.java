package UnacdemySearchTestPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UnacademySearchPOM.SearchPOM;


public class SearchTest 
{
	WebDriver driver;
	@Test
	public void searchTest() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);

	sp.searchBox();
	sp.name("sahil khandelwal");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();	
	Thread.sleep(5000);
	
	sp.seeMore();
//	sp.follow();
	Thread.sleep(5000);
	sp.freeClass();
	Thread.sleep(5000);
	
	sp.courseSyllabus();
	Thread.sleep(5000);
	sp.testPractice();
	Thread.sleep(5000);
	sp.testSeries();
	Thread.sleep(5000);
	sp.userCourses();
	Thread.sleep(3000);
	sp.issueReport();
	sp.writeIssue("Some content was not loading");
	WebDriverWait wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send')]")));
	sp.sendIssue();
	sp.dwdApp();
	sp.appStore();
	sp.googlePlay();
	sp.links();
	sp.faceBook();
	
	sp.homePage();
	driver.close();	
	}
}
