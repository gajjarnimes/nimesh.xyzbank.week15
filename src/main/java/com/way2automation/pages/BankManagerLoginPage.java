package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='addCust()']")
    WebElement AddCustomer;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement PostCode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(id = "7")
    WebElement Popup;

    @CacheLookup
    @FindBy(name = "Customer added successfully")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy
    WebElement acceptAlert;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement CustomerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement Currency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement Process;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement Customers;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement SearchCustomer;

    @CacheLookup
    @FindBy(xpath = "//thead/tr/td[4]")
    WebElement verifyAccountNumber;

    @CacheLookup
    @FindBy(xpath = "//thead/tr/td[5]")
    WebElement DeleteCustomer;

    public void clickOnAddCustomer(){
        Reporter.log("AddCustomer"+AddCustomer.toString());
        clickOnElement(AddCustomer);
        CustomListeners.test.log(Status.PASS,"AddCustomer"+AddCustomer);
    }

    public void enterFirstName(String Name){
        Reporter.log("FirstName"+FirstName.toString());
        sendTextToElement(FirstName,Name);
        CustomListeners.test.log(Status.PASS,"FirstName"+FirstName);
    }
    public void enterLastName(String lastname) {
        Reporter.log("LastName"+LastName.toString());
        sendTextToElement(LastName, lastname);
        CustomListeners.test.log(Status.PASS,"LastName"+LastName);
    }
    public void enterPostCode(String postcode){
        Reporter.log("PostCode"+PostCode.toString());
        sendTextToElement(PostCode,postcode);
        CustomListeners.test.log(Status.PASS,"PostCode"+PostCode);}
    public void clickOnaddCustomer(){
        Reporter.log("addCustomer"+addCustomer.toString());
        clickOnElement(addCustomer);
        CustomListeners.test.log(Status.PASS,"addCustomer"+addCustomer);}
    public void isDisplayed() {
        boolean diplayed;}
    public String getVerifyMessage() {
        Reporter.log("VerifyMessage" + verifyMessage.toString());
        return getTextFromElement(verifyMessage);
    }
    public void setAcceptAlert() {
        return;}
    public void clickOnopenAccount() {
        Reporter.log("openAccount"+openAccount.toString());
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"openAccount"+openAccount);
    }
    public void clickOnCustomerName() {
        Reporter.log("CustomerName"+CustomerName.toString());
        clickOnElement(CustomerName);
        CustomListeners.test.log(Status.PASS,"CustomerName"+CustomerName);
    }
    public void clickOnCurrency() {
        Reporter.log("Currency"+Currency.toString());
        clickOnElement(Currency);
        CustomListeners.test.log(Status.PASS,"Currency"+Currency);
    }
    public void clickOnProcess() {
        Reporter.log("Process"+Process.toString());
        clickOnElement(Process);
        CustomListeners.test.log(Status.PASS,"Process"+Process);
    }
    public void clickOnCustomers() {
        Reporter.log("Customers"+Customers.toString());
        clickOnElement(Customers);
        CustomListeners.test.log(Status.PASS,"Customers"+Customers);
    }
    public void clickOnSearchCustomer() {
        Reporter.log("SearchCustomer"+SearchCustomer.toString());
        clickOnElement(SearchCustomer);
        CustomListeners.test.log(Status.PASS,"SearchCustomer"+SearchCustomer);
    }
    public void clickOnAccountNumber() {
        Reporter.log("AccountNumber"+verifyAccountNumber.toString());
        clickOnElement(verifyAccountNumber);
        CustomListeners.test.log(Status.PASS,"AccountNumber"+verifyAccountNumber);
    }
    public void clickOnDeleteCustomer(){
        Reporter.log("DeleteCustomer"+DeleteCustomer.toString());
        clickOnElement(DeleteCustomer);
        CustomListeners.test.log(Status.PASS,"DeleteCustomer"+DeleteCustomer);
    }


}
