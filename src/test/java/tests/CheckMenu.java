package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckMenu {


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
    private void MainMenuTest() throws InterruptedException {




        WebElement computerPartsClickMenu = driver.findElement(By.className("site-top__menu-right-link"));
        computerPartsClickMenu.click();
       WebElement dropDownMenuSelect = driver.findElement(By.linkText("Pasiūlymai"));
        dropDownMenuSelect.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect1 = driver.findElement(By.linkText("Nokautas kainoms"));
        dropDownMenuSelect1.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect2 = driver.findElement(By.linkText("Sprendimas taupantiems"));
        dropDownMenuSelect2.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect3 = driver.findElement(By.linkText("Leidiniai"));
        dropDownMenuSelect3.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect4 = driver.findElement(By.linkText("Patarimai"));
        dropDownMenuSelect4.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect5 = driver.findElement(By.linkText("SMART NET"));
        dropDownMenuSelect5.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect6 = driver.findElement(By.linkText("Naujakurys"));
        dropDownMenuSelect6.click();
        Thread.sleep(2000);
        WebElement dropDownMenuSelect7 = driver.findElement(By.linkText("Proficard"));
        dropDownMenuSelect7.click();
        Thread.sleep(2000);

    }

    @AfterMethod
    private void close() {
     //   try {
      //      Thread.sleep(6000);
     //   } catch (InterruptedException e) {
     //       e.printStackTrace();
      //  }
        driver.quit();
    }



}
