package starter.Pages.home;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomepageFunc extends PageObject {

    HomepageFact home;

    public void openApplication(){
        open();
    }

    public void enterUN(String username){
        home.txt_Username.type(username);
    }

    public void enterPW(String password)
    {

        home.txt_Password.type(password);
    }

    public void clickLogin()
    {

        home.btn_Login.click();
    }

    public void verifyLogin()
    {
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("Guru99 Bank Manager HomePage"));
    }
}
