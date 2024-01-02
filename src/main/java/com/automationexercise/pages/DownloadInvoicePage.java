package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DownloadInvoicePage extends Utility {
    private static final Logger log = LogManager.getLogger(DownloadInvoicePage.class.getName());
//    @CacheLookup
//    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
//    WebElement downloadInvoiceButton;
    By downloadInvoiceButton = By.xpath("//a[normalize-space()='Download Invoice']");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement downloadContinueButton3;

    //Folder location
    public void clickOnDownloadInvoiceButtonAndVerify()throws InterruptedException {
        log.info("Click on download invoice : " + downloadInvoiceButton.toString());
        seleniumDownloadFile(downloadInvoiceButton);

    }

    public void clickOnDownloadContinueButton3() {
        clickOnElement(downloadContinueButton3);
        log.info("Click on Continue download invoice : " + downloadContinueButton3.toString());
    }

}
