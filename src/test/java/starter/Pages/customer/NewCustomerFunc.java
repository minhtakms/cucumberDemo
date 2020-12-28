package starter.Pages.customer;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import static starter.stepdefinitions.demoBankingGuru99.customerID;

public class NewCustomerFunc extends PageObject {
    public NewCustomerFunc(WebDriver driver) {
        super(driver);
    }

    private NewCustomerFact newCustomerFact;

    public void navigateToNewCustomerPage(){
        newCustomerFact.lnk_NewCustomer.click();
    }

    public void enterCustomerName(String name){
        newCustomerFact.txt_CustomerName.type(name);
    }

    public void selectGenderMale(boolean male){
        if(male)
        {
            newCustomerFact.gender_Male.click();
        }
        else
        {
            newCustomerFact.gender_Female.click();
        }
    }

    public void enterDateOfBirth(String dob)
    {
        newCustomerFact.dob.sendKeys(dob);
    }

    public void enterAddress(String add)
    {
        newCustomerFact.txt_add.sendKeys(add);
    }

    public void enterCity(String city)
    {
        newCustomerFact.txt_city.sendKeys(city);
    }

    public void enterState(String state)
    {
        newCustomerFact.txt_state.sendKeys(state);
    }

    public void enterPin(String pin)
    {
        newCustomerFact.txt_pin.type(pin);
    }

    public void enterPhoneNumber(String number)
    {
        newCustomerFact.txt_telephone.sendKeys(number);
    }

    public void enterEmail(String email)
    {
        newCustomerFact.txt_mail.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        newCustomerFact.txt_password.sendKeys(password);
    }

    public void clickOnSubmitButton()
    {
        newCustomerFact.btn_submit.click();
        customerID = newCustomerFact.lbl_CustomerID.getText();
    }

    public void verifyCreateNewCustomerSuccessfully()
    {
        String noti = newCustomerFact.lbl_registerNotification.getText();
        Assert.assertTrue(noti.contains("Customer Registered Successfully!!!"));
    }
}
