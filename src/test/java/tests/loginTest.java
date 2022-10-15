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

public class loginTest {

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

        driver.get("https://www.senukai.lt/users/sign_in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    private void firstPartTest() throws InterruptedException {

        String emailBar = "emaxer@gmail.com";
        String password = "124754567459";
      //  String isPasswordCorrect = null;
        String isNotCorect = "Neteisingas el. pašto adresas arba slaptažodis";
        WebElement loginEmail = driver.findElement(By.xpath("//input[@id='user_email']"));
        loginEmail.sendKeys(emailBar);

       WebElement passwordInput = driver.findElement(By.xpath("//input[@id='user_password']"));
       passwordInput.sendKeys(password);

        WebElement openprisijungti = driver.findElement(new By.ByClassName("users-session-form__submit"));
        openprisijungti.click();

        WebElement isPasswordCorrect = driver.findElement(new By.ByClassName("users-session-form__error-message"));
        isPasswordCorrect.getText();
        Assert.assertFalse(Boolean.parseBoolean(String.valueOf(isPasswordCorrect)), isNotCorect);

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
