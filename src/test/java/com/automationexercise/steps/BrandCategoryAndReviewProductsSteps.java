package com.automationexercise.steps;

import com.automationexercise.pages.BrandCategoryAndReviewProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BrandCategoryAndReviewProductsSteps {
    @When("User Verify that categories are visible on left side bar")
    public void userVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        String expected = "CATEGORY";
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatCategoryTextIsDisplayedCorrectly(),
                expected, "Incorrect displayed!");
    }

    @When("User Click on {string} category")
    public void userClickOnWomenCategory(String women) {
        new BrandCategoryAndReviewProductsPage().clickOnWomenLink();
    }

    @And("User Click on any category link under Women category, for example: Dress")
    public void userClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new BrandCategoryAndReviewProductsPage().clickOnSubCategoryWomenDressLink();
    }

    @Then("User Verify that category page is displayed and confirm text {string}")
    public void userVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String text) {
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatSubCategoryPageTextIsDisplayedCorrectly(),
                text, "Incorrect subcategory title displayed!");
    }

    @And("User is On left side bar, click on any sub-category link of {string} category")
    public void userIsOnLeftSideBarClickOnAnySubCategoryLinkOfMenCategory(String men) {
        new BrandCategoryAndReviewProductsPage().clickOnMenLink();
    }

    @Then("User Verify that user is navigated to that category page")
    public void userVerifyThatUserIsNavigatedToThatCategoryPage() {
        new BrandCategoryAndReviewProductsPage().verifyThatUserNavigatedToMensSubcategoryOptions();
    }

    @Then("User Verify that Brands are visible on left side bar")
    public void userVerifyThatBrandsAreVisibleOnLeftSideBar() {
        String expected = "BRANDS";
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatBrandsTextIsDisplayedCorrectly(),
                expected, "Incorrect displayed!");

    }

    @And("User Click on any brand name {string}")
    public void userClickOnAnyBrandName(String polo) {
        new BrandCategoryAndReviewProductsPage().userClickOnPoloBrand();
    }

    @Then("User Verify that user is navigated to brand page and brand products are displayed")
    public void userVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        new BrandCategoryAndReviewProductsPage().verifyThatBrandPoloProductTitleIsDisplayedCorrectly();
        new BrandCategoryAndReviewProductsPage().getListOfProducts();
    }

    @And("User is On left side bar, click on any other brand link {string}")
    public void userIsOnLeftSideBarClickOnAnyOtherBrandLink(String biba) {
        new BrandCategoryAndReviewProductsPage().userClickOnBibaBrand();

    }

    @Then("User Verify that user is navigated to that brand page and can see products")
    public void userVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        new BrandCategoryAndReviewProductsPage().verifyThatBrandBibaProductTitleIsDisplayedCorrectly();
        new BrandCategoryAndReviewProductsPage().getListOfProducts();
    }

    @Then("User Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String expected = "ALL PRODUCTS";
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatUserIsNavigatedToTheAllProductsPage(),
                expected, "Incorrect title displayed!");
    }

    @Then("User Verify  that {string} is visible")
    public void userVerifyThatWriteYourReviewIsVisible(String writeReview) {
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatWriteYourReviewIsDisplayedCorrectly(),
                writeReview, "Incorrect message displayed!");
    }

    @And("User Enter name {string} email {string} and review {string}")
    public void userEnterNameEmailAndReview(String name, String email, String review) {
        new BrandCategoryAndReviewProductsPage().enterDetailsForReviewBox(name, email, review);
    }

    @And("User Click Submit button")
    public void userClickSubmitButton() {
        new BrandCategoryAndReviewProductsPage().clickOnReviewSubmitButton();
    }

    @Then("User Verify the success message {string}")
    public void userVerifyTheSuccessMessageThankYouForYourReview(String successMessage) {
        Assert.assertEquals(new BrandCategoryAndReviewProductsPage().verifyThatThankYouForReviewMessage(),
                successMessage, "Incorrect message displayed!");
    }
}
