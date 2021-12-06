package bankguru.pageUIs;

public class AbstractBankPageUI {

	public static final String DYNAMIC_LINK = "//ul[@class='menusubnav']//a[text()='%s']";
	public static final String DYNAMIC_HEADER_OR_MESSAGE_DISPLAYED = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_TEXTBOX_TEXTAREA = "(//textarea | //input)[@name='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_TEXT_INTO_TABLE = "//td[contains(text(),'%s')]/following-sibling::td";
	public static final String DYNAMIC_DROPDOWN = "//select[@name='%s']";

}
