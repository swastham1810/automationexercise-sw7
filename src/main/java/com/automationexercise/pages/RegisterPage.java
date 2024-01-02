package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUpText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signUpName;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmailAddress;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement accountInfoText;
    @CacheLookup
   //@FindBy(xpath = "//input[@id='id_gender2']")
    @FindBy(xpath = "(//input[@id='id_gender2'])[1]")
    WebElement selectMrs;
    @CacheLookup
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement selectMr;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dayOfDateOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthOfDateOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearOfDateOfBirth;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsLetterCheckBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialOfferCheckBox;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement fistNameField;
    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "company")
    WebElement company;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2;
    @CacheLookup
    @FindBy(id = "country")
    WebElement country;
    @CacheLookup
    @FindBy(id = "state")
    WebElement state;
    @CacheLookup
    @FindBy(id = "city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcode;
    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumber;
    @CacheLookup
    //@FindBy(xpath = "//button[normalize-space()='Create Account']")
    @FindBy(xpath = "(//button[normalize-space()='Create Account'])[1]")
    WebElement createAccount;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreateMsg;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUser;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccount;
    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedMsg;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOutButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement errorMessage;

    public String isNewUserSignUpTextDisplayedSuccessfully() {
        log.info("New User SignUp text displayed : " + newUserSignUpText.toString());
        return getTextFromElement(newUserSignUpText);
    }

    public void enterNameInSignUpNameField(String name) {
        sendTextToElement(signUpName, name);
        log.info("Enter sign up name in to the name field : " + signUpName.toString());
    }

    public void enterSignUpEmailAddress(String email) {
        sendTextToElement(signUpEmailAddress, email);
        log.info("Enter signUp email to the email Address field : " + signUpEmailAddress.toString());
    }

    public void clickOnSignUpButton() {
        clickOnElement(signUpButton);
        log.info("Click On Sign Up Button : " + signUpName.toString());
    }

    public String isEnterAccountInformationTextVisible() {
        log.info("Verify Enter account info visible : " + accountInfoText.toString());
        return getTextFromElement(accountInfoText);
    }
    public void selectGender(String mrOrMrs) {
        switch (mrOrMrs) {
            case "Mr.":
                clickOnElement(selectMr);
                break;
            case "Mrs.":
                clickOnElement(selectMrs);
                break;
            default:
                break;
        }
        log.info("Select gender : " + mrOrMrs.toString());
    }

    public void setSelectMrs(String mrs) {
        clickOnElement(selectMrs);
        log.info("Select gender : " + selectMrs.toString());
    }

    public void enterTheDetailsForAccount(String title, String pwd, String day, String month, String year) {
        selectGender(title);
        sendTextToElement(password, pwd);
        selectByVisibleTextFromDropDown(dayOfDateOfBirth, day);
        selectByVisibleTextFromDropDown(monthOfDateOfBirth, month);
        selectByVisibleTextFromDropDown(yearOfDateOfBirth, year);
        log.info("Enter the details for an account");
    }

    public void clickOnNewsLetterCheckBox() {
        clickOnElement(newsLetterCheckBox);
        log.info("Click on NewsLetter checkbox : " + newsLetterCheckBox.toString());
    }

    public void clickOnSpecialOfferCheckBox() {
        clickOnElement(specialOfferCheckBox);
        log.info("Click on Special offer checkbox : " + specialOfferCheckBox.toString());
    }
    public void enterAllTheDetailsForRegisterAnAccount(String fName, String lName, String company,
                                                       String address, String address2, String country,
                                                       String state, String city, String zipcode,
                                                       String mobile){
        sendTextToElement(fistNameField, fName);
        sendTextToElement(lastNameField, lName);
        sendTextToElement(this.company, company);
        sendTextToElement(address1, address);
        sendTextToElement(this.address2, address2);
        selectByVisibleTextFromDropDown(this.country, country);
        sendTextToElement(this.state, state);
        sendTextToElement(this.city, city);
        sendTextToElement(this.zipcode, zipcode);
        sendTextToElement(mobileNumber, mobile);
        log.info("Filled all personal information for register an account");
    }

    public void clickOnCreateAccountButton(){
        //clickOnElement(createAccount);
        javaExecutorScriptExecuteScriptToClick(createAccount);
        log.info("Click on create an account button : " + createAccount.toString());
    }
    public boolean verifyThatIsMessageDisplayed(String text) {
        if (text.equalsIgnoreCase("ENTER ACCOUNT INFORMATION")) {
            Assert.assertEquals(new RegisterPage().isEnterAccountInformationTextVisible(), text, text + " text not displayed");
            log.info("Message: ENTER ACCOUNT INFORMATION");
        } else if (text.equalsIgnoreCase("ACCOUNT CREATED!")) {
            Assert.assertEquals(new RegisterPage().getTextForAccountCreatedSuccessfully(), text, text + "text not displayed");
            log.info("Message: ACCOUNT CREATED!");
        } else if (text.equalsIgnoreCase("Logged in as username")) {
            Assert.assertEquals(new RegisterPage().getTextForLoggedInAsUserISDisplayed(), text, text + "text not displayed");
            log.info("Message: Logged in as username");
        } else if (text.equalsIgnoreCase("ACCOUNT DELETED!")) {
            Assert.assertEquals(new RegisterPage().getTextForAccountDeletedSuccessfully(), text, text + "text not displayed");
            log.info("Message: ACCOUNT DELETED!");
        }
        else {
            log.info("Message: Not displayed!");
        }
        return false;
    }
    public String getTextForAccountCreatedSuccessfully() {
        log.info("Verify account created message is visible : " + accountCreateMsg.toString());
        return getTextFromElement(accountCreateMsg);
    }
    public String getTextForLoggedInAsUserISDisplayed() {
        log.info("Verify that logged In as user is visible : " + loggedInAsUser.toString());
        return getTextFromElement(loggedInAsUser);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
        log.info("Click on continue button 1 : " + continueButton1.toString());
    }
    public void clickOnDeleteAccountButton(){
        clickOnElement(deleteAccount);
        log.info("Click on delete account button : " + deleteAccount.toString());
    }
    public String getTextForAccountDeletedSuccessfully() {
        log.info("Verify account deleted message is visible : " + accountDeletedMsg.toString());
        return getTextFromElement(accountDeletedMsg);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
        log.info("Click on continue button 2 : " + continueButton2.toString());
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
        log.info("Click on Logout button : " + logOutButton.toString());
    }

    public String getTextForErrorMessage() {
        log.info("Verify error message is visible : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}
