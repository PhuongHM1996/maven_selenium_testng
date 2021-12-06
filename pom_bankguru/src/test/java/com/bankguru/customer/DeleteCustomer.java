package com.bankguru.customer;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.commons.common_02_LoginAccount;
import com.bankguru.data.Customer_Module;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.DeleteCustomerPO;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import commons.AbstractTest;

public class DeleteCustomer extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private DeleteCustomerPO deleteCustomerPage;

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
	public void EC_01_verifyCustomerIdFieldCannotBeEmpty() {

		log.info("CustomerIdFieldCannotBeEmpty - step 01: Click New Customer link");
		deleteCustomerPage = (DeleteCustomerPO) homePage.openMultipleBankGuruPages("Delete Customer");

		log.info("CustomerIdFieldCannotBeEmpty - step 02: Click Tab keybord focus out Customer id textbox");
		deleteCustomerPage.fucusOfCustomerIdField();

		log.info("CustomerIdFieldCannotBeEmpty - step 03: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_02_verifyCustomerIdFieldMustBeNumeric() {

		log.info("CustomerIdFieldMustBeNumeric - step 01: Click New Customer link");
		deleteCustomerPage = (DeleteCustomerPO) deleteCustomerPage.openMultipleBankGuruPages("Delete Customer");

		log.info("CustomerIdFieldCannotBeEmpty - step 02: Input to customer id textbox");
		deleteCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_CHARACTER_01);

		log.info("CustomerIdFieldCannotBeEmpty - step 03: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_CHARACTER);

		log.info("CustomerIdFieldCannotBeEmpty - step 04: Input to customer id textbox");
		deleteCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_CHARACTER_02);

		log.info("CustomerIdFieldCannotBeEmpty - step 05: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_CHARACTER);

	}

	@Test
	public void EC_03_verifyCustomerIdFieldCannotSpecialCharacter() {

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 01: Click New Customer link");
		deleteCustomerPage = (DeleteCustomerPO) deleteCustomerPage.openMultipleBankGuruPages("Delete Customer");

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 02: Input to customer id textbox");
		deleteCustomerPage.inputToCustomerIdTextbox(
				Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_01);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 03: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_SPECIAL_CHARACER);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 04: Input to customer id textbox");
		deleteCustomerPage.inputToCustomerIdTextbox(
				Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_02);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 05: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_SPECIAL_CHARACER);

	}

	@Test
	public void EC_04_verifyCustomerIdFieldCannotHaveBlankSpace() {

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 01: Click New Customer link");
		deleteCustomerPage = (DeleteCustomerPO) deleteCustomerPage.openMultipleBankGuruPages("Delete Customer");

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 02: Input to customer id textbox");
		deleteCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Delete_Customer_Data.CUSTOMER_ID_DATA_HAVE_SPACE_CHARACTER);

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 03: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_BLANK_SPACE);

	}

	@Test
	public void EC_05_verifyCustomerIdFieldCannotHaveBeSpace() {

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 01: Click New Customer link");
		deleteCustomerPage = (DeleteCustomerPO) deleteCustomerPage.openMultipleBankGuruPages("Delete Customer");

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 02: Input to customer id textbox");
		deleteCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Delete_Customer_Data.CUSTOMER_ID_DATA_HAVE_FIRST_SPACE);

		log.info("CustomerIdFieldCannotHaveBlankSpace - step 03: Verify customer id message");
		verifyEquals(deleteCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_FIRST_BLANK_SPACE);
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
