package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.Pages.account.NewAccount;
import starter.Pages.customer.NewCustomer;
import starter.Pages.customer.NewCustomerFunc;
import starter.Pages.deposit.Deposit;
import starter.Pages.home.Homepage;

import java.util.Random;

public class demoBankingGuru99 {
    public static final String adminUsername = "mngr301662";
    public static final String adminPassword = "mUjybeg";
    public static String customerID = "";
    public static String accountID = "";
    @Managed
    WebDriver driver;

    @Steps
    Homepage home;

    @Steps
    NewCustomer newCustomer;

    @Steps
    NewAccount newAccount;

    @Steps
    Deposit deposit;

    @Given("user logged in successfully with admin account")
    public void user_logged_in_successfully_with_admin_account() {
        home.enterUsername(adminUsername);
        home.enterPassword(adminPassword);
        home.clickOnLogin();
    }

    @When("user navigate to new customer tab")
    public void user_navigate_to_new_customer_tab() {
        newCustomer.navigateToNewCustomerPage();
    }
    @When("^user enter customer name \"(.*)\"$")
    public void user_enter_customer_name(String name) {
        newCustomer.enterCustomerName(name);
    }
    @When("^user select gender \"(.*)\"$")
    public void user_select_gender(boolean gender) {
        newCustomer.selectGenderMale(gender);
    }
    @When("^user enter customer info \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enter_customer_info(String dob, String addr, String city, String state, String pin, String phone) {
        newCustomer.enterDateOfBirth(dob);
        newCustomer.enterAddress(addr);
        newCustomer.enterCity(city);
        newCustomer.enterState(state);
        newCustomer.enterPin(pin);
        newCustomer.enterPhoneNumber(phone);
    }
    @When("^user enter customer email \"(.*)\"$")
    public void user_enter_customer_email(String email) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomEmail = sb+email;
        newCustomer.enterEmail(randomEmail);
    }
    @When("^user enter customer password \"(.*)\"$")
    public void user_enter_customer_password(String password) {
        newCustomer.enterPassword(password);
    }
    @When("user click on Submit button")
    public void user_click_on_submit_button() {
        newCustomer.clickOnSubmitButton();
    }

    @Then("new customer should be added successfully")
    public void new_customer_should_be_added_successfully() {
        newCustomer.verifyCreateNewCustomerSuccessfully();
    }


    //Scenario: Add new account based on created customer

    @Given("user navigate to New Account page")
    public void user_navigate_to_new_account_page() {
        newAccount.navigateToNewAccountPage();
    }

    @When("user enter Customer id")
    public void user_enter_customer_id() {
        newAccount.enterCustomerID(customerID);
    }
    @When("^user select account type \"(.*)\"$")
    public void user_select_account_type(String type) {
        newAccount.selectAccountType(type);
    }
    @When("^user enter deposit amount \"(.*)\"$")
    public void user_enter_deposit_amount(String amount) {
        newAccount.enterInitialDeposit(amount);
    }
    @When("user click on Submit new account button")
    public void user_click_on_submit_new_account_button() {
        newAccount.clickOnSubmitButtonNewAccount();
    }

    @Then("user should be able to create new account successfully")
    public void user_should_be_able_to_create_new_account_successfully() {
        newAccount.verifyNewAccountCreatedSuccessfully();
    }

    //Scenario: Deposit for account that created recently

    @Given("user navigate to deposit page")
    public void user_navigate_to_deposit_page() {
        deposit.navigateToDepositPage();
    }

    @When("user enter account ID")
    public void user_enter_account_id() {
       deposit.enterAccountNo(accountID);
    }
    @When("^user enter amount to deposit \"(.*)\"$")
    public void user_enter_amount_to_deposit(String depamount) {
        deposit.enterAmount(depamount);
    }
    @When("^user enter description \"(.*)\"$")
    public void user_enter_description(String desc) {
        deposit.enterDesc(desc);
    }
    @When("user click on submit deposit form button")
    public void user_click_on_submit_deposit_form_button() {
        deposit.clickOnDepositSubmitButton();
    }

    @Then("user should be able to deposit successfully")
    public void user_should_be_able_to_deposit_successfully() {
        deposit.verifyDepositSuccessfully();
    }
}
