package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBase {
	
	public static WebDriver driver;
	public static void initialize() throws IOException
	{
		
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\13SeptPractice\\msedgedriver.exe");
		
//		ChromeOptions chrome=new ChromeOptions();
//		
//		chrome.addArguments("--remote-allow-origins=*"); //LIKE THIS WE CAN ADD MULTIPLE ARGUMENTS IN CHROMEOPTION OBJECT
//		chrome.addArguments("--disable-notifications");
	    	
		EdgeOptions option=new EdgeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		// WE NEED TO ADD DEPENDENCY FOR THIS WEBDRIVER MANAGER INTO POM.XML
				
      //  WebDriverManager.chromedriver().setup(); //this line will adjust the chromedriver version, no need to update

        driver=new EdgeDriver(option);
        
     driver.get(readPropertyFile("url"));
		
	}
	

	public static String readPropertyFile(String value) throws IOException
	
	{
		
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\13SeptPractice\\src\\main\\java\\Configure\\Config.properties");
		
		prop.load(file);
		
		return prop.getProperty(value);
	}
	
	
	
	

}
