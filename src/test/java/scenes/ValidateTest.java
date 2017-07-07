package scenes;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import actionModules.PageActions;
import commons.Utilities;
import commons.BaseTest;

public class ValidateTest implements BaseTest{

	private WebDriver driver;	
	private PageActions pageActions;	
	
	@Parameters ({"browser", "value"})
	@Test(enabled = true)
	public void ValidateText(String browser, String value) {

		try {

			driver = Utilities.openBrowser(browser);			
			pageActions = new PageActions(driver);	
			pageActions.enterText(value);
			Assert.assertEquals(RESULT_EXPECTED, pageActions.getNewText());			
		}

		catch (Exception e) {
			Assert.fail(); // To fail test in case of any element identification
							// failure
		}

	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		try {
			if (testResult.getStatus() == ITestResult.FAILURE) {
				System.out.println(testResult.getStatus());
				Utilities.TomarEvidencia(driver);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void Terminacion() throws Exception {
		driver.quit();
		System.out.println("El Proceso ha terminado");

	}

	public void setupPages() {
		// TODO Auto-generated method stub
		
	}

}
