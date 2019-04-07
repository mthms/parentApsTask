package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uiHelpers {
    //A generic function to find any element.
    public static WebElement findAnyElement(WebDriver driver, String elementSelector, String selectorType){
        WebElement foundElement;
        WebDriverWait wait = new WebDriverWait(driver, 10);
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
}
