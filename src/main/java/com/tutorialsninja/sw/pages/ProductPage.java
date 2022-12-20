package com.tutorialsninja.sw.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.sw.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath="//div[@id = 'content']//h1")
            WebElement productText;

    //By productText = By.xpath("//div[@id = 'content']//h1");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'input-group date']//button")
            WebElement calendarButton;

    //By calendarButton = By.xpath("//div[@class = 'input-group date']//button");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
            WebElement monthAndYearText;
    //By monthAndYearText = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//th[@class='next']")
            WebElement nextButton;
    //By nextButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
           List< WebElement> dateList;
    //By dateList = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-quantity']\n")
    WebElement qtyField;
    //By qtyField = By.cssSelector("#input-quantity");
    @CacheLookup
            @FindBy(xpath="//button[@id='button-cart']")
            WebElement addToCartButton;

   // By addToCartButton = By.xpath("//button[@id='button-cart']");
    @CacheLookup
           @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']\n")
    WebElement successMessage;
    //By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'shopping cart')]")
            WebElement shoppingCartLink;
    //By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'input-group date']//button")
    WebElement datePicker;
    //By datePicker = By.xpath("//div[@class = 'input-group date']//button");


    public String getProductText() {
        log.info("Get Product"+productText);
        return getTextFromElement(productText);
    }

    public void selectDeliveryDate(String day, String month, String year) {
        log.info("Select delivery date"+datePicker);
        clickOnElement(datePicker);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndYearText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = dateList;
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(day)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {
       log.info("click on add to chart" + addToCartButton);
        clickOnElement(addToCartButton);

    }

    public String getProductAddedSuccessMessage() {
        String message = getTextFromElement(successMessage);
        log.info("verify text messagae"+ successMessage);
        return message;

    }

    public void clickOnShoppingCartLinkIntoMessage() {
      log.info("click on shoppinh chart message" + shoppingCartLink);
        clickOnElement(shoppingCartLink);
    }

    public void enterQuantity(String qty) {
        log.info("quenty"+qty+"quenty"+qtyField.toString());
        sendTextToElement(qtyField, qty);
    }
}