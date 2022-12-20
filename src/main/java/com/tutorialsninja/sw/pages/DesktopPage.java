package com.tutorialsninja.sw.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.sw.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By productsList = By.xpath("//h4/a");
    By sortBy = By.id("input-sort");


    public String getDesktopsText() {
        String message = getTextFromElement(desktopsText);
        log.info("Desktops text"+desktopsText);
       // return getTextFromElement(desktopsText);
        return message;
    }

    public ArrayList<String> getProductsNameList() {
        log.info("get it product name "+ productsList);
        List<WebElement> products = getListOfElements(productsList);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }
    public void selectProductByName(String product) {
        log.info("get it product list name"+productsList);
        List<WebElement> products = getListOfElements(productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

    public void selectSortByOption(String option) {
       log.info("Select option"+sortBy);
        selectByVisibleTextFromDropDown(sortBy, option);
    }
}
