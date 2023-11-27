package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.UICommonUtils;
import utils.ConfigReader;
import utils.Driver;

public class Hooks {
    public static WebDriver driver;
    public static ABCMousePage abcMousePage;
    public static Faker faker;

    @Before
    public void setup() {
        driver = Driver.getDriver(ConfigReader.getProperty("browser"));
        faker = new Faker();
        abcMousePage = new ABCMousePage(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        UICommonUtils.takeScreenshots(driver, scenario);
        Driver.quitDriver();
    }
}
