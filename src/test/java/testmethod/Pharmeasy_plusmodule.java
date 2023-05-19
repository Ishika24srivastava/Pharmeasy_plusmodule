package testmethod;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import testbase.Pharmeasy_base;
import testpage.Pharmeasy_page;

public class Pharmeasy_plusmodule extends Pharmeasy_base{
	
	Pharmeasy_page pharmeasy_offermodule;
	static ExtentTest log ;
	static ExtentReports report ;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_offermodule=new Pharmeasy_page();
	}
	
	
	
	@BeforeClass
	public void x() 
	{
			
		report=new ExtentReports("C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_module\\target\\TestcaseExecutionreport\\Offer_testexecutionReport.html",true);	
	}
		

	
	
	@Test(priority=1)
	public void Plus() throws InterruptedException
	{
		log = report.startTest("plus page is loading");
		pharmeasy_offermodule.plus();
		log.log(LogStatus.PASS, "Test Case passed");	
	}
	
	@Test(priority=2)
	public void Logo()
	{
		log = report.startTest("Logo is displayed properly");
		pharmeasy_offermodule.Logo();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=3)
	public void Exclusive() throws InterruptedException
	{
		log = report.startTest("Exclusive data displayed properly");
		pharmeasy_offermodule.Exlusive();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=4)
	public void Coupon() throws InterruptedException
	{
		log = report.startTest("Apply Coupon is clicked  properly");
		pharmeasy_offermodule.Apply_coupon();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=5)
	public void Login() throws InterruptedException
	{
		log = report.startTest("Login successfully");
		pharmeasy_offermodule.Login();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=6)
	public void Plan() throws InterruptedException
	{
		log = report.startTest("Plan viewed  successfully");
		pharmeasy_offermodule.Plan();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	
	@Test(priority=7)
	public void Plan_membership() throws InterruptedException
	{
		log = report.startTest("Plan Member ship  viewed  successfully");
		pharmeasy_offermodule.PharmEasy_plus();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	
	@Test(priority=8)
	public void  Add_cart() throws InterruptedException
	{
		log = report.startTest("Plus member ship added to the cart successfully");
		pharmeasy_offermodule.Apply_click();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=9)
	public void  Plus_reback() throws InterruptedException
	{
		log = report.startTest("Redirect to the page  successfully");
		pharmeasy_offermodule.Plus_S();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=10)
	public void  Spending() throws InterruptedException
	{
		log = report.startTest(" Spending scroll successfully");
		pharmeasy_offermodule.Spending();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=11)
	public void  Sure() throws InterruptedException
	{
		log = report.startTest(" Still not sure text viewed  successfully");
		pharmeasy_offermodule.Still_sure();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=12)
	public void  User() throws InterruptedException
	{
		log = report.startTest(" Desired user profile click  successfully");
		pharmeasy_offermodule.User();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=13)
	public void  Wallet() throws InterruptedException
	{
		log = report.startTest("Wallet is  clicked  successfully");
		pharmeasy_offermodule.Wallet();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@Test(priority=14)
	public void  Work() throws InterruptedException
	{
		log = report.startTest(" Work button viewed  successfully");
		pharmeasy_offermodule.Works();
		log.log(LogStatus.PASS, "Test cases passed");
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
		}
	}
	
	@AfterSuite
	void EndTest()
	{
		report.endTest(log);	
		report.flush();
		terminate();
	
	}
}
