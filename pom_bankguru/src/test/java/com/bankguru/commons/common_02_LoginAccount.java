package com.bankguru.commons;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.data.AccountData;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.HomePO;
import bankguru.pageObject.LoginPO;
import commons.AbstractTest;

public class common_02_LoginAccount extends AbstractTest {

	private WebDriver driver;

	private LoginPO loginPage;
	private HomePO homePage;

	public common_02_LoginAccount(LoginPO loginPage) {
		this.loginPage = loginPage;
	}

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {

		driver = getBrowserDriver(browserName, urlValue);

		loginPage = BankGuruPageGeneratorManager.getLoginPage(driver);
	}

	@Test
	public void common_01_LoginAccount() {

		log.info("Login - Step 02: Input to email and passwork textbox");
		loginPage.inputToUsernameTextbox(AccountData.USER_ID);
		loginPage.inputToPasswordTextbox(AccountData.PASSWORD);

		log.info("Login - Step 03: Click to login button -> Navigate to HomePage");
		homePage = loginPage.clickToSubmitButton();

		log.info("Login - Step 04: Verify 'My Account' link is displayed");
		assertTrue(homePage.isWelcomeMessageDisplayed());
	}

	public HomePO LoginAccount() {

		log.info("Login - Step 02: Input to email and passwork textbox");
		loginPage.inputToUsernameTextbox(AccountData.USER_ID);
		loginPage.inputToPasswordTextbox(AccountData.PASSWORD);

		log.info("Login - Step 03: Click to login button -> Navigate to HomePage");
		homePage = loginPage.clickToSubmitButton();

		log.info("Login - Step 04: Verify 'My Account' link is displayed");
		assertTrue(homePage.isWelcomeMessageDisplayed());
		
		return homePage;
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
