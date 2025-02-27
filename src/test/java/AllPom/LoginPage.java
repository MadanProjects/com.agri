package AllPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PomBase {
	
 public	LoginPage(WebDriver driver){
		super(driver);
	}


 
 
 
 @FindBy(xpath="//input[@id='email']") WebElement emailtxt;
 @FindBy(xpath="//input[@id='password']") WebElement passwordtxt;
 @FindBy(xpath="//button[normalize-space()='Login']") WebElement loginbtn;
 
 
 
 
 
 public void enterEmail(String username) {
	 
	 emailtxt.sendKeys(username);
	 
 }
 
 
public void enterPassord(String password) {
	passwordtxt.sendKeys(password);
	 
 }
 
public void clicklogin() {
	 loginbtn.click();
}

}
