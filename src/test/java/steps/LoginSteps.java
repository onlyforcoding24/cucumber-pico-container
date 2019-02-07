package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    AutomationApi api;
    private LoginPage loginPage;

    public LoginSteps(AutomationApi api, LoginPage loginPage){
        this.api = api;
        this.loginPage = loginPage;
    }


    @Then("^I am on home page$")
    public void iAmOnHomePage() {
        loginPage.goToHomePage();
    }

    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
        System.out.println("I am on login page");
    }

    @When("^I enter username and password$")
    public void iEnterUsernameAndPassword() {
        System.out.println("I enter username and password");
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() {
        System.out.println("I click on submit button");
    }
}
