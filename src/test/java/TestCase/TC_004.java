package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AllPom.ArthagriHomePage;
import basePkg.Base;

public class TC_004 extends Base{
	
	
	private static final ArthagriHomePage WebDriverUtils = null;

	@Test
	public void verifySelectfigDropdown() throws InterruptedException 
	{
		ArthagriHomePage hm= new ArthagriHomePage(driver);
		
		hm.communicationClick();
		
		hm.farmermessageClick();

		hm.createmessageClick();
		
		hm.enterTitle("FARMERREPORT");
	
		hm.statusDropdown();
		
		hm.clickfigDropdown();
		
		hm.enterDescription("Stomy whether 4" );
		
		By RegisterButtonLocator = By.xpath("//input[@value='Register']");
		WebDriverUtils.scrollToElement(driver, RegisterButtonLocator, 2000);
	
		hm.clickRegister();
		
		
	}

}
