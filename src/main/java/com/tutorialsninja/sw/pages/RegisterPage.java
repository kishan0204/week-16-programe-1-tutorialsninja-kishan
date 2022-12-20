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

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath="//input[@id='input-firstname']")
    WebElement firstNameField;
    //By firstNameField = By.xpath("//input[@id='input-firstname']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-lastname']")
            WebElement lastNameField;
    //By lastNameField = By.xpath("//input[@id='input-lastname']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-email']")
            WebElement emailIdField;
    //By emailIdField = By.xpath("//input[@id='input-email']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-telephone']")
            WebElement phoneNumberField;
    //By phoneNumberField = By.xpath("//input[@id='input-telephone']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-password']")
            WebElement passwordField;
    //By passwordField = By.xpath("//input[@id='input-password']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-confirm']")
            WebElement passwordConfirmField;
    //By passwordConfirmField = By.xpath("//input[@id='input-confirm']");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")
            WebElement radioButton;
    //By radioButton = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
            WebElement privacyPolicy;
    //By privacyPolicy =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
            WebElement continueButton;
    //By continueButton =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
    @CacheLookup
            @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
            WebElement accountCreated;
    //By accountCreated =By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"); //Your Account Has Been Created!
    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'Continue')]")
            WebElement continueButtonLink;
   // By continueButtonLink = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
           @FindBy(xpath="//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
           WebElement myAccountLink;
   // By myAccountLink = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    @CacheLookup
           @FindBy(xpath="//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logOut;

   // By logOut =By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");

    public void enterFirstNameField(String firstname){
       log.info("Enter first name " + firstname + "to email field" + firstname.toString());
        sendTextToElement(firstNameField,firstname);
      }
    public void enterLastNameField(String lastName){
       log.info("Enter last name " + lastName + "to email field" + lastName.toString());
        sendTextToElement(lastNameField,lastName);
   }
    public void enterEmailIdField(String emailId){
      log.info("Enter email " +emailId + "to email field" + emailIdField.toString());
        sendTextToElement(emailIdField,emailId +getRandomString(2)+"@yahoo.co.in");
      }
    public void enterPhoneNumberField(String phoneNumber){
       log.info("Enter phone number  " +phoneNumber + "to phone number field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField,phoneNumber);

    }
    public void enterPasswordField (String password){
       log.info("Enter password" + password+ "password field "+passwordField.toString());
        sendTextToElement(passwordField,password);
       }
    public void enterPasswordConfirmField(String passwordConfirm) {
        log.info("Enter password confirm" + passwordConfirm + "password conform field " + passwordConfirm.toString());
        sendTextToElement(passwordConfirmField, passwordConfirm);
    }

    public void clickOnRadioButton() {
        log.info("click on loging button" + radioButton);
        clickOnElement(radioButton);
    }
    public void clickOnPrivacyPolicy(){
       log.info("radio buttton" + privacyPolicy);
        clickOnElement(privacyPolicy);
        }
    public void clickOnContinueButton(){
        log.info("click" + continueButton);
        clickOnElement(continueButton);

    }
    public void verifyAccountCreated() {
       log.info("click on loging button" + accountCreated);
        verifyTextFromElements(accountCreated,"Your Account Has Been Created!");

    }
    public void clickOnContinueButtonLink(){
        log.info("click on contunie button" + continueButtonLink);
        clickOnElement(continueButtonLink);}
    public void clickOnMyAccountLin(){
       log.info("click on my account link button" + myAccountLink);
        clickOnElement(myAccountLink);
       }

    public void clickOnLogOut(){
        log.info("click button" + logOut);
    clickOnElement(logOut);
        }
    }




