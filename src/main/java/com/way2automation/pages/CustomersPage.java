package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersPage extends Utility {
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
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement account1008;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement Deposit;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enteramount;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Deposit1;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyMessage1;

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

    public String getWelcomeText() {
        Reporter.log("WelcomeText" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String getaccount1008text() {
        Reporter.log("Account1008" + account1008.toString());
        return getTextFromElement(account1008);
    }

    public void clickOnDeposit() {
        Reporter.log("Deposit" + Deposit.toString());
        clickOnElement(Deposit);
    }

    public void amountfield(String amount) {
        Reporter.log("enteramount" + enteramount.toString());
        sendTextToElement(enteramount, "100");
    }
    public void clickOnDeposittab(){
        Reporter.log("Deoposit1"+Deposit1.toString());
        clickOnElement(Deposit1);
    }
    public String getverifyMesssage1(){
        Reporter.log("verifyMessage1"+verifyMessage1.toString());
        return getTextFromElement(verifyMessage1);}


}
