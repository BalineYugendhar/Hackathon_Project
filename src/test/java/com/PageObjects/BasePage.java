package com.PageObjects;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilies.Excelsheet;

public class BasePage
{
	WebDriver driver;

	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String file = System.getProperty("user.dir") + "/src/test/resources/Excel/NewBikesDetails.xlsx";

	// Home Logo Element
	@FindBy(xpath = "//img[@data-track-label='zw-header-logo']")
	WebElement HomeEle;

	
	//navigates to home page
	public void NavigateHome()
	{
		HomeEle.click();
	}

	
	//scrolling upto element
	public void ScrollUpto(WebElement Scroll)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Scroll);
	}

	
	//entering bike details to excel
	public void setDataToExcel(String Sheet, String txt, int row, int col) throws IOException 
	{
		Excelsheet.setCellData(file, Sheet, row, col, txt);
	}

}