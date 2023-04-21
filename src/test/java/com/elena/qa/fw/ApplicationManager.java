package com.elena.qa.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
    TranslateHelper translate;
    PopUpHelper popup;


    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openSite("https://translate.google.com/");
        translate = new TranslateHelper(wd);
        popup = new PopUpHelper(wd);
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public TranslateHelper translator() {
        return translate;
    }

    public PopUpHelper popup() {
        return popup;
    }

    public void stop() {
        wd.quit();
    }

}
