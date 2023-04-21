package com.elena.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextTranslationTests extends TestBase {

    @Test
    public void simpleTextTranslationViaAutoDetectLanguageToDefaultLanguage() {
        /*Translate from Hebrew to default language*/
        app.translator().typeInput("שלום!");
        String translation = app.translator().getTranslation();
        Assert.assertEquals(translation, "Hello!");
    }

    @Test
    public void addTranslationToSavedByGuest() {
        /*Not signed-in user (Guest) adds translations to Saved list, but opens pop-up*/
        app.translator().translate("Привет!");
        String translation = app.translator().getTranslation();
        Assert.assertEquals(translation, "Hello!");
        app.translator().saveToFavorits();
        Assert.assertTrue(app.popup().isPopUpAppears(), "I don't see pop-up");
    }
}
