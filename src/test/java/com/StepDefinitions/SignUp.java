package com.StepDefinitions;

import java.io.IOException;

import com.Factory.Baseclass;
import com.PageObjects.SignUpObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp
{

	SignUpObjects SU;
	@Given("user should on the zigwheels.com website Home page")
	public void user_should_on_the_zigwheels_com_website_Home_page()
	{
		SU=new SignUpObjects(Baseclass.getDriver());
		
		
	}

	@When("User clicks the Login\\/SignUp button")
	public void user_clicks_the_login_sign_up_button() 
	{
	   SU.LoginClk();
	}

	@When("User click on Google button to SignUp")
	public void user_click_on_google_button_to_sign_up() 
	{
	   SU.GoogleEle();
		
	}

	@When("User enter invalid emailId in Email\\/Phone field")
	public void user_enter_invalid_email_id_in_email_phone_field() throws IOException 
	{
	   SU.EnterInvalidMail();
		
		
	}

	@Then("User capture Error message after entering invalid email")
	public void user_capture_error_message_after_entering_invalid_email() throws IOException 
	{
	  SU.Errormsg();
	 
	}
	
	
	@Then("Checks whether login\\/signup is available in the zigwheels Home Page")
	public void checks_whether_login_signup_is_available_in_the_zigwheels_home_page()
	{
	    SU.VerifyVisibilityLogin();
	}

	@When("user click on the login tab")
	public void user_click_on_the_login_tab()
	{
	 
		SU.LoginClk();
	}

	@Then("User should be navigated to login\\/register tab")
	public void user_should_be_navigated_to_login_register_tab() 
	{
	   SU.verifyLoginPage();
	}
	
	
	
	
	
	@When("user clicks on the login\\/SingUp tab")
	public void user_clicks_on_the_login_sing_up_tab() 
	{
	  SU.LoginClk();
	}

	@When("user clicks on the facebook")
	public void user_clicks_on_the_facebook() 
	{
	   SU.facebookClk();
	}

	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_the_login_page()
	{
	   SU.SwitchToFacebook();
	}

	@When("user is on the login page")
	public void user_is_on_the_login_page() 
	{
	   SU.facebookpage();
	}

	@Then("User checks whether the error message is displayed")
	public void user_checks_whether_the_error_message_is_displayed() throws IOException
	{
	   SU.FacebookErrorTextMsg();
	}
	
}
