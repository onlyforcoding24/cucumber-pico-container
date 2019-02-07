package steps;

public class LoginPage {

    AutomationApi api;

    public LoginPage(AutomationApi api){
        this.api = api;
    }

    public void goToHomePage(){
        System.out.println("I have a "+api.getDriver());
        System.out.println("Running Test on "+api.getBrowserName());
        System.out.println("I am on home page");
    }

}

