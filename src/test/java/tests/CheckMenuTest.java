package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class CheckMenuTest extends TestBase {


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

        driver.get("https://www.senukai.lt");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    private void MainMenuTest() throws InterruptedException {


        WebElement computerPartsClickMenu = driver.findElement(computerParrtsClickMenu);
        computerPartsClickMenu.click();
        WebElement dropDownMenuSelect = driver.findElement(dropDownMenuiSelected);
        dropDownMenuSelect.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect1 = driver.findElement(dropDownMenuiSelected1);
        dropDownMenuSelect1.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect2 = driver.findElement(computerParrtsClickMenu2);
        dropDownMenuSelect2.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect3 = driver.findElement(computerParrtsClickMenu3);
        dropDownMenuSelect3.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect4 = driver.findElement(computerParrtsClickMenu4);
        dropDownMenuSelect4.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect5 = driver.findElement(computerParrtsClickMenu5);
        dropDownMenuSelect5.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect6 = driver.findElement(computerParrtsClickMenu6);
        dropDownMenuSelect6.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect7 = driver.findElement(computerParrtsClickMenu7);
        dropDownMenuSelect7.click();
        Thread.sleep(2000);
        Assert.assertFalse(dropDownMenuSelect7.isEnabled());
    }

    @AfterMethod
    private void close() {

        driver.quit();
    }


}
