package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AllPom.ArthagriHomePage;
import basePkg.Base;

public class TC_005 extends Base {
	
	
	private static final ArthagriHomePage WebDriverUtils = null;

	@Test
	public void verifyChoosefarmersDropdown() throws InterruptedException
	{
		ArthagriHomePage hm= new ArthagriHomePage(driver);
		hm.communicationClick();
		hm.farmermessageClick();
		hm.createmessageClick();
		
		hm.enterTitle("FARMERREPORT");
		hm.statusDropdown();
		By RegisterButtonLocator = By.xpath("//input[@value='Register']");
		WebDriverUtils.scrollToElement(driver, RegisterButtonLocator, 2000);
		hm.clickchoosefarmersDropdown();
		hm.clickchoosefarmersDropdown();
		hm.enterDescription("THIS IS FARMERS DETAIL5");
		
		hm.clickRegister();
	}

}
