package AllPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Organisation extends PomBase {

	private static final Organisation WebDriverUtils = null;



	public Organisation(WebDriver driver) {
		super(driver);
	}

	//WbELements
	@FindBy(xpath="//span[text()='Organization']") WebElement Orgnisation;
	@FindBy(xpath="//a[text()='Company Profile']") WebElement companyprfile;
	@FindBy(xpath="//a[text()='My Profile']") WebElement myprfile;
	@FindBy(xpath="//a[contains(text(),'Shareholder')]") WebElement Sharehold;



	@FindBy(xpath=("//input[@placeholder='First Name']")) WebElement firstname;
	@FindBy(xpath=("//input[@placeholder='Middle Name']")) WebElement middlename ;
	@FindBy(xpath=("//input[@placeholder='Last Name']"))WebElement lastname;
	@FindBy(xpath=("//input[@id='mobilenumber']"))WebElement mobilenumber ;
	@FindBy(xpath=("//button[@type=\"submit\"][1]"))WebElement submit;
	@FindBy(xpath=(" //li[text()='The email has already been taken.']")) WebElement errormssage;

    ///////////////
	
	@FindBy(xpath=("//input[@type='search']")) WebElement searchacc;
	@FindBy(xpath=("//a[@onclick='amountAdd(673)']")) WebElement manageacc;
	@FindBy(xpath=("//input[@id='share_held_add']")) WebElement share_held;
	@FindBy(xpath=("//input[@id='face_value_add']")) WebElement face_digit;
	@FindBy(xpath=("//input[@id='amount_add']")) WebElement amount;
	@FindBy(xpath=("(//textarea[@id='textarea'])[1]")) WebElement folio;
	@FindBy(xpath=("//textarea[@id='remark']")) WebElement mark;
	@FindBy(xpath=("//button[@onclick='closePopupAmountDetails()']")) WebElement closebttn;
	@FindBy(xpath=("//button[text()='Submit']")) WebElement submitbttn;
	
	///////////////

	@FindBy(xpath="//a[text()='Organization Structure']") WebElement organizationstructure;
	@FindBy(xpath="//a[text()='Add Resource']") WebElement addresource;

	@FindBy(xpath="//input[@id='firstname']") WebElement osfistname;
	@FindBy(xpath="//input[@id='middlename']") WebElement osmidname;
	@FindBy(xpath="//input[@id='lastname']") WebElement oslasname;
	@FindBy(xpath="//input[@id='address']") WebElement osadres;
	@FindBy(xpath="//select[@id='gender']") WebElement osgnder;
	@FindBy(xpath="//option[text()='Male'][1]") WebElement osmale;
	@FindBy(xpath="//input[@role='textbox']") WebElement ostextbox;
	@FindBy(xpath="//li[text()='Manager']") WebElement osManager;
	@FindBy(xpath="//input[@id='mobile']") WebElement osmobnumber;
	@FindBy(xpath="//input[@id='email']") WebElement osmail;
	@FindBy(xpath="//input[@id='password']") WebElement ospasword;
	@FindBy(xpath="//input[@id='confirm_password']") WebElement osconfirm_pasword;
    @FindBy(xpath="//input[@id='bod-check']") WebElement osbod;
	
	@FindBy(xpath="//select[@id='category']") WebElement oscategry;
	@FindBy(xpath="//option[text()='Open / General']") WebElement osOpenGeneral;
	@FindBy(xpath="//input[@id='land-holding']") WebElement oslandhold;
	@FindBy(xpath="//input[@id='tenants']") WebElement ostents;
	@FindBy(xpath="//input[@id='land-lease']") WebElement oslandleas;
	@FindBy(xpath="//input[@id='designation']") WebElement osdesnation;
	@FindBy(xpath="//input[@id='education']") WebElement osedu;
	@FindBy(xpath="//input[@id='pan']") WebElement ospan;
	@FindBy(xpath="//input[@id='aadhar']") WebElement osaadhar;
	@FindBy(xpath="//select[@id='women']") WebElement oswomen;
	@FindBy(xpath="//option[text()='Yes'][1]") WebElement osYes;
	@FindBy(xpath="//select[@id='saat-bara']") WebElement ossaatbara;
	@FindBy(xpath="//input[@id='command']") WebElement oscommand;

	@FindBy(xpath="//a[text()='Manage Agencies']") WebElement Agencies;
	
	

	public void orgnsationClick() {
		Orgnisation.click();
	}


	public void CompanyprfleClick() {
		companyprfile.click();
	}

	public void myprofileClick() {
		myprfile.click();
	}

	///////////////////

	public void firstname(String title) throws InterruptedException {
		firstname.clear();
	
		firstname.sendKeys(title);
	}
	public void midlename(String title) throws InterruptedException {
		middlename.clear();
	
		middlename.sendKeys(title);
	}
	public void lstname(String title) throws InterruptedException {
		lastname.clear();
		
		lastname.sendKeys(title);
	}
	public void mobilenumber(String title) throws InterruptedException {
		mobilenumber.clear();
		
		mobilenumber.sendKeys(title);
	}
	public void Submit() throws InterruptedException {

		submit.click();
	}

	public void erormssage() throws InterruptedException {

		String actualmessage = errormssage.getText();
		System.out.println(actualmessage);
		Assert.assertEquals(actualmessage, "The email has already been taken.");
	}

	/////////////////////////////////
	
	public void shareholder(){
		Sharehold.click();
	}
	
	public void searchtab(String title ){
		searchacc.sendKeys(title);
	}
	public void srmanageaccount() throws InterruptedException{
		manageacc.click();
		
	}
//	public void sramountwait () {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement amt = wait.until(ExpectedConditions.elementToBeClickable(amount));
//	    amt.click();
//	}
	
	public void srshare_held_add(String title) throws InterruptedException{
		share_held.sendKeys(title);;
	
	}
	
	public void srface_value_add(String title) throws InterruptedException{
		face_digit.sendKeys(title);
		
	}
	public void sramount_add() throws InterruptedException{
		amount.click();
		
	}
	
	
	
	
	public void srfolio_no(String title) throws InterruptedException{
		folio.sendKeys(title);
		
	}
	
	public void srremark(String title) throws InterruptedException{
		mark.sendKeys(title);
		
	}
	public void srclosepopup() throws InterruptedException{
		closebttn.click();;
		
	}
	public void srsubmit() throws InterruptedException{
		submitbttn.click();;
		
	}
	
	
	///////////////////////////////

	public void orgstructure() throws InterruptedException {
		organizationstructure.click();

	}

	public void addresorce() throws InterruptedException {
		addresource.click();

	}

	public void osfirstname(String title) throws InterruptedException {
		osfistname.clear();
	
		osfistname.sendKeys(title);
	}

	public void osmiddlename(String title) throws InterruptedException {
		osmidname.clear();
		
		osmidname.sendKeys(title);
	}

	public void oslastname(String title) throws InterruptedException {
		oslasname.clear();
		
		oslasname.sendKeys(title);
	}
	public void osaddress(String title) throws InterruptedException {

		
		osadres.sendKeys(title);
	}

	public void osgender(String title) throws InterruptedException {

		
		osgnder.sendKeys(title);
	}
	public void osmale(String title) throws InterruptedException {

		
		osmale.sendKeys(title);
	}

	public void osmobile(String title) throws InterruptedException {

		
		osmobnumber.sendKeys(title);
	}
	public void osrole(String title) throws InterruptedException {

		
		ostextbox.sendKeys(title);
	}

	public void osManager(String title) throws InterruptedException {

	
		osManager.sendKeys(title);
	}

	public void osemail(String title) throws InterruptedException {
		osmail.clear();
		
		osmail.sendKeys(title);
	}
//	// Method to scroll to an element and optionally wait before interacting
//		public static void scrollToElement(WebDriver driver, By locator, int waitTimeInMillis) {
//			try {
//				// Find the element by locator
//				WebElement element = driver.findElement(locator);
//				
//				  
//
//				// Use JavaScriptExecutor to scroll to the element
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//				// Wait for a specified amount of time (optional, for observation purposes)
//				Thread.sleep(waitTimeInMillis);
//
//				// Click the element after scrolling
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	


	public static void scrollToElement(WebDriver driver, By locator, int waitTimeInMillis) {
	    try {
	        // Create a WebDriverWait instance to wait for the element to be visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for the element to be visible
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	        // Use JavaScriptExecutor to scroll to the element
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);

	        // Wait for a specified amount of time (optional, for observation purposes)
	        Thread.sleep(waitTimeInMillis);

	        // Click the element after scrolling
	       // element.click(); // You can replace this with any other interaction you need

	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}


	
	public void ospassword(String title) throws InterruptedException {

	
		ospasword.clear();

		ospasword.sendKeys(title);

	}

	public void osconfirm_password(String title) throws InterruptedException {
		osconfirm_pasword.clear();
		
		osconfirm_pasword.sendKeys(title);
	}

	public void osbodcheck() throws InterruptedException {
		
		
		osbod.click();
		// Verify that the radio button is selected
        Assert.assertTrue(osbod.isSelected(), "Radio button should be selected after clicking");
	}

	
	public void oscategory(String title) throws InterruptedException {

	
		oscategry.sendKeys(title);

	}
	
	
	public void oslandholding(String title) throws InterruptedException {

		
		oslandhold.sendKeys(title);

	}
	
	public void ostenants(String title) throws InterruptedException {

		
		ostents.sendKeys(title);

	}
	public void oslandlease(String title) throws InterruptedException {

		
		oslandleas.sendKeys(title);

	}

	public void osdesignation(String title) throws InterruptedException {

		
		osdesnation.sendKeys(title);

	}
	
	public void oseducation(String title) throws InterruptedException {

		
		osedu.sendKeys(title);

	}
	
	public void ospancard(String title) throws InterruptedException {

		
		ospan.sendKeys(title);

	}
	public void osaadharcard(String title) throws InterruptedException {

	
		osaadhar.sendKeys(title);

	}
	public void oslandbelongstothebOD(String title) throws InterruptedException {

		
		ossaatbara.sendKeys(title);

	}
	

	public void osotherinfo(String title) throws InterruptedException {

		
		oscommand.sendKeys(title);

	}
	
	/////////////////////////////////
	public void manageagencies() throws InterruptedException {
		
		Agencies.click();

	}

		
		
}
