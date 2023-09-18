package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SearchPage;

public class SearchPageTest extends TestBase {
	
	public SearchPage obj;
	@BeforeTest
	
	public void setup() throws IOException
	{
		
		initialize();
		
		 obj=new SearchPage();
		
	}
	
	
	@Test
	
	public void searchYoutubeTest() throws IOException, InterruptedException
	{
		obj.searchYoutube();
		
	}
	
	@AfterTest
	
	public void closeBrower()
	{
		driver.close();
	}
	
	
	

}
