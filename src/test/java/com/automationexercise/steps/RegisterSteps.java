package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("User Launch browser")
    public void userLaunchBrowser() {
    }
    @When("User navigate to URL {string}")
    public void userNavigateToURL(String baseUrl) {
    }
    @Then("User should be able to verify that homepage visible successfully")
    public void userShouldBeAbleToVerifyThatHomepageVisibleSuccessfully() throws InterruptedException {
        new HomePage().verifyHomePage();
    }
    @When("User Click on {string} button")
    public void clickOnSignupLoginButton(String signUp) {
        new HomePage().clickOnSignUpOrLoginButton();
    }
    @Then("User verify {string} is visible")
    public void userVerifyNewUserSignupIsVisible(String text) {
        Assert.assertEquals(new RegisterPage().isNewUserSignUpTextDisplayedSuccessfully(),
                text, "Incorrect text displayed!");
    }
    @When("User Enter name {string} and email address {string}")
    public void userEnterNameAndEmailAddress(String name, String email) {
        new RegisterPage().enterNameInSignUpNameField(name);
        new RegisterPage().enterSignUpEmailAddress(email);
    }
    @And("User click {string} button")
    public void userClickSignupButton(String signUpButton) {
        new RegisterPage().clickOnSignUpButton();
    }
    @Then("User Verify that ENTER ACCOUNT INFORMATION is visible")
    public void userVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        String expected = "ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(new RegisterPage().isEnterAccountInformationTextVisible(),
                expected, "Text is incorrectly visible");
    }

//    @Then("User Verify that {string} is visible")
//    public void userVerifyThatENTERACCOUNTINFORMATIONIsVisible(String message) {
//        Assert.assertEquals(new RegisterPage().isEnterAccountInformationTextVisible(),
//                message, "Text is incorrectly visible");
//        if (message.equalsIgnoreCase("ENTER ACCOUNT INFORMATION")
//                || message.equalsIgnoreCase("ACCOUNT CREATED!")
//        ||message.equalsIgnoreCase("Logged in as username")
//    || message.equalsIgnoreCase("ACCOUNT DELETED!")) {
//            Assert.assertTrue(new RegisterPage().verifyThatIsMessageDisplayed(message, actual, expected), "Incorrect message displayed: " + message);
//        }
//       new RegisterPage().verifyThatIsMessageDisplayed(message, actual, expected);
//    }

    @When("User Fill details: Title {string} Password {string} Day {string} Month {string} Year {string}")
    public void userFillDetailsTitleNameEmailPasswordDayMonthYear(String title, String password, String day, String month, String year) {
    new RegisterPage().enterTheDetailsForAccount(title, password, day, month,year);
    }


    @And("User Select checkbox {string}")
    public void userSelectCheckboxSignUpForOurNewsletter(String checkBox) {
        new RegisterPage().clickOnNewsLetterCheckBox();
        new RegisterPage().clickOnSpecialOfferCheckBox();
    }

    @And("User Fill details: FirstName {string} LastName {string} Company {string} Address {string} AddressLine {string} Country {string} State {string} City {string} Zipcode {string} Mobile Number {string}")
    public void userFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(String fName, String lName, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobile) {
    new RegisterPage().enterAllTheDetailsForRegisterAnAccount(fName, lName, company, address1, address2, country, state, city, zipcode, mobile);
    }

    @And("User Click {string}")
    public void userClickCreateAccountButton(String createAccount) {
        new RegisterPage().clickOnCreateAccountButton();
    }
    @Then("User Verify that ACCOUNT CREATED! is visible")
    public void userVerifyThatACCOUNTCREATEDIsVisible() {
        String expected = "ACCOUNT CREATED!";
        Assert.assertEquals(new RegisterPage().getTextForAccountCreatedSuccessfully(),
                expected, "Text is incorrectly visible");
    }

    @When("User Click {string} button")
    public void userClickContinueButton(String continueButton1) {
        new RegisterPage().clickOnContinueButton1();
    }
    @Then("User Verify that Logged in as username is visible")
    public void userVerifyThatLoggedInAsUsernameIsVisible() {
        String expected = "Logged in as Asha";
        Assert.assertEquals(new RegisterPage().getTextForLoggedInAsUserISDisplayed(),
                expected, "Text is incorrectly visible");
    }
    @When("User Click on a {string} button")
    public void userClickOnADeleteAccountButton(String deleteButton) {
        new RegisterPage().clickOnDeleteAccountButton();
    }

    @Then("User Verify that ACCOUNT DELETED! is visible")
    public void userVerifyThatACCOUNTDELETEDIsVisible() {
        String expected = "ACCOUNT DELETED!";
        Assert.assertEquals(new RegisterPage().getTextForAccountDeletedSuccessfully(),
                expected, "Text is incorrectly visible");
    }

    @And("User click a {string} button")
    public void userClickAContinueButton(String continueButton2) {
        new RegisterPage().clickOnContinueButton2();
    }
    @And("User Click {string} Button")
    public void userClickLogoutButton(String logOut) {
        new RegisterPage().clickOnLogOutButton();
    }

    @And("User Enter name {string}and already registered email address{string}")
    public void userEnterNameAndAlreadyRegisteredEmailAddress(String name, String email) {
        new RegisterPage().enterNameInSignUpNameField(name);
        new RegisterPage().enterSignUpEmailAddress(email);
    }

    @Then("User Verify error {string} is visible")
    public void userVerifyErrorEmailAddressAlreadyExistIsVisible(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getTextForErrorMessage(),
                errorMessage, "Text is incorrectly visible");
    }

}