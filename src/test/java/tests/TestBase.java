package tests;

import Pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.Screenshots;

    @Listeners(Screenshots.class)
    public class TestBase {

        @BeforeMethod
        public void setUp() {
            Common.setUpDriver();
        }

        @AfterMethod
        public void tearDown() {
            Common.closeDriver();
        }
}
