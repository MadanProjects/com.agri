package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AllPom.Organisation;
import basePkg.Base;

public class TC_007 extends Base {

	private static final Organisation WebDriverUtils = null;

	@Test
	public void verifyOrgstrcture() throws InterruptedException {
		Organisation or= new Organisation(driver);

		or.orgnsationClick();
		By OrgStrutureLocator = By.xpath("//a[text()='Organization Structure']");
		WebDriverUtils.scrollToElement(driver, OrgStrutureLocator, 2000);
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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("bod-check")));
		radioButton.click();
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
