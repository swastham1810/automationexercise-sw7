package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @And("User Verify {string} is visible")
    public void userVerifyLoginToYourAccountIsVisible(String message) {
        Assert.assertEquals(new LoginPage().isLoginToYourAccountTextDisplayedSuccessfully(),
                message, "Incorrect message displayed!");
    }
    @And("User Enter email address {string} and password {string}")
    public void userEnterEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterEmailAndPasswordIntoTheField(email, password);
    }

    @And("User click on {string} button")
    public void userClickOnLoginButton(String loginButton) {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User Verify that {string} is visible")
    public void userVerifyThatIsVisible(String message) {
        Assert.assertEquals(new RegisterPage().getTextForLoggedInAsUserISDisplayed(),
                message, "Text is incorrectly visible");
    }


    @Then("User Verify error message {string} is visible")
    public void userVerifyErrorMessageYourEmailOrPasswordIsIncorrectIsVisible(String message) {
        Assert.assertEquals(new LoginPage().incorrectLoginMessageIsDisplayed(),
                message, "Text is incorrectly visible");
    }
    @Then("User Verify that User Logged in as username is visible")
    public void userVerifyThatUserLoggedInAsUsernameIsVisible() {
        String expected = "Logged in as Harry";
        Assert.assertEquals(new RegisterPage().getTextForLoggedInAsUserISDisplayed(),
                expected, "Text is incorrectly visible");
    }

    @Then("User Verify that user is navigated to login page")
    public void userVerifyThatUserIsNavigatedToLoginPage() {
        new LoginPage().verifyLoginPage();
    }

}
