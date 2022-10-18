package Pages;

public class loginTestPage {
    public static void enterLoginEmail(String loginEmail) {
        Common.sendKeysToElement(loginEmail,
                Locators.TestsLocators.loginTest1);
    }
}
