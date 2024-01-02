package com.automationexercise.steps;

import com.automationexercise.pages.ScrollUpAndScrollDownPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ScrollUpAndScrollDownSteps {
    @And("User Click on arrow at bottom right side to move upward")
    public void userClickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        new ScrollUpAndScrollDownPage().scrollUpWithArrowKey();
    }

    @Then("User Verify that page is scrolled up and {string} text is visible on screen")
    public void userVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String fullFledgedMessage) {
        Assert.assertEquals(new ScrollUpAndScrollDownPage().verifyTheFullFledgedAutomationEngineerText(),
                fullFledgedMessage, "incorrect message displayed!");
    }

    @And("User Scroll up page to top")
    public void userScrollUpPageToTop() {
        new ScrollUpAndScrollDownPage().scrollUpWithoutArrowKey();
    }
}
