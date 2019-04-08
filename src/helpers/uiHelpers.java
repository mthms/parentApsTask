package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uiHelpers {
    //A generic function to find any element.
    public static WebElement findAnyElement(WebDriver driver, String elementSelector, String selectorType){
        WebElement foundElement;
        WebDriverWait wait = new WebDriverWait(driver, 120);
        switch (selectorType) {
            case "xpath":
                foundElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementSelector)));
                break;
            case "id":
                foundElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementSelector)));
                break;
            default:
                foundElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementSelector)));
                break;
        }
        return foundElement;
    }

    //A generic scroll function to support the new clients of appium and selenium
    public static void scrollScreen(AppiumDriver<MobileElement> driver){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
    }
}
