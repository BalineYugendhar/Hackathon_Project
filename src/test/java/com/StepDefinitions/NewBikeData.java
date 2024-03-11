package com.StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.Factory.Baseclass;
import com.PageObjects.BikesDataObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewBikeData 
{

	public static WebDriver driver=Baseclass.getDriver();
	BikesDataObjects BD;
	
	@Given("The user should be on the zigwheels.com website Home page")
	public void the_user_should_be_on_the_zigwheels_com_website_home_page() 
	{
		BD=new BikesDataObjects(Baseclass.getDriver());
	}

	@When("user moving over NewBikes")
	public void user_moving_over_new_bikes()
	{
	   BD.MoveOverNewBike();
	}
	
	@When("User clicking the Upcoming Bikes")
	public void user_clicking_the_upcoming_bikes()
	{
		BD.ClckUpComingBikes();
	}
	@When("user selects BikeType in Manfactures")
	public void user_selects_bike_type_in_manfactures() throws IOException
	{
	   BD.SelectHonda();
	}

	@Then("User get Bike Details like BikeNames,BikePrice,LauncDates lesstha 4Lakhs")
	public void user_get_bike_details_like_bike_names_bike_price_launc_dates_lesstha_4lakhs() throws IOException
	{
	  BD.BikeDetails();
	  BD.NavigateHome();
	}
	
	
	
	//smoke
	@Then("Checks whether {string} is present in the header section")
	public void checks_whether_is_present_in_the_header_section(String string)
	{
		boolean txt=BD.VerifyVisibilityNewBikes(string);
		if(txt==true)
		{
			System.out.println("New Bikes Tab is visible on Home Page");
		}
		else
		{
			System.out.println("New Bikes Tab is Not visible on Home Page");
		}
	}


	
	@Then("Checks whether {string} is available in the New Bikes dropdown")
	public void checks_whether_is_available_in_the_new_bikes_dropdown(String string)
	{
	  boolean text=BD.VerifyVisibilityUpcomingBikes(string);
	  if(text==true)
	  {
		  System.out.println("The Upcoming bikes available in New Bikes dropdown in the Home page");
	  }
	  else
	  {
		  System.out.println("The Upcoming bikes not available in New Bikes dropdown in the Home page");  
	  }
	}
	
	
	@When("click on Upcoming Bikes in New Bikes dropdown")
	public void click_on_upcoming_bikes_in_new_bikes_dropdown()
	{
	    BD.MoveOverNewBike();
	    BD.ClckUpComingBikes();
	}

	@Then("Verify navigated to Upcoming Bikes or not")
	public void verify_navigated_to_upcoming_bikes_or_not()
	{
	    
		Assert.assertEquals(BD.VerifyUpcomingPage(),true,"Not navigated to Upcoming Bike page");
	}
	
	@Then("Checks whether Manufacturers tab is available or not in the Upcoming Bikes Page")
	public void checks_whether_manufacturers_tab_is_available_or_not_in_the_upcoming_bikes_page()
	{
	
	  Assert.assertEquals(BD.VisibleManufacturers(), true,"Manufacturers element is not available");
	}
	
	@Then("Verify {string} in Manufacturers dropdown in the Upcoming Bikes page")
	public void verify_in_manufacturers_dropdown_in_the_upcoming_bikes_page(String string) 
	{
	  Assert.assertEquals(BD.VerifyVisiblityHonda(string),true,"Honda Not available in dropdown");
	}
	
	
	@When("select {string} in Manufacturers dropdown in the Upcoming Bikes page")
	public void select_in_manufacturers_dropdown_in_the_upcoming_bikes_page(String string) 
	{
	    BD.ClickHonda(string);
	}

	@Then("BikeNames displayed or not in Upcoming Bikes page")
	public void bike_names_displayed_or_not_in_upcoming_bikes_page()
	{
	    BD.VerifyVisiblityBikeName();
	}
	
	@Then("Upcoming BikePrices displayed or not in Upcoming Bikes page")
	public void upcoming_bike_prices_displayed_or_not_in_upcoming_bikes_page()
	{
	   BD.VerifyVisiblityBikePrice();
	}

	@Then("Upcoming Bike launchDate displayed or not in Upcoming Bikes page")
	public void upcoming_bike_launch_date_displayed_or_not_in_upcoming_bikes_page() 
	{
	   BD.VerifyVisiblityBikeLaunchDate();
	}
	
	
	
	
	
	
	
	@When("user navigates to the New Bikes")
	public void user_navigates_to_the_new_bikes()
	{
	    BD.MoveOverNewBike();
	}

	@Then("user clicks on the Upcomming Bikes")
	public void user_clicks_on_the_upcomming_bikes()
	{
	  BD.ClckUpComingBikes();
	}

	@Then("user the manaufacture dropdown and select Honda")
	public void user_the_manaufacture_dropdown_and_select_honda() throws IOException 
	{
	  BD.SelectHonda();
	}


	@When("user stores the information of all upcoming Honda bikes")
	public void user_stores_the_information_of_all_upcoming_honda_bikes() 
	{
	   BD.AllUpcomingBikeDetails();
	}

	@Then("User should be redirected to the Home page")
	public void user_should_be_redirected_to_the_home_page()
	{
	   BD.NavigateHome();
	}

	@Then("user clicks on the Bikes showroom")
	public void user_clicks_on_the_bikes_showroom() 
	{
	 BD.MoveOverNewBike();
	 BD.clkBikeShowroom();
	}

	@When("user navigates to Electric vechicles")
	public void user_navigates_to_electric_vechicles()
	{
	   BD.MoveoverEleVechicle();
	}

	@Then("user clicks on the Bajaj chetak")
	public void user_clicks_on_the_bajaj_chetak()
	{
	   BD.MoveoverElescooter();
	   BD.clkBajajchetak();
	   BD.NavigateHome();
	}

	
	
}
