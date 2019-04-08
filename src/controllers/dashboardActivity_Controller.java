package controllers;

import helpers.uiHelpers;
import helpers.android.dashboardActivity_Selectors;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

class dashboardActivity_Controller {
    //Tab on the beesClass
    static boolean tabOnBeesClass(AppiumDriver<MobileElement> driver){
        try {
            WebElement beesClassButton = uiHelpers.findAnyElement(driver, dashboardActivity_Selectors.getBeeClassSelector_xPath(), "xpath");
            beesClassButton.click();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
