Feature: Identify New Bikes Regression

  @Regression
  Scenario: Navigates to the Honda Bikes page
    Given The user should be on the zigwheels.com website Home page
    When user navigates to the New Bikes
    Then user clicks on the Upcomming Bikes
    And user the manaufacture dropdown and select Honda

  @Regression
  Scenario: Extract the Honda Bikes details
    Given The user should be on the zigwheels.com website Home page
    When user stores the information of all upcoming Honda bikes
    Then User should be redirected to the Home page

  @Regression
  Scenario: Navigates to the Bikes showroom page
    Given The user should be on the zigwheels.com website Home page
    When user navigates to the New Bikes
    Then user clicks on the Bikes showroom

  @Regression
  Scenario: Navigates to Bajaj chetak page
    Given The user should be on the zigwheels.com website Home page
    When user navigates to Electric vechicles
    Then user clicks on the Bajaj chetak

  @Regression
  Scenario Outline: Navigating to the Used Cars in that location
    Given user should be on the zigwheels.com website Home page
    When User clicks on the "<location name>" button in Used Cars tab
    Then User should be navigated to the Used Cars with that "<location name>"

    Examples: 
      | location name |
      | Delhi         |
      | Hyderabad     |
      | Mumbai        |
      | Bangalore     |
      | Jaipur        |
      | Chennai       |
      | Kolkata       |
      | Pune          |
      | Ahmedabad     |

  @Regression
  Scenario: Navigate to the SignUp/Login tab
    Given user should on the zigwheels.com website Home page
    When user clicks on the login/SingUp tab
    And user clicks on the facebook
    Then User should be navigated to the login page

  @Regression
  Scenario: Verifing the error message is displayed in Sign in tab
    Given user should on the zigwheels.com website Home page
    When user is on the login page
    Then User checks whether the error message is displayed
