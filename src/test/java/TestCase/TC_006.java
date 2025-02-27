package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import AllPom.Organisation;
import basePkg.Base;

public class TC_006 extends Base {


	@Test
	public void verifyprofile() throws InterruptedException {

		Organisation or= new Organisation(driver);

		or.orgnsationClick();
		or.CompanyprfleClick();
		or.myprofileClick();
		or.firstname("biru");
		or.midlename("biru");
		or.lstname("biru");
		or.mobilenumber("9874563210");
		or.Submit();
		or.erormssage();




		// Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed. URL doesn't contain 'dashboard'");
		//String actualstring = driver.get

	}
}
