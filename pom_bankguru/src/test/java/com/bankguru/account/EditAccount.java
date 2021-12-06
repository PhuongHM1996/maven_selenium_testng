package com.bankguru.account;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.commons.common_02_LoginAccount;
import com.bankguru.data.AccountData;
import com.bankguru.data.Account_Module;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.EditAccountPO;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import commons.AbstractTest;

public class EditAccount extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private EditAccountPO editAccountPage;

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
	public void EA_01_verifyAccountNoFieldCannotBeEmpty() {

		log.info("AccountNoFieldCannotBeEmpty - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) homePage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldCannotBeEmpty - step 02: focus out account no textbox");
		editAccountPage.fucusOfAccountNoField();

		log.info("AccountNoFieldCannotBeEmpty - step 03: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EA_02_verifyAccountNoFieldMustBeNumberic() {

		log.info("AccountNoFieldMustBeNumberic - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) editAccountPage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldMustBeNumberic - step 02: input to account no textbox");
		editAccountPage.inputToAccountNoTextbox(Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARATERS_01);

		log.info("AccountNoFieldMustBeNumberic - step 03: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_CHARACTER);

		log.info("AccountNoFieldMustBeNumberic - step 04: input to account no textbox");
		editAccountPage.inputToAccountNoTextbox(Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARATERS_02);

		log.info("AccountNoFieldMustBeNumberic - step 05: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_CHARACTER);
	}

	@Test
	public void EA_03_verifyAccountNoFieldCannotHaveSpecialCharater() {

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) editAccountPage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 02: input to account no textbox");
		editAccountPage
				.inputToAccountNoTextbox(Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 03: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_SPECIAL_CHARATER);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 04: input to account no textbox");
		editAccountPage
				.inputToAccountNoTextbox(Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("AccountNoFieldCannotHaveSpecialCharater - step 05: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_SPECIAL_CHARATER);
	}

	@Test
	public void EA_04_verifyAccountNoFieldValidAccountNumber() {

		log.info("AccountNoFieldValidAccountNumber - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) editAccountPage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldValidAccountNumber - step 02: input to account no textbox");
		editAccountPage.inputToAccountNoTextbox(AccountData.ACCOUNT_ID);

		log.info("AccountNoFieldValidAccountNumber - step 03: input to account no textbox");
		editAccountPage.clickToSubmitButton();

		log.info("AccountNoFieldValidAccountNumber - step 03: Verify message");
		verifyTrue(editAccountPage.isEditAccountFormDisplayed());
	}

	@Test
	public void EA_05_verifyAccountNoFieldCannotHaveBlankSpace() {

		log.info("AccountNoFieldCannotHaveBlankSpace - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) editAccountPage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldCannotHaveBlankSpace - step 02: input to account no textbox");
		editAccountPage
				.inputToAccountNoTextbox(Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("AccountNoFieldCannotHaveBlankSpace - step 03: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_BLANK_SPACE);
	}

	@Test
	public void EA_06_verifyAccountNoFieldFirstCharacerCannotHaveSpace() {

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 01: Click Edit Account link");
		editAccountPage = (EditAccountPO) editAccountPage.openMultipleBankGuruPages("Edit Account");

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 02: input to account no textbox");
		editAccountPage.inputToAccountNoTextbox(
				Account_Module.Edit_Customer_Data.ACCOUNT_NO_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("AccountNoFieldFirstCharacerCannotHaveSpace - step 03: Verify message");
		verifyEquals(editAccountPage.getTextOfAccountNoMessage(),
				Account_Module.ErrorMessage.ACCOUNT_NO_CAN_NOT_HAVE_FIRST_BLANK_SPACE);
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
