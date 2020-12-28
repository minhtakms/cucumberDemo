package starter.Pages.account;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewAccountFact extends PageObject {
    WebDriver driver;
    public NewAccountFact(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "New Account")
    public WebElementFacade lnk_NewAccount;

    @FindBy(name = "cusid")
    public WebElementFacade txt_CustomerID;

    @FindBy(name = "selaccount")
    public WebElementFacade select_AccountType;

    @FindBy(name = "inideposit")
    public WebElementFacade txt_Deposit;

    @FindBy(name = "button2")
    public WebElementFacade btn_Submit;

    @FindBy(className = "heading3")
    protected WebElementFacade lbl_registerNotification;

    @FindBy(xpath = "//td[contains(text(),'Account ID')]//following-sibling::td")
    protected WebElementFacade lbl_AccountID;
}
