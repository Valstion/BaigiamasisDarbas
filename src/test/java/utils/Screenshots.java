package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Screenshots implements ITestListener {


    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String directory = "./screenshots";

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss_SSS");
        String dateTime = localDateTime.format(formatter);

        File screenshotFile = new File(
                directory + "/screenshot_" + dateTime + "_" + UUID.randomUUID() + ".png"
        );

        try {
            FileUtils.copyFile(screenshotRaw, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
