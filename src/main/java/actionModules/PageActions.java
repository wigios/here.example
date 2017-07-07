package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.PageObject;

public class PageActions {

	public WebDriver driver;

	public PageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void enterText(String value) throws InterruptedException {

		PageObject pageObject = new PageObject(driver);
		
		WebElement fr = driver.findElement(By.name("result"));
		driver.switchTo().frame(fr);
		pageObject.txtBxNewText.sendKeys(value);

		pageObject.btnChange.click();
	}
	
	public String getNewText() throws InterruptedException {

		PageObject pageObject = new PageObject(driver);

		return pageObject.lblText.getText();
	}

}
