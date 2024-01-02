package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifyAndSearchProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchProductsSteps {

    @When("User Enter product name {string} in search input and click search button")
    public void userEnterProductNameInSearchInputAndClickSearchButton(String productName) {
        new VerifyAndSearchProductsPage().userEnterTheSearchInputAndClickOnSearchButton(productName);
    }

    @Then("User can see {string} is visible")
    public void userCanSeeSEARCHEDPRODUCTSIsVisible(String searchedProducts) {
        Assert.assertEquals(new VerifyAndSearchProductsPage().getTextForSearchedProducts(),
                searchedProducts, "Incorrect text displayed!");
    }

    @And("User Verify all the products related to search are visible")
    public void userVerifyAllTheProductsRelatedToSearchAreVisible() {
        new VerifyAndSearchProductsPage().getSearchedItemsList();
    }

    @And("User Again, go to Cart page")
    public void userAgainGoToCartPage() {
        new HomePage().clickOnCartLink();
    }

    @Then("User Verify that those products are visible in cart after login as well")
    public void userVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        new VerifyAndSearchProductsPage().UserVerifyThatThoseProductsVisibleInCartAfterLoginAsWell();
    }
}
