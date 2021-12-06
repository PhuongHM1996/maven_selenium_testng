package bankguru.pageObject;

import org.openqa.selenium.WebDriver;

import commons.AbstractPageObject;

public class FundTransferPO extends AbstractPageObject {

	WebDriver driver;
	
	public FundTransferPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

}
