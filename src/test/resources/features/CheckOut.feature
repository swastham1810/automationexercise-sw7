@Asha @Regression
Feature: CheckOut Functionality
  As a User,
  I would Place an Order: Register while Checkout
  I would Place an Order: Register before Checkout
  I would Place an Order: Login before Checkout
  I should be able to verify address details in Checkout page

  Background:
    Given     User Launch browser
    When      User navigate to URL "https://automationexercise.com/"
    Then      User should be able to verify that homepage visible successfully

  @Test_Case14
  @Asha @Sanity
  Scenario: User Place an Order: Register while Checkout
    When    User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    When    User Click Proceed To Checkout Button
    And     User Click Register  Login button
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
    And     User Click Cart button on header menu
    And     User Click Proceed To Checkout Button
    Then    User Verify 'Address Details' and 'Review Your Order'
    And     User Enter description in comment text area "Please deliver it on time." and click 'Place Order'
    When    User Enter payment details: Name on Card "A Kakadiya" Card Number "0000000000000000" CVC "526" Expiration date of month "02" and year "2026"
    And     User Click Pay and Confirm Order button
    Then    User Verify success message 'Congratulations! Your order has been confirmed!'
    And     User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible
    And     User click a 'Continue' button

  @Test_Case15
  @Asha @Smoke
  Scenario:  User Place an Order: Register before Checkout
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
    When    User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    And     User Click Proceed To Checkout Button
    Then    User Verify 'Address Details' and 'Review Your Order'
    And     User Enter description in comment text area "Please deliver it on time." and click 'Place Order'
    When    User Enter payment details: Name on Card "A Kakadiya" Card Number "0000000000000000" CVC "526" Expiration date of month "02" and year "2026"
    And     User Click Pay and Confirm Order button
    Then    User Verify success message 'Congratulations! Your order has been confirmed!'
    And     User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible
    And     User click a 'Continue' button

  @Test_Case16
  @Asha @Regression
  Scenario: User Place an Order: Login before Checkout
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
    When    User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    And     User Click Proceed To Checkout Button
    Then    User Verify 'Address Details' and 'Review Your Order'
    And     User Enter description in comment text area "Please deliver it on time." and click 'Place Order'
    When    User Enter payment details: Name on Card "A Kakadiya" Card Number "0000000000000000" CVC "526" Expiration date of month "02" and year "2026"
    And     User Click Pay and Confirm Order button
    Then    User Verify success message 'Congratulations! Your order has been confirmed!'
    And     User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible

  @Test_Case23
  @Asha @Regression
  Scenario:  User Verify address details in checkout page
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
    When    User Hover over product and click 'Add to cart'
    And     User Click View Cart button
    Then    User Verify that cart page is displayed
    And     User Click Proceed To Checkout Button
    Then    User Verify that the delivery address is 'BaconLane' same address filled at the time registration of account
    And     User Verify that the billing address is 'BaconLane' same address filled at the time registration of account
    And     User Click on a 'Delete Account' button
    Then    User Verify that ACCOUNT DELETED! is visible
    And     User click a 'Continue' button










