package com.automationexercise.pages;

import com.automationexercise.propertyreader.PropertyReader;
import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement visibilityOfTheHomepage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLoginButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUs;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']")
    WebElement testCasesLink;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCasesText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
    WebElement cartLink;


    public String isHomepageDisplayedSuccessfully() {
        log.info("Verify homepage shop menu displayed : " + visibilityOfTheHomepage.toString());
        return getTextFromElement(visibilityOfTheHomepage);
    }

    public void verifyHomePage() throws InterruptedException {
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url.");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnSignUpOrLoginButton() {
        log.info("Click on SignUp/Login link : " + signUpOrLoginButton.toString());
        clickOnElement(signUpOrLoginButton);
    }

    public void clickOnContactUsLink() {
        log.info("Click on contact Us link : " + contactUs.toString());
        clickOnElement(contactUs);
    }

    public void clickOnTestCasesLink() {
        log.info("Click on Test Cases link : " + testCasesLink.toString());
        clickOnElement(testCasesLink);
    }

    public String getTextFromTestCasesMessage() {
        log.info("Verify Test Cases Text is displayed : " + testCasesText.toString());
        return getTextFromElement(testCasesText);
    }

    public void clickOnProductsLink() {
        log.info("Click on Products link : " + productsLink.toString());
        clickOnElement(productsLink);
    }

    //    public void scrollDownToFooter(){
//        log.info("Scroll Down to Footer");
//        js.executeScript("window.scrollBy(0,5000)");
//    }
    public void clickOnCartLink() {
        log.info("Click on cart link : " + cartLink.toString());
        clickOnElement(cartLink);
    }
}
