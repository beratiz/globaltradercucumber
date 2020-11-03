package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WomenDressesTestPage {

        public WomenDressesTestPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath="(//span[@class='icon_widh'])[2]")
        public WebElement womenClothing;

        @FindBy(linkText="Tassels Dresses")
        public WebElement tasselsDresses;

        @FindBy(xpath="//div[@class='img-box']")
        public WebElement product;

        @FindBy(linkText="Add to wishlist")
        public WebElement wishlist;

        @FindBy(xpath = "//span[@id='alert_messages_show']")
        public WebElement allertMessage;
}


