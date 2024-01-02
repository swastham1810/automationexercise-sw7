package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsSubscriptionPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsSubscriptionPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionEmailButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscribeSuccessfullyMessage;

    public void scrollDownToThePage() {
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(subscriptionText);
    }

    public String getTextForSubscription() {
        log.info("Verify Subscription text is displayed : " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public void enterAnEmailToSubscriptionBox(String email) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(subscriptionEmail, email);
        clickOnElement(subscriptionEmailButton);
    }

    public String verifyTheMessageSubscribeSuccessfully() {
        return getTextFromElement(subscribeSuccessfullyMessage);
    }
}
