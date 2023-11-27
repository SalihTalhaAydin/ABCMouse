package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.ConfigReader;

public class UICommonStepDefs {
    @Given("user navigates to {string}.")
    public void userNavigatesTo(String url) {
        Hooks.driver.get(ConfigReader.replaceWithConfig(url));
    }

    @And("waits for {int} seconds")
    public void waitsForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }
}
