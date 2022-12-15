package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement CustomersLogin;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourname;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Ron Weasly')]")
    WebElement RonWeasly;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement verifylogouttab;

    @CacheLookup
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement verifyyourname;

    public void clickOnCustomerLogin() {
        Reporter.log("CustomersLogin" + CustomersLogin.toString());
        clickOnElement(CustomersLogin);
        CustomListeners.test.log(Status.PASS, "CustomersLogin" + CustomersLogin);

    }

    public void clickOnyourname() {
        Reporter.log("Yourname" + yourname.toString());
        clickOnElement(yourname);
        CustomListeners.test.log(Status.PASS, "Yourname" + yourname);
    }

    public void setSelectRonWeasly() {
        Reporter.log("RonWeasly" + RonWeasly.toString());
        clickOnElement(RonWeasly);
        CustomListeners.test.log(Status.PASS, "RonWeasly" + RonWeasly);
    }

    public void clickOnLogin() {
        Reporter.log("Login" + login.toString());
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS, "Login" + login);
    }
    public void clickOnLogut(){
        Reporter.log("logout"+verifylogouttab.toString());
        clickOnElement(verifylogouttab);
    }

    public String getverifyMessage() {
        return getverifyMessage();
    }
}
