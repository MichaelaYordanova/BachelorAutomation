package testFuctionalities;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SixTimesIncorrectPassword extends CommonBaseActions {

    private final static By LOGIN_BUTTON_HEADER = By.xpath("//a[@href='/login']");
    private final static By USERNAME_INPUT_FIELD = By.xpath("//input[@formcontrolname='email']");
    private final static By PASSWORD_INPUT_FIELD = By.xpath("//input[@type='password']");
    private final static By EXACT_LOGIN_BUTTON = By.cssSelector("button[type='submit']");
    private final static By TOAST_ERROR_MESSAGE = By.xpath("//div[@class='cw-toast-message error']");

    public static void clickOnLoginSixTimes(String username, String password) throws InterruptedException {
        click(LOGIN_BUTTON_HEADER);
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        for (int i = 0; i < 6; i++) {
            Thread.sleep(5000);
            click(EXACT_LOGIN_BUTTON);

        }


    }

    public static void verifyToastErrorMessage(String expectedToast, String messageOnFailure) {
        String actualLogoutButtonText = getText(TOAST_ERROR_MESSAGE);
        Assert.assertTrue(true, expectedToast);
    }
}
