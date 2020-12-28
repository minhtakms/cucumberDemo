package starter.Pages.account;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static starter.stepdefinitions.demoBankingGuru99.accountID;

public class NewAccountFunc extends PageObject {
    public NewAccountFunc(WebDriver driver) {
        super(driver);
    }

    private NewAccountFact newAccountFact;

    public void navigateToNewAccountPage(){
        newAccountFact.lnk_NewAccount.click();
    }

    public void enterCustomerID(String id){
        newAccountFact.txt_CustomerID.sendKeys(id);
    }

    public void selectAccountType(String value){
        newAccountFact.select_AccountType.selectByValue(value);
    }

    public void enterInitialDeposit(String value){
        newAccountFact.txt_Deposit.sendKeys(value);
    }

    public void clickOnSubmitButton(){
        newAccountFact.btn_Submit.click();
        accountID = newAccountFact.lbl_AccountID.getText();
    }

    public void verifyNewAccountCreatedSuccessfully(){
        String noti = newAccountFact.lbl_registerNotification.getText();
        Assert.assertTrue(noti.contains("Account Generated Successfully!!!"));
    }
}
