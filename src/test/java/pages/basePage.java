package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class basePage {
	public static WebDriver driver;
	public String url= "https://www.amazon.in/";
    	
	@BeforeSuite
	public  void setup() {
		 
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		//WebDriver
		System.out.println("Setup Successful");

	}
	
	@BeforeTest
	public void navigateToURL() {
		//driver.get("https://www.saucedemo.com/");
		driver.get(url);
		System.out.println("Successfully nevigated to url");
	}
	
	@AfterSuite
	public  void finish() {
		driver.quit();
		System.out.println("Quitting...");
	}
}
