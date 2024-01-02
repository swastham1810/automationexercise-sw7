@Asha @Regression
Feature: Test Cases Page Functionality
  As a User I would like to verify the Test Cases Functionality

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case7
  @Asha @Sanity
  Scenario: User Verify Test Cases Page
    When    User Click on Test Cases button
    Then    User Verify user is navigated to test cases page successfully