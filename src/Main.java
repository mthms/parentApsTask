import helpers.uiHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.io.IOException;

import core.invokationCore;

import controllers.testCaseController;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello World!");

        AppiumDriver<MobileElement> appiumDriver;

        appiumDriver = invokationCore.invokeAppium();

        testCaseController.runCase1(appiumDriver);
    }
}