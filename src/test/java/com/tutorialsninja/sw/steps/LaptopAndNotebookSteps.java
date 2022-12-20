package com.tutorialsninja.sw.steps;

import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.sw.pages.ProductPage;
import com.tutorialsninja.sw.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LaptopAndNotebookSteps {
    @When("^I mouse hover on laptop and note book link$")
    public void iMouseHoverOnLaptopAndNoteBookLink() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("^I selcet menue show$")
    public void iSelcetMenueShow() {
        new HomePage().selectMenu("Show All Laptops & Notebooks");
    }

    @And("^I select original prodct price$")
    public void iSelectOriginalProdctPrice() {
        new LaptopsAndNotebooksPage().getProductsPriceList();
    }

    @And("^I select lprice high to low$")
    public void iSelectLpriceHighToLow() {
        new LaptopsAndNotebooksPage().selectSortByOption("Price (High > Low)");
    }

    @Then("^I should Products Price Display High To Low Successfully$")
    public void iShouldProductsPriceDisplayHighToLowSuccessfully() {
    }

    @And("^I select product macbook$")
    public void iSelectProductMacbook() {
        new LaptopsAndNotebooksPage().selectProductByName("MacBook");

    }

//    @And("^I verify message macbook$")
//    public void iVerifyMessageMacbook() {
//        Assert.assertEquals("MacBook Product not display","MacBook",new ProductPage().getProductText());
//    }
//
//    @And("^I verify add chart butoon message macbook$")
//    public void iVerifyAddChartButoonMessageMacbook() {
//        Assert.assertEquals("Product name not matched","MacBook",new ShoppingCartPage().getProductName());
//    }
@And("^I click on clik on shoping chart link$")
public void iClickOnClikOnShopingChartLink() {
    new ProductPage().clickOnShoppingCartLinkIntoMessage();
}

    @And("^I change quantity$")
    public void iChangeQuantity() {
        new ShoppingCartPage().changeQuantity("2");
    }

    @And("^I click on update button$")
    public void iClickOnUpdateButton() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @And("^I get veriy message$")
    public void iGetVeriyMessage() {
        Assert.assertEquals("message","Success: You have modified your shopping cart!",new ShoppingCartPage().getSuccessModifiedMessage() );
    }

    @And("^I total matched$")
    public void iTotalMatched() {
        Assert.assertEquals("Total not matched","£737.45",new ShoppingCartPage().getTotal());
    }

    @Then("^I Place Order Successfully$")
    public void iPlaceOrderSuccessfully() {
    }

    @And("^I click on update buttons$")
    public void iClickOnUpdateButtons() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }


}
