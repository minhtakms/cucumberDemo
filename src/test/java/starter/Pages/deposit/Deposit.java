package starter.Pages.deposit;

import net.thucydides.core.annotations.Step;
import starter.Pages.customer.NewCustomerFunc;

public class Deposit {
    DepositFunc dep;

    @Step("This step will navigate to Deposit page")
    public void navigateToDepositPage(){
        dep.navigateToDepositPage();
    }

    @Step("This step will enter Account ID")
    public void enterAccountNo(String accountID){
        dep.enterAccountNo(accountID);
    }

    @Step("This step will enter deposit amount")
    public void enterAmount(String amount){
        dep.enterAmount(amount);
    }

    @Step("This step will enter description")
    public void enterDesc(String desc){
        dep.enterDesc(desc);
    }

    @Step("This step will submit deposit form")
    public void clickOnDepositSubmitButton(){
        dep.clickOnSubmitButton();
    }

    @Step("This step will verify deposit successfully")
    public void verifyDepositSuccessfully(){
        dep.verifyDepositSuccessfully();
    }
}
