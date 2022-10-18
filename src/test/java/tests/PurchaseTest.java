package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.Locators.TestsLocators.*;

public class PurchaseTest extends TestBase {
    WebDriver driver;
    private TimeUnit thread;

    @BeforeMethod

    public void setUp() {
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


        WebElement purchaseBagClick = driver.findElement(purchase1);
        purchaseBagClick.click();

        WebElement goToTheBagOfJoy = driver.findElement(purchase2);
        goToTheBagOfJoy.click();
        WebElement purchaseButton = driver.findElement(purchase3);
        purchaseButton.click();

        WebElement continueButton = driver.findElement(purchase4);
        continueButton.click();

        WebElement loginEmail = driver.findElement(purchase5);
        loginEmail.sendKeys(emailReal);

        WebElement passwordInput = driver.findElement(purchase6);
        passwordInput.sendKeys(passwordReal);

        WebElement registerButton = driver.findElement(purchase7);
        registerButton.click();

    }

    @AfterMethod
    private void close() {

        driver.quit();
    }


}
