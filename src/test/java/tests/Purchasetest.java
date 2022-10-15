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

public class Purchasetest {
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

        driver.get("https://www.senukai.lt/p/mobilusis-telefonas-apple-iphone-14-pro-violetinis-6gb-128gb/mf2d?mtd=search&pos=regular&src=searchnode");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    private void firstPartTest() throws InterruptedException {

        String emailReal = "emaxer@gmail.com";
        String passwordReal = "123456789";


        WebElement purchaseBagClick = driver.findElement(new By.ByClassName("catalog-taxons-buy-button__icon"));
        purchaseBagClick.click();

        WebElement goToTheBagOfJoy = driver.findElement(new By.ByClassName("main-button-border"));
        goToTheBagOfJoy.click();
        WebElement purchaseButton = driver.findElement(new By.ByClassName("cart-block__handle"));
        purchaseButton.click();

        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@class, 'main-button cart-main-button')]"));
        continueButton.click();

        WebElement loginEmail = driver.findElement(By.xpath("//input[@id='user_email']"));
        loginEmail.sendKeys(emailReal);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordInput.sendKeys(passwordReal);

        WebElement registerButton = driver.findElement(By.name("commit"));
        registerButton.click();

    }

    @AfterMethod
    private void close() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}
