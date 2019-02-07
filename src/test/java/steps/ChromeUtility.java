package steps;

public class ChromeUtility implements AutomationApi{

    public void launchChrome(){
        System.out.println("launching Chrome!!");
    }

    public String getDriver() {
        return "Chrome Driver";
    }

    public String getBrowserName() {
        return "Chrome Browser";
    }
}
