package com.bankguru.account;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.commons.common_02_LoginAccount;
import com.bankguru.data.Account_Module;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import bankguru.pageObject.NewAccountPO;
import commons.AbstractTest;

public class NewAccount extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private NewAccountPO newAccountPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {

		DOMConfigurator.configure(".\\src\\test\\resources\\log4j.xml");

		driver = getBrowserDriver(browserName, urlValue);

		loginPage = BankGuruPageGeneratorManager.getLoginPage(driver);

		common_02_LoginAccount loginAccount = new common_02_LoginAccount(loginPage);
		homePage = loginAccount.LoginAccount();

	}

	@Test
	public void NA_01_verifyCustomerIDFieldCannotBeEmpty() {

		log.info("CustomerIDFieldCannotBeEmpty - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) homePage.openMultipleBankGuruPages("New Account");

		log.info("CustomerIDFieldCannotBeEmpty - step 02: focus out customer id textbox");
		newAccountPage.fucusOfCustomerIdField();

		log.info("CustomerIDFieldCannotBeEmpty - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NA_02_verifyCustomerIDFieldMustBeNumeric() {

		log.info("CustomerIDFieldMustBeNumeric - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("CustomerIDFieldMustBeNumeric - step 02: focus out customer id textbox");
		newAccountPage.inputToCustomerIdTextbox(Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_CHARATERS_01);

		log.info("CustomerIDFieldMustBeNumeric - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_CHARACTER);

		log.info("CustomerIDFieldMustBeNumeric - step 04: focus out customer id textbox");
		newAccountPage.inputToCustomerIdTextbox(Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_CHARATERS_02);

		log.info("CustomerIDFieldMustBeNumeric - step 05: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_CHARACTER);

	}

	@Test
	public void NA_03_verifyCustomerIDFieldCannotHaveSpecialCharacter() {

		log.info("CustomerIDFieldCannotHaveSpecialCharacter - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("CustomerIDFieldCannotHaveSpecialCharacter - step 02: focus out customer id textbox");
		newAccountPage
				.inputToCustomerIdTextbox(Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("CustomerIDFieldCannotHaveSpecialCharacter - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_SPECIAL_CHARATER);

		log.info("CustomerIDFieldCannotHaveSpecialCharacter - step 04: focus out customer id textbox");
		newAccountPage
				.inputToCustomerIdTextbox(Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("CustomerIDFieldCannotHaveSpecialCharacter - step 05: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_SPECIAL_CHARATER);
	}

	@Test
	public void NA_04_verifyCustomerIDFieldCannotHaveBlackSpace() {

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 02: focus out customer id textbox");
		newAccountPage
				.inputToCustomerIdTextbox(Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_BLANK_SPACE);
	}

	@Test
	public void NA_05_verifyCustomerIDFieldFirstCharacterCannotBeSpace() {

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 02: focus out customer id textbox");
		newAccountPage.inputToCustomerIdTextbox(
				Account_Module.New_Account_Data.CUSTOMER_ID_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("CustomerIDFieldCannotHaveBlackSpace - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfCustomerIdMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_HAVE_FIRST_BLANK_SPACE);

	}

	@Test
	public void NA_06_verifyDepositFieldCannotBeEmpty() {

		log.info("DepositFieldCannotBeEmpty - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("DepositFieldCannotBeEmpty - step 02: focus out deposit textbox");
		newAccountPage.fucusOfDepositIdField();

		log.info("DepositFieldCannotBeEmpty - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(), Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NA_07_verifyDepositFieldMustBeNumeric() {

		log.info("DepositFieldMustBeNumeric - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("DepositFieldMustBeNumeric - step 02: focus out deposit textbox");
		newAccountPage.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_CHARATERS_01);

		log.info("DepositFieldMustBeNumeric - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_CHARACTER);

		log.info("DepositFieldMustBeNumeric - step 04: focus out deposit textbox");
		newAccountPage.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_CHARATERS_02);

		log.info("DepositFieldMustBeNumeric - step 05: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_CHARACTER);

	}

	@Test
	public void NA_08_verifyDepositFieldCannotHaveSpecialCharacter() {

		log.info("DepositFieldCannotHaveSpecialCharacter - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("DepositFieldCannotHaveSpecialCharacter - step 02: focus out deposit textbox");
		newAccountPage.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("DepositFieldCannotHaveSpecialCharacter - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_SPECIAL_CHARATER);

		log.info("DepositFieldCannotHaveSpecialCharacter - step 04: focus out deposit textbox");
		newAccountPage.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("DepositFieldCannotHaveSpecialCharacter - step 05: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_SPECIAL_CHARATER);
	}

	@Test
	public void NA_09_verifyDepositFieldCannotHaveBlackSpace() {

		log.info("DepositFieldCannotHaveBlackSpace - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("DepositFieldCannotHaveBlackSpace - step 02: focus out customer id textbox");
		newAccountPage.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("DepositFieldCannotHaveBlackSpace - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_BLANK_SPACE);
	}

	@Test
	public void NA_10_verifyDepositFieldFirstCharacterCannotBeSpace() {

		log.info("DepositFieldFirstCharacterCannotBeSpace - step 01: Click New Account link");
		newAccountPage = (NewAccountPO) newAccountPage.openMultipleBankGuruPages("New Account");

		log.info("DepositFieldFirstCharacterCannotBeSpace - step 02: focus out deposit textbox");
		newAccountPage
				.inputToDepositTextbox(Account_Module.New_Account_Data.DEPOSIT_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("DepositFieldFirstCharacterCannotBeSpace - step 03: Verify message");
		verifyEquals(newAccountPage.getTextOfDepositMessage(),
				Account_Module.ErrorMessage.DEPOSIT_CAN_NOT_HAVE_FIRST_BLANK_SPACE);
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
