package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.Locators.TestsLocators.*;

public class Registertest {
    WebDriver driver;
    private TimeUnit thread;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("headless");

        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();

        driver.get("https://www.senukai.lt/users/sign_up");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    private void firstPartTest() throws InterruptedException {



        String vardas = "Jevgenij";
        String pavarde = "Relaxer";
        String emailBars = "emaxer@gmail.com";
        String password = "123456789";


        WebElement login = driver.findElement(registerTest1);
        login.sendKeys(vardas);

        WebElement loginUrname = driver.findElement(registerTest2);
        loginUrname.sendKeys(pavarde);


        WebElement emailInputr = driver.findElement(registerTest3);
        emailInputr.sendKeys(emailBars);


        WebElement passwordInputer = driver.findElement(registerTest4);
        passwordInputer.sendKeys(password);

        WebElement passwordRepeter = driver.findElement(registerTest5);
        passwordRepeter.sendKeys(password);


        WebElement marketingConsent = driver.findElement(registerTest6) ;
        marketingConsent.click();

        WebElement marketingConsent2 = driver.findElement(registerTest7) ;
        marketingConsent2.click();


        WebElement registerButton = driver.findElement( registerTest8);
        registerButton.click();


    }
    @AfterMethod
    private void close () {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }




}
