@Asha @Regression
Feature: Search Product Functionality
  As a User I would like to search products Functionality

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case9
  @Asha @Sanity
  Scenario: Use Search Product
    When    User Click on Products button
    Then    User Verify user is navigated to 'ALL PRODUCTS' page successfully
    When    User Enter product name 'Tops' in search input and click search button
    Then    User can see 'SEARCHED PRODUCTS' is visible
    And     User Verify all the products related to search are visible

  @Test_Case20
  @Asha @Smoke
  Scenario: User Search Products and Verify Cart After Login
    When    User Click on Products button
    Then    User Verify user is navigated to 'ALL PRODUCTS' page successfully
    When    User Enter product name 'Tops' in search input and click search button
    Then    User can see 'SEARCHED PRODUCTS' is visible
    And     User Verify all the products related to search are visible
    And     User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    When    User Click on 'Signup / Login' button
    Then    User verify 'New User Signup!' is visible
    When    User Enter name "Asha" and email address "gkp@gmail.com"
    And     User click 'Signup' button
    Then    User Verify that ENTER ACCOUNT INFORMATION is visible
    When    User Fill details: Title "Mrs." Password "GKP123" Day "26" Month "October" Year "1984"
    And     User Select checkbox 'Sign up for our newsletter!'
    And     User Select checkbox 'Receive special offers from our partners!'
    And     User Fill details: FirstName "Asha" LastName "Karelia" Company "Swastham" Address "902" AddressLine "Pal" Country "India" State "Gujarat" City "Surat" Zipcode "365601" Mobile Number "9498236541"
    And     User Click 'Create Account button'
    Then    User Verify that ACCOUNT CREATED! is visible
    When    User Click 'Continue' button
    And     User Click 'Logout' Button
    When    User Click on 'Signup / Login' button
    And     User Verify 'Login to your account' is visible
    And     User Enter email address "gkp@gmail.com" and password "GKP123"
    And     User click on 'login' button
    Then    User Verify that Logged in as username is visible
    And     User Again, go to Cart page
    Then    User Verify that those products are visible in cart after login as well
