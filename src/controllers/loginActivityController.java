package controllers;

import org.openqa.selenium.WebDriver;
import helpers.uiHelpers;
import helpers.android.loginActivity_Selectors;
import org.openqa.selenium.WebElement;

class loginActivityController {
    static boolean fillInLoginForm(WebDriver driver, String email, String password){
        try{
            WebElement emailAddressField =
                    uiHelpers.findAnyElement(driver, loginActivity_Selectors.getEmailAddressSelector_xPath(), "xpath");
            WebElement passwordField =
                    uiHelpers.findAnyElement(driver, loginActivity_Selectors.getPasswordSelector_xPath(), "xpath");
            emailAddressField.sendKeys(email);
            // Essential for small screen devices to close the keyboard.
            driver.navigate().back();
            passwordField.sendKeys(password);
            // Essential for small screen devices to close the keyboard.
            driver.navigate().back();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    static boolean submitLoginForm(WebDriver driver){
        try{
            WebElement loginButton =
                    uiHelpers.findAnyElement(driver, loginActivity_Selectors.getLoginButtonSelector_xPath(), "xpath");
            loginButton.click();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
