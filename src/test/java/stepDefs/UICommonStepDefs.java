package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.ConfigReader;
import utils.WaitUtils;

public class UICommonStepDefs {
    @Given("user navigates to {string}.")
    public void userNavigatesTo(String url) {
        Hooks.driver.get(ConfigReader.replaceWithConfig(url));
    }

    @And("waits for {int} seconds")
    public void waitsForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }

    @Then("waits for url to be {string} and verifies it.")
    public void waitsForUrlToBeAndVerifiesIt(String urlToWait) {
        urlToWait = ConfigReader.replaceWithConfig(urlToWait);
        WaitUtils.waitForPageUrl(Hooks.driver, urlToWait);
        Assert.assertEquals(urlToWait, Hooks.driver.getCurrentUrl());
    }
}
