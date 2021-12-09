package testFuctionalities.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.UiComponents.CredoHeader;
import core.CommonBaseActions;
import utils.Browser;


public class CredoHeaderTests extends BaseTest {

    @Test
    public void checkForCredoHeaderButton() {
        CredoHeader.openCredoLive();
        CredoHeader.verifyCredoHeaderButtonIsPresent("true", "Button is not visible");

    }

}
