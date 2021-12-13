package core;

import org.openqa.selenium.By;
import utils.Browser;

import static utils.Browser.*;

public class CommonBaseActions {
    protected static void type(By elementLocator, String whatToType) {
        driver.findElement(elementLocator).sendKeys(whatToType);
    }

    protected static void typeIntoSearchBar(By elementLocator, String whatToType) {
        driver.findElement(elementLocator).sendKeys(whatToType);
    }

    /**
     * Gets current URL address
     * @return the current URL address
     */
    protected static String getURL() {
        return driver.getCurrentUrl();
    }

    public static void openCredoLive() {
        driver.get("https://www.credoweb.bg/");
    }

    public static void openCredoRC() {
        driver.get("https://rc.www.credoweb.bg/");
    }

    public static void openCredoHF() {
        driver.get("https://www.hf.credoweb.bg/");
    }

    public static void openCredoDev() {
        driver.get("https://www.dev.credoweb.bg/");
    }

    /**
     * Clicks on element based on provided locator
     * @param elementLocator provided locator
     */
    public static void click(By elementLocator) {
        driver.findElement(elementLocator).click();
    }

    /**
     * Gets text from element based on provided locator
     * @param elementLocator provided locator
     * @return
     */
    protected static String getText(By elementLocator) {
        return driver.findElement(elementLocator).getText();
    }




}
