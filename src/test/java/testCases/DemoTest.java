package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DemoTest {
	public static WebDriver driver;
//	    @Test
//	    public void test1() {
//            System.out.println("Hello World");
//            System.out.println("Test case 1 passed.");
//	    }
//	    
//	    @Test
//	    public void test2() {
//            System.out.println("Welcome to Flipkart");
//            System.out.println("Test case 2 passed.");
//	    }
	    @Test
	    public void test1() {
	    	// setting path for Chrome driver
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

			// initializing driver as Chrome driver
			driver = new ChromeDriver();

			// Maximize the window
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			// navigating to application
			driver.get("https://www.amazon.in/");
			System.out.println("Title"+driver.getTitle());
            System.out.println("Test case 1 passed.");
	    }
	    
	  

}

