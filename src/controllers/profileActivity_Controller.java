package controllers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

import helpers.android.profileActivity_Selectors;
import helpers.uiHelpers;

class profileActivity_Controller {
    static boolean tabOnEditButton (AppiumDriver<MobileElement> driver) {
        try {
            WebElement editButton = uiHelpers.findAnyElement(driver, profileActivity_Selectors.getEditProfileButton_Selector(), "xpath");
            editButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    static boolean editBirthPlace (AppiumDriver<MobileElement> driver, String newBirthPlace) {
        try {
            WebElement birthPlaceField = uiHelpers.findAnyElement(driver, profileActivity_Selectors.getBirthPlaceField_Selector(), "xpath");
            birthPlaceField.clear();
            birthPlaceField.sendKeys(newBirthPlace);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    static boolean saveProfileInfo (AppiumDriver<MobileElement> driver) {
        try {
            WebElement saveButton = uiHelpers.findAnyElement(driver, profileActivity_Selectors.getSaveButton_Selector(), "xpath");
            saveButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
