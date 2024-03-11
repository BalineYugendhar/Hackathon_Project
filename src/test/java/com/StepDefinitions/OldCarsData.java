package com.StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.Factory.Baseclass;
import com.PageObjects.UsedCarsObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OldCarsData
{
  
	UsedCarsObjects UC;//=new UsedCarsObjects(Baseclass.getDriver());
	@Given("user should be on the zigwheels.com website Home page")
	public void user_should_be_on_the_zigwheels_com_website_Home_page()
	{
		UC=new UsedCarsObjects(Baseclass.getDriver());
		
	}

	@When("User moveover to Used Cars and Click Chennai Location")
	public void user_moveover_to_used_cars_and_click_chennai_location()
	{
	   UC.UsedCarClk();
	   UC.ClkChennai();
	}

	@Then("Extracting used Car Details by selecting each car model from popular models list")
	public void extracting_used_car_details_by_selecting_each_car_model_from_popular_models_list() throws InterruptedException, IOException
	{
	    UC.ExtractCarsDetails();
	    UC.NavigateHome();
	}
	
	
	
	
	@Then("Verify whether {string} is available in the header section")
	public void verify_whether_is_available_in_the_header_section(String string) 
	{
	   Assert.assertEquals(UC.VerifyVisibilityUsedCars(string),true,"Used Cars Not available");
	   if(UC.VerifyVisibilityUsedCars(string))
	   {
		   System.out.println("Used Cars tab is visible");
	   }
	   else
	   {
		   System.out.println("Used Cars tab is not visible");
	   }
	}

	@When("user navigates to the Used cars dropdown")
	public void user_navigates_to_the_used_cars_dropdown() 
	{
		UC.UsedCarClk();
	}

	@Then("Verify whether The Location {string} is available in the  dropdown")
	public void verify_whether_the_location_is_available_in_the_dropdown(String string) 
	{
	   UC.VerifyChennai(string);
	}

	@When("user clicks on the Chennai")
	public void user_clicks_on_the_chennai()
	{
	  UC.ClkChennai();
	}

	@Then("User should be navigated to Used cars tab")
	public void user_should_be_navigated_to_used_cars_tab() 
	{
	   String act_title="Used Cars in Chennai";
	   if(UC.VerifyUsedCars().contains(act_title))
	   {
		   System.out.println("user in used cars page");
	   }
	   else
	   {
		   System.out.println("user is not in used cars page");
	   }
	   
	}

	@Then("Verify whether seller details available or not")
	public void verify_whether_seller_details_available_or_not() 
	{
	  UC.SellerDetailsAvaliblity();
	  UC.NavigateHome();
	}
	
	
	@When("User clicks on the {string} button in Used Cars tab")
	public void user_clicks_on_the_button_in_used_cars_tab(String string)
	{
	  UC.cityclick(string);
	}

	@Then("User should be navigated to the Used Cars with that {string}")
	public void user_should_be_navigated_to_the_used_cars_with_that(String string)
	{
	  UC.carsPageNavigation(string);
	  UC.NavigateHome();
	}


}
