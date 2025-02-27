package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AllPom.Organisation;
import basePkg.Base;

public class TC_007 extends Base {

	private static final Organisation WebDriverUtils = null;

	@Test
	public void verifyOrgstrcture() throws InterruptedException {
		Organisation or= new Organisation(driver);

		or.orgnsationClick();
		or.orgstructure();
		or.addresorce();
		or.osfirstname("rajesh");
		or.osmiddlename("kumar");
		or.oslastname("sharma");
		or.osaddress("pune");
		or.osgender("male");
		or.osrole("manager");
		or.osmobile("9874563210");
		or.osemail("jayesh@gmail.com");
		or.ospassword("123456789");
		By registerButtonLocator = By.xpath("//button[text()='Register Company Member']");
		WebDriverUtils.scrollToElement(driver, registerButtonLocator, 2000);

		or.osconfirm_password("123456789");
		or.osbodcheck();
        
		
		By submitButtonLocator = By.xpath("//button[text()='Register Company Member']");
		WebDriverUtils.scrollToElement(driver, submitButtonLocator, 2000);
		or.oscategory("Open / General");
		or.oslandholding("50");
		or.ostenants("20");
		or.oslandlease("20");
		or.osdesignation("manager");
		or.oseducation("B.ed");
		or.ospancard("ABCD1234A");
		or.osaadharcard("123456981254");
		or.oslandbelongstothebOD("yes");
		or.osotherinfo("N/a");

		
		or.manageagencies();
		
		
		
	}


}
