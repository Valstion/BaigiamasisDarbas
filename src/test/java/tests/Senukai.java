package tests;//package readme.seleniumEasy.introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.icu.impl.BMPSet;
import jdk.internal.org.objectweb.asm.tree.InsnList;
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

public class Senukai {

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


        WebElement singleInputField = driver.findElement(By.xpath("//input[@id='q']"));
        singleInputField.sendKeys(searchBar);

        WebElement buttonShowMessage = driver.findElement(new By.ByClassName("main-search__submit"));
        buttonShowMessage.click();

        lookText = driver.findElement(new By.ByClassName("ks-mobile-menu-title sn-topBar-title"));
        lookText.getText();

        String actualFullName = String.valueOf(lookText);
        Assert.assertTrue(actualFullName.contains(searchBar));

    }

    @Test
    private void firstPartTest() throws InterruptedException {

        WebElement buttonShowMessage = driver.findElement(By.xpath("//input[@id='$0']"));
        buttonShowMessage.click();
        WebElement clickButton = driver.findElement(new By.ByClassName("main-search-submit__icon icon-svg"));
        clickButton.click();

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



