package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;



public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//input[@id='gss-signin-email']")
    WebElement _emailAddress;
    @FindBy(xpath = "//input[@id='gss-signin-password']")
    WebElement _passwordLink;
    @FindBy(xpath = "//button[@id='gss-signin-submit']")
    WebElement _signIn;
    @FindBy(xpath = "//div[@id='gss-signin-incorrect-email-or-password']")
    WebElement _errorText;
    @FindBy(xpath = "//label[@id='login-form-email-label']//span[@class='label'][contains(text(),'Email address')]")
    WebElement _getSignInMessage;

    public String getSignInText(){
        Reporter.addStepLog("Getting verification message " + _getSignInMessage.toString());
        log.info("Getting verification message " + _getSignInMessage.toString());
        return getTextFromElement(_getSignInMessage);
    }

    public void enterEmailAddress(String email) {
        Reporter.addStepLog("Enter email " + email + "Email field " + _emailAddress.toString());
        sendTextToElement(_emailAddress, email);
        log.info("Enter email " + email + "Email field " + _emailAddress.toString());

    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password " + password + "Enter password " + _passwordLink.toString());
        sendTextToElement(_passwordLink, password);
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Clicking sign in button " + _signIn.toString());
        clickOnElement(_signIn);
        log.info("Clicking sign in button " + _signIn.toString());

    }

    public String getErrorText() {
        Reporter.addStepLog("Getting error message " + _errorText.toString());
        log.info("Getting error message " + _errorText.toString());
        return getTextFromElement(_errorText);
    }

}
