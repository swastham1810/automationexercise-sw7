package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsFormPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.awt.*;

public class ContactUsFormSteps {
    @When("User Click on  {string} button")
    public void userClickOnContactUsButton(String contactUs) {
        new HomePage().clickOnContactUsLink();
    }

    @Then("User Verify the {string} is visible")
    public void userVerifyTheGETINTOUCHIsVisible(String message) {
        Assert.assertEquals(new ContactUsFormPage().getTextForGetInTouchMessage(),
                message, "Incorrect message displayed!");
    }

    @And("User Enter name {string} email {string} subject {string} and message {string}")
    public void userEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactUsFormPage().enterDetailInGetInTouchForm(name, email, subject, message);
    }

    @And("User Upload file {string}")
    public void userUploadFileCUsersKakadOneDrivePicturesSavedPicturesPicture(String location) throws AWTException {
        new ContactUsFormPage().uploadFile(location);
    }

    @And("User Click  on {string} button")
    public void userClickOnSubmitButton(String submit) {
        new ContactUsFormPage().clickOnSubmitButton();
    }

    @And("User Click OK button")
    public void userClickOKButton() {
        new ContactUsFormPage().clickOnAlertOkButtonForAccept();
    }

    @Then("User Verify success message {string} is visible")
    public void userVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String message){
        Assert.assertEquals(new ContactUsFormPage().getTextSuccessMessageForContactUsForm(),
                message, "Incorrect message displayed!");
    }

    @And("User Click Home button")
    public void userClickHomeButton() throws InterruptedException {
        new ContactUsFormPage().clickOnGetInTouchHomeButton();
    }

    @Then("User verify that landed to home page successfully")
    public void userVerifyThatLandedToHomePageSuccessfully() throws InterruptedException {
        new HomePage().verifyHomePage();
    }

}
