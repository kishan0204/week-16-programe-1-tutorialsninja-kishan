package com.tutorialsninja.sw.steps;

import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class RegisterSteps {
    @And("^I Click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().selectMyAccountOptions("Register");
    }

    @And("^I click on first name$")
    public void iClickOnFirstName() {
        new RegisterPage().enterFirstNameField("kishan");
    }

    @And("^I click on last name$")
    public void iClickOnLastName() {
        new RegisterPage().enterLastNameField("malaviya");
    }

    @And("^I enter email id field$")
    public void iEnterEmailIdField() {
        new RegisterPage().enterEmailIdField("kishan_");
    }

    @And("^I enter phone number$")
    public void iEnterPhoneNumber() {
        new RegisterPage().enterPhoneNumberField("07534666850");
    }

    @And("^I enter password field$")
    public void iEnterPasswordField() {
        new RegisterPage().enterPasswordField("123456");
    }

    @And("^I enter password confirm field$")
    public void iEnterPasswordConfirmField() {
        new RegisterPage().enterPasswordConfirmField("123456");
    }

    @And("^I click on radio button$")
    public void iClickOnRadioButton() {
        new RegisterPage().clickOnRadioButton();
    }

    @And("^I click on privacy policy$")
    public void iClickOnPrivacyPolicy() {
        new RegisterPage().clickOnPrivacyPolicy();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I verify Account created$")
    public void iVerifyAccountCreated() {
        new RegisterPage().verifyAccountCreated();

    }

    @And("^I click on continue button link$")
    public void iClickOnContinueButtonLink() {
        new RegisterPage().clickOnContinueButtonLink();
    }

    @And("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new RegisterPage().clickOnMyAccountLin();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new RegisterPage().clickOnLogOut();
    }
}
