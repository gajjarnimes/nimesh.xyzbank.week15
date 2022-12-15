package com.way2automation.testsuite;

import com.way2automation.pages.*;
import com.way2automation.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage hompage;
    BankManagerLoginPage bankManagerloginpage;
    OpenAccountPage  openAccountPage;
    CustomersLoginPage customerloginpage;
    CustomersPage customersPage;
    AccountPage accountPage;



    @Test(groups = {"sanity","regrssion"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        hompage.clickOnBankManagerLogintab();
        bankManagerloginpage.clickOnAddCustomer();
        bankManagerloginpage.enterFirstName("Nash");
        bankManagerloginpage.enterLastName("Purohit");
        bankManagerloginpage.enterPostCode("Ha9 6pu");
        bankManagerloginpage.clickOnaddCustomer();
        bankManagerloginpage.isDisplayed();
        bankManagerloginpage.setAcceptAlert();

    }

    @Test(groups = {"sanity","regrssion"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        hompage.clickOnBankManagerLogintab();
        openAccountPage.clickOnopenAccount();
        openAccountPage.clickOnCustomerName();
        openAccountPage.setSelectRoanWeasly();
        openAccountPage.clickOnCurrency();
        openAccountPage.setSelectCurrency();
        openAccountPage.clickOnProcess();
        openAccountPage.isDisplayed();
        openAccountPage.setAcceptAlert();

    }

    @Test(groups = {"smoke","regrssion"})
    public void customerShouldLoginAndLogoutSuccessfully() {
        customerloginpage.clickOnCustomerLogin();
        customerloginpage.clickOnyourname();
        customerloginpage.setSelectRonWeasly();
        customerloginpage.clickOnLogin();
        customerloginpage.clickOnLogut();
        String expectedMessage = "Your Name:";
        String actualMessage = customerloginpage.getverifyMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Your Name:");

    }
    @Test(groups = {"smoke","regrssion"})
    public void customerShouldDepositMoneySuccessfully() {
        customersPage.clickOnCustomerLogin();
        customersPage.clickOnyourname();
        customersPage.setSelectRonWeasly();
        customersPage.clickOnLogin();
        customersPage.getWelcomeText();
        customersPage.getaccount1008text();
        customersPage.clickOnDeposit();
        customersPage.amountfield("100");
        customersPage.clickOnDeposittab();
        customersPage.getverifyMesssage1();
        String expectedMessage = "Deposit Successful";
        String actualMessage = customersPage.getverifyMesssage1();
        Assert.assertEquals(actualMessage, expectedMessage, "Deposit Successful");

    }
    @Test(groups = {"smoke","regrssion"})
    public void customerShouldWithdrawMoneySuccessfully(){
        accountPage.clickOnCustomerLogin();
        accountPage.clickOnyourname();
        accountPage.setSelectRonWeasly();
        accountPage.clickOnLogin();
        accountPage.getWelcomeText();
        accountPage.getaccount1008text();
        accountPage.clickOnWithdrawl();
        accountPage.amountfield("50");
        accountPage.click0nWithdraw();
        accountPage.getverifyMesssage2();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getverifyMesssage2();
        Assert.assertEquals(actualMessage,expectedMessage,"Transaction successful");
    }
}
