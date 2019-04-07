package core;

import helpers.configurationHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class invokationCore{
    //A generic function to be configured for iOS and Android
    public static WebDriver invokeAppium() throws IOException {
        WebDriver appium;

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
        appium = new RemoteWebDriver(new URL(properties.getProperty("appiumDriverUrl")), desiredCapabilities);
        return appium;
    }
}