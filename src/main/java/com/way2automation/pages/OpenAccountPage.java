package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement CustomerName;

    @CacheLookup
    @FindBy(xpath = "//option[@value='3']")
    WebElement setselectRonWeasly;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement Currency;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Pound')]")
    WebElement setselectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement Process;

    @CacheLookup
    @FindBy(id = "1016")
    WebElement Popup;

    @CacheLookup
    @FindBy(name = "Account created successfully with account Number :1016")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(id = "Ok")
    WebElement acceptAlert;

    public void clickOnopenAccount() {
        Reporter.log("OpenAccount" + openAccount.toString());
        clickOnElement(openAccount);
    }

    public void clickOnCustomerName() {
        Reporter.log("CustomerName" + CustomerName.toString());
        clickOnElement(CustomerName);
    }

    public void setSelectRoanWeasly() {
        Reporter.log("RonWeasly" + setselectRonWeasly.toString());
        clickOnElement(setselectRonWeasly);
    }

    public void clickOnCurrency() {
        Reporter.log("Currrency" + Currency.toString());
        clickOnElement(Currency);
    }

    public void setSelectCurrency() {
        Reporter.log("SetCurrency" + setselectCurrency.toString());
        clickOnElement(setselectCurrency);
    }

    public void clickOnProcess() {
        Reporter.log("Process" + Process.toString());
        clickOnElement(Process);


        public String getVerifyMessage(){
            Reporter.log("VerifyMessage" + verifyMessage.toString());
            return getTextFromElement(verifyMessage);
        }

        public void setAcceptAlert () {
            return;
        }
    }
}
