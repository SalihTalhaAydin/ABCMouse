package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.ConfigReader;
import utils.WaitUtils;

public class ABCSteps {
    @And("clicks on signup button from ABC home page.")
    public void clicksOnSignupButtonFromABCHomePage() {
        Hooks.abcMousePage.signUp();
    }

    @And("enters a {string} address then submits.")
    public void entersAAddressThenSubmits(String emailAddress) {
        emailAddress = ConfigReader.replaceWithConfig(emailAddress);
        Hooks.abcMousePage.giveEmailAndSubmit(emailAddress);
    }

    @And("user verifies the {string} text is visible on the page.")
    public void userVerifiesTheTextIsVisibleOnThePage(String expectedVisibleText) {
        Hooks.abcMousePage.validateHeaderVisible(expectedVisibleText);
    }
}
