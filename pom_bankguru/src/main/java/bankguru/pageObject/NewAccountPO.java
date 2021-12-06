package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.NewAccountUI;
import commons.AbstractPageObject;

public class NewAccountPO extends AbstractPageObject {

	WebDriver driver;

	public NewAccountPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void fucusOfCustomerIdField() {
		waitToElementVisible(NewAccountUI.CUSTOMER_ID_TEXTBOX);
		sendKeyboardToElement(NewAccountUI.CUSTOMER_ID_TEXTBOX, Keys.TAB);
	}

	public String getTextOfCustomerIdMessage() {
		waitToElementVisible(NewAccountUI.CUSTOMER_ID_MESSAGE);
		return getTextElement(NewAccountUI.CUSTOMER_ID_MESSAGE);
	}

	public void inputToCustomerIdTextbox(String textValue) {
		waitToElementVisible(NewAccountUI.CUSTOMER_ID_TEXTBOX);
		sendKeyToElement(NewAccountUI.CUSTOMER_ID_TEXTBOX, textValue);
	}
	
	public void fucusOfDepositIdField() {
		waitToElementVisible(NewAccountUI.DEPOSIT_TEXTBOX);
		sendKeyboardToElement(NewAccountUI.DEPOSIT_TEXTBOX, Keys.TAB);
	}

	public String getTextOfDepositMessage() {
		waitToElementVisible(NewAccountUI.DEPOSIT_MESSAGE);
		return getTextElement(NewAccountUI.DEPOSIT_MESSAGE);
	}

	public void inputToDepositTextbox(String textValue) {
		waitToElementVisible(NewAccountUI.DEPOSIT_TEXTBOX);
		sendKeyToElement(NewAccountUI.DEPOSIT_TEXTBOX, textValue);
	}
}
