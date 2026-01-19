package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AllPom.ArthagriHomePage;

public class TC_009 {
	private static final ArthagriHomePage WebDriverUtils = null;

	@Test
	public void verifyCommunication() throws InterruptedException {
		//LoginPage l=new LoginPage(driver);
		//l.enterEmail("nikhilm@arthagri.in");
		//l.enterPassord("123456789");
		//l.clicklogin();
		
		ArthagriHomePage hm= new ArthagriHomePage(driver);
		hm.communicationClick();
		hm.farmermessageClick();
		hm.createmessageClick();
		
		hm.enterTitle("FARMERREPORT");
		hm.statusDropdown();
		
		hm.enterDescription("THI IS FARMERS DETAIL2");
	
		hm.villageDropdown();
	
		hm.clickfigDropdown();
		By RegisterButtonLocator = By.xpath("//input[@value='Register']");
		WebDriverUtils.scrollToElement(driver, RegisterButtonLocator, 2000);
		hm.clickchoosefarmersDropdown();
		
		
		
		hm.clickRegister();
		
		
	}
}
