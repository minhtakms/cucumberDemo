package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.Pages.home.Homepage;

import static starter.stepdefinitions.demoBankingGuru99.adminPassword;
import static starter.stepdefinitions.demoBankingGuru99.adminUsername;

public class loginToApplication {
    @Managed
    WebDriver driver;

    @Steps
    Homepage home;

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        home.openApplication();
    }

    @When("user enter username")
    public void user_enter_username(){
        home.enterUsername(adminUsername);
    }

    @When("user enter password")
    public void user_enter_password(){
        home.enterPassword(adminPassword);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        home.clickOnLogin();
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        home.verifyLoginSuccessfully();
    }
}
