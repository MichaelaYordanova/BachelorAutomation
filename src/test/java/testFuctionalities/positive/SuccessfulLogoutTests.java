package testFuctionalities.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.SuccessfulLogout;


public class SuccessfulLogoutTests extends BaseTest {

    @Test
    public void successfulLogout() {
        SuccessfulLogout.openCredoLive();
        SuccessfulLogout.successfulLogout();
        SuccessfulLogout.verifySuccessfulLogout("Login", "You might not be logged out");

    }

}
