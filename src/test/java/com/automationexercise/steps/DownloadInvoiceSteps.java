package com.automationexercise.steps;

import com.automationexercise.pages.DownloadInvoicePage;
import io.cucumber.java.en.And;

public class DownloadInvoiceSteps {
    @And("User Click {string} button and verify invoice is downloaded successfully.")
    public void userClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String downloadInvoice) throws InterruptedException {
        new DownloadInvoicePage().clickOnDownloadInvoiceButtonAndVerify();
    }

    @And("User Click on the {string} button")
    public void userClickOnTheContinueButton(String downloadContinueButton) {
        new DownloadInvoicePage().clickOnDownloadContinueButton3();
    }
}
