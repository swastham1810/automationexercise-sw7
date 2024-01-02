package com.automationexercise.steps;

import com.automationexercise.pages.AddAndRemoveProductToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddAndRemoveProductToCartSteps {

    @And("User Hover over product and click {string}")
    public void userHoverOverProductAndClickAddToCart(String firstProduct) throws InterruptedException {
        new AddAndRemoveProductToCartPage().mouseHoverAndClickOnFirstProduct();
    }

    @And("User click on the {string} button")
    public void userClickOnTheContinueShoppingButton(String continueButton) throws InterruptedException {
        new AddAndRemoveProductToCartPage().clickOnContinueShoppingButton();
    }

    @And("User Hover over second product and click {string}")
    public void userHoverOverSecondProductAndClickAddToCart(String secondProduct) throws InterruptedException {
        new AddAndRemoveProductToCartPage().mouseHoverAndClickOnSecondProduct();
    }

    @And("User Click View Cart button")
    public void userClickViewCartButton() throws InterruptedException {
        new AddAndRemoveProductToCartPage().clickOnViewCartButton();
    }

    @Then("User Verify both products are added to Cart")
    public void userVerifyBothProductsAreAddedToCart() throws InterruptedException {
        new AddAndRemoveProductToCartPage().getTextForBothProductsAreAddedToTheCart();
    }

    @And("User Verify their prices, quantity and total price")
    public void userVerifyTheirPricesQuantityAndTotalPrice() {
        new AddAndRemoveProductToCartPage().verifyTheListOfProductsPriceQuantityAndTotal();
    }

    @Then("User Verify product detail is displayed")
    public void userVerifyProductDetailIsDisplayed() {
        new AddAndRemoveProductToCartPage().getProductDetailsInformation();
    }

    @And("User Increase quantity to {string}")
    public void userIncreaseQuantityTo(String qty) throws InterruptedException {
        new AddAndRemoveProductToCartPage().changeTheQuantityOfProducts(qty);
    }

    @And("User Click Add to cart button")
    public void userClickAddToCartButton() {
        new AddAndRemoveProductToCartPage().clickOnAddToCartBtn();
    }

    @Then("User Verify that product is displayed in cart page with exact quantity")
    public void userVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        new AddAndRemoveProductToCartPage().getCorrectQuantityDisplayedInCart();
    }

    @And("User Click {string} button corresponding to particular product")
    public void userClickXButtonCorrespondingToParticularProduct(String removeBtn) {
        new AddAndRemoveProductToCartPage().clickOnRemoveFromCartButton();
    }

    @Then("User Verify that product is removed from the cart")
    public void userVerifyThatProductIsRemovedFromTheCart() {
//        String expected = "Cart is empty! Click here to buy products.";
//        Assert.assertEquals(new AddAndRemoveProductToCartPage().getTextForRemoveProductFromCart(),
//                expected, "Incorrect message displayed!");
    }

    @When("User Scroll to bottom of page")
    public void userScrollToBottomOfPage() {
        new AddAndRemoveProductToCartPage().userScrollDownToRecommendedItems();
    }

    @Then("User Verify {string} are visible")
    public void userVerifyRECOMMENDEDITEMSAreVisible(String recommendedItems) {
        Assert.assertEquals(new AddAndRemoveProductToCartPage().getTextForRecommendedItemsInBottom(),
                recommendedItems, "Incorrect Text Displayed!");
    }

    @And("User Click on {string} on Recommended product")
    public void userClickOnAddToCartOnRecommendedProduct(String addToCart) {
        new AddAndRemoveProductToCartPage().userClickOnAddToCartOnRecommendedItem();

    }

    @Then("User Verify that product is displayed in cart page")
    public void userVerifyThatProductIsDisplayedInCartPage() {
        new AddAndRemoveProductToCartPage().userVerifyThatRecommendedItemIsDisplayedInCart();
    }

}
