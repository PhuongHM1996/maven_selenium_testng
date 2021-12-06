package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.EditAccountUI;
import commons.AbstractPageObject;

public class EditAccountPO extends AbstractPageObject {
	
	WebDriver driver;
	
	public EditAccountPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}
	
	public void fucusOfAccountNoField() {
		waitToElementVisible(EditAccountUI.ACCOUNT_NO_TEXTBOX);
		sendKeyboardToElement(EditAccountUI.ACCOUNT_NO_TEXTBOX, Keys.TAB);
	}

	public String getTextOfAccountNoMessage() {
		waitToElementVisible(EditAccountUI.ACCOUNT_NO_MESSAGE);
		return getTextElement(EditAccountUI.ACCOUNT_NO_MESSAGE);
	}

	public void inputToAccountNoTextbox(String textValue) {
		waitToElementVisible(EditAccountUI.ACCOUNT_NO_TEXTBOX);
		sendKeyToElement(EditAccountUI.ACCOUNT_NO_TEXTBOX, textValue);
	}
	
	public void clickToSubmitButton() {
		waitToElementVisible(EditAccountUI.SUBMIT_BUTTON);
		clickToElement(EditAccountUI.SUBMIT_BUTTON);
	}
	
	public boolean isEditAccountFormDisplayed() {
		waitToElementVisible(EditAccountUI.EDIT_ACCOUNT_FORM);
		return isElementDisplayed(EditAccountUI.EDIT_ACCOUNT_FORM);
	}
}
