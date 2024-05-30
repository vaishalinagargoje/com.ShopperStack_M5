package com.ShopperStack_genericutility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShopperStack_Register.Home_Page;
import com.ShopperStack_Register.Login_Page;
import com.ShopperStack_Register.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseTest {
	

		public WebDriver driver;
		static WebDriver ListenersDriver;
		public Java_Utility javauti=new Java_Utility();
		public File_Utility file =new File_Utility ();
		
		public Welcome_Page welcomePage;
		public Login_Page loginPage;
		public Home_Page homePage;
		public ExtentSparkReporter spark;
		public ExtentReports reports;
		public ExtentTest test;
		public Webdriver_Utility webdriver = new Webdriver_Utility();
		

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Beforesuite");
		}
		@BeforeTest
		public void bforeTest() {
			System.out.println("BeforeTest");
			spark= new ExtentSparkReporter("./reports/"+javauti.localDateTime()+".html");
		    reports=new ExtentReports();
			reports.attachReporter(spark);
			 test = reports.createTest("Demo");
			
		}
		@BeforeClass
		public void beforeClass() throws IOException {
			System.out.println("BeforeClass");
			
			String browser=file.readPropertyData("browser");
			String url=file.readPropertyData("url");
			
			if(browser.contains("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browser.contains("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(browser.contains("edge")) {
				driver=new EdgeDriver();
			}
			else {
				System.out.println("Enter Valid Browser Name");
			}
			ListenersDriver=driver;
			welcomePage = new Welcome_Page(driver);
			loginPage = new Login_Page(driver);
			homePage=new Home_Page(driver);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get(url);
			
		}
		@BeforeMethod
		public void beforeMethod() throws IOException, InterruptedException {
			System.out.println("BeforeMethod");
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
			Thread.sleep(3000);
			welcomePage.getLoginBtn().click();
			loginPage.getEmailBtn().sendKeys(file.readPropertyData("username"));
			loginPage.getPasswordBtn().sendKeys(file.readPropertyData("Password"));
			loginPage.getLoginBtn().click();
		}
		
		
		
		@AfterMethod
		public void aftermethod() { 
			System.out.println("after method");
			
			
		}
		@AfterClass
		public void afterclass() throws InterruptedException  {	
			System.out.println("after class");
			
			Thread.sleep(2000);
			driver.quit();
		}
		@AfterTest
		public void aftertest() {	
			System.out.println("after test");
			reports.flush();
		}
		
	@AfterSuite
		public void aftersuite() {	
			System.out.println("after suite");
		}



	
}
