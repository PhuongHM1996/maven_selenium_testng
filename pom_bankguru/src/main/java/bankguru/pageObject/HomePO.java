package bankguru.pageObject;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.HomePageUI;
import commons.AbstractPageObject;

public class HomePO extends AbstractPageObject {

	WebDriver driver;

	public HomePO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public boolean isWelcomeMessageDisplayed() {
		waitToElementVisible(HomePageUI.WELCOME_MESSAGE);
		return isElementDisplayed(HomePageUI.WELCOME_MESSAGE);
	}

}
