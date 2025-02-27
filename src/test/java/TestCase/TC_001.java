package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import AllPom.LoginPage;
import basePkg.Base;

public class TC_001 extends Base {



	@Test
	public void verifyLogIn() {
		//  LoginPage l=new LoginPage(driver);
		//  l.enterEmail("nikhilm@arthagri.in");
		//	l.enterPassord("123456789");
		//	l.clicklogin();
		
		
		String title=	driver.getTitle();
		Assert.assertEquals(title, "Arthagri");


	}

}
