package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddAndRemoveProductToCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddAndRemoveProductToCartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[2]")
    //@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton1;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[4]")
    //@FindBy(xpath = "//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[3]")
    WebElement addToCartButton2;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;
    @CacheLookup
    //@FindBy(xpath = "//u[normalize-space()='View Cart']")
    @FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    WebElement viewCartButton;
    @CacheLookup
    @FindBy(xpath = "//tbody")
    WebElement verifyBothProductsInCart;
    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_price'])")
    List<WebElement> verifyPrice;
    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_quantity'])")
    List<WebElement> verifyQuantity;
    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_total'])")
    List<WebElement> verifyTotalPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productDetails;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_quantity'])")
    WebElement verifyQuantityIntoTheCart;
    @CacheLookup
    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
    WebElement removeFromCart;
    @CacheLookup
    @FindBy(xpath = "(//p[contains(text(),'Click')])[1]")
    WebElement removedProductMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='recommended_items']")
    WebElement scrollDownToRecommendedItems;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
    WebElement addToCartButton3ForRecommendedItems;
    @CacheLookup
    @FindBy(xpath = "//div[@id='cart_info']")
    WebElement verifyProductDisplayedInCart;
    public void mouseHoverAndClickOnFirstProduct() throws InterruptedException {
        Thread.sleep(5000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton1);
        // mouseHoverToElementAndClick(addToCartButton1);
        log.info("Click on add to cart button1 for first product : " + addToCartButton1.toString());
    }

    public void clickOnContinueShoppingButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(continueShoppingButton);
        log.info("Click on continue button : " + continueShoppingButton.toString());
    }

    public void mouseHoverAndClickOnSecondProduct() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton2);
        // mouseHoverToElementAndClick(addToCartButton2);
        log.info("Click on add to cart button2 for second product : " + addToCartButton2.toString());
    }

    public void clickOnViewCartButton() throws InterruptedException {
        Thread.sleep(3000);
        javaExecutorScriptExecuteScriptToClick(viewCartButton);
        log.info("Click on view cart button : " + viewCartButton.toString());
    }

    public void getTextForBothProductsAreAddedToTheCart() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Verify the products are added correctly : " + verifyBothProductsInCart.toString());
        verifyBothProductsInCart.isDisplayed();
    }

    public void verifyTheListOfProductsPriceQuantityAndTotal() {
        getArrayListFromWebElements(verifyPrice);
        getArrayListFromWebElements(verifyQuantity);
        getArrayListFromWebElements(verifyTotalPrice);
        log.info("Verify the products price, quantity and total are correctly : ");
    }

    public String getProductDetailsInformation() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
        log.info("Verify the products Information details displayed : " + productDetails.toString());
        return getTextFromElement(productDetails);
    }

    public void changeTheQuantityOfProducts(String qty) throws InterruptedException {
        Thread.sleep(2000);
        clearTextField(changeQuantity);
        sendTextToElement(changeQuantity, qty);
        log.info("Cahnge the quantity : " + changeQuantity.toString());
    }

    public void clickOnAddToCartBtn() {
        clickOnElement(addToCartBtn);
        log.info("Click On Add to cart btn : " + addToCartBtn.toString());
    }

    public void getCorrectQuantityDisplayedInCart() {
        //getArrayListFromWebElements(verifyQuantity);
        verifyQuantityIntoTheCart.isDisplayed();
        log.info("Verify the products Quantity displayed correctly: " + verifyQuantityIntoTheCart.toString());
    }
    public void clickOnRemoveFromCartButton(){
        clickOnElement(removeFromCart);
        log.info("Click On remove from cart btn : " + removeFromCart.toString());
    }
    public String getTextForRemoveProductFromCart(){
        log.info("Verify remove products from cart : " + removedProductMessage.toString());
        return getTextFromElement(removedProductMessage);
    }
    public void userScrollDownToRecommendedItems(){
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(scrollDownToRecommendedItems);
        log.info("User Scroll down to the recommended items : " + scrollDownToRecommendedItems.toString());
    }
    public String getTextForRecommendedItemsInBottom(){
        log.info("User verify recommended items Text is displayed : " + recommendedItemsText.toString());
        return getTextFromElement(recommendedItemsText);
    }
    public void userClickOnAddToCartOnRecommendedItem(){
        clickOnElement(addToCartButton3ForRecommendedItems);
        log.info("User Click on Add to Cart on recommended Item : " + addToCartButton3ForRecommendedItems.toString());
    }
    public void userVerifyThatRecommendedItemIsDisplayedInCart(){
        log.info("User verify recommended items Text is displayed : " + verifyProductDisplayedInCart.toString());
        verifyProductDisplayedInCart.isDisplayed();
    }
}
