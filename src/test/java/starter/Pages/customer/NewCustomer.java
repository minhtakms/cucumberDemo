package starter.Pages.customer;

import net.thucydides.core.annotations.Step;
import starter.Pages.home.HomepageFunc;

public class NewCustomer {
    NewCustomerFunc cus;

    @Step("This step will navigate to New Customer page")
    public void navigateToNewCustomerPage(){
        cus.navigateToNewCustomerPage();
    }

    @Step("This step will enter Username")
    public void enterCustomerName(String name){
        cus.enterCustomerName(name);
    }

    @Step("This step will select Gender")
    public void selectGenderMale(boolean male){
        cus.selectGenderMale(male);
    }

    @Step("This step will enter date of birth")
    public void enterDateOfBirth(String dob){
        cus.enterDateOfBirth(dob);
    }

    @Step("This step will enter address")
    public void enterAddress(String addr){
        cus.enterAddress(addr);
    }

    @Step("This step will enter city")
    public void enterCity(String city){
        cus.enterCity(city);
    }

    @Step("This step will enter state")
    public void enterState(String state){
        cus.enterState(state);
    }

    @Step("This step will enter pin")
    public void enterPin(String pin){
        cus.enterPin(pin);
    }

    @Step("This step will enter phone number")
    public void enterPhoneNumber(String phone){
        cus.enterPhoneNumber(phone);
    }

    @Step("This step will enter mail")
    public void enterEmail(String mail){
        cus.enterEmail(mail);
    }

    @Step("This step will enter password")
    public void enterPassword(String password){
        cus.enterPassword(password);
    }

    @Step("This step will submit form")
    public void clickOnSubmitButton(){
        cus.clickOnSubmitButton();
    }

    @Step("This step will verify new customer added successfully")
    public void verifyCreateNewCustomerSuccessfully(){
        cus.verifyCreateNewCustomerSuccessfully();
    }
}
