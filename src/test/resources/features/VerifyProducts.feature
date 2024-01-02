@Asha @Regression
Feature: Product verification Page Functionality
  As a User I would like to verify the Product page Functionality

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case8
  @Asha @Sanity
  Scenario: User Verify All Products and product detail page
    When    User Click on Products button
    Then    User Verify user is navigated to 'ALL PRODUCTS' page successfully
    And     The products list is visible
    When    User Click on View Cart Product
    Then    User is landed to product detail page
    And     User Verify that detail detail is visible: product name, category, price, availability, condition, brand


