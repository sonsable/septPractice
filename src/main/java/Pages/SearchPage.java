package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SearchPage extends TestBase {
	
	
	
	@FindBy(xpath = "//input[@id='search']") private WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='search-icon-legacy']") WebElement searchbtn;
	
	@FindBy(xpath = "//span[@title='SELENIUM WEBDRIVER TUTORIAL - Learn Selenium Automation with Java - FULL COURSE']") WebElement title;
	
	
	public SearchPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void  searchYoutube() throws IOException, InterruptedException
	{
		
		searchBar.sendKeys(readPropertyFile("search"));
		
		searchbtn.click();
		
		Thread.sleep(3000);
		
		title.click();
		
		Thread.sleep(5000);
	}

}
