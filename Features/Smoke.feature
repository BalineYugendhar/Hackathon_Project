Feature: Identify New Bikes Smoke

@Smoke
  Scenario: Validate the New bikes tab in the Home page
    Given The user should be on the zigwheels.com website Home page
		Then Checks whether "<tab name>" is present in the header section
		Examples:
		|		tab name		|
		|		New Bikes		|
		
@Smoke
 Scenario: Verify the Upcoming bikes in New Bikes dropdown in the Home page
    Given The user should be on the zigwheels.com website Home page
		Then Checks whether "<tab name>" is available in the New Bikes dropdown
		Examples:
		|		tab name		|
		|		Upcoming Bikes		|
		
@Smoke
Scenario: Validate user navigate to Upcoming Bikes page
     Given The user should be on the zigwheels.com website Home page
     When click on Upcoming Bikes in New Bikes dropdown
     Then Verify navigated to Upcoming Bikes or not
     
@Smoke
  Scenario: Validate the Manufacturers tab in the Upcoming Bikes page
    Given The user should be on the zigwheels.com website Home page
		Then Checks whether Manufacturers tab is available or not in the Upcoming Bikes Page
		
@Smoke
  Scenario: Verify Honda in Manufacturers dropdown in the Upcoming Bikes page
    Given The user should be on the zigwheels.com website Home page
     Then Verify "<tab name>" in Manufacturers dropdown in the Upcoming Bikes page
     Examples:
		|		tab name		|
		|		Honda       |
		
@Smoke
  Scenario: Verify Bike Names are displayed in Upcoming Bike Page
    Given The user should be on the zigwheels.com website Home page
    When select "<tab name>" in Manufacturers dropdown in the Upcoming Bikes page
    Then BikeNames displayed or not in Upcoming Bikes page
     Examples:
		|		tab name		|
		|		Honda       |
		
@Smoke
  Scenario: Verify Bike Prices are displayed in Upcoming Bike Page
    Given The user should be on the zigwheels.com website Home page
    Then Upcoming BikePrices displayed or not in Upcoming Bikes page
    
@Smoke
  Scenario: Verify LaunchDate are displayed in Upcoming Bike Page
    Given The user should be on the zigwheels.com website Home page
    Then Upcoming Bike launchDate displayed or not in Upcoming Bikes page
    
@Smoke
  Scenario: Validate the Used cars tab in the Home page
    Given user should be on the zigwheels.com website Home page
		Then Verify whether "<tab name>" is available in the header section
		Examples:
		|		tab name		|
		|		Used Cars		|
		
@Smoke	
	Scenario: Verifying the dropdown of Used cars
		Given user should be on the zigwheels.com website Home page
		When user navigates to the Used cars dropdown
		Then Verify whether The Location "<tab name>" is available in the  dropdown
		Examples:
		|		tab name		|
		|		Chennai		|
		
		
@Smoke
	Scenario: Verifying the navigation to the Chennai Used Cars
		Given user should be on the zigwheels.com website Home page
		When user clicks on the Chennai
		Then User should be navigated to Used cars tab
		

@Smoke
	Scenario: Verify seller details in Used Cars  
		Given user should be on the zigwheels.com website Home page
		Then Verify whether seller details available or not
		
@Smoke
	Scenario: Verify the login/signup button in zigwheels
		Given user should on the zigwheels.com website Home page
		Then Checks whether login/signup is available in the zigwheels Home Page
		
		
@Smoke
	Scenario: Navigating to the login/register tab
		Given user should on the zigwheels.com website Home page
		When user click on the login tab
		Then User should be navigated to login/register tab	

   



