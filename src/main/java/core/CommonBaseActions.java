package core;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class CommonBaseActions {
    private final static By LOGIN_BUTTON_HEADER = By.xpath("//a[@href='/login']");
    private final static By USERNAME_INPUT_FIELD = By.xpath("//input[@formcontrolname='email']");
    private final static By PASSWORD_INPUT_FIELD = By.xpath("//input[@type='password']");
    private final static By EXACT_LOGIN_BUTTON = By.cssSelector("button[type='submit']");
    private static final By CREATE_TITLE_NAME_FIELD = By.xpath("//textarea[@class='form-area bordered title-field cw-modifier-title-field ng-pristine ng-invalid ng-touched']");

    protected static void type(By elementLocator, String whatToType) {
        driver.findElement(elementLocator).sendKeys(whatToType);
    }

//    protected static void typeIntoSearchBar(By elementLocator, String whatToType) {
//        driver.findElement(elementLocator).sendKeys(whatToType);
//    }

    /**
     * Gets current URL address
     *
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
     *
     * @param elementLocator provided locator
     */
    public static void click(By elementLocator) {
        driver.findElement(elementLocator).click();
    }

    /**
     * Gets text from element based on provided locator
     *
     * @param elementLocator provided locator
     * @return
     */
    protected static String getText(By elementLocator) {
        return driver.findElement(elementLocator).getText();
    }


    public static void login(String username, String password) {
        click(LOGIN_BUTTON_HEADER);
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        click(EXACT_LOGIN_BUTTON);
    }


}
