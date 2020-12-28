package starter.Pages.customer;

import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.serenitybdd.core.pages.PageObject;

public class NewCustomerFact extends PageObject {
    WebDriver driver;
    public NewCustomerFact(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "New Customer")
    public WebElementFacade lnk_NewCustomer;

    @FindBy(name = "name")
    public WebElementFacade txt_CustomerName;

    @FindBy(xpath = "//input[@value='m']")
    protected WebElementFacade gender_Male;

    @FindBy(xpath = "//input[@value='f']")
    protected WebElementFacade gender_Female;

    @FindBy(name = "dob")
    protected WebElementFacade dob;

    @FindBy(name = "addr")
    protected WebElementFacade txt_add;

    @FindBy(name = "city")
    protected WebElementFacade txt_city;

    @FindBy(name = "state")
    protected WebElementFacade txt_state;

    @FindBy(name = "pinno")
    protected WebElementFacade txt_pin;

    @FindBy(name = "telephoneno")
    protected WebElementFacade txt_telephone;

    @FindBy(name = "emailid")
    protected WebElementFacade txt_mail;

    @FindBy(name = "password")
    protected WebElementFacade txt_password;

    @FindBy(name = "sub")
    protected WebElementFacade btn_submit;

    @FindBy(className = "heading3")
    protected WebElementFacade lbl_registerNotification;

    @FindBy(xpath = "//td[contains(text(),'Customer ID')]//following-sibling::td")
    protected WebElementFacade lbl_CustomerID;
}
