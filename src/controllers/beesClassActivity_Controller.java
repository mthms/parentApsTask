package controllers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

import static helpers.android.beesClassActivity_Selectors.getSarahSmithProfilePicture_Selector;

class beesClassActivity_Controller {
    static boolean tabOnSarahSmith (AppiumDriver<MobileElement> driver){
        try {
            WebElement sarahSmithProfilePic = helpers.uiHelpers.findAnyElement(driver,
                    getSarahSmithProfilePicture_Selector(), "xpath");
            sarahSmithProfilePic.click();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
