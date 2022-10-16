package Pages;

import utils.Driver;

public class Common {
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void setUpDriver() {Driver.setDriver();    }

    public static void closeDriver() { Driver.close();    }
}
