package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.EditCustomerUI;
import commons.AbstractPageObject;

public class EditCustomerPO extends AbstractPageObject {

	WebDriver driver;
	
	public EditCustomerPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void fucusOfCustomerIdField() {
		waitToElementVisible(EditCustomerUI.CUSTOMER_ID_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.CUSTOMER_ID_TEXTBOX, Keys.TAB);
	}

	public String getTextOfCustomerIdMessage() {
		waitToElementVisible(EditCustomerUI.CUSTOMER_ID_MESSAGE);
		return getTextElement(EditCustomerUI.CUSTOMER_ID_MESSAGE);
	}
	
	public void inputToCustomerIdTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.CUSTOMER_ID_TEXTBOX);
		sendKeyToElement(EditCustomerUI.CUSTOMER_ID_TEXTBOX, textValue);
	}
	
	public void inputToAddressTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.ADDRESS_TEXTBOX);
		sendKeyToElement(EditCustomerUI.ADDRESS_TEXTBOX, textValue);
	}

	public void fucusOfAddressField() {
		waitToElementVisible(EditCustomerUI.ADDRESS_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.ADDRESS_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfAddressMessage() {
		waitToElementVisible(EditCustomerUI.ADDRESS_MESSAGE);
		return getTextElement(EditCustomerUI.ADDRESS_MESSAGE);
	}
	
	public String getTextOfCityMessage() {
		waitToElementVisible(EditCustomerUI.CITY_MESSAGE);
		return getTextElement(EditCustomerUI.CITY_MESSAGE);
	}
	
	public void inputToCityTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.CITY_TEXTBOX);
		sendKeyToElement(EditCustomerUI.CITY_TEXTBOX, textValue);
	}

	public void fucusOfCityField() {
		waitToElementVisible(EditCustomerUI.CITY_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.CITY_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfStateMessage() {
		waitToElementVisible(EditCustomerUI.STATE_MESSAGE);
		return getTextElement(EditCustomerUI.STATE_MESSAGE);
	}
	
	public void inputToStateTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.STATE_TEXTBOX);
		sendKeyToElement(EditCustomerUI.STATE_TEXTBOX, textValue);
	}

	public void fucusOfStateField() {
		waitToElementVisible(EditCustomerUI.STATE_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.STATE_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfPinMessage() {
		waitToElementVisible(EditCustomerUI.PIN_MESSAGE);
		return getTextElement(EditCustomerUI.PIN_MESSAGE);
	}
	
	public void inputToPinTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.PIN_TEXTBOX);
		sendKeyToElement(EditCustomerUI.PIN_TEXTBOX, textValue);
	}

	public void fucusOfPinField() {
		waitToElementVisible(EditCustomerUI.PIN_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.PIN_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfTelephoneMessage() {
		waitToElementVisible(EditCustomerUI.PHONE_MESSAGE);
		return getTextElement(EditCustomerUI.PHONE_MESSAGE);
	}
	
	public void inputToTelephoneTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.PHONE_TEXTBOX);
		sendKeyToElement(EditCustomerUI.PHONE_TEXTBOX, textValue);
	}

	public void fucusOfTelephoneField() {
		waitToElementVisible(EditCustomerUI.PHONE_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.PHONE_TEXTBOX, Keys.TAB);
	}
	
	public String getTextOfEmailMessage() {
		waitToElementVisible(EditCustomerUI.EMAIL_MESSAGE);
		return getTextElement(EditCustomerUI.EMAIL_MESSAGE);
	}
	
	public void inputToEmailTextbox(String textValue) {
		waitToElementVisible(EditCustomerUI.EMAIL_TEXTBOX);
		sendKeyToElement(EditCustomerUI.EMAIL_TEXTBOX, textValue);
	}

	public void fucusOfEmailField() {
		waitToElementVisible(EditCustomerUI.EMAIL_TEXTBOX);
		sendKeyboardToElement(EditCustomerUI.EMAIL_TEXTBOX, Keys.TAB);
	}

	public void clickSubmitButton() {
		waitToElementVisible(EditCustomerUI.SUBMID_BUTTON);
		clickToElement(EditCustomerUI.SUBMID_BUTTON);
	}

	public boolean isEditCustomerFormDisplayed() {
		waitToElementVisible(EditCustomerUI.EDIT_CUSTOMER_FORM);
		return isElementDisplayed(EditCustomerUI.EDIT_CUSTOMER_FORM);
	}

}
