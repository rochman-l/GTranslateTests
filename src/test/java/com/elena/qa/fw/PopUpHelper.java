package com.elena.qa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpHelper extends HelperBase {

    public PopUpHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isPopUpAppears(){
        return isElementPresent(By.cssSelector(".VfPpkd-P5QLlc"));
    }

}
