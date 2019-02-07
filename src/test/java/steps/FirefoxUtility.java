package steps;

public class FirefoxUtility implements AutomationApi{

    public void launchFirefox(){
        System.out.println("Launching Firefox browser");
    }

    public String getDriver() {
        return "Firefox Driver";
    }

    public String getBrowserName() {
        return "Firefox Browser";
    }
}
