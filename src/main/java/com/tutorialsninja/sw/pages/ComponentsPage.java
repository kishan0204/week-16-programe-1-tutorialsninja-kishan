package com.tutorialsninja.sw.pages;


import com.tutorialsninja.sw.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani
 */
public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
            @FindBy(xpath="//h2[contains(text(),'Components')]")
    WebElement componentsText;

    //By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentsText() {
        String message = getTextFromElement(componentsText);
        log.info("Get text message"+componentsText);
        //return getTextFromElement(componentsText);
        getTextFromElement(componentsText);
        return message;
    }
}
