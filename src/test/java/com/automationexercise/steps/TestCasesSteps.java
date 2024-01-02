package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestCasesSteps {
    @When("User Click on Test Cases button")
    public void userClickOnTestCasesButton() {
        new HomePage().clickOnTestCasesLink();
    }

    @Then("User Verify user is navigated to test cases page successfully")
    public void userVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String expected = "TEST CASES";
        Assert.assertEquals(new HomePage().getTextFromTestCasesMessage(), expected, "Text not displayed!");
    }
}
