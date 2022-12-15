package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerlogin;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourname;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Ron Weasly')]")
    WebElement RonWeasly;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement setSelectaccount1008;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enteramount;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement transactions;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement Deposit;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement Withdrawl;

    @CacheLookup
    @FindBy(xpath  ="//button[@type='submit']")
    WebElement Withdraw;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifyMessage2;

    public void clickOnCustomerLogin() {
        Reporter.log("Customerlogin" + customerlogin.toString());
        clickOnElement(customerlogin);
        CustomListeners.test.log(Status.PASS, "Customerlogin" + customerlogin);
    }
    public void clickOnyourname() {
        Reporter.log("Yourname"+yourname.toString());
        clickOnElement(yourname);
        CustomListeners.test.log(Status.PASS,"Yourname"+yourname);
    }
    public void setSelectRonWeasly() {
        Reporter.log("RonWeasly"+ RonWeasly.toString());
        clickOnElement(RonWeasly);
        CustomListeners.test.log(Status.PASS,"RonWeasly"+RonWeasly);
    }
    public void clickOnLogin() {
        Reporter.log("Login"+login.toString());
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS,"Login"+login);
    }
    public String getWelcomeText() {
        Reporter.log("WelcomeText" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public String getaccount1008text() {
        Reporter.log("Account1008"+ setSelectaccount1008.toString());
        return getTextFromElement(setSelectaccount1008);
    }
    public void amountfield(String amount) {
        Reporter.log("EnterAmount"+ enteramount.toString());
        sendTextToElement(enteramount, "50");
        CustomListeners.test.log(Status.PASS,"enteramount"+enteramount);
    }
    public void clickOnTransactions() {
        Reporter.log("Transactions"+transactions.toString());
        clickOnElement(transactions);
        CustomListeners.test.log(Status.PASS,"Transactions"+transactions);
    }
    public void clickOnDeposit() {
        Reporter.log("Deposit"+Deposit.toString());
        clickOnElement(Deposit);
        CustomListeners.test.log(Status.PASS,"Deposit"+Deposit);
    }

    public void clickOnWithdrawl() {
        Reporter.log("Withdrawl"+Withdrawl.toString());
        clickOnElement(Withdrawl);
        CustomListeners.test.log(Status.PASS,"Withdrawl"+Withdrawl);
    }
    public void click0nWithdraw() {
        Reporter.log("Withdraw" + Withdraw.toString());
        clickOnElement(Withdraw);
        CustomListeners.test.log(Status.PASS, "Withdraw" + Withdraw);
    }

    public String getverifyMesssage2() {
        Reporter.log("VerifyMessage2"+verifyMessage2.toString());
        return getTextFromElement(verifyMessage2);
    }

}
