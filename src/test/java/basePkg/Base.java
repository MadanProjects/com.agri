package basePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;




import AllPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


	public static  WebDriver driver;
	public Properties p;
	public	FileInputStream f;
    public  ExtentTest test;
    ExtentReports e ;
	
	public void getscrnshot(ITestResult result ) throws IOException {
		// Take a screenshot and store it as a File object
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
			test.fail(result.getThrowable());
			
			
		

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		// Specify the destination path for the screenshot
		File destFile = new File("D:\\JAVA_ECLIPSE_WORKSPACE\\com.agri\\screenshots\\screenshot00.png");

		// Copy the screenshot to the destination path
		FileUtils.copyFile(srcFile, destFile);

		System.out.println("companyProfile Screenshot saved in 'screenshots' folder!");
	}}



	@BeforeClass
	public void setUp() throws IOException 

	{
		Properties p = new Properties();
		try {
			FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
			p.load(f);
		} catch (FileNotFoundException e) {
			System.out.println("Error: config.properties file not found!");
			return; // Exit the method if properties file not found

		}
		//////
		String u = p.getProperty("browser");
		////////

		if (u.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		} else if (p.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else {
			System.out.println("Invalid browser specified in config.properties");
		}
		
		
        
        

		LoginPage l=new LoginPage(driver);
		l.enterEmail("nikhilm@arthagri.in");
		l.enterPassord("123456789");
		l.clicklogin();

		////////////////////////////

		/*	public void scrnshot(ITestResult result ) {
			// Take a screenshot and store it as a File object
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

	        // Specify the destination path for the screenshot
	        File destFile = new File("screenshots/screenshot00.png");

	        // Copy the screenshot to the destination path
	        FileUtils.copyFile(srcFile, destFile);

	        System.out.println("companyProfile Screenshot saved in 'screenshots' folder!");
		}*/


	}




	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
