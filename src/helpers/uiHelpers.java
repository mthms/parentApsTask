package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class uiHelpers {
    //A generic function to find any element.
    public static WebElement findAnyElement(WebDriver driver, String elementSelector, String selectorType){
        WebElement foundElement;
        switch (elementSelector) {
            case "xpath":
                foundElement = driver.findElement(By.xpath(elementSelector));
                break;
            case "id":
                foundElement = driver.findElement(By.id(elementSelector));
                break;
            default:
                foundElement = driver.findElement(By.xpath(elementSelector));
                break;
        }
        return foundElement;
    }
}
