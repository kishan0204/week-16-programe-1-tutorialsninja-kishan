package com.tutorialsninja.sw.steps;

import com.tutorialsninja.sw.pages.DesktopPage;
import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.ProductPage;
import com.tutorialsninja.sw.pages.ShoppingCartPage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopsSteps {
    @Given("^I select currency$")
    public void iSelectCurrency() {
        new HomePage().selectCurrency("£ Pound Sterling");
    }

    @When("^I mouse hover on desktops link$")
    public void iMouseHoverOnDesktopsLink() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }


    @And("^I Get all the products name and stored into array list$")
    public void iGetAllTheProductsNameAndStoredIntoArrayList() {
        new DesktopPage().getProductsNameList();
    }

    @And("^I Sort By Reverse order$")
    public void iSortByReverseOrder() {



    }

    @And("^I Select sort by Name Z - A$")
    public void iSelectSortByNameZA() {
        new DesktopPage().selectSortByOption("Name (Z - A)");
    }

    @And("^I After filter Z -A Get all the products name and stored into array list$")
    public void iAfterFilterZAGetAllTheProductsNameAndStoredIntoArrayList() {
        new DesktopPage().getProductsNameList();
    }

    @Then("^I Product Arrange In Alphabetical Order successfully$")
    public void iProductArrangeInAlphabeticalOrderSuccessfully() {

    }

    @And("^I Select sort by Name A-Z$")
    public void iSelectSortByNameAZ() {
        new DesktopPage().selectSortByOption("Name (A - Z)");
    }

    @And("^I select product by name$")
    public void iSelectProductByName() {
        new DesktopPage().selectProductByName("HP LP3065");
    }

    @And("^I Verify message product by name$")
    public void iVerifyMessageProductByName() {
        Assert.assertEquals("HP LP3065 Product not display","HP LP3065",new ProductPage().getProductText());
    }

    @And("^I select delivry date$")
    public void iSelectDelivryDate() {
        new ProductPage().selectDeliveryDate("30", "November", "2023");
    }

    @And("^I enter quantity$")
    public void iEnterQuantity() {
        new ProductPage().enterQuantity("1");
    }

    @And("^I click on add chart button$")
    public void iClickOnAddChartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I verify add chart butoon message$")
    public void iVerifyAddChartButoonMessage() {
        Assert.assertEquals("\"Product not added to cart","Success: You have added HP LP3065 to your shopping cart!",new ProductPage().getProductAddedSuccessMessage());
    }

    @And("^I click on shoping chart link in to message$")
    public void iClickOnShopingChartLinkInToMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("^I verify message shoping cart$")
    public void iVerifyMessageShopingCart() {
        Assert.assertEquals("message not disply","Shopping Cart",new ShoppingCartPage().getShoppingCartText());
    }

    @And("^I verify product name$")
    public void iVerifyProductName() {
        Assert.assertEquals("Product name not matched","HP LP3065",new ShoppingCartPage().getProductName());
    }

    @And("^I verify delivry date$")
    public void iVerifyDelivryDate() {
        Assert.assertEquals("Delivery date not matched","2023-11-30",new ShoppingCartPage().getDeliveryDate());
    }

    @And("^I verify get model name$")
    public void iVerifyGetModelName() {
        Assert.assertEquals("Model not matched","Product 21",new ShoppingCartPage().getModel());
    }

    @Then("^I should navigate Product Added To Shopping Cart SuccessFully$")
    public void iShouldNavigateProductAddedToShoppingCartSuccessFully() {
    }



    @And("^I select menu$")
    public void iSelectMenu() {
        new HomePage().selectMenu("Show All Desktops");
    }
}
