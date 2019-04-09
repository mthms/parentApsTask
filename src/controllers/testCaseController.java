package controllers;

import helpers.uiHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.testCase;
import helpers.configurationHelper;

import java.io.IOException;
import java.util.Properties;

import static controllers.dashboardActivity_Controller.tabOnBeesClass;
import static models.testCase.getTestCaseLog;
import static models.testCase.setTestCaseStatus;
import static models.userModel.*;
import static models.testCase.setTestCaseLog;

public class testCaseController {
    public static testCase runCase1(AppiumDriver<MobileElement> appium) throws IOException, InterruptedException {
        //Prepare login form's data
        Properties properties;
        properties = configurationHelper.getConfig();

        testCase testCase = new testCase();

        setEmailAddress(properties.getProperty("userName"));
        setPassword(properties.getProperty("password"));

        setTestCaseLog("TestCase started.");
        // ** Step 1: Fill in and Submit login form ** //
        //Fill in the login form and check it's status
        boolean formFillingStatus =
                loginActivityController.fillInLoginForm(appium, getEmailAddress(), getPassword());
        //Start of logging action.
        if (!formFillingStatus){
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nLogin Form filling status failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nLogin Form filling status Passed."));
        }
        //End of logging action.

        //Submit the login form and check the status
        boolean formSubmissionStatus = loginActivityController.submitLoginForm(appium);
        //Start of logging action.
        if (!formSubmissionStatus){
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nForm submission failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nSubmitted login form."));
        }
        //End of logging action.

        //Time to load the dashboard 10 secconds
        Thread.sleep(10000);

        //Scroll to find the beesClass on UI
        uiHelpers.scrollScreen(appium);

        // Time to Load the available classes.
        Thread.sleep(10000);

        //Step 2 Tab on beesClass from dashboard classes
        boolean beesClassTabAction = tabOnBeesClass(appium);
        //Start of logging action.
        if (!beesClassTabAction){
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nTabbing on beesClass failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nClicked the bee class."));
        }
        //End of logging action.

        // Time to load the class's info
        Thread.sleep(10000);

        //Scroll to find Sarah Smith Child
        uiHelpers.scrollScreen(appium);

        // Time to load the checkedIn children
        Thread.sleep(10000);

        //**Step 3 Tab on Sarah Smith from children**//
        boolean sarahSmithTabAction = beesClassActivity_Controller.tabOnSarahSmith(appium);
        //Start of logging action.
        if (!sarahSmithTabAction) {
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nTabbing on Sarah Smith failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nClicked the Sarah Smith's profile picture."));
        }
        //End of logging action.

        //Time to load the profile menu
        Thread.sleep(2000);

        //**Step 4 Tab on Profile button.**//
        boolean profileButtonTabAction = beesClassActivity_Controller.tabOnProfileButton(appium);
        //Start of logging action.
        if (!profileButtonTabAction) {
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nTabbing on profile button failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nClicked the profile button."));
        }
        //End of logging action.

        //**Step 5 Tab on edit button.**//
        boolean editLinkTabAction = profileActivity_Controller.tabOnEditButton(appium);
        //Start of logging action.
        if (!editLinkTabAction) {
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nTabbing on the edit link failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nClicked the edit link."));
        }
        //End of logging action.

        //Time to load the child's editView
        Thread.sleep(2000);

        uiHelpers.scrollScreen(appium);

        //Time to load the child's editView
        Thread.sleep(2000);

        //**Step 6 edit the birthPlace**//
        boolean birthPlaceEditField = profileActivity_Controller.editBirthPlace(appium, "Cairo");
        //Start of logging action.
        if (!birthPlaceEditField) {
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nEditing the birth place failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nEdited the birth place successfully."));
        }
        //End of logging action.
        boolean saveButtonTabAction = profileActivity_Controller.saveProfileInfo(appium);
        //Start of logging action.
        if (!saveButtonTabAction) {
            setTestCaseStatus(false);
            setTestCaseLog(getTestCaseLog().concat("\nSaving the information failed."));
            return testCase;
        } else {
            setTestCaseLog(getTestCaseLog().concat("\nSaved the birth place successfully."));
        }
        //End of logging action.
        return testCase;
    }
}
