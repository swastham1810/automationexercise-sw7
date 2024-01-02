@Asha @Regression
Feature: Register User
  As a User I would like to register the application successfully

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case1
  @Asha @Sanity
  Scenario: Verify that User should able to register successfully
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
    Then    User Verify that Logged in as username is visible
    When    User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible
    And     User click a 'Continue' button

  @Test_Case5
  @Asha @Smoke
  Scenario:  User Register with existing email
    When     User Click on 'Signup / Login' button
    Then     User verify 'New User Signup!' is visible
    When     User Enter name "Ruby" and email address "ruby_jackson@gmail.com"
    And      User click 'Signup' button
    Then     User Verify that ENTER ACCOUNT INFORMATION is visible
    When     User Fill details: Title "Mrs." Password "Ruby123" Day "20" Month "December" Year "1984"
    And      User Select checkbox 'Sign up for our newsletter!'
    And      User Select checkbox 'Receive special offers from our partners!'
    And      User Fill details: FirstName "Ruby" LastName "Jackson" Company "R J Ltd" Address "50" AddressLine "MarshLane" Country "United States" State "America" City "America" Zipcode "HA5 9AU" Mobile Number "07428691002"
    And      User Click 'Create Account button'
    Then     User Verify that ACCOUNT CREATED! is visible
    When     User Click 'Continue' button
    And      User Click 'Logout' Button
    And      User Click on 'Signup / Login' button
    And      User Enter name "Ruby "and already registered email address"ruby_jackson@gmail.com"
    And      User click 'Signup' button
    Then     User Verify error 'Email Address already exist!' is visible