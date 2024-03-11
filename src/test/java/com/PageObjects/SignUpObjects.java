package com.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utilies.Excelsheet;

public class SignUpObjects extends BasePage 
{

	public SignUpObjects(WebDriver driver)
	{
		super(driver);
	}	
	
	
	String email,Pswd;
	String file=System.getProperty("user.dir")+"/src/test/resources/Excel/NewBikesDetails.xlsx";
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(60));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	 
	 
	//Elements
	@FindBy(id="forum_login_div_lg")
	WebElement loginbtnEle;
	
	@FindBy(xpath="//div[@data-track-label='Popup_Login/Register_with_Google']")
	WebElement signupEle;
	
	@FindBy(id="identifierId")
	WebElement emailEle;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement Nxtbtn;
	
	@FindBy(xpath="//div[@class='LXRPh']//div/div")
	WebElement ErrorMsgEle;
	
	@FindBy(xpath="(//span[contains(@class,'login-title')])[1]")
	WebElement LonginPageheading;
	
	@FindBy(xpath="//span[contains(text(),'Facebook')]")
	WebElement facebookEle;
	
	@FindBy(id="email")
	WebElement FBemailEle;
	
	@FindBy(id="pass")
	WebElement fbpasswordEle;
	
	@FindBy(xpath="//div[@class='fsl fwb fcb']")
	WebElement ErrorTxtMsg;
	
	 public void LoginClk()
	  {
		 
		  loginbtnEle.click();
	  }
	 public void GoogleEle()
	 {
	    signupEle.click();
	 }

	 public void EnterInvalidMail() throws IOException
	 {
	    Set<String> WindowIds=driver.getWindowHandles();
	    
	    for(String id:WindowIds)
	    {
	    	String title=driver.switchTo().window(id).getTitle();
	    	if(title.equals("Sign in - Google Accounts"))
	    	{
	    		
	    		
	    	    mywait.until(ExpectedConditions.visibilityOf(emailEle));
	    	    email=Excelsheet.getCellData(file,"UserInfo", 1, 0);
	    	    System.out.println(email);
	    	   // email="abc@gmail";
	    	    emailEle.sendKeys(email);
	    	    
	    	    
	    		
	    	}
	    }
	    
	  }
	 
	 
	 public void Errormsg() throws IOException
	 {
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 		js.executeScript("arguments[0].click();",Nxtbtn);
 		mywait.until(ExpectedConditions.visibilityOf(ErrorMsgEle));
 		String ErrorMsg=ErrorMsgEle.getText();
 		System.out.println("************Error Message after entering Invalid credentials*************");
 		System.out.println(ErrorMsg);
 		Excelsheet.setCellData(file, "UserInfo", 0,1,"Error Message");
 		Excelsheet.fillYellowColor(file, "UserInfo", 0,1);
 		Excelsheet.setCellData(file,"UserInfo", 1, 1, ErrorMsg);
 		
 		//driver.close();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public void VerifyVisibilityLogin() 
	{
		if(loginbtnEle.isDisplayed())
		{
			System.out.println("Login/signup Element available in Home Page");
		}
		else
		{
			System.out.println("Login/signup Element available in Home Page");
		}
		
	}
	public void verifyLoginPage() 
	{
		
		String actname="Login/Register to ZigWheels";
		if(LonginPageheading.getText().equals(actname))
		{
			System.out.println("User in the Login page");
		}
		else
		{
			System.out.println("User not in the Login page");
		}
	}
	
	
	//regression
		public void facebookClk()
		{
			facebookEle.click();
		}
		//regression
		public void SwitchToFacebook()
		{
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
		}	
		//regression
		public void facebookpage() {
			String exppagetitle=driver.getTitle();
			String actpagetitle="Facebook";
			//System.out.println(exppagetitle);
			if(exppagetitle.equalsIgnoreCase(actpagetitle)) {
				System.out.println("navigated to correct facebook");
			}
			else {
				System.out.println("navigated to incorrect facebook");
			}
		}
		//regression
		public void FacebookErrorTextMsg() throws IOException
		{
			 email=Excelsheet.getCellData(file,"UserInfo", 1, 0);
			 Pswd=Excelsheet.getCellData(file,"UserInfo", 2, 0);
			FBemailEle.sendKeys(email);
			fbpasswordEle.click();
			fbpasswordEle.sendKeys(Pswd,Keys.ENTER);
			System.out.println(ErrorTxtMsg.getText());
	 		Excelsheet.setCellData(file,"UserInfo", 1, 2, ErrorTxtMsg.getText());
			//driver.close();

		}
}
