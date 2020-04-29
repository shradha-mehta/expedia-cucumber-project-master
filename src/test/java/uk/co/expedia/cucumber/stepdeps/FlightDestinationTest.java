package uk.co.expedia.cucumber.stepdeps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.expedia.pages.FlightPage;
import uk.co.expedia.pages.HomePage;

import static org.apache.log4j.NDC.clear;

/**
 * Created by Pradip
 */
public class FlightDestinationTest {
    @Given("^I am on home page of expedia website$")
    public void iAmOnHomePageOfExpediaWebsite() {
    }

    @And("^I click on Accept button$")
    public void iClickOnAcceptButton() {
        new HomePage().clickOnAcceptButton();
    }

    @When("^I click on Flight tab$")
    public void iClickOnFlightTab() {
        new HomePage().clickOnFlightButton();
    }

    @And("^I select flying from \"([^\"]*)\"$")
    public void iSelectFlyingFrom(String flyingFrom) {
        new FlightPage().enterFlyingFrom(flyingFrom);


    }

    @And("^I select Going to \"([^\"]*)\"$")
    public void iSelectGoingTo(String goingFrom) {
        new FlightPage().enterGoingTo(goingFrom);


    }

    @And("^I select Departing date \"([^\"]*)\"$")
    public void iSelectDepartingDate(String departingDate) {
        new FlightPage().enterDepartingDate(departingDate);


    }

    @And("^I select Returning date \"([^\"]*)\"$")
    public void iSelectReturningDate(String returnDate) {
        clear();
        new FlightPage().enterReturningDate(returnDate);


    }

    @And("^I click on Travellers$")
    public void iClickOnTravellers() {
        new FlightPage().clickOnTravellers();
    }

    @And("^I select two Travellers$")
    public void iSelectTwoTravellers() {
        new FlightPage().clickOnAdults();

    }

    @And("^I click on close button after selection of passengers$")
    public void iClickOnCloseButtonAfterSelectionOfPassengers() {
        new FlightPage().clickOnClose();
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new FlightPage().clickOnSearchButton();
    }


    @Then("^I should see my selected \"([^\"]*)\" successfully$")
    public void iShouldSeeMySelectedSuccessfully(String destination) {
        Assert.assertEquals(new FlightPage().getDestinationText(), destination);

    }

    @When("^I click on Flight button$")
    public void iClickOnFlightButton() {
        new FlightPage().clickOnFlightButton();
    }

    @Then("^I should navigate to Flight page successfully$")
    public void iShouldNavigateToFlightPageSuccessfully() {
        Assert.assertEquals(new FlightPage().getConfirmText(), "Search Flights");

    }
}
