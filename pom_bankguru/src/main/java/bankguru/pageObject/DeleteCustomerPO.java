package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.DeleteCustomerUI;
import commons.AbstractPageObject;

public class DeleteCustomerPO extends AbstractPageObject {

	WebDriver driver;

	public DeleteCustomerPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void acceptAlertDelectCustomer() {
		driver.switchTo().alert().accept();
	}

	public void acceptAlertDelectSucessfully() {
		driver.switchTo().alert().accept();
	}

	public String getTextAlertCustomerDoesNotExist() {
		return driver.switchTo().alert().getText();
	}

	public void acceptAlertCustomerDoesNotExist() {
		driver.switchTo().alert().accept();
	}

	public void fucusOfCustomerIdField() {
		waitToElementVisible(DeleteCustomerUI.CUSTOMER_ID_TEXTBOX);
		sendKeyboardToElement(DeleteCustomerUI.CUSTOMER_ID_TEXTBOX, Keys.TAB);
	}

	public String getTextOfCustomerIdMessage() {
		waitToElementVisible(DeleteCustomerUI.CUSTOMER_ID_MESSAGE);
		return getTextElement(DeleteCustomerUI.CUSTOMER_ID_MESSAGE);
	}

	public void inputToCustomerIdTextbox(String textValue) {
		waitToElementVisible(DeleteCustomerUI.CUSTOMER_ID_TEXTBOX);
		sendKeyToElement(DeleteCustomerUI.CUSTOMER_ID_TEXTBOX, textValue);
	}

}
