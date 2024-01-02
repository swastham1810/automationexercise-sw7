package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//table[@id='cart_info_table']")
    WebElement cartInfoTablePageForProducts;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckOutButton;
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement headerMenuCartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(), 'Address Details')]")
    WebElement verifyAddressDetailsText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(), 'Review Your Order')]")
    WebElement verifyReviewYourOrderText;
    @CacheLookup
    @FindBy(xpath = "//textarea[@class ='form-control']")
    WebElement textAreaToPassMessageForOrder;
    @CacheLookup
    @FindBy(xpath = "//a[@class ='btn btn-default check_out']")
    WebElement placeOrderButton;
    @CacheLookup
    @FindBy(name = "name_on_card")
    WebElement nameOnCard;
    @CacheLookup
    @FindBy(name = "card_number")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(name = "cvc")
    WebElement cardCVCNumber;
    @CacheLookup
    @FindBy(name = "expiry_month")
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(name = "expiry_year")
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")
    WebElement payAndConfirmOrder;
    @CacheLookup
    @FindBy(xpath = "//p[contains(text(), 'Congratulations! Your order has been confirmed!')]")
    //@FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]")
    //@FindBy(xpath = "//div[@id='success_message']")
    WebElement successMessage;
    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_delivery']/li[5]")
    WebElement addressDelivery;
    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_invoice']/li[5]")
    WebElement addressInvoice;


    public void verifyThatCartPageDisplayedCorrectly() {
        log.info("Verify the cart page displayed correctly : " + cartInfoTablePageForProducts.toString());
        cartInfoTablePageForProducts.isDisplayed();
    }


    public void clickOnProceedToCheckOutButton() {
        clickOnElement(proceedToCheckOutButton);
        log.info("Click On Proceed to CheckOut Button : " + proceedToCheckOutButton.toString());
    }

    public void clickOnRegisterOrLoginButton() {
        clickOnElement(registerLoginButton);
        log.info("Click On Register Or Login Button : " + registerLoginButton.toString());
    }

    public void userClickOnCartButtonOnHeaderMenu() {
        clickOnElement(headerMenuCartLink);
        log.info("Click On Cart button on top menu header: " + headerMenuCartLink.toString());
    }

    public String verifyUserCanSeeTheAddressDetailsDisplayed() {
        log.info("Verify User can see the address details is displayed: " + verifyAddressDetailsText.toString());
        return getTextFromElement(verifyAddressDetailsText);

    }

    public String verifyUserCanSeeReviewYourOrderDetailsDisplayed() {
        log.info("Verify User can see Review Your order details is displayed:" + verifyReviewYourOrderText.toString());
        return getTextFromElement(verifyReviewYourOrderText);
    }

    public void sendMessageForPlacingAnOrderAndClickOnPlaceOrderButton(String message) {
        sendTextToElement(textAreaToPassMessageForOrder, message);
        clickOnElement(placeOrderButton);
        log.info("Send message for placing an order and click on place order button:");
    }

    public void enterPaymentDetails(String name, String cardNum, String cvcNum,
                                    String monthExpiry, String yearExpiry) {
        sendTextToElement(nameOnCard, name);
        sendTextToElement(cardNumber, cardNum);
        sendTextToElement(cardCVCNumber, cvcNum);
        sendTextToElement(expiryMonth, monthExpiry);
        sendTextToElement(expiryYear, yearExpiry);
        log.info("Enter payment details:");
    }

    public void clickOnPayAndConfirmOrder() {
        //clickOnElement(payAndConfirmOrder);
        javaExecutorScriptExecuteScriptToClick(payAndConfirmOrder);
        log.info("Click On pay and confirm order button: " + payAndConfirmOrder.toString());
    }

    public String getSuccessMessageForPlacingAnOder() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Verify the success message for placing an order correctly : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public String verifyAddressDeliverySameAsRegistrationAccountCreation() {
        log.info("Verify Address delivery same as Registration account creation : " + addressDelivery.toString());
        return getTextFromElement(addressDelivery);
    }

    public String verifyAddressInvoiceSameAsRegistrationAccountCreation() {
        log.info("Verify Address Invoice same as Registration account creation : " + addressInvoice.toString());
        return getTextFromElement(addressInvoice);
    }

}
