package bankguru.pageObject;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.LoginPageUI;
import commons.AbstractPageObject;

public class LoginPO extends AbstractPageObject {

	WebDriver driver;

	public LoginPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public String getLoginPageUrl() {
		return getPageCurrentUrl();
	}

	public RegisterPO clickToHereLink() {
		waitToElementVisible(LoginPageUI.HERE_LINK);
		clickToElement(LoginPageUI.HERE_LINK);
		return BankGuruPageGeneratorManager.getRegisterPage(driver);
	}

	public void inputToUsernameTextbox(String userIdValue) {
		waitToElementVisible(LoginPageUI.USER_ID_TEXTBOX);
		sendKeyToElement(LoginPageUI.USER_ID_TEXTBOX, userIdValue);
	}
	
	public void inputToPasswordTextbox(String passwordValue) {
		waitToElementVisible(LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
	}
	
	public HomePO clickToSubmitButton() {
		waitToElementVisible(LoginPageUI.LOGIN_BUTTON);
		clickToElement(LoginPageUI.LOGIN_BUTTON);
		return BankGuruPageGeneratorManager.getHomePage(driver);
	}


}
