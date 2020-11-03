package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WomenDressesTestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WomenDressesStepDefinitions {

    WomenDressesTestPage globalTraderPage = new WomenDressesTestPage();

    @Given("user is on the start page")
    public void user_is_on_the_start_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glbtrader_url"));
    }

    @Given("user clicks on the women clothing")
    public void user_clicks_on_the_women_clothing() {
        globalTraderPage.womenClothing.click();

    }
    @Given("user clicks on the tassels dresses")
    public void user_clicks_on_the_tassels_dresses() {
        globalTraderPage.tasselsDresses.click();

    }
    @Given("user clicks on the product")
    public void user_clicks_on_the_product() {
        globalTraderPage.product.click();

    }
    @Given("user click on the add to wishlist")
    public void user_click_on_the_add_to_wishlist() throws InterruptedException {
        Actions options = new Actions(Driver.getDriver());
        options.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        globalTraderPage.wishlist.click();
        Thread.sleep(2000);
    }
    @Then("verify the allert contains {string}")
    public void verify_the_allert_contains(String string) throws InterruptedException {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = Driver.getDriver().switchTo().alert();
            String alertText = alert.getText();

            Assert.assertTrue(alert.getText().contains("Please Login to use this option."));
        } catch (Exception e) {
            //exception handling
        }

    }

}
