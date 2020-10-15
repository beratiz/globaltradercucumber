package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StartPage {

    public StartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Computer & Office']")
    public WebElement computerAndOfficeBtn;

    @FindBy(linkText = "iPad")
    public WebElement ipadBtn;



}
