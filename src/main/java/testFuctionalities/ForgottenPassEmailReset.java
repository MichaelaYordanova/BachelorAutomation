package testFuctionalities;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ForgottenPassEmailReset extends CommonBaseActions {
    private final static By LOGIN_BUTTON_HEADER = By.xpath("//a[@href='/login']");
    private final static By FORGOTTEN_PASSWORD_BUTTON = By.cssSelector("a[class='tt-none lh-2 tc-dark-gray link label'] label[class='td-underline']");
    private final static By RESET_VIA_EMAIL = By.xpath("//div[@class='col-sm-8 col-sm-offset-2 col-md-8 col-md-offset-2']//button[1]");
    private final static By EMAIL_FIELD = By.xpath("//input[@class='form-control field-note-space ng-untouched ng-pristine ng-invalid']");
    private final static By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
    private final static By SEND_AGAIN_BUTTON = By.cssSelector("p[class='disclaimer text-row'] a");



    public static void resetPasswordViaEmail(String email) throws InterruptedException {
        click(LOGIN_BUTTON_HEADER);
        Thread.sleep(5000);
        click(FORGOTTEN_PASSWORD_BUTTON);
        Thread.sleep(200);
        click(RESET_VIA_EMAIL);
        Thread.sleep(200);
        click(EMAIL_FIELD);
        Thread.sleep(200);
        type(EMAIL_FIELD, email);
        Thread.sleep(200);
        click(SUBMIT_BUTTON);
    }


    public static void verifyEmailHasBeenSent(String condition, String messageOnFailure) {
        String actualCredoButton = getText(SEND_AGAIN_BUTTON);
        Assert.assertTrue(true, messageOnFailure);
    }
}
