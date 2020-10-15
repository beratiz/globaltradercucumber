package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailPage {

    public ProductDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Shipping & Payments")
    public WebElement shippingAndPaymentsTabBtn;

    @FindBy(xpath = "//tbody[2]//tr//td[1]")
    public List<WebElement> shippingCompanyList;

    public List<String> shippingCompanyStrList(){
        List<String> strList = new ArrayList<>();
        for (WebElement w: shippingCompanyList) {
            strList.add(w.getText());
        }
        return strList;
    }

}
