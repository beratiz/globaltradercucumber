package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProductDetailPage;
import pages.ProductsPage;
import pages.StartPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DHLShippingStepDefinition {

    ProductsPage productsPage = new ProductsPage();
    StartPage startPage = new StartPage();
    ProductDetailPage productDetailPage =new ProductDetailPage();

    @Given("user is on the start page")
    public void user_is_on_the_start_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glbtrader_url"));
    }

    @Given("user clicks on the Computers&Office button")
    public void user_clicks_on_the_Computers_Office_button() {
        startPage.computerAndOfficeBtn.click();
    }

    @Given("user clicks on the Ipad link")
    public void user_clicks_on_the_Ipad_link() {
    startPage.ipadBtn.click();
    }

    @Given("user clicks on the Apple Ipad Pro link")
    public void user_clicks_on_the_Apple_Ipad_Pro_link() {
    productsPage.ipadProProduct.click();
    }

    @Given("user clicks on the Shipping & Payments tab")
    public void user_clicks_on_the_Shipping_Payments_tab() {
        productDetailPage.shippingAndPaymentsTabBtn.click();
    }


    @Then("verify {string} is in the table")
    public void verify_is_in_the_table(String string) {
        Assert.assertTrue(productDetailPage.shippingCompanyStrList().contains(string));
    }



}
