package starter.Pages.account;

import net.thucydides.core.annotations.Step;
import starter.Pages.customer.NewCustomerFunc;

public class NewAccount {
    NewAccountFunc acc;

    @Step("This step will navigate to New Account page")
    public void navigateToNewAccountPage(){
        acc.navigateToNewAccountPage();
    }

    @Step("This step will enter Customer ID")
    public void enterCustomerID(String id){
        acc.enterCustomerID(id);
    }

    @Step("This step will select account type")
    public void selectAccountType(String value){
        acc.selectAccountType(value);
    }

    @Step("This step will enter amount of deposit")
    public void enterInitialDeposit(String value){
        acc.enterInitialDeposit(value);
    }

    @Step("This step will submit form new account")
    public void clickOnSubmitButtonNewAccount(){
        acc.clickOnSubmitButton();
    }

    @Step("This step will verify new customer added successfully")
    public void verifyNewAccountCreatedSuccessfully(){
        acc.verifyNewAccountCreatedSuccessfully();
    }
}
