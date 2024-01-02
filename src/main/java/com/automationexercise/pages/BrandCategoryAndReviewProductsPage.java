package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrandCategoryAndReviewProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BrandCategoryAndReviewProductsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenLink;
    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement womenDressLink;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductTitle;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menLink;
    @CacheLookup
    @FindBy(xpath = "//div[@id='Men']//div[@class='panel-body']")
    WebElement menSubCategoryLink;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandsText;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement brandPoloProductTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> productList;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    WebElement bibaBrand;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Biba Products']")
    WebElement brandBibaProductTitle;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsTitleText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReview;
    @CacheLookup
    @FindBy(id = "name")
    WebElement nameFieldForWriteReview;
    @CacheLookup
    @FindBy(id = "email")
    WebElement emailFieldForWriteReview;
    @CacheLookup
    @FindBy(id = "review")
    WebElement reviewBoxForWriteReview;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement clickOnSubmit;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement successMessageForReview;

    public String verifyThatCategoryTextIsDisplayedCorrectly() {
        log.info("Verify the women category text displayed correctly : " + categoryText.toString());
        return getTextFromElement(categoryText);
    }

    public void clickOnWomenLink() {
        clickOnElement(womenLink);
        log.info("Click on women link : " + womenLink.toString());
    }

    public void clickOnSubCategoryWomenDressLink() {
        clickOnElement(womenDressLink);
        log.info("Click on subcategory women dress link : " + womenDressLink.toString());
    }

    public String verifyThatSubCategoryPageTextIsDisplayedCorrectly() {
        log.info("Verify the cart page displayed correctly : " + womenDressProductTitle.toString());
        return getTextFromElement(womenDressProductTitle);
    }

    public void clickOnMenLink() {
        clickOnElement(menLink);
        log.info("Click on Men link : " + menLink.toString());
    }

    public void verifyThatUserNavigatedToMensSubcategoryOptions() {
        log.info("Verify the user navigated to the men's subcategory options : " + menSubCategoryLink.toString());
        menSubCategoryLink.isDisplayed();
    }

    public String verifyThatBrandsTextIsDisplayedCorrectly() {
        log.info("Verify the Brands category text displayed correctly : " + brandsText.toString());
        return getTextFromElement(brandsText);
    }

    public void userClickOnPoloBrand() {
        javaExecutorScriptExecuteScriptToClick(poloBrand);
        log.info("User click On polo brand : " + poloBrand.toString());
    }

    public String verifyThatBrandPoloProductTitleIsDisplayedCorrectly() {
        log.info("Verify that brand Polo Product title is displayed correctly : " + brandPoloProductTitle.toString());
        return getTextFromElement(brandPoloProductTitle);
    }

    public void getListOfProducts() {
        getArrayListFromWebElements(productList);
        log.info("Get the list of brand Products : " + productList.toString());
    }

    public void userClickOnBibaBrand() {
        clickOnElement(bibaBrand);
        log.info("User click On BIBA brand : " + bibaBrand.toString());
    }

    public String verifyThatBrandBibaProductTitleIsDisplayedCorrectly() {
        log.info("Verify that brand BIBA Product title is displayed correctly : " + brandBibaProductTitle.toString());
        return getTextFromElement(brandBibaProductTitle);
    }
    public String verifyThatUserIsNavigatedToTheAllProductsPage() {
        log.info("Verify that user is navigated to the all products page: " + allProductsTitleText.toString());
        return getTextFromElement(allProductsTitleText);
    }
    public String verifyThatWriteYourReviewIsDisplayedCorrectly() {
        log.info("Verify that Write your review is displayed correctly: " + writeYourReview.toString());
        return getTextFromElement(writeYourReview);
    }
    public void enterDetailsForReviewBox(String name, String email, String review){
        sendTextToElement(nameFieldForWriteReview, name);
        sendTextToElement(emailFieldForWriteReview, email);
        sendTextToElement(reviewBoxForWriteReview, review);
        log.info("Enter details for review box: ");

    }

    public void clickOnReviewSubmitButton(){
        javaExecutorScriptExecuteScriptToClick(clickOnSubmit);
        log.info("Click on submit review button: " + clickOnSubmit.toString());
    }
    public String verifyThatThankYouForReviewMessage() {
        log.info("Verify that Thank you for review Message: " + successMessageForReview.toString());
        return getTextFromElement(successMessageForReview);
    }
}
