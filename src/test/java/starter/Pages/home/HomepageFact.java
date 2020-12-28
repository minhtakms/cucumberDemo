package starter.Pages.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomepageFact extends PageObject {
    public HomepageFact(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(name = "uid")
    public WebElementFacade txt_Username;

    @FindBy(name = "password")
    public WebElementFacade txt_Password;

    @FindBy(name = "btnLogin")
    public WebElementFacade btn_Login;
}
