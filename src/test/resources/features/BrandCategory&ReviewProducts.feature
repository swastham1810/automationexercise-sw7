@Asha @Regression
Feature: View Category, Brand And review of the Cart page Functionality
  As a User
  I would like to View Category, Brand And review of the Cart page Functionality Successfully

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case18
  @Asha @Sanity
  Scenario: User View Category Products
    When    User Verify that categories are visible on left side bar
    When    User Click on 'Women' category
    And     User Click on any category link under Women category, for example: Dress
    Then    User Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    And     User is On left side bar, click on any sub-category link of 'Men' category
    Then    User Verify that user is navigated to that category page

  @Test_Case19
  @Asha @Smoke
  Scenario: User View & Cart Brand Products
    When    User Click on Products button
    Then    User Verify that Brands are visible on left side bar
    And     User Click on any brand name 'POLO'
    Then    User Verify that user is navigated to brand page and brand products are displayed
    And     User is On left side bar, click on any other brand link 'BIBA'
    Then    User Verify that user is navigated to that brand page and can see products

  @Test_Case21
  @Asha @Regression
  Scenario: User Add review on product
    When    User Click on Products button
    Then    User Verify user is navigated to ALL PRODUCTS page successfully
    And     User Click on View Cart Product
    Then    User Verify  that 'WRITE YOUR REVIEW' is visible
    And     User Enter name "Asha" email "akakadiya@gmail.com" and review "I have received my order on time, Thank you!"
    And     User Click Submit button
    Then    User Verify the success message 'Thank you for your review.'
