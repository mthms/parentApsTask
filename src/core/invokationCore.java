package core;

import helpers.configurationHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class invokationCore{
    //A generic function to be configured for iOS and Android
    public static AppiumDriver<MobileElement> invokeAppium() throws IOException {
        AppiumDriver<MobileElement> appium;

        //Calling configuration manager to return an object of the configuration file.
        Properties properties = configurationHelper.getConfig();

        //Desired Capabilities definitions from config file.
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", properties.getProperty("deviceName"));
        desiredCapabilities.setCapability("platformName", properties.getProperty("platformName"));
        desiredCapabilities.setCapability("appiumDriverUrl", properties.getProperty("appiumDriverUrl"));
        desiredCapabilities.setCapability("platformVersion", properties.getProperty("platformVersion"));
        desiredCapabilities.setCapability("appPackage", properties.getProperty("appPackage"));
        desiredCapabilities.setCapability("appWaitActivity", properties.getProperty("appWaitActivity"));
        desiredCapabilities.setCapability("app", properties.getProperty("app"));

        //Connecting the desired capabilities with the appium server.

        appium = new AndroidDriver<MobileElement>(new URL(properties.getProperty("appiumDriverUrl")), desiredCapabilities);

        return appium;
    }
}