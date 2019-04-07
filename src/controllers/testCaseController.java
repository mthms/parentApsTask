package controllers;

import models.userModel;
import helpers.configurationHelper;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

import static models.userModel.*;

public class testCaseController {
    public static boolean runCase1(WebDriver appium) throws IOException {
        // ** Step 1: Fill in and Submit login form ** //
        //Prepare login form's data
        Properties properties;
        properties = configurationHelper.getConfig();

        userModel userModel = new userModel();
        setEmailAddress(properties.getProperty("userName"));
        setPassword(properties.getProperty("password"));

        //Fill in the login form and check it's status
        boolean formFillingStatus =
                loginActivityController.fillInLoginForm(appium, getEmailAddress(), getPassword());
        if (!formFillingStatus){
            System.out.println("Form filling execution failed.");
            return false;
        }

        //Submit the login form and check the status
        boolean formSubmissionStatus =
                loginActivityController.submitLoginForm(appium);
        if (!formSubmissionStatus){
            System.out.println("Form submission failed.");
            return false;
        }

        return true;
    }
}
