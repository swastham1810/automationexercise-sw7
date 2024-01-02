@Asha @Regression
Feature: Login Functionality
  As a User I would like to Login the application

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case2
  @Asha @Sanity
  Scenario: User Login with correct email and password
    When    User Click on 'Signup / Login' button
    Then    User verify 'New User Signup!' is visible
    When    User Enter name "Asha" and email address "akakadiya@gmail.com"
    And     User click 'Signup' button
    Then    User Verify that ENTER ACCOUNT INFORMATION is visible
    When    User Fill details: Title "Mrs." Password "Ash123" Day "18" Month "October" Year "1984"
    And     User Select checkbox 'Sign up for our newsletter!'
    And     User Select checkbox 'Receive special offers from our partners!'
    And     User Fill details: FirstName "Asha" LastName "Kakadiya" Company "Prishn" Address "47" AddressLine "BaconLane" Country "United States" State "America" City "America" Zipcode "HA8 5AU" Mobile Number "07868504723"
    And     User Click 'Create Account button'
    Then    User Verify that ACCOUNT CREATED! is visible
    When    User Click 'Continue' button
    And     User Click 'Logout' Button
    When    User Click on 'Signup / Login' button
    And     User Verify 'Login to your account' is visible
    And     User Enter email address "akakadiya@gmail.com" and password "Ash123"
    And     User click on 'login' button
    Then    User Verify that Logged in as username is visible
    And     User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible

  @Test_Case3
  @Asha @Smoke
  Scenario:  User Login with incorrect email and password
    When     User Click on 'Signup / Login' button
    And      User Verify 'Login to your account' is visible
    And      User Enter email address "akakadiya123@gmail.com" and password "ash123"
    And      User click on 'login' button
    Then     User Verify error message 'Your email or password is incorrect!' is visible

  @Test_Case4
  @Asha @Regression
  Scenario:  User Logout Successfully
    When     User Click on 'Signup / Login' button
    Then     User verify 'New User Signup!' is visible
    When     User Enter name "Harry" and email address "harry_potter@gmail.com"
    And      User click 'Signup' button
    Then     User Verify that ENTER ACCOUNT INFORMATION is visible
    When     User Fill details: Title "Mr." Password "Harry123" Day "28" Month "January" Year "2000"
    And      User Select checkbox 'Sign up for our newsletter!'
    And      User Select checkbox 'Receive special offers from our partners!'
    And      User Fill details: FirstName "Harry" LastName "Potter" Company "H P Ltd" Address "30" AddressLine "Harry Porter Lane" Country "United States" State "America" City "America" Zipcode "HP5 9PA" Mobile Number "07598564532"
    And      User Click 'Create Account button'
    Then     User Verify that ACCOUNT CREATED! is visible
    When     User Click 'Continue' button
    And      User Click 'Logout' Button
    And      User Click on 'Signup / Login' button
    And      User Verify 'Login to your account' is visible
    When     User Enter email address "harry_potter@gmail.com" and password "Harry123"
    And      User click on 'login' button
    Then     User Verify that User Logged in as username is visible
    And      User Click 'Logout' Button
    Then     User Verify that user is navigated to login page