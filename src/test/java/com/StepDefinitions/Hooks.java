package com.StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.Factory.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Hooks {
	 public static  WebDriver driver;
	  static Properties properties;
    
	@BeforeAll
   public static void setup() throws IOException, AWTException, InterruptedException 
   {
   	driver=Baseclass.getWebDriver();
   	properties=Baseclass.getProperties();
   	    	
   	driver.get(properties.getProperty("appURL"));
   	driver.manage().window().maximize();

   }
	
	@After
  public static void addScreenshot(Scenario scenario)
  {
  	// this is for cucumber junit report
      if(!scenario.isFailed())
      {
      	TakesScreenshot ts=(TakesScreenshot) driver;
      	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
      	scenario.attach(screenshot, "image/png",scenario.getName());
      }
  }
    
   			

		
   
   @AfterAll
   public static void tearDown() {
       		
      driver.quit();
      
   }
}
   	


