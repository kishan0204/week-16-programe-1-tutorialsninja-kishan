package com.tutorialsninja.sw.steps;


import com.tutorialsninja.sw.pages.AccountLoginPage;
import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.MyAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Jay Vaghani
 */
public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on my account tab$")
    public void iClickOnMyAccountTab() {
        new HomePage().clickOnMyQAccountTab();

    }

    @And("^I select option login$")
    public void iSelectOptionLogin() {
        new HomePage().selectMyAccountOptions("Login");
    }

    @Then("^I Should Navigate To Login Page Successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("message not display", "Returning Customer", new AccountLoginPage().getReturningCustomerText());
    }

    @And("^I enter email address\"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
        new AccountLoginPage().enterEmailAddress(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new AccountLoginPage().enterPassword(password);

    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }


    @And("^I click on my account$")
    public void iClickOnMyAccount() {
        new MyAccountPage().clickOnMyQAccountTab1();
    }

    @And("^I select my account options$")
    public void iSelectMyAccountOptions() {
        new MyAccountPage().selectMyAccountOptions1("Logout");
    }

    @Then("^I Should Login And Logout Successfully$")
    public void iShouldLoginAndLogoutSuccessfully() {
        Assert.assertEquals("Account Logout",new MyAccountPage().getAccountLogoutText());
    }


}




