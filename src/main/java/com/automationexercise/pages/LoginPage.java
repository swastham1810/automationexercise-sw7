package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailAddress;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement loginPassword;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement incorrectLoginMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='login-form']")
    WebElement verifyLoginPage;


    public String isLoginToYourAccountTextDisplayedSuccessfully() {
        log.info("Login to your account text displayed : " + loginToYourAccountText.toString());
        return getTextFromElement(loginToYourAccountText);
    }

    public void enterEmailAndPasswordIntoTheField(String email, String password) {
        sendTextToElement(loginEmailAddress, email);
        sendTextToElement(loginPassword, password);
        log.info("Login with valid credentials:");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on Login Button: " + loginButton.toString());
    }

    public String incorrectLoginMessageIsDisplayed() {
        log.info("Incorrect Login message displayed : " + incorrectLoginMessage.toString());
        return getTextFromElement(incorrectLoginMessage);
    }

    public String verifyLoginPage() {
        log.info("Login to your account text displayed : " + verifyLoginPage.toString());
        return getTextFromElement(verifyLoginPage);
    }
}
