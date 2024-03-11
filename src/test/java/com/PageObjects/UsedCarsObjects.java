package com.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilies.Excelsheet;

public class UsedCarsObjects extends BasePage {

	public UsedCarsObjects(WebDriver driver) {
		super(driver);
	}
	
	int row1=1;
	int s=1;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(50));
	
	
	@FindBy(xpath="//li/a[@href='/used-car']")
	WebElement UsedCarBtnEle;
	
	@FindBy(xpath="(//li/span[contains(text(),'Chennai')])[1]")
	WebElement LocationEle;
	
	@FindBy(xpath="//div[contains(text(),'Popular Models')]")
	WebElement scroltoPoPular;
	
	@FindBy(xpath="//li[contains(@id,'mmvLi_')]")
	List<WebElement> listOfCarsEle ;
	
	@FindBy(xpath="//input[@class='carmmCheck']")
	List<WebElement> CheckBoxEle;
	
	
	@FindBy(xpath="//div/a[@data-track-label='Car-name']")
	List<WebElement> CarNamesEle ;
	
	@FindBy(xpath="//span[@class='zw-cmn-price n pull-left mt-3']")
	List<WebElement> CarPriceEle ;
	
	@FindBy(xpath="//span[@class='zc-7 fnt-14 uLm block']")
	List<WebElement> CarAvlocEle ;
	
	@FindBy(xpath="//div[@class='h-dd-r']/ul")
	List<WebElement> AreaList ;
	
	@FindBy(xpath="//span[contains(@class,'contactSellerbtn')]")
	List<WebElement> sellerDetails ;
	
	
	@FindBy(xpath="//*[@id='oneTapAlternateLoginPopup']//div[@class='clr']")
	WebElement PopUp;
	
	@FindBy(xpath="//div[@class='h-dd-r']/ul/li")
	List<WebElement> cities;
	
	@FindBy(id="usedcarttlID")
	WebElement carspagetitle;
	  
	  public void UsedCarClk() 
	  {
		  Actions ac=new Actions(driver);
		
		  ac.moveToElement(UsedCarBtnEle).perform();
	  }
	  public void ClkChennai()
	  {
		 mywait.until(ExpectedConditions.visibilityOf(LocationEle)).click();
		 ScrollUpto(scroltoPoPular);
	  }
	  
	  public void ExtractCarsDetails() throws InterruptedException, IOException
	  {
		
		  ScrollUpto(scroltoPoPular);
		  System.out.println("*******************Popular Models List********************");
		  System.out.println("------------------");
		 int a=listOfCarsEle.size();
		 for(int i=0;i<a;i++)
		 {
			
				System.out.print(s+ ":");
				String PopularListData = listOfCarsEle.get(i).getText();
				System.out.println(PopularListData);
				System.out.println("***********************");
			 
				Excelsheet.setCellData(file, "CarDetails", row1, 0, PopularListData);
				row1++;
				js.executeScript("arguments[0].click();", CheckBoxEle.get(i));

				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(10000);

				CarDetailsAftClk(PopularListData);
				js.executeScript("arguments[0].click();", CheckBoxEle.get(i));
				s++;
			 
		 }
	  }
	  
	  
	  public void CarDetailsAftClk(String str) throws IOException
	  {

		 
		  String CarNames,CarPrice,CarLocation;
		  int a=1;
		  Excelsheet.setCellData(file,str,0, 0,"Car Names");
		  Excelsheet.fillYellowColor(file, str, 0, 0);
		  Excelsheet.setCellData(file,str,0, 1,"Car Prices");
		  Excelsheet.fillYellowColor(file, str, 0, 1);
		  Excelsheet.setCellData(file,str,0, 2,"Car Avaliable Location");
		  Excelsheet.fillYellowColor(file, str, 0, 2);
		  for(int i=0;i<CarNamesEle.size();i++)
		  {
			
			  CarNames=CarNamesEle.get(i).getText();
			  System.out.println(a+":"+CarNames);
			  Excelsheet.setCellData(file,str,a,0, CarNames);
			  try
			  {
				  CarLocation=CarAvlocEle.get(i).getText();
			  System.out.println(CarLocation);
			  Excelsheet.setCellData(file,str,a,2, CarLocation);
			  }
			  catch(Exception e)
			  {
				  Excelsheet.setCellData(file,str,a,2, "not Available");
			  }
			  CarPrice=CarPriceEle.get(i).getText();
			  System.out.println(CarPrice);
			  Excelsheet.setCellData(file,str,a,1, CarPrice);
			  System.out.println("--------");
			  a++;
		  }
	  }

	public Boolean VerifyVisibilityUsedCars(String string) 
	{
		
		return (UsedCarBtnEle.getText().equals(string));
	}
	public void VerifyChennai(String string)
	{
		for(WebElement li:AreaList)
		{
			if(li.getText().equals(string))
			{
				System.out.println("Chennai is available in Used cars");
			}
			else
			{
				System.out.println("Chennai is available in Used cars");
			}
		}
		
	}
	public String VerifyUsedCars() {
		
		return driver.getTitle();
	}
	  
	public void SellerDetailsAvaliblity()
	{
		if(sellerDetails.size()>0)
		{
			System.out.println("Seller details are available");
		}
		else
		{
			System.out.println("Seller details are not available");
		}
	}
	
	
	
	   public void cityclick(String string) 
	   {
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions obj = new Actions(driver);
		
		int size = cities.size();
		for (int i = 0; i < size; i++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			obj.moveToElement(UsedCarBtnEle).perform();
//			if(string.equalsIgnoreCase("Delhi") || string.equalsIgnoreCase("Mumbai")) {
//				try 
//				{
//					wait.until(ExpectedConditions.visibilityOf(PopUp));
//					wait.until(ExpectedConditions.invisibilityOf(PopUp));
//				}
//				catch(Exception e)
//				{	}
//				}
			if (string.equalsIgnoreCase(cities.get(i).getText()))
			{
				
				obj.moveToElement(cities.get(i)).click().perform();
				break;
			}
		}
	}
	
	
	//regression
	public void carsPageNavigation(String str)
	{
		String pagetitle=carspagetitle.getText();
		System.out.println(pagetitle);
	}
	  
}
	
	

