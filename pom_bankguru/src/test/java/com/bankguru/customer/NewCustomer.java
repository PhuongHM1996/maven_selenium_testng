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
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import bankguru.pageObject.NewCustomerPO;
import commons.AbstractTest;

public class NewCustomer extends AbstractTest {

	private WebDriver driver;
	private LoginPO loginPage;
	private HomePO homePage;
	private NewCustomerPO newCustomerPage;

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
	public void NC_01_verifyNameFieldCannotBeEmpty() {

		log.info("NameFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) homePage.openMultipleBankGuruPages("New Customer");

		log.info("NameFieldCannotBeEmpty - step 02: Click Tab keybord focus out Customer name textbox");
		newCustomerPage.fucusOfNameField();

		log.info("NameFieldCannotBeEmpty - step 03: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_02_verifyNameFieldCannotBeNumeric() {

		log.info("NameFieldCannotBeNumeric - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("NameFieldCannotBeNumeric - step 02: Input data to customer name textbox");
		newCustomerPage
				.inputToCustomerNameTextbox(Customer_Module.New_Customer_Data.CUSTOMER_NAME_DATA_HAVE_NUMBERIC_01);

		log.info("NameFieldCannotBeEmpty - step 03: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_BE_NUMERIC);

		log.info("NameFieldCannotBeNumeric - step 04: Input data to customer name textbox");
		newCustomerPage
				.inputToCustomerNameTextbox(Customer_Module.New_Customer_Data.CUSTOMER_NAME_DATA_HAVE_NUMBERIC_02);

		log.info("NameFieldCannotBeEmpty - step 05: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void NC_03_verifyNameFieldCannotHaveSpecialCharaters() {

		log.info("NameFieldCannotHaveSpecialCharaters - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("NameFieldCannotHaveSpecialCharaters - step 02: Input data to customer name textbox");
		newCustomerPage.inputToCustomerNameTextbox(
				Customer_Module.New_Customer_Data.CUSTOMER_NAME_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("NameFieldCannotHaveSpecialCharaters - step 03: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("NameFieldCannotHaveSpecialCharaters - step 04: Input data to customer name textbox");
		newCustomerPage.inputToCustomerNameTextbox(
				Customer_Module.New_Customer_Data.CUSTOMER_NAME_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("NameFieldCannotHaveSpecialCharaters - step 05: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void NC_04_verifyNameFieldCannotHaveFirstCharacterAsSpace() {

		log.info("NameFieldCannotHaveFirstCharacterAsSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("NameFieldCannotHaveFirstCharacterAsSpace - step 02: Input data to customer name textbox");
		newCustomerPage.inputToCustomerNameTextbox(
				Customer_Module.New_Customer_Data.CUSTOMER_NAME_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("NameFieldCannotHaveFirstCharacterAsSpace - step 03: Verify customer name message");
		verifyEquals(newCustomerPage.getTextOfCustomerNameMessage(),
				Customer_Module.ErrorMessage.CUSTOMER_NAME_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_05_verifyAddressFieldCannotBeEmpty() {

		log.info("AddressFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("AddressFieldCannotBeEmpty - step 02: Click Tab keybord focus out address textbox");
		newCustomerPage.fucusOfAddressField();

		log.info("AddressFieldCannotBeEmpty - step 03: Verify address message");
		verifyEquals(newCustomerPage.getTextOfAddressMessage(), Customer_Module.ErrorMessage.ADDRESS_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_06_verifyAddressFieldCannotHaveFirstCharacterAsSpace() {

		log.info("AddressFieldCannotHaveFirstCharacterAsSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("AddressFieldCannotHaveFirstCharacterAsSpace - step 02: Input data to address textbox");
		newCustomerPage
				.inputToAddressTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("AddressFieldCannotHaveFirstCharacterAsSpace - step 03: Verify address message");
		verifyEquals(newCustomerPage.getTextOfAddressMessage(),
				Customer_Module.ErrorMessage.ADDRESS_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_08_verifyCityFieldCannotBeEmpty() {

		log.info("CityFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("CityFieldCannotBeEmpty - step 02: Click Tab keybord focus out city textbox");
		newCustomerPage.fucusOfCityField();

		log.info("CityFieldCannotBeEmpty - step 03: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_09_verifyCityFieldCannotBeNumeric() {

		log.info("CityFieldCannotBeNumeric - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("CityFieldCannotBeNumeric - step 02: Input data to city textbox");
		newCustomerPage.inputToCityTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_NUMBERIC_01);

		log.info("CityFieldCannotBeNumeric - step 03: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_NUMERIC);

		log.info("CityFieldCannotBeNumeric - step 04: Input data to city textbox");
		newCustomerPage.inputToCityTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_NUMBERIC_02);

		log.info("CityFieldCannotBeNumeric - step 05: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(), Customer_Module.ErrorMessage.CITY_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void NC_10_verifyCityFieldCannotHaveSpecialCharaters() {

		log.info("CityFieldCannotHaveSpecialCharaters - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("CityFieldCannotHaveSpecialCharaters - step 02: Input data to city textbox");
		newCustomerPage.inputToCityTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("CityFieldCannotHaveSpecialCharaters - step 03: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(),
				Customer_Module.ErrorMessage.CITY_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("CityFieldCannotHaveSpecialCharaters - step 04: Input data to city textbox");
		newCustomerPage.inputToCityTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("CityFieldCannotHaveSpecialCharaters - step 05: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(),
				Customer_Module.ErrorMessage.CITY_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void NC_11_verifyCityFieldCannotHaveFirstCharacterAsSpace() {

		log.info("CityFieldCannotHaveFirstCharacterAsSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("CityFieldCannotHaveFirstCharacterAsSpace - step 02: Input data to city textbox");
		newCustomerPage
				.inputToCityTextbox(Customer_Module.New_Customer_Data.ADDRESS_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("CityFieldCannotHaveFirstCharacterAsSpace - step 03: Verify city message");
		verifyEquals(newCustomerPage.getTextOfCityMessage(),
				Customer_Module.ErrorMessage.CITY_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_12_verifyStateFieldCannotBeEmpty() {

		log.info("StateFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("StateFieldCannotBeEmpty - step 02: Click Tab keybord focus out state textbox");
		newCustomerPage.fucusOfStateField();

		log.info("StateFieldCannotBeEmpty - step 03: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_13_verifyStateFieldCannotBeNumeric() {

		log.info("StateFieldCannotBeNumeric - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("StateFieldCannotBeNumeric - step 02: Input data to state textbox");
		newCustomerPage.inputToStateTextbox(Customer_Module.New_Customer_Data.STATE_DATA_HAVE_NUMBERIC_01);

		log.info("StateFieldCannotBeNumeric - step 03: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_NUMERIC);

		log.info("StateFieldCannotBeNumeric - step 04: Input data to state textbox");
		newCustomerPage.inputToStateTextbox(Customer_Module.New_Customer_Data.STATE_DATA_HAVE_NUMBERIC_02);

		log.info("StateFieldCannotBeNumeric - step 05: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(), Customer_Module.ErrorMessage.STATE_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void NC_14_verifyStateFieldCannotHaveSpecialCharaters() {

		log.info("StateFieldCannotHaveSpecialCharaters - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("StateFieldCannotHaveSpecialCharaters - step 02: Input data to state textbox");
		newCustomerPage.inputToStateTextbox(Customer_Module.New_Customer_Data.STATE_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("StateFieldCannotHaveSpecialCharaters - step 03: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(),
				Customer_Module.ErrorMessage.STATE_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("StateFieldCannotHaveSpecialCharaters - step 04: Input data to state textbox");
		newCustomerPage.inputToStateTextbox(Customer_Module.New_Customer_Data.STATE_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("StateFieldCannotHaveSpecialCharaters - step 05: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(),
				Customer_Module.ErrorMessage.STATE_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void NC_15_verifyStateFieldCannotHaveFirstBlankSpace() {

		log.info("StateFieldCannotHaveFirstBlankSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("StateFieldCannotHaveFirstBlankSpace - step 02: Input data to state textbox");
		newCustomerPage.inputToStateTextbox(Customer_Module.New_Customer_Data.STATE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("StateFieldCannotHaveFirstBlankSpace - step 03: Verify state message");
		verifyEquals(newCustomerPage.getTextOfStateMessage(),
				Customer_Module.ErrorMessage.STATE_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_16_verifyPinFieldMustBeNumeric() {

		log.info("PinFieldMustBeNumeric - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldMustBeNumeric - step 02: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_HAVE_CHARACTER);

		log.info("PinFieldMustBeNumeric - step 03: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_NOT_BE_NUMERIC);
	}

	@Test
	public void NC_17_verifyPinFieldCannotBeEmpty() {

		log.info("PinFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldCannotBeEmpty - step 02: Click Tab keybord focus out pin textbox");
		newCustomerPage.fucusOfPinField();

		log.info("PinFieldCannotBeEmpty - step 03: Verify state message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_18_verifyPinFieldMustHaveSixDigits() {

		log.info("PinFieldMustHaveSixDigits - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldMustHaveSixDigits - step 02: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_LESS_SIX_DIGITS);

		log.info("PinFieldMustHaveSixDigits - step 03: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(), Customer_Module.ErrorMessage.PIN_CAN_MUST_HAVE_SIX_DIGITS);
	}

	@Test
	public void NC_19_verifyPinFieldCannotHaveSpecialCharaters() {

		log.info("PinFieldCannotHaveSpecialCharaters - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldCannotHaveSpecialCharaters - step 02: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("PinFieldCannotHaveSpecialCharaters - step 03: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("PinFieldCannotHaveSpecialCharaters - step 04: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("PinFieldCannotHaveSpecialCharaters - step 05: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void NC_20_verifyPinFieldCannotHaveFirstBlankSpace() {

		log.info("PinFieldCannotHaveFirstBlankSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldCannotHaveFirstBlankSpace - step 02: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("PinFieldCannotHaveFirstBlankSpace - step 03: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_21_verifyPinFieldCannotHaveSpace() {

		log.info("PinFieldCannotHaveSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("PinFieldCannotHaveSpace - step 02: Input data to pin textbox");
		newCustomerPage.inputToPinTextbox(Customer_Module.New_Customer_Data.PIN_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("PinFieldCannotHaveSpace - step 03: Verify pin message");
		verifyEquals(newCustomerPage.getTextOfPinMessage(),
				Customer_Module.ErrorMessage.PIN_CAN_NOT_HAVE_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_22_verifyTelephoneFieldCannotBeEmpty() {

		log.info("TelephoneFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("TelephoneFieldCannotBeEmpty - step 02: Click Tab keybord focus out telephone textbox");
		newCustomerPage.fucusOfTelephoneField();

		log.info("TelephoneFieldCannotBeEmpty - step 03: Verify telephone message");
		verifyEquals(newCustomerPage.getTextOfTelephoneMessage(), Customer_Module.ErrorMessage.PHONE_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_23_verifyTelephoneFieldCannotHaveFirstCharacterAsSpace() {

		log.info("TelephoneFieldCannotHaveFirstCharacterAsBlackSpace - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("TelephoneFieldCannotHaveFirstCharacterAsBlackSpace - step 02: Input data to telephone textbox");
		newCustomerPage
				.inputToTelephoneTextbox(Customer_Module.New_Customer_Data.PHONE_DATA_HAVE_FIRST_CHARACTER_AS_SPACE);

		log.info("TelephoneFieldCannotHaveFirstCharacterAsBlackSpace - step 03: Verify telephone message");
		verifyEquals(newCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_FIRST_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_24_verifyTelephoneFieldCannotHaveSpaces() {

		log.info("TelephoneFieldCannotHaveSpaces - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("TelephoneFieldCannotHaveSpaces - step 02: Input data to telephone textbox");
		newCustomerPage.inputToTelephoneTextbox(Customer_Module.New_Customer_Data.PHONE_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("TelephoneFieldCannotHaveSpaces - step 03: Verify telephone message");
		verifyEquals(newCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_25_verifyTelephoneFieldCannotHaveSpecialCharacter() {

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 02: Input data to telephone textbox");
		newCustomerPage.inputToTelephoneTextbox(Customer_Module.New_Customer_Data.PHONE_DATA_HAVE_SPECIAL_CHARATERS_01);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 03: Verify telephone message");
		verifyEquals(newCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_SPECIAL_CHARETERS);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 04: Input data to telephone textbox");
		newCustomerPage.inputToTelephoneTextbox(Customer_Module.New_Customer_Data.PHONE_DATA_HAVE_SPECIAL_CHARATERS_02);

		log.info("TelephoneFieldCannotHaveSpecialCharacter - step 05: Verify telephone message");
		verifyEquals(newCustomerPage.getTextOfTelephoneMessage(),
				Customer_Module.ErrorMessage.PHONE_CAN_NOT_HAVE_SPECIAL_CHARETERS);
	}

	@Test
	public void NC_26_verifyEmailFieldCannotBeEmpty() {

		log.info("EmailFieldCannotBeEmpty - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("EmailFieldCannotBeEmpty - step 02: Click Tab keybord focus out email textbox");
		newCustomerPage.fucusOfEmailField();

		log.info("EmailFieldCannotBeEmpty - step 03: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(), Customer_Module.ErrorMessage.EMAIL_CAN_NOT_BE_EMPTY);
	}

	@Test
	public void NC_27_verifyEmailFieldMustBeInCorrectFormat() {

		log.info("EmailFieldMustBeInCorrectFormat - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("EmailFieldMustBeInCorrectFormat - step 02: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_01);

		log.info("EmailFieldMustBeInCorrectFormat - step 03: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 04: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_02);

		log.info("EmailFieldMustBeInCorrectFormat - step 05: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 05: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_03);

		log.info("EmailFieldMustBeInCorrectFormat - step 07: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 08: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_04);

		log.info("EmailFieldMustBeInCorrectFormat - step 09: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);

		log.info("EmailFieldMustBeInCorrectFormat - step 10: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_NOT_CORRECT_FORMAT_05);

		log.info("EmailFieldMustBeInCorrectFormat - step 11: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_MUST_BE_IN_CORRECT_FORMAT);
	}

	@Test
	public void NC_29_verifyEmailFieldCannotHaveSpace() {

		log.info("EmailFieldMustBeInCorrectFormat - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("EmailFieldMustBeInCorrectFormat - step 02: Input data to email textbox");
		newCustomerPage.inputToEmailTextbox(Customer_Module.New_Customer_Data.EMAIL_DATA_HAVE_CHARACTER_AS_SPACE);

		log.info("EmailFieldMustBeInCorrectFormat - step 03: Verify email message");
		verifyEquals(newCustomerPage.getTextOfEmailMessage(),
				Customer_Module.ErrorMessage.EMAIL_CAN_NOT_HAVE_CHARACTER_AS_SPACE);
	}

	@Test
	public void NC_30_verifyAllFieldLabelsAreAsRequirement() {

		log.info("AllFieldLabelsAreAsRequirement - step 01: Click New Customer link");
		newCustomerPage = (NewCustomerPO) newCustomerPage.openMultipleBankGuruPages("New Customer");

		log.info("AllFieldLabelsAreAsRequirement - step 02: Click submit button");
		newCustomerPage.clickSubmitButton();

		log.info("AllFieldLabelsAreAsRequirement - step 03: Verify alert message");
		verifyEquals(newCustomerPage.getAlertMessage(), "please fill all fields");

		log.info("AllFieldLabelsAreAsRequirement - step 04: Click OK button in alert");
		newCustomerPage.closeAlertMessage();
	}

	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
