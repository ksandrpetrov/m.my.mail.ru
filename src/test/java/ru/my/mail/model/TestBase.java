package ru.my.mail.model;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.my.mail.appmanager.ApplicationManager;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
