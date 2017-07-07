package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PageObject extends BasePage {

	public WebDriver driver;

	public PageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "myTextField")
	public WebElement txtBxNewText;

	//@FindBy(how = How.ID, using = "myTextField")
	//WebElement txtBxNewText;
	
	@FindBy(id = "title")
	public WebElement lblText;

	@FindBy(id = "byBtn")
	public WebElement btnChange;
}
