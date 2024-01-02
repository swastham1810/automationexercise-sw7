@Asha @Regression
Feature: ScrollUp and Scroll Down Functionality
  As a User I would like to ScrollUp and ScrollDown the page successfully

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case25
  @Asha @Sanity
  Scenario: User Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    When    User Scroll down to footer
    Then    User Verify text 'SUBSCRIPTION'
    And     User Click on arrow at bottom right side to move upward
    Then    User Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @Test_Case26
  @Asha @Smoke
  Scenario: User Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    When    User Scroll down to footer
    Then    User Verify text 'SUBSCRIPTION'
    And     User Scroll up page to top
    Then    User Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
