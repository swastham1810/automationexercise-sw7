@Asha @Regression
Feature: Product Subscription Functionality
  As a User I would like to Subscribe the products

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case10
  @Asha @Sanity
  Scenario: User Verify Subscription in home page
    When    User Scroll down to footer
    Then    User Verify text 'SUBSCRIPTION'
    When    User Enter email address "akakadiya@gmail.com" in input and click arrow button
    Then    User Verify the success message 'You have been successfully subscribed!' is visible

  @Test_Case11
  @Asha @Smoke
  Scenario: User Verify Subscription in Cart page
  When      User click on Cart button
  And       User Scroll down to footer
  Then      User Verify text 'SUBSCRIPTION'
  And       User Enter email address "akakadiya@gmail.com" in input and click arrow button
  Then      User Verify the success message 'You have been successfully subscribed!' is visible
