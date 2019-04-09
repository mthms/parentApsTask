import helpers.uiHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.io.IOException;

import core.invokationCore;

import controllers.testCaseController;
import models.testCase;

import static models.testCase.getTestCaseLog;
import static models.testCase.isTestCaseStatus;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Identify the appiumDriver.
        AppiumDriver<MobileElement> appiumDriver;
        appiumDriver = invokationCore.invokeAppium();

        //Calling the testCases controller that manages steps execution.
        testCase testCase = testCaseController.runCase1(appiumDriver);
        if (isTestCaseStatus()){
            System.out.println("Case1 Test case passed successfully.\n Execution logs are below:");
        } else {
            System.out.println("Case1 Test case Failed.\n Execution logs are below:");
        }
        System.out.println(getTestCaseLog());
    }
}