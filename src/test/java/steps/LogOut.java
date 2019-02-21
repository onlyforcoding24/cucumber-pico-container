package steps;

import cucumber.api.java.en.Then;

public class LogOut {

    @Then("^I log out$")
    public void iLogOut() {
        System.out.println("I LOGGED OUT!");
    }

    @Then("^Click on logout button$")
    public void logOutButton() {
        System.out.println("I clcked logged out button!");
    }
}
