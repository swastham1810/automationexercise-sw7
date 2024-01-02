package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class VerifyAndSearchProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(VerifyAndSearchProductsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProduct;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productInfo;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProduct;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> searchedItemsList;
    @CacheLookup
    @FindBy(id = "cart_info")
    WebElement itemsInCartAfterLoginIsVisible;

    public String getTextFromAllProductsMessage() {
        log.info("Verify All Products Text is displayed : " + allProductsText.toString());
        return getTextFromElement(allProductsText);
    }

    public void clickOnViewProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", viewProduct);
        clickOnElement(viewProduct);
        log.info("Click on view product : " + viewProduct.toString());
    }

    public String getTextFromProductInformation() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
        log.info("Verify product information is displayed : " + productInfo.toString());
        return getTextFromElement(productInfo);
    }

    public void userEnterTheSearchInputAndClickOnSearchButton(String text) {
        sendTextToElement(searchProduct, text);
        clickOnElement(searchButton);
        log.info("User enter The search items and click on search button : ");
    }

    public String getTextForSearchedProducts() {
        log.info("Verify Searched products Text is displayed : " + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

    public ArrayList<String> getSearchedItemsList() {
        log.info("Verify Searched products List is displayed : " + searchedItemsList.toString());
        return getArrayListFromWebElements(searchedItemsList);
    }

    public void UserVerifyThatThoseProductsVisibleInCartAfterLoginAsWell() {
        itemsInCartAfterLoginIsVisible.isDisplayed();
    }

}
