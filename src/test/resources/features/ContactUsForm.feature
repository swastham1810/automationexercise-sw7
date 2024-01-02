@Asha @Regression
Feature: Contact Us Form Feature
  As a User I would like to register the application successfully

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case6
  @Asha @Sanity
  Scenario: User should able to FillOut Contact Us Form
    When    User Click on  'Contact Us' button
    Then    User Verify the 'GET IN TOUCH' is visible
    And     User Enter name "Asha" email "akakadiya@gmail.com" subject "General" and message "Improvements Needed!"
    And     User Upload file 'C:\Users\kakad\IdeaProjects\automationexercise-sw7\src\info.txt'
    And     User Click  on 'Submit' button
    And     User Click OK button
    Then    User Verify success message 'Success! Your details have been submitted successfully.' is visible
    And     User Click Home button
    Then    User verify that landed to home page successfully
