package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.basePage;
import pages.homePage;
import pages.loginPage;



public class loginTest extends basePage{
    
	@DataProvider(name="usertestdata")
	public static  Object[][] userinputdata(){
		Object[][] data=new Object[][] {{"akashv5482@gmail.com","akashchakia"}};
		return data;
	}
	
	@Test(priority=1,dataProvider="usertestdata")
	public void login(String username,String password) {

		driver.findElement(homePage.btn_signIn).click();
	
		driver.findElement(loginPage.text_username).sendKeys(username);
		
		driver.findElement(loginPage.btn_continue).click();
		
		driver.findElement(loginPage.text_password).click();
		
		driver.findElement(loginPage.text_password).sendKeys(password);
	
		driver.findElement(loginPage.btn_signInSubmit).click();
		
		Assert.assertEquals(driver.getTitle(), "Amazon");
		
		System.out.println("Test passed");
	}

}

