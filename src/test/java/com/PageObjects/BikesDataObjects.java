package com.PageObjects;


import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilies.Excelsheet;

public class BikesDataObjects extends BasePage
{
	
	public BikesDataObjects(WebDriver driver)
	{
		super(driver);
	}	
	
	String BikeType;
	String file=System.getProperty("user.dir")+"/src/test/resources/Excel/NewBikesDetails.xlsx";
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
	double txt;
	int row1=1;
	
	//Elements
	@FindBy(xpath="//li/a[contains(text(),'New Bikes')]")
	WebElement NewBikesEle;
	
	@FindBy(xpath="//li/span[contains(text(),'Upcoming Bikes')]")
	WebElement UpcomingBikeEle;
	
	@FindBy(id="makeId")
	WebElement bikeTypeEle ;
	
	@FindBy(xpath="//span[contains(text(),'View More')]")
	WebElement ViewMoreEle;
	
	@FindBy(xpath="//a[@data-track-label='model-name']")
	List<WebElement> bikeNameEle;
	
	@FindBy(xpath="//div[@class='b fnt-15']")
	List<WebElement> bikePriceEle;
	
	@FindBy(xpath="//div[@class='clr-try fnt-14']")
	List<WebElement> bikeLaunchDateEle;
	
	
	@FindBy(xpath="//span[contains(text(),'Bike Showrooms')]")
	WebElement BikeShowroomEle;
	
	
	@FindBy(xpath="//a[@href='/electric-vehicles' and @class='c-p clr-ev']")
	WebElement Electricvechicle;
	
	@FindBy(xpath="//a[contains(text(),'Electric Scooters')]")
	WebElement ElectricScooters;
	
	@FindBy(xpath="//span[contains(text(),' Bajaj Chetak')]")
	WebElement BajajChetak;
	
	@FindBy(xpath="//select/option[@data-url='honda']")
	WebElement Hondaavailablity;
	
	
	//cursor on New Bikes Tab
	public void MoveOverNewBike()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(NewBikesEle).perform();
		
	}
	
	//Clicking Upcoming Bikes
	public void ClckUpComingBikes()
	{
		UpcomingBikeEle.click();
	}
	
	//selecting honda in manufacturers dropdown
	public void SelectHonda() throws IOException
	{
		Select sc=new Select(bikeTypeEle);
		BikeType=Excelsheet.getCellData(file, "BikeType", 1, 0);
		sc.selectByVisibleText(BikeType);
	}
	
	//Extracting Bike details below 4 Lakhs
	public void BikeDetails() throws IOException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		ScrollUpto(ViewMoreEle);
		js.executeScript("arguments[0].click();",ViewMoreEle);
		System.out.println("************Upcoming Bikes of Honda Lessthan 4Lakhs*****************");
		for (int i = 0; i < bikeNameEle.size(); i++) 
		{
			String BikePrice = bikePriceEle.get(i).getText();
			String BikeName=bikeNameEle.get(i).getText();
			String BikeLaunchDate=bikeLaunchDateEle.get(i).getText();
			if (BikePrice.contains("Lakh"))
			{
				txt = Double.parseDouble(BikePrice.replaceAll("[Rs. Lakhs]", "")) / 100;

			} else 
			{
				txt = Double.parseDouble(BikePrice.replaceAll("[Rs. ,]", "")) / 100000;

			}
			if (txt < 4)
			{
				
				System.out.println(BikeName);
				setDataToExcel("BikeDetails",BikeName,row1,0);
				System.out.println(BikePrice);
				setDataToExcel("BikeDetails",BikePrice,row1,1);
				System.out.println(BikeLaunchDate);
				setDataToExcel("BikeDetails",BikeLaunchDate,row1,2);
				System.out.println("------------------------------");
				row1++;
				
			}

		}
	}
	
	
	
	
	//verification smokes and regression methods starts
	
	public boolean VerifyVisibilityNewBikes(String str)
	{
		return (NewBikesEle.getText().equals(str));
		
	}
	
	
	public boolean VerifyVisibilityUpcomingBikes(String str)
	{
		return (UpcomingBikeEle.getText().equals(str));
		
	}
	
	
	public boolean VerifyUpcomingPage()
	{
		String exp_title="Upcoming Bikes";
		return (driver.getTitle().contains(exp_title));
	}
	
	
	public boolean VisibleManufacturers()
	{
		return bikeTypeEle.isDisplayed();
	
	}
	
	public boolean VerifyVisiblityHonda(String str1)
	{
		return (Hondaavailablity.getText().equals(str1));
	}
	
	public void ClickHonda(String str1)
	{
		Select sc=new Select(bikeTypeEle);
		sc.selectByVisibleText(str1);
	
	}
	
	public void VerifyVisiblityBikeName()
	{
		if(bikeNameEle.size()>0)
		{
			System.out.println("Bikes name is visible");
		}
		else
		{
			System.out.println("Bikes name is not visible");
		}
	}
	
	public void VerifyVisiblityBikePrice()
	{
		if(bikePriceEle.size()>0)
		{
			System.out.println("Bikes Price visible");
		}
		else
		{
			System.out.println("Bikes price not visible");
		}
	}
	
	
	public void VerifyVisiblityBikeLaunchDate()
	{
		if(bikeLaunchDateEle.size()>0)
		{
			System.out.println("LaunchDate is visible");
		}
		else
		{
			System.out.println("LaunchDate is not visible");
		}
	}
	
	
	public void AllUpcomingBikeDetails()
	{
		
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			ScrollUpto(ViewMoreEle);
			js.executeScript("arguments[0].click();",ViewMoreEle);
			for (int i = 0; i < bikeNameEle.size(); i++) 
			{
				String BikePrice = bikePriceEle.get(i).getText();
				String BikeName=bikeNameEle.get(i).getText();
				String BikeLaunchDate=bikeLaunchDateEle.get(i).getText();
				System.out.println(BikeName);
				System.out.println(BikePrice);
				System.out.println(BikeLaunchDate);
				System.out.println("---------------");
			}
	}
	
	public void clkBikeShowroom()
	{
		BikeShowroomEle.click();
	}
	
	public void MoveoverEleVechicle()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(BikeShowroomEle).perform();
	}
	
	public void MoveoverElescooter()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(ElectricScooters).perform();
	}
	
	public void clkBajajchetak()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",BajajChetak );
	}
}
