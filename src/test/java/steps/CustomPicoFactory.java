package steps;

import cucumber.runtime.java.picocontainer.PicoFactory;

public class CustomPicoFactory extends PicoFactory {

    public CustomPicoFactory(){
        System.setProperty("browser","chrome");
        if ("chrome".equals(System.getProperty("browser"))){
            addClass(ChromeUtility.class);
        }else
            addClass(FirefoxUtility.class);
    }
}

