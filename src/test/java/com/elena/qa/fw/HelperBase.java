package com.elena.qa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public String waitForElementAndGetText(By locator, int timeOut) {
       return waitForElement(locator, timeOut).getText();
    }

    public void type(By locator, String text) {
        if(text!=null){
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public WebElement waitForElement(By locator, int timeOut) {
       return new WebDriverWait(wd, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
