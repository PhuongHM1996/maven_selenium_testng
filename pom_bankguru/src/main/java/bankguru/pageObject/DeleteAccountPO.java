package bankguru.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.DeleteAccountUI;
import commons.AbstractPageObject;

public class DeleteAccountPO extends AbstractPageObject {

	WebDriver driver;

	public DeleteAccountPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void acceptAlertDelectAccount() {
		driver.switchTo().alert().accept();
	}

	public void acceptAlertDelectSucessfully() {
		driver.switchTo().alert().accept();
	}

	public String getTextAlertAccountDoesNotExist() {
		return driver.switchTo().alert().getText();
	}

	public void acceptAlertAccountDoesNotExist() {
		driver.switchTo().alert().accept();
	}
	
	public void fucusOfAccountNoField() {
		waitToElementVisible(DeleteAccountUI.ACCOUNT_NO_TEXTBOX);
		sendKeyboardToElement(DeleteAccountUI.ACCOUNT_NO_TEXTBOX, Keys.TAB);
	}

	public String getTextOfAccountNoMessage() {
		waitToElementVisible(DeleteAccountUI.ACCOUNT_NO_MESSAGE);
		return getTextElement(DeleteAccountUI.ACCOUNT_NO_MESSAGE);
	}

	public void inputToAccountNoTextbox(String textValue) {
		waitToElementVisible(DeleteAccountUI.ACCOUNT_NO_TEXTBOX);
		sendKeyToElement(DeleteAccountUI.ACCOUNT_NO_TEXTBOX, textValue);
	}

}
