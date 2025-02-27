package AllPom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArthagriHomePage extends PomBase {

	JavascriptExecutor js;

	public	ArthagriHomePage(WebDriver driver) {
		super(driver);

	}

	//WbELements
	@FindBy(xpath="//span[normalize-space()='Communication']") WebElement communicationbtn;
	@FindBy(xpath="//a[normalize-space()='Farmer Message']") WebElement farmermessagebtn;
	@FindBy(xpath="//b[normalize-space()='Create Message']") WebElement createmessagebtn;

	@FindBy(xpath="//input[@id='title']") WebElement titletxt;
	@FindBy(xpath="//select[@id='status']") WebElement statustxt;
	@FindBy(xpath="//textarea[@id='description']") WebElement descriptiontxt;
	@FindBy(xpath="//input[@value='Register']") WebElement registerbtn;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy (xpath="//select[@data-select2-id='village']/option[4]") WebElement vd ;
	@FindBy(xpath="//ul[@class='select2-selection__rendered'][1]") WebElement villaglistDropdown;

	@FindBy(xpath="(//ul[@class='select2-selection__rendered'])[2]") WebElement figDropdown ;
	@FindBy(xpath="//select[@id='fig']/option[21]") WebElement fd;
	@FindBy(xpath="(//ul[@class='select2-selection__rendered'])[3]") WebElement choosefarmersDropdown;
	
	@FindBy(xpath="//select[@id='farmerIds']/option[4]") WebElement cfd;
	///////////
	public void communicationClick() {
		communicationbtn.click();
	}


	public void farmermessageClick() {
		farmermessagebtn.click();
	}

	public void createmessageClick() {
		createmessagebtn.click();

	}

	////////////////////////////

	public void enterTitle(String title) {
		titletxt.sendKeys(title);

	}

	//drop1

	public void statusDropdown() {
		Select s1 =new Select(statustxt);
		s1.selectByValue("Publish");
	}
	//////practice//

	public void villageDropdown() {
		villaglistDropdown.click();
		vd.click();


	}


	public void clickfigDropdown() {
		figDropdown.click();
		fd.click();
	}

	public void clickchoosefarmersDropdown() {
		choosefarmersDropdown.click();
		cfd.click();
	}
	
	/////practice//


	public void enterDescription(String desc) {

		descriptiontxt.sendKeys(desc);

	}

	public void clickRegister() throws InterruptedException {

//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",registerbtn);
//		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//
//
//
//		// WebDriverWait  w=new WebDriverWait( driver, 30s);

		registerbtn.click();

	}
	/*public void waitUntilElementIsVisible(By locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element is visible.");
		} catch (TimeoutException e) {
			System.out.println("Timed out waiting for the element to be visible.");
		}
	}*/

	// Method to scroll to an element and optionally wait before interacting
			public static void scrollToElement(WebDriver driver, By locator, int waitTimeInMillis) {
				try {
					// Find the element by locator
					WebElement element = driver.findElement(locator);

					// Use JavaScriptExecutor to scroll to the element
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true);", element);

					// Wait for a specified amount of time (optional, for observation purposes)
					Thread.sleep(waitTimeInMillis);

					// Click the element after scrolling

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


}


