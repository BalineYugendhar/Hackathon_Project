Feature: Identify New Bikes

  Scenario: Display UpComing Bikes details which should be lessthan 4Lakhs
    Given The user should be on the zigwheels.com website Home page
    When user moving over NewBikes
    And User clicking the Upcoming Bikes
    And user selects BikeType in Manfactures
    Then User get Bike Details like BikeNames,BikePrice,LauncDates lesstha 4Lakhs

  Scenario: Extract and Display Used Car Details By Selecting Each Car Model from Popular Models List
    Given user should be on the zigwheels.com website Home page
    When User moveover to Used Cars and Click Chennai Location
    Then Extracting used Car Details by selecting each car model from popular models list

  Scenario: User Capture Error Message By Entering Invalid User Details
    Given user should on the zigwheels.com website Home page
    When User clicks the Login/SignUp button
    And User click on Google button to SignUp
    And User enter invalid emailId in Email/Phone field
    Then User capture Error message after entering invalid email
