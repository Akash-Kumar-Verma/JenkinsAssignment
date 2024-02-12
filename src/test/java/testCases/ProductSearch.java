package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Productsearch;
import pages.basePage;


public class ProductSearch extends basePage {
	
	
 @SuppressWarnings("deprecation")
@Test
 public  void productsearch()  throws InterruptedException{


  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  //search the product
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");

  //click on search button  
  driver.findElement(Productsearch.btn_search).click();
    
  // Get Product Name
  String ProductName=driver.findElement(Productsearch.productname).getText();
  System.out.println(ProductName);
  
  // Verify that correct Product is displaying after search 
  Assert.assertEquals(driver.getTitle(), "Amazon.in : mobile");
  
  if(driver.getTitle().equalsIgnoreCase("Amazon.in : mobile")) {
   System.out.println("Results Matched;Test Case Passed");
  }else{
   System.out.println("Results NotMatched;Test Case Failed");
  }
  
 }

}
