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
import bankguru.pageObject.DeleteAccountPO;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import commons.AbstractTest;

public class DeleteAccount extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private DeleteAccountPO deleteAccountPage;

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
	public void DA_01_verifyAccountNoFieldCannotBeEmpty() {

		log.info("AccountNoFieldCannotBeEmpty - step 01: Click Delete Account link");
		deleteAccountPage = (DeleteAccountPO) homePage.openMultipleBankGuruPages("Delete Account");

		log.info("AccountNoFieldCannotBeEmpty - step 02: focus out account no textbox");
		deleteAccountPage.fucusOfAccountNoField();

		log.info("AccountNoFieldCannotBeEmpty - step 03: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void DA_02_verifyAccountNoFieldMustBeNumberic() {

		log.info("AccountNoFieldMustBeNumberic - step 01: Click Delete Account link");
		deleteAccountPage = (DeleteAccountPO) deleteAccountPage.openMultipleBankGuruPages("Delete Account");

		log.info("AccountNoFieldMustBeNumberic - step 02: input to account no textbox");
		deleteAccountPage.inputToAccountNoTextbox(Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARATERS_01);

		log.info("AccountNoFieldMustBeNumberic - step 03: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_BE_EMPTY);

		log.info("AccountNoFieldMustBeNumberic - step 04: input to account no textbox");
		deleteAccountPage.inputToAccountNoTextbox(Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARATERS_02);

		log.info("AccountNoFieldMustBeNumberic - step 05: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void DA_03_verifyAccountNoFieldCannotHaveSpecialCharater() {

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 01: Click Delete Account link");
		deleteAccountPage = (DeleteAccountPO) deleteAccountPage.openMultipleBankGuruPages("Delete Account");

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 02: input to account no textbox");
		deleteAccountPage
				.inputToAccountNoTextbox(Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 03: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_SPECIAL_CHARATER);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 04: input to account no textbox");
		deleteAccountPage
				.inputToAccountNoTextbox(Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 05: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_SPECIAL_CHARATER);
	}


	@Test
	public void DA_04_verifyAccountNoFieldCannotHaveBlankSpace() {

		log.info("AccountNoFieldCannotHaveBlankSpace - step 01: Click Delete Account link");
		deleteAccountPage = (DeleteAccountPO) deleteAccountPage.openMultipleBankGuruPages("Delete Account");

		log.info("AccountNoFieldCannotHaveBlankSpace - step 02: input to account no textbox");
		deleteAccountPage
				.inputToAccountNoTextbox(Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("AccountNoFieldCannotHaveBlankSpace - step 03: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_BLANK_SPACE);
	}

	@Test
	public void DA_05_verifyAccountNoFieldFirstCharacerCannotHaveSpace() {

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 01: Click Delete Account link");
		deleteAccountPage = (DeleteAccountPO) deleteAccountPage.openMultipleBankGuruPages("Delete Account");

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 02: input to account no textbox");
		deleteAccountPage.inputToAccountNoTextbox(
				Account_Module.Delete_Customer_Data.ACCOUNT_NO_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 03: Verify message");
		verifyEquals(deleteAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_FIRST_BLANK_SPACE);
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
