package com.elena.qa.tests;

import com.elena.qa.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        app.stop();
    }


}
