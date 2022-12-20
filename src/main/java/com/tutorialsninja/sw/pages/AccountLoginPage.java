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

/**
 * Created by Jay Vaghani
 */
public class AccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath="//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

   // By returningCustomerText = By.xpath("//div[@id='content']/div/div[2]//h2");
    @CacheLookup
           @FindBy(xpath="//div[@id='content']/div/div[1]//h2")
           WebElement newCustomerText;
    //By newCustomerText = By.xpath("//div[@id='content']/div/div[1]//h2");
    @CacheLookup
            @FindBy(id="input-email")
            WebElement emailAddressField;
    //By emailAddressField = By.id("input-email");
    @CacheLookup
            @FindBy(id="input-password")
            WebElement passwordField;
    //By passwordField = By.id("input-password");
    @CacheLookup
            @FindBy(xpath="//form[contains(@action,'login')]//input[@type='submit']")
            WebElement loginBtn;
    //By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String getReturningCustomerText() {
        String message =getTextFromElement(returningCustomerText);
        log.info("message"+returningCustomerText);
       // return getTextFromElement(returningCustomerText);
        return message;

    }

    public String getNewCustomerText() {
        log.info("New message"+newCustomerText);
        String message = getTextFromElement(newCustomerText);
        return message;
        //return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        log.info("Enter email " + email + "to email field" + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
       log.info("Enter password" + password + "to password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
       log.info("click on loging button" + loginBtn);
        clickOnElement(loginBtn);
    }

}
