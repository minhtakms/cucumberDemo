package starter.Pages.deposit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DepositFact extends PageObject {
    WebDriver driver;
    public DepositFact(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "Deposit")
    public WebElementFacade lnk_Deposit;

    @FindBy(name = "accountno")
    public WebElementFacade txt_AccountNo;

    @FindBy(name = "ammount")
    protected WebElementFacade txt_Ammount;

    @FindBy(name = "desc")
    protected WebElementFacade txt_Desc;

    @FindBy(name = "AccSubmit")
    protected WebElementFacade btn_AccSubmit;

    @FindBy(className = "heading3")
    protected WebElementFacade lbl_registerNotification;
}
