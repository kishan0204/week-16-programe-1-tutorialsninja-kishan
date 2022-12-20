package com.tutorialsninja.sw.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.sw.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath="//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
   // By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
           @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
           WebElement accountCreatedText;
   // By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath="//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List< WebElement> myAccountOptions1;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
    WebElement myAccountTab1;
    //By continueBtn = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnMyQAccountTab1() {

        clickOnElement(myAccountTab1);
    }
    public String getAccountLogoutText() {
        String message = getTextFromElement(accountLogoutText);
       log.info("verify text"+accountLogoutText);
        return message;

    }

    public String getYourAccountHasBeenCreatedText() {
        String message =  getTextFromElement(accountCreatedText);
        log.info("verify text messagae"+ accountCreatedText);
        return message;

    }
    public void clickOnContinueButton() {
        log.info("Click on continue button  "+continueBtn);
        clickOnElement(continueBtn);
    }
    public void selectMyAccountOptions1(String option) {
        log.info("Select my account option"+myAccountOptions1);
        List<WebElement> myAccountList = myAccountOptions1;
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountOptions1;
        }
    }
}
