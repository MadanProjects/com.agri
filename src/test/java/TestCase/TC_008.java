package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import AllPom.Organisation;
import basePkg.Base;

public class TC_008 extends Base  {

	public TC_008( ) {

	}


	private static final Organisation WebDriverUtils = null;

	@Test
	public void verifyshareholder() throws InterruptedException{

		Organisation or= new Organisation(driver);

		or.orgnsationClick();
		or.shareholder();
		or.searchtab("Pratiksha Efgh");

		By manageaccountButtonLocator = By.xpath("//a[contains(text(),'Manage Account')][1]");
		WebDriverUtils.scrollToElement(driver, manageaccountButtonLocator, 2000);

		or.srmanageaccount();
		or.srshare_held_add("500");
		or.srface_value_add("500");
		or.sramount_add();
		//or.srfolio_no("123542");
		or.srremark("all done");
		or.srsubmit();


	}


}
