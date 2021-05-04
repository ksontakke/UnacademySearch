package UnacademySearchPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class SearchPOM 
{
	WebDriver driver;
	
	@FindBy(id="searchInput")
	WebElement search;
	
	@FindBy(css ="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(3) > p:nth-child(1)")
	WebElement seeall;
	
	@FindBy(xpath="//div[@class='Carousel__CardContainer-sc-1owlrrs-4 cIqTFa']//div[1]//a[1]//div[2]//div[2]//button[1]")
	WebElement follow;
	
	@FindBy(xpath ="//a[normalize-space()='Free classes & tests']")
	WebElement freeoptions;
	
	@FindBy(xpath="//li[@data-id='library']")
	WebElement library;
	
	@FindBy(xpath="//span[contains(text(),'Report an issue')]")
	WebElement issue;
	
	@FindBy(xpath="//textarea[@placeholder='Type in your query']")
	WebElement textissue;
	
	@FindBy(xpath ="//button[contains(text(),'Send')]")
	WebElement sendissue;
	
	@FindBy(xpath="//span[contains(text(),'Get the learning app')]")
	WebElement getapp;
	
	@FindBy(xpath="//img[@alt='appStore']")
	WebElement appstore;
	
	@FindBy(xpath="//img[@alt='playStore']")
	WebElement googleplay;
	
	@FindBy(css="li:nth-child(3) span:nth-child(1)")
	WebElement otherlinks;
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/unacademy/']")
	WebElement facebook;
	
	@FindBy(xpath = "//a[normalize-space()='Syllabus']")
	WebElement syllabus;
	
	@FindBy(xpath="//span[contains(text(),'Test series & Practice')]")
	WebElement testpractice;
	
	@FindBy(xpath = "//a[normalize-space()='Test series']")
	WebElement testseries;
	
	@FindBy(linkText="Quick courses")
	WebElement quickcourse;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homepage;
	
	public void search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox()
	{
		search.click();
	}
	
	public void name(String name) throws InterruptedException
	{
		search.sendKeys(name);
		Thread.sleep(3000);
	}

	public void seeMore()
	{
		seeall.click();
	}
	
	public void follow()
	{
		follow.click();
	}
	
	public void freeClass()
	{
		freeoptions.click();
	}
	public void userCourses()
	{
		library.click();
	}
	public void issueReport()
	{
		issue.click();
	}
	public void writeIssue(String issue)
	{
		textissue.sendKeys(issue);		
	}
	public void sendIssue()
	{
		sendissue.click();	
	}
	public void dwdApp()
	{
		getapp.click();
	}
	public void appStore() throws InterruptedException
	{
		appstore.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void googlePlay() throws InterruptedException
	{
		googleplay.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void links()
	{
		otherlinks.click();
	}
	public void faceBook() throws InterruptedException
	{
		facebook.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void courseSyllabus()
	{
		syllabus.click();
	}
	public void testPractice()
	{
		testpractice.click();
	}
	public void testSeries()
	{
		testseries.click();
	}
	
	public void homePage()
	{
		homepage.click();
	}
}
