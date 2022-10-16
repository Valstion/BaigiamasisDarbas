package Pages;

import org.openqa.selenium.By;

public class Locators {
    public static class TestsLocators {
        public static By computerParrtsClickMenu = By.className("site-top__menu-right-link");
        public static By dropDownMenuiSelected = By.linkText("Pasiūlymai");
        public static By dropDownMenuiSelected1 = By.linkText("Nokautas kainoms");
        public static By computerParrtsClickMenu2 = By.linkText("Sprendimas taupantiems");
        public static By computerParrtsClickMenu3 = By.linkText("Leidiniai");
        public static By computerParrtsClickMenu4 = By.linkText("Patarimai");
        public static By computerParrtsClickMenu5 = By.linkText("SMART NET");
        public static By computerParrtsClickMenu6 = By.linkText("Naujakurys");
        public static By computerParrtsClickMenu7 = By.linkText("Proficard");


        public static By buttonMessage1 = By.xpath("//input[@id='q']");
        public static By buttonMessage2 = new By.ByClassName("main-search__submit");
        public static By buttonMessage3 = new By.ByClassName("ks-page-title");


        public static By registerTest1 = By.xpath("//input[@id='user_first_name']");
        public static By registerTest2 = By.xpath("//input[@id='user_last_name']");
        public static By registerTest3 = By.xpath("//input[@id='user_email']");
        public static By registerTest4 = By.xpath("//input[@id='user_password']");
        public static By registerTest5 = By.xpath("//input[@id='user_password_confirmation']");
        public static By registerTest6 = By.xpath("//input[@id='user_marketing_consent_1']");
        public static By registerTest7 = By.xpath("//input[@id='user_marketing_consent_2']");
        public static By registerTest8 = By.name("commit");


        public static By purchase1 = new By.ByClassName("catalog-taxons-buy-button__icon");
        public static By purchase2 = new By.ByClassName("main-button-border");
        public static By purchase3 = new By.ByClassName("cart-block__handle");
        public static By purchase4 = By.xpath("//*[contains(@class, 'main-button cart-main-button')]");
        public static By purchase5 = By.xpath("//input[@id='user_email']");
        public static By purchase6 = By.xpath("//input[@id='user_password']");
        public static By purchase7 = By.name("commit");


        public static By loginTest1 = By.xpath("//input[@id='user_email']");
        public static By loginTest2 = By.xpath("//input[@id='user_password']");
        public static By loginTest3 = new By.ByClassName("users-session-form__submit");
        public static By loginTest4 = new By.ByClassName("users-session-form__error-message");


    }

}
