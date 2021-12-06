package com.bankguru.commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bankguru.pageObject.BankGuruPageGeneratorManager;
import bankguru.pageObject.LoginPO;
import bankguru.pageObject.RegisterPO;
import commons.AbstractTest;

public class common_01_RegisterAccount extends AbstractTest {

	private WebDriver driver;

	private LoginPO loginPage;
	private RegisterPO registerPage;

	private String email;

	public static String USERID, PASSWORD;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {

		driver = getBrowserDriver(browserName, urlValue);

		email = "hmp" + radomNumber() + "@gmail.com";

		loginPage = BankGuruPageGeneratorManager.getLoginPage(driver);
	}

	@Test
	public void common_01_RegisterUser() {

		log.info("Rester - step 01: Get Login Page Url");
		//loginPageUrl = loginPage.getLoginPageUrl();

		log.info("Rester - step 02: Click to 'here' link");
		registerPage = loginPage.clickToHereLink();

		log.info("Rester - step 03: Input to EmailID textbox ");
		registerPage.inputToEmailIDTextbox(email);

		log.info("Rester - step 04: Click to Submit button");
		registerPage.clickToSubmidButton();

		log.info("Rester - step 05: Get UserID value");
		USERID = registerPage.getUserIDValue();

		log.info("Rester - step 06: Get Password value");
		PASSWORD = registerPage.getPasswordValue();
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
