package testFuctionalities;
import org.openqa.selenium.By;
import core.CommonBaseActions;
import org.openqa.selenium.JavascriptExecutor;

import static sun.plugin.javascript.navig.JSType.Element;
import static utils.Browser.driver;

public class CreateNewSecretDiscussion extends CommonBaseActions{
    private static final By DISCUSSIONS_BUTTON = By.xpath("/html[1]/body[1]/app[1]/div[3]/top-menu[1]/div[1]/nav[1]/ul[1]/li[3]/span[1]/a[1]");
    private static final By CREATE_NEW_DISCUSSION_BUTTON = By.cssSelector("body > app:nth-child(2) > div:nth-child(4) > top-menu:nth-child(2) > div:nth-child(1) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > ul:nth-child(3) > li:nth-child(6) > a:nth-child(1) > span:nth-child(1)");
    private static final By CREATE_TITLE_NAME_FIELD = By.xpath("//textarea");
    private static final By PUBLIC_DESCRIPTION_FIELD = By.cssSelector(".mceContentBody");
    ///html/body/app/div[3]/discussion-modifier/div/form/div/div[3]/div[1]/div/editor/div/div/div[2] nai-blizkiq selektor
    private static final By PARTICIPANT_DESCRIPTION_FIELD = By.cssSelector("#tiny-react_3974567231640858042159");
    private static final By DISCUSSION_SETTINGS_PLUS_BUTTON = By.xpath("//div[@class='container-box container-styles']//div[@class='expandable-container--label tt-uppercase']");
    private static final By SECRET_DISCUSSION_RADIO_BUTTON = By.xpath("//div[@class='publication-type-wrapper mb-6']//div[3]//label[1]//span[1]");
    private static final By PUBLISH_BUTTON = By.cssSelector("button[class='btn blue fa-right']");
    




    public static void creationOfASecretDiscussion() throws InterruptedException {
        Thread.sleep(3000);
        click(DISCUSSIONS_BUTTON);
        click(CREATE_NEW_DISCUSSION_BUTTON);
        click(CREATE_TITLE_NAME_FIELD);
        type(CREATE_TITLE_NAME_FIELD, "THIS IS AN AUTOMATED SECRET TEST DISCUSSION");
        click(PUBLIC_DESCRIPTION_FIELD);
        type(PUBLIC_DESCRIPTION_FIELD, "THIS IS AN AUTOMATED SECRET TEST DISCUSSION - PUBLIC DESCRIPTION");
        click(PARTICIPANT_DESCRIPTION_FIELD);
        type(PARTICIPANT_DESCRIPTION_FIELD, "THIS IS AN AUTOMATED SECRET TEST DISCUSSION - PARTICIPANT DESCRIPTION");
        click(DISCUSSION_SETTINGS_PLUS_BUTTON);
        click(SECRET_DISCUSSION_RADIO_BUTTON);
        click(PUBLISH_BUTTON);


    }


}
