package controllers;

import helpers.uiHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.userModel;
import helpers.configurationHelper;

import java.io.IOException;
import java.util.Properties;

import static controllers.dashboardActivity_Controller.tabOnBeesClass;
import static models.userModel.*;

public class testCaseController {
    public static boolean runCase1(AppiumDriver<MobileElement> appium) throws IOException, InterruptedException {
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

        //Time to load the dashboard 10 secconds to load the info
        Thread.sleep(10000);

        //Scroll to find the beesClass on UI
        uiHelpers.scrollScreen(appium);

        // Time to Load the available classes.
        Thread.sleep(10000);

        //Step 2 Tab on beesClass from dashboard classes
        boolean beesClassTabAction = tabOnBeesClass(appium);
        if (!beesClassTabAction){
            System.out.println("Tabbing on beesClass failed.");
            return false;
        }

        // Time to load the class's info
        Thread.sleep(10000);

        //Scroll to find Sarah Smith Child
        uiHelpers.scrollScreen(appium);

        // Time to load the checkedIn children
        Thread.sleep(10000);

        //Step 3 Tab on Sarah Smith from children and go to the profile
        boolean sarahSmithTabAction = beesClassActivity_Controller.tabOnSarahSmith(appium);
        if (!sarahSmithTabAction) {
            System.out.println("Tabbing on SarahSmith Failed.");
            return false;
        }

        //Time to load the profile menu
        Thread.sleep(2000);

        boolean profileButtonTabAction = beesClassActivity_Controller.tabOnProfileButton(appium);
        if (!profileButtonTabAction) {
            System.out.println("Tabbing on profile button failed.");
            return false;
        }

        return true;
    }
}
