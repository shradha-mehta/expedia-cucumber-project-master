package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;


public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    @FindBy(xpath = "//button[@id='header-account-menu']")
    WebElement _accountLink;

    public void clickOnAccountButton() {
        Reporter.addStepLog("Clicking on account button " + _accountLink.toString());
        clickOnElement(_accountLink);
        log.info("Clicking on account button " + _accountLink.toString());
    }

}
