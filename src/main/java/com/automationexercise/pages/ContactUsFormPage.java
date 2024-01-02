package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsFormPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsFormPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement getInTouchName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement getInTouchEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement getInTouchSubject;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement getInTouchMessageArea;
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement getInTouchChooseFile;
    By chooseFile = By.xpath("//input[@name='upload_file']");
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement getInTouchSubmitButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement getInTouchSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement getInTouchHomeButton;

    public String getTextForGetInTouchMessage() {
        log.info("Verify account created message is visible : " + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    public void enterDetailInGetInTouchForm(String name, String email, String subject, String messageArea) {
        sendTextToElement(getInTouchName, name);
        sendTextToElement(getInTouchEmail, email);
        sendTextToElement(getInTouchSubject, subject);
        sendTextToElement(getInTouchMessageArea, messageArea);
        log.info("Enter details in get in touch form : ");
    }

//        public void uploadingFile(String filePath) throws AWTException {
//        filePath = "C:\\Users\\kakad\\OneDrive\\Pictures\\Saved Pictures\\scrum.png";
//        uploadFile(filePath, getInTouchChooseFile);
//        log.info("upload file : " + getInTouchChooseFile.toString());
//    }

    public void clickOnAlertOkButtonForAccept() {
        acceptAlert();
        log.info("Click on Accept alert :");
    }

    public void clickOnSubmitButton() {
        clickOnElement(getInTouchSubmitButton);
        log.info("Click on Submit button : " + getInTouchSubmitButton.toString());
    }

    public String getTextSuccessMessageForContactUsForm() {
        log.info("Verify success message is displayed : " + getInTouchSuccessMessage.toString());
        return getTextFromElement(getInTouchSuccessMessage);
    }

    public void clickOnGetInTouchHomeButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(getInTouchHomeButton);
        log.info("Click on Get in touch home button : " + getInTouchHomeButton.toString());
    }

    //    public void uploadFile(String filePath) {
//        filePath = "C:\\Users\\kakad\\OneDrive\\Pictures\\Saved Pictures\\scrum.png";
//        uploadFiles(filePath, getInTouchChooseFile);
//        log.info("Upload file : " + getInTouchChooseFile.toString());
//    }
    public void uploadFile(String filePath) {
        filePath = "C:\\Users\\kakad\\IdeaProjects\\automationexercise-sw7\\src\\info.txt";
        uploadFiles(filePath, getInTouchChooseFile);
        log.info("Upload file : " + getInTouchChooseFile.toString());
    }
}
