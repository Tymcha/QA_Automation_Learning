package utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Configuration.*;
import static utils.PropertyHelper.*;

public class TestRunner {
    @BeforeClass
    protected void setBrowser() {
        browser = getBrowserProperty();
        browserSize = getBrowserSizeProperty();
        timeout = getTimeoutProperty();
        pageLoadTimeout = getPageLoadTimeout();
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
