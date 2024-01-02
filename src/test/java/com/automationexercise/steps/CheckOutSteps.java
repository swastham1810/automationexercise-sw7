package com.automationexercise.steps;

import com.automationexercise.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckOutSteps {
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        new CheckOutPage().verifyThatCartPageDisplayedCorrectly();
    }

    @When("User Click Proceed To Checkout Button")
    public void userClickProceedToCheckoutButton() {
        new CheckOutPage().clickOnProceedToCheckOutButton();
    }

    @And("User Click Register  Login button")
    public void userClickRegisterLoginButton() {
        new CheckOutPage().clickOnRegisterOrLoginButton();
    }

    @And("User Click Cart button on header menu")
    public void userClickCartButtonOnHeaderMenu() {
        new CheckOutPage().userClickOnCartButtonOnHeaderMenu();
    }

    @Then("User Verify {string} and {string}")
    public void userVerifyAddressDetailsAndReviewYourOrder(String addressDetail, String reviewOrderDetail) {
        Assert.assertEquals(new CheckOutPage().verifyUserCanSeeTheAddressDetailsDisplayed(),
                addressDetail, "Incorrect address detail displayed!");
        Assert.assertEquals(new CheckOutPage().verifyUserCanSeeReviewYourOrderDetailsDisplayed(),
                reviewOrderDetail, "Incorrect review order detail displayed!");
    }

    @And("User Enter description in comment text area {string} and click {string}")
    public void userEnterDescriptionInCommentTextAreaAndClickPlaceOrder(String message, String orderButton) {
        new CheckOutPage().sendMessageForPlacingAnOrderAndClickOnPlaceOrderButton(message);
    }

    @When("User Enter payment details: Name on Card {string} Card Number {string} CVC {string} Expiration date of month {string} and year {string}")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDateOfMonthAndYear(String name, String cardNum, String cvcNum,
                                                                                           String monthExpiry, String yearExpiry) {
        new CheckOutPage().enterPaymentDetails(name, cardNum, cvcNum, monthExpiry, yearExpiry);
    }

    @And("User Click Pay and Confirm Order button")
    public void userClickPayAndConfirmOrderButton() {
        new CheckOutPage().clickOnPayAndConfirmOrder();
    }

    @Then("User Verify success message {string}")
    public void userVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String successMessage) throws InterruptedException {
        Assert.assertEquals(new CheckOutPage().getSuccessMessageForPlacingAnOder(),
                successMessage, "Incorrect message displayed!");
    }

    @Then("User Verify that the delivery address is {string} same address filled at the time registration of account")
    public void userVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String deliveryAddress) {
        Assert.assertEquals(new CheckOutPage().verifyAddressDeliverySameAsRegistrationAccountCreation(),
                deliveryAddress, "Incorrect Delivery address displayed!");
    }

    @And("User Verify that the billing address is {string} same address filled at the time registration of account")
    public void userVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String invoiceAddress) {
        Assert.assertEquals(new CheckOutPage().verifyAddressInvoiceSameAsRegistrationAccountCreation(),
                invoiceAddress, "Incorrect invoice address displayed!");
    }
}
