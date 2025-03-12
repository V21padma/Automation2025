package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForce{

@Given("User navigates to salesforce login page")
public void salesForceLogin(){}

    @When("user enter username {} and password {}")
    public void userEnterUsernameAndPassword(String arg0, String arg1) {

    }

    @And("clicks on Login button")
    public void clicksOnLoginButton() {

    }

    @Then("user should navigate to homepage")
    public void userShouldNavigateToHomepage() {
    }
}
