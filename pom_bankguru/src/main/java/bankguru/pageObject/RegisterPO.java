package bankguru.pageObject;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.RegisterPageUI;
import commons.AbstractPageObject;

public class RegisterPO extends AbstractPageObject {

	WebDriver driver;

	public RegisterPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}
	
	
	public void inputToEmailIDTextbox(String email) {
		waitToElementVisible(RegisterPageUI.EMAIL_ID_TEXTBOX);
		sendKeyToElement(RegisterPageUI.EMAIL_ID_TEXTBOX, email);
	}

	public void clickToSubmidButton() {
		waitToElementVisible(RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(RegisterPageUI.SUBMIT_BUTTON);
	}

	public String getUserIDValue() {
		waitToElementVisible(RegisterPageUI.USER_ID_TEXT);
		return getTextElement(RegisterPageUI.USER_ID_TEXT);
	}

	public String getPasswordValue() {
		waitToElementVisible(RegisterPageUI.PASSWORD_TEXT);
		return getTextElement(RegisterPageUI.PASSWORD_TEXT);
	}

	public LoginPO openLoginPage(String loginPageUrl) {
		openUrl(loginPageUrl);
		return BankGuruPageGeneratorManager.getLoginPage(driver);
	}

}
