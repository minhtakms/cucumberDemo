package starter.Pages.deposit;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static starter.stepdefinitions.demoBankingGuru99.accountID;

public class DepositFunc extends PageObject {
    public DepositFunc(WebDriver driver) {
        super(driver);
    }

    private DepositFact dep;

    public void navigateToDepositPage(){
        //dep.lnk_Deposit.click();
        getDriver().navigate().to("http://demo.guru99.com/v4/manager/DepositInput.php");
    }

    public void enterAccountNo(String accountID){
        dep.txt_AccountNo.type(accountID);
    }

    public void enterAmount(String amount){
        dep.txt_Ammount.type(amount);
    }

    public void enterDesc(String desc){
        dep.txt_Desc.type(desc);
    }

    public void clickOnSubmitButton()
    {
        dep.btn_AccSubmit.click();
    }

    public void verifyDepositSuccessfully()
    {
        String noti = dep.lbl_registerNotification.getText();
        Assert.assertTrue(noti.contains("Transaction details of Deposit for Account " + accountID));
    }
}
