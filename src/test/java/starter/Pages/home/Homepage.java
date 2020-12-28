package starter.Pages.home;

import net.thucydides.core.annotations.Step;

public class Homepage {
    HomepageFunc home;
    @Step("This step will open guru website")
    public void openApplication(){
        home.openApplication();
    }

    @Step("This step will enter username")
    public void enterUsername(String username){
        home.enterUN(username);
    }

    @Step("This step will enter password")
    public void enterPassword(String password){
        home.enterPW(password);
    }

    @Step("This step will click on Login button")
    public void clickOnLogin(){
        home.clickLogin();
    }

    @Step("This step will verify login successfully")
    public void verifyLoginSuccessfully(){
        home.verifyLogin();
    }
}
