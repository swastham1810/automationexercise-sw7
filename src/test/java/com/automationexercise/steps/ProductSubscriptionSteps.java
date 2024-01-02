package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsSubscriptionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSubscriptionSteps {
    @When("User Scroll down to footer")
    public void userScrollDownToFooter() {
        new ProductsSubscriptionPage().scrollDownToThePage();
    }

    @Then("User Verify text {string}")
    public void userVerifyTextSUBSCRIPTION(String subscription) {
        Assert.assertEquals(new ProductsSubscriptionPage().getTextForSubscription(),
                subscription, "Incorrect text is displayed!");

    }

    @When("User Enter email address {string} in input and click arrow button")
    public void userEnterEmailAddressInInputAndClickArrowButton(String email) throws InterruptedException {
        new ProductsSubscriptionPage().enterAnEmailToSubscriptionBox(email);
    }

    @Then("User Verify the success message {string} is visible")
    public void userVerifyTheSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String message) {
        Assert.assertEquals(new ProductsSubscriptionPage().verifyTheMessageSubscribeSuccessfully(),
                 message, "Incorrect message displayed!");
    }

    @When("User click on Cart button")
    public void userClickOnCartButton() {
        new HomePage().clickOnCartLink();
    }
}
