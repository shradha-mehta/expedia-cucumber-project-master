package uk.co.expedia.cucumber.stepdeps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;

/**
 * Created by Pradip
 */
public class LoginTest {

    @And("^I click on account button$")
    public void iClickOnAccountButton() {
        new AccountPage().clickOnAccountButton();
    }


    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new HomePage().clickOnSignInButton();
    }

    @When("^I enter email in email field \"([^\"]*)\"$")
    public void iEnterEmailInEmailField(String email) {
        new SignInPage().enterEmailAddress(email);


    }

    @And("^I enter password in password field \"([^\"]*)\"$")
    public void iEnterPasswordInPasswordField(String password) {
        new SignInPage().enterPassword(password);

    }

    @And("^I click on sign in tab$")
    public void iClickOnSignInTab() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^I should see system showing error message$")
    public void iShouldSeeSystemShowingErrorMessage() {
        Assert.assertEquals(new SignInPage().getErrorText(), "You may have entered an unknown email address or an incorrect password");
    }


    @Then("^I should be in sign in page successfully$")
    public void iShouldBeInSignInPageSuccessfully() {
        Assert.assertEquals(new SignInPage().getSignInText(), "Email address");

    }
}
