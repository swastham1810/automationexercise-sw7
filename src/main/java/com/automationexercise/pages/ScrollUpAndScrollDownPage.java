package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ScrollUpAndScrollDownPage extends Utility {
    private static final Logger log = LogManager.getLogger(ScrollUpAndScrollDownPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body[@aria-hidden='false']")
    WebElement hideTheAddsInBottom;
    @CacheLookup
    //@FindBy (xpath = "//a[@id='scrollUp']")
    @FindBy (xpath = "//i[@class='fa fa-angle-up']")
    WebElement scrollUpArrow;
    @CacheLookup
    @FindBy (xpath = "//section[@id='slider']")
    WebElement slider;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedText;

    public void scrollUpWithArrowKey() throws InterruptedException {
        Thread.sleep(3000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(slider);
        clickOnElement(scrollUpArrow);
    }
    public String verifyTheFullFledgedAutomationEngineerText(){
        System.out.println(fullFledgedText);
        return getTextFromElement(fullFledgedText);
    }
    public void scrollUpWithoutArrowKey(){
        //javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(slider);
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(fullFledgedText);
    }

}
