package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public LaptopsAndNotebooksPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Laptops & Notebooks')]")
            WebElement laptopsAndNotebooksText;

   // By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    @CacheLookup
           @FindBy(xpath="//p[@class ='price']")
           List<WebElement> productsPrices;
   // By productsPrices = By.xpath("//p[@class ='price']");
    @CacheLookup
           @FindBy(xpath="//h4/a")
           List<WebElement> productsList;
   // By productsList = By.xpath("//h4/a");
    @CacheLookup
           @FindBy(id="input-sort")
    WebElement sortBy;
    //By sortBy = By.id("input-sort");

    public String getLaptopsAndNotebooksText() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public ArrayList<Double> getProductsPriceList() {
        log.info("Product price"+productsPrices);
        List<WebElement> products = productsPrices;
        ArrayList<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return originalProductsPrice;
    }

    public void selectSortByOption(String option) {
        log.info("Select option"+sortBy);
        selectByVisibleTextFromDropDown(sortBy, option);
    }

    public void selectProductByName(String product) {
        log.info("Select product Name "+productsList);
        List<WebElement> products = productsList;
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
}
