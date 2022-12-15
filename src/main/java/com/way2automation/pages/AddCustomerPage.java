package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
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
}
