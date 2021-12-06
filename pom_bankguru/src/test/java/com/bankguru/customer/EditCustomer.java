package com.bankguru.customer;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.commons.common_02_LoginAccount;
import com.bankguru.data.AccountData;
import com.bankguru.data.Customer_Module;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.EditCustomerPO;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import commons.AbstractTest;

public class EditCustomer extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private EditCustomerPO editCustomerPage;

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
		editCustomerPage = (EditCustomerPO) homePage.openMultipleBankGuruPages("Edit Customer");

		log.info("CustomerIdFieldCannotBeEmpty - step 02: Click Tab keybord focus out Customer id textbox");
		editCustomerPage.fucusOfCustomerIdField();

		log.info("CustomerIdFieldCannotBeEmpty - step 03: Verify customer id message");
		verifyEquals(editCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_02_verifyCustomerIdFieldMustBeNumeric() {

		log.info("CustomerIdFieldMustBeNumeric - step 01: Click New Customer link");
		editCustomerPage = (EditCustomerPO) editCustomerPage.openMultipleBankGuruPages("Edit Customer");

		log.info("CustomerIdFieldCannotBeEmpty - step 02: Input to customer id textbox");
		editCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_CHARACTER_01);

		log.info("CustomerIdFieldCannotBeEmpty - step 03: Verify customer id message");
		verifyEquals(editCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_CHARACTER);

		log.info("CustomerIdFieldCannotBeEmpty - step 04: Input to customer id textbox");
		editCustomerPage
				.inputToCustomerIdTextbox(Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_CHARACTER_02);

		log.info("CustomerIdFieldCannotBeEmpty - step 05: Verify customer id message");
		verifyEquals(editCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_CHARACTER);
	}

	@Test
	public void EC_03_verifyCustomerIdFieldCannotHaveSpecialCharacter() {

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 01: Click New Customer link");
		editCustomerPage = (EditCustomerPO) editCustomerPage.openMultipleBankGuruPages("Edit Customer");

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 02: Input to customer id textbox");
		editCustomerPage.inputToCustomerIdTextbox(
				Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_01);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 03: Verify customer id message");
		verifyEquals(editCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_SPECIAL_CHARACER);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 04: Input to customer id textbox");
		editCustomerPage.inputToCustomerIdTextbox(
				Customer_Module.Edit_Customer_Data.CUSTOMER_ID_DATA_HAVE_SPECIAL_CHARACTER_02);

		log.info("CustomerIdFieldCannotHaveSpecialCharacter - step 05: Verify customer id message");
		verifyEquals(editCustomerPage.getTextOfCustomerIdMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_ID_HAVE_SPECIAL_CHARACER);

	}

	@Test
	public void EC_04_verifyCustomerIdFieldVaild() {

		log.info("CustomerIdFieldVaild - step 01: Click New Customer link");
		editCustomerPage = (EditCustomerPO) editCustomerPage.openMultipleBankGuruPages("Edit Customer");

		log.info("CustomerIdFieldVaild - step 02: Input to customer id textbox");
		editCustomerPage.inputToCustomerIdTextbox(AccountData.CUSTOMER_ID);

		log.info("CustomerIdFieldVaild - step 03: Click sumbit button");
		editCustomerPage.clickSubmitButton();

		log.info("CustomerIdFieldVaild - step 04: Verify Edit Customer form is Displayed");
		verifyTrue(editCustomerPage.isEditCustomerFormDisplayed());
	}

	@Test
	public void EC_05_verifyAddressFieldCannotBeEmpty() {

		log.info("AddressFieldCannotBeEmpty - step 01: Input to Address textbox");
		editCustomerPage.inputToAddressTextbox("");

		log.info("AddressFieldCannotBeEmpty - step 02: Click Tab keybord focus out address textbox");
		editCustomerPage.fucusOfAddressField();

		log.info("AddressFieldCannotBeEmpty - step 02: Verify address message");
		verifyEquals(editCustomerPage.getTextOfAddressMessage(),
				Customer_Module.ErrorMessage.ADDRESS_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_06_verifyCityFieldCannotBeEmpty() {

		log.info("CityFieldCannotBeEmpty - step 01: Input to city textbox");
		editCustomerPage.inputToCityTextbox("");

		log.info("CityFieldCannotBeEmpty - step 02: Click Tab keybord focus out city textbox");
		editCustomerPage.fucusOfCityField();

		log.info("CityFieldCannotBeEmpty - step 02: Verify city message");
		verifyEquals(editCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_07_verifyCityFieldCannotBeNumeric() {

		log.info("CityFieldCannotBeNumeric - step 01: Input data to city textbox");
		editCustomerPage.inputToCityTextbox(Customer_Module.Edit_Customer_Data.CITY_DATA_HAVE_NUMBERIC_01);

		log.info("CityFieldCannotBeNumeric - step 02: Verify city message");
		verifyEquals(editCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_NUMERIC);

		log.info("CityFieldCannotBeNumeric - step 03: Input data to city textbox");
		editCustomerPage.inputToCityTextbox(Customer_Module.Edit_Customer_Data.CITY_DATA_HAVE_NUMBERIC_02);

		log.info("CityFieldCannotBeNumeric - step 04: Verify city message");
		verifyEquals(editCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void EC_08_verifyCityFieldCannotHaveSpecialCharacter() {

		log.info("CityFieldCannotHaveSpecialCharaters - step 01: Input data to city textbox");
		editCustomerPage.inputToCityTextbox(Customer_Module.Edit_Customer_Data.CITY_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("CityFieldCannotHaveSpecialCharaters - step 02: Verify city message");
		verifyEquals(editCustomerPage.getTextOfCityMessage(),
				Customer_Module.ErrorMessage.CITY_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("CityFieldCannotHaveSpecialCharaters - step 03: Input data to city textbox");
		editCustomerPage.inputToCityTextbox(Customer_Module.Edit_Customer_Data.CITY_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("CityFieldCannotHaveSpecialCharaters - step 04: Verify city message");
		verifyEquals(editCustomerPage.getTextOfCityMessage(),
				Customer_Module.ErrorMessage.CITY_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void EC_09_verifyStateFieldCannotBeEmpty() {
		
		log.info("StateFieldCannotBeEmpty - step 01: Input to city textbox");
		editCustomerPage.inputToStateTextbox("");
		
		log.info("StateFieldCannotBeEmpty - step 02: Click Tab keybord focus out state textbox");
		editCustomerPage.fucusOfStateField();

		log.info("StateFieldCannotBeEmpty - step 03: Verify state message");
		verifyEquals(editCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_EMPTY_EDIT);
	}

	@Test
	public void EC_10_verifyStateFieldCannotBeNumeric() {

		log.info("StateFieldCannotBeNumeric - step 01: Input data to state textbox");
		editCustomerPage.inputToStateTextbox(Customer_Module.Edit_Customer_Data.STATE_DATA_HAVE_NUMBERIC_01);

		log.info("StateFieldCannotBeNumeric - step 02: Verify state message");
		verifyEquals(editCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_NUMERIC);

		log.info("StateFieldCannotBeNumeric - step 03: Input data to state textbox");
		editCustomerPage.inputToStateTextbox(Customer_Module.Edit_Customer_Data.STATE_DATA_HAVE_NUMBERIC_02);

		log.info("StateFieldCannotBeNumeric - step 04: Verify state message");
		verifyEquals(editCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void EC_11_verifyStateFieldCannotHaveSpecialCharacter() {

		log.info("StateFieldCannotHaveSpecialCharaters - step 01: Input data to state textbox");
		editCustomerPage.inputToStateTextbox(Customer_Module.Edit_Customer_Data.STATE_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("StateFieldCannotHaveSpecialCharaters - step 02: Verify state message");
		verifyEquals(editCustomerPage.getTextOfStateMessage(),
				Customer_Module.ErrorMessage.STATE_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("StateFieldCannotHaveSpecialCharaters - step 03: Input data to state textbox");
		editCustomerPage.inputToStateTextbox(Customer_Module.Edit_Customer_Data.STATE_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("StateFieldCannotHaveSpecialCharaters - step 04: Verify state message");
		verifyEquals(editCustomerPage.getTextOfStateMessage(),
				Customer_Module.ErrorMessage.STATE_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void EC_12_verifyPinFieldCannotBeNumeric() {

		log.info("PinFieldMustBeNumeric - step 01: Input data to pin textbox");
		editCustomerPage.inputToPinTextbox(Customer_Module.Edit_Customer_Data.PIN_DATA_HAVE_CHARACTER);

		log.info("PinFieldMustBeNumeric - step 02: Verify pin message");
		verifyEquals(editCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void EC_13_verifyPinFieldCannotBeEmpty() {

		log.info("PinFieldCannotBeEmpty - step 01: Input to city textbox");
		editCustomerPage.inputToPinTextbox("");
		
		log.info("PinFieldCannotBeEmpty - step 02: Click Tab keybord focus out pin textbox");
		editCustomerPage.fucusOfPinField();

		log.info("PinFieldCannotBeEmpty - step 03: Verify pin message");
		verifyEquals(editCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_14_verifyPinFieldMustHaveSixDigits() {
		
		log.info("PinFieldMustHaveSixDigits - step 01: Input data to pin textbox");
		editCustomerPage.inputToPinTextbox(Customer_Module.Edit_Customer_Data.PIN_DATA_LESS_SIX_DIGITS);

		log.info("PinFieldMustHaveSixDigits - step 02: Verify pin message");
		verifyEquals(editCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_MUST_HAVE_SIX_DIGITS);

	}

	@Test
	public void EC_15_verifyPinFieldCannotHaveSpecialCharacter() {
		
		log.info("PinFieldCannotHaveSpecialCharaters - step 01: Input data to pin textbox");
		editCustomerPage.inputToPinTextbox(Customer_Module.Edit_Customer_Data.PIN_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("PinFieldCannotHaveSpecialCharaters - step 02: Verify pin message");
		verifyEquals(editCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("PinFieldCannotHaveSpecialCharaters - step 03: Input data to pin textbox");
		editCustomerPage.inputToPinTextbox(Customer_Module.Edit_Customer_Data.PIN_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("PinFieldCannotHaveSpecialCharaters - step 04: Verify pin message");
		verifyEquals(editCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_SPECIAL_CHARETERS);

	}

	@Test
	public void EC_16_verifyTelePhoneFieldCannotBeEmpty() {
		
		log.info("TelePhoneFieldCannotBeEmpty - step 01: Input to city textbox");
		editCustomerPage.inputToTelephoneTextbox("");

		log.info("TelePhoneFieldCannotBeEmpty - step 02: Click Tab keybord focus out phone textbox");
		editCustomerPage.fucusOfPinField();

		log.info("TelePhoneFieldCannotBeEmpty - step 03: Verify phone message");
		verifyEquals(editCustomerPage.getTextOfTelephoneMessage(), Customer_Module.ErrorMessage.PHONE_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_17_verifyTelePhoneFieldCannotHaveSpecialCharacter() {

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 01: Input data to telephone textbox");
		editCustomerPage
				.inputToTelephoneTextbox(Customer_Module.Edit_Customer_Data.PHONE_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 02: Verify telephone message");
		verifyEquals(editCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 03: Input data to telephone textbox");
		editCustomerPage
				.inputToTelephoneTextbox(Customer_Module.Edit_Customer_Data.PHONE_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 04: Verify telephone message");
		verifyEquals(editCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_SPECIAL_CHARETERS);

	}

	@Test
	public void EC_18_verifyEmailFieldCannotBeEmpty() {
		
		log.info("EmailFieldCannotBeEmpty - step 01: Input to city textbox");
		editCustomerPage.inputToEmailTextbox("");
		
		log.info("EmailFieldCannotBeEmpty - step 02: Click Tab keybord focus out email textbox");
		editCustomerPage.fucusOfEmailField();

		log.info("EmailFieldCannotBeEmpty - step 03: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(), Customer_Module.ErrorMessage.EMAIL_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void EC_19_verifyEmailFieldMustBeInFormat() {
		
		log.info("EmailFieldMustBeInCorrectFormat - step 01: Input data to email textbox");
		editCustomerPage.inputToEmailTextbox(Customer_Module.Edit_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_01);

		log.info("EmailFieldMustBeInCorrectFormat - step 02: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 03: Input data to email textbox");
		editCustomerPage.inputToEmailTextbox(Customer_Module.Edit_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_02);

		log.info("EmailFieldMustBeInCorrectFormat - step 04: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 05: Input data to email textbox");
		editCustomerPage.inputToEmailTextbox(Customer_Module.Edit_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_03);

		log.info("EmailFieldMustBeInCorrectFormat - step 06: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 07: Input data to email textbox");
		editCustomerPage.inputToEmailTextbox(Customer_Module.Edit_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_04);

		log.info("EmailFieldMustBeInCorrectFormat - step 08: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 9: Input data to email textbox");
		editCustomerPage.inputToEmailTextbox(Customer_Module.Edit_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_05);

		log.info("EmailFieldMustBeInCorrectFormat - step 10: Verify email message");
		verifyEquals(editCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

	}
	
	
	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
