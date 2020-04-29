package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//span[@class='button-text']")
    WebElement _accept;
    @FindBy(xpath = "//button[@id='header-account-signin-button']")
    WebElement _signInLink;
    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement _flightLink;

    public void clickOnAcceptButton() {
        Reporter.addStepLog("Clicking on accept button " + _accept.toString());
        clickOnElement(_accept);
        log.info("Clicking on accept button " + _accept.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Clicking on sign in button " + _signInLink.toString());
        clickOnElement(_signInLink);
        log.info("Clicking on sign in button " + _signInLink.toString());
    }

    public void clickOnFlightButton() {
        Reporter.addStepLog("Clicking on flight button " + _flightLink.toString());
        clickOnElement(_flightLink);
        log.info("Clicking on flight button " + _flightLink.toString());
    }
}
