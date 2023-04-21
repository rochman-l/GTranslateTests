package com.elena.qa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TranslateHelper extends HelperBase {

    public TranslateHelper(WebDriver wd) {
        super(wd);
    }

    public String getTitle() {
        return wd.findElement(By.xpath("//h1")).getText();
    }

    public void typeInput(String inputText) {
        type(By.cssSelector("textarea"), inputText);
    }

    public String getTranslation() {
        return waitForElementAndGetText(By.cssSelector("[aria-live='polite'] span[lang]"), 100);
    }

    public void saveToFavorits() {
        click(By.xpath("//div[@jsname='kDm4dd']"));
    }

    public void translate(String input) {
        typeInput("Привет!");
       getTranslation();
    }
}
