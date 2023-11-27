package utils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

public class UICommonUtils {

    public static void assertTextForTwoLists(List<WebElement> webElements, DataTable tableItems) {
        for (int i = 0; i < webElements.size(); i++) {
            Assert.assertEquals(tableItems.asList().get(i), webElements.get(i).getText());
        }
    }

    public static void takeScreenshots(WebDriver driver, Scenario scenario) {
        if (!scenario.getStatus().toString().equals("PASSED")) {
            try {
                scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "screenshot");
            } catch (Exception e) {
                System.out.println("Failed to take screenshots");
            }
        } else {
            System.out.println("Scenario is passed!");
        }
    }



    public static WebElement getElementByText(WebElement element, String text){
        return element.findElement(By.xpath("//*[text()='"+ text + "']"));
    }
}
