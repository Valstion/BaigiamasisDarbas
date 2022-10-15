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


        WebElement login = driver.findElement(By.xpath("//input[@id='user_first_name']"));
        login.sendKeys(vardas);

        WebElement loginUrname = driver.findElement(By.xpath("//input[@id='user_last_name']"));
        loginUrname.sendKeys(pavarde);


        WebElement emailInputr = driver.findElement(By.xpath("//input[@id='user_email']"));
        emailInputr.sendKeys(emailBars);


        WebElement passwordInputer = driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordInputer.sendKeys(password);

        WebElement passwordRepeter = driver.findElement(By.xpath("//input[@id='user_password_confirmation']"));
        passwordRepeter.sendKeys(password);


        WebElement marketingConsent = driver.findElement(By.xpath( "//input[@id='user_marketing_consent_1']")) ;
        marketingConsent.click();

        WebElement marketingConsent2 = driver.findElement(By.xpath( "//input[@id='user_marketing_consent_2']")) ;
        marketingConsent2.click();


        WebElement registerButton = driver.findElement( By.name("commit"));
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
