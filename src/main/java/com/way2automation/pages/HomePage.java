package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerlogin;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankmanagerlogin;

    public void clickOnCustomerLoginTab() {
        Reporter.log("Customerlogin"+customerlogin.toString());
        clickOnElement(customerlogin);
        CustomListeners.test.log(Status.PASS,"Customerlogin"+customerlogin);
    }
    public void clickOnBankManagerLogintab(){
        Reporter.log("BaniManagerlogoin"+bankmanagerlogin.toString());
        clickOnElement(bankmanagerlogin);
        CustomListeners.test.log(Status.PASS,"BankManagerlogin"+bankmanagerlogin);
    }
}
