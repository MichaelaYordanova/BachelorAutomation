package testFuctionalities.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.SixTimesIncorrectPassword;

public class SixTimesIncorrectPasswordTests extends BaseTest {

    @Test
    public void sixTimesIncorrectPassword() throws InterruptedException {
        SixTimesIncorrectPassword.openCredoLive();
        SixTimesIncorrectPassword.clickOnLoginSixTimes("mmm123@amail.club", "111111");
        SixTimesIncorrectPassword.verifyToastErrorMessage("true","Toast did not show up");


    }
}
