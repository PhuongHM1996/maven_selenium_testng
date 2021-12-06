package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.NewCustomerUI;
import commons.AbstractPageObject;

public class NewCustomerPO extends AbstractPageObject {

	WebDriver driver;

	public NewCustomerPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void fucusOfNameField() {
		waitToElementVisible(NewCustomerUI.CUSTOMER_NAME_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.CUSTOMER_NAME_TEXTBOX, Keys.TAB);
	}

	public String getTextOfCustomerNameMessage() {
		waitToElementVisible(NewCustomerUI.CUSTOMER_NAME_MESSAGE);
		return getTextElement(NewCustomerUI.CUSTOMER_NAME_MESSAGE);
	}

	public void inputToCustomerNameTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.CUSTOMER_NAME_TEXTBOX);
		sendKeyToElement(NewCustomerUI.CUSTOMER_NAME_TEXTBOX, textValue);
	}
	
	public void fucusOfAddressField() {
		waitToElementVisible(NewCustomerUI.ADDRESS_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.ADDRESS_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfAddressMessage() {
		waitToElementVisible(NewCustomerUI.ADDRESS_MESSAGE);
		return getTextElement(NewCustomerUI.ADDRESS_MESSAGE);
	}

	public void inputToAddressTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.ADDRESS_TEXTBOX);
		sendKeyToElement(NewCustomerUI.ADDRESS_TEXTBOX, textValue);
	}
	
	public void fucusOfCityField() {
		waitToElementVisible(NewCustomerUI.CITY_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.CITY_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfCityMessage() {
		waitToElementVisible(NewCustomerUI.CITY_MESSAGE);
		return getTextElement(NewCustomerUI.CITY_MESSAGE);
	}

	public void inputToCityTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.CITY_TEXTBOX);
		sendKeyToElement(NewCustomerUI.CITY_TEXTBOX, textValue);
	}
	
	public void fucusOfStateField() {
		waitToElementVisible(NewCustomerUI.STATE_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.STATE_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfStateMessage() {
		waitToElementVisible(NewCustomerUI.STATE_MESSAGE);
		return getTextElement(NewCustomerUI.STATE_MESSAGE);
	}

	public void inputToStateTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.STATE_TEXTBOX);
		sendKeyToElement(NewCustomerUI.STATE_TEXTBOX, textValue);
	}
	
	public void fucusOfPinField() {
		waitToElementVisible(NewCustomerUI.PIN_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.PIN_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfPinMessage() {
		waitToElementVisible(NewCustomerUI.PIN_MESSAGE);
		return getTextElement(NewCustomerUI.PIN_MESSAGE);
	}

	public void inputToPinTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.PIN_TEXTBOX);
		sendKeyToElement(NewCustomerUI.PIN_TEXTBOX, textValue);
	}
	
	public void fucusOfTelephoneField() {
		waitToElementVisible(NewCustomerUI.PHONE_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.PHONE_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfTelephoneMessage() {
		waitToElementVisible(NewCustomerUI.PHONE_MESSAGE );
		return getTextElement(NewCustomerUI.PHONE_MESSAGE);
	}

	public void inputToTelephoneTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.PHONE_TEXTBOX);
		sendKeyToElement(NewCustomerUI.PHONE_TEXTBOX, textValue);
	}
	
	public void fucusOfEmailField() {
		waitToElementVisible(NewCustomerUI.EMAIL_TEXTBOX);
		sendKeyboardToElement(NewCustomerUI.EMAIL_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfEmailMessage() {
		waitToElementVisible(NewCustomerUI.EMAIL_MESSAGE );
		return getTextElement(NewCustomerUI.EMAIL_MESSAGE);
	}

	public void inputToEmailTextbox(String textValue) {
		waitToElementVisible(NewCustomerUI.EMAIL_TEXTBOX);
		sendKeyToElement(NewCustomerUI.EMAIL_TEXTBOX, textValue);
	}
	
	public void clickSubmitButton() {
		waitToElementVisible(NewCustomerUI.SUBMIT_BUTTON);
		clickToElement(NewCustomerUI.SUBMIT_BUTTON);
	}
	
	public String getAlertMessage() {
		waitAlertPresence();
		return getTextAlert();
	}
	
	public void closeAlertMessage() {
		acceptAlert();
	}

}
