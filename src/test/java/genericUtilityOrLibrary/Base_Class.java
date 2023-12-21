package genericUtilityOrLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Base_Class {
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public JavaUtility JUTIL = new JavaUtility();
	public ExcelUtility EUTIL = new ExcelUtility();
	public static WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void createDbConnection() {
		System.out.println("DB connection created succesfully");
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(/*String browser*/) throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		/*if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}*/
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("launching browser successfull");
	}

//	@BeforeMethod(alwaysRun = true)
//	public void loginApp() throws Exception {
//		/*String USERNAME = PUTIL.getDataFromProperties("username");
//		//String PASSWORD = PUTIL.getDataFromProperties("password");
//		
//		Login_Page_PomClass lp = new Login_Page_PomClass(driver);
//		lp.loginOperation(USERNAME, PASSWORD);*/
//	}
//
//	@AfterMethod(alwaysRun = true)
//	public void logoutApp() { 
//		//Home_Page_Pom_Class hp = new Home_Page_Pom_Class(driver);
//		//hp.logout();
//	}
//
	@AfterClass(alwaysRun = true)
	public void closeWindow()
	{
		//driver.close();
		System.out.println("window closed successfully");
	}

	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("DB connection closed successfully");
	}
}
