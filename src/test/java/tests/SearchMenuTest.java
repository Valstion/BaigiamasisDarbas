package tests;//package readme.seleniumEasy.introduction;

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

public class SearchMenuTest {

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

        driver.get("https://www.senukai.lt");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    private void testInputFieldSeleniumEasy() throws InterruptedException {

        String searchBar = "iPhone";
        WebElement lookText = null;
        WebElement singleInputField = driver.findElement(buttonMessage1);
        singleInputField.sendKeys(searchBar);
        WebElement buttonShowMessage = driver.findElement( buttonMessage2);
        buttonShowMessage.click();
        lookText = driver.findElement(buttonMessage3);
        lookText.getText();
        String actualFullName = String.valueOf(lookText);
        Assert.assertFalse(actualFullName.contains(searchBar));

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



