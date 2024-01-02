@Asha @Regression
Feature: Add And Remove Product to Cart page Functionality
  As a User I would like to Add and remove the products to Cart successfully

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case12
  @Asha @Sanity
  Scenario: User Add Products in Cart
    When    User Click on Products button
    And     User Hover over product and click 'Add to cart'
    And     User click on the 'Continue Shopping' button
    And     User Hover over second product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify both products are added to Cart
    And     User Verify their prices, quantity and total price

  @Test_Case13
  @Asha @Smoke
  Scenario: User Verify Product quantity in the Cart
    When    User Click on View Cart Product
    Then    User Verify product detail is displayed
    And     User Increase quantity to "4"
    And     User Click Add to cart button
    And     User Click View Cart button
    Then    User Verify that product is displayed in cart page with exact quantity

  @Test_Case17
  @Asha @Regression
  Scenario: User Remove Products From Cart
    When    User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    And     User Click 'X' button corresponding to particular product
    Then    User Verify that product is removed from the cart

  @Test_Case22
  @Asha @Regression
  Scenario: User Add to cart from Recommended items
    When    User Scroll to bottom of page
    Then    User Verify 'RECOMMENDED ITEMS' are visible
    And     User Click on 'Add To Cart' on Recommended product
    And     User Click View Cart button
    Then    User Verify that product is displayed in cart page
