package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifyAndSearchProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyProductsSteps {
    @When("User Click on Products button")
    public void userClickOnProductsButton() {
        new HomePage().clickOnProductsLink();
    }

    @Then("User Verify user is navigated to {string} page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully(String message) {
        Assert.assertEquals(new VerifyAndSearchProductsPage().getTextFromAllProductsMessage(),
                message, "Incorrect message displayed!");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
    }

    @When("User Click on View Cart Product")
    public void userClickOnViewProductOfFirstProduct(){
        new VerifyAndSearchProductsPage().clickOnViewProduct();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

    }

    @And("User Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void userVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        new VerifyAndSearchProductsPage().getTextFromProductInformation();
    }

}
