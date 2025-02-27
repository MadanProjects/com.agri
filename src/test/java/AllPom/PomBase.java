package AllPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PomBase {
	public WebDriver driver;
	
	
	PomBase(WebDriver driver){
		PageFactory.initElements(driver,this );
		driver=this.driver;
	}
}
