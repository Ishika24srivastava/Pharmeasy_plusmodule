package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import testbase.Pharmeasy_base;

public class Pharmeasy_page extends Pharmeasy_base {
	public ExtentTest test;
	public ExtentReports extent;
	
	
	
	
	
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus;
	
	@FindBy(xpath="//img[@class='_2xpm0']")
	WebElement Logoplus;
	
	@FindBy(xpath="//div[@class='_3n74z']")
	WebElement Exclusive ;
	
	@FindBy(xpath="//span[text()='Apply Coupon']")
	WebElement Applycoupon ;
	
	@FindBy(xpath="//input[@id='mobileNoInput']")
	WebElement Mobileno ;
	
	@FindBy(xpath="//button[@id='mobileNoSubmitBtn']")
	WebElement Sendotp ;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit ;
	
	@FindBy(xpath="//div[@class='_3muwI']")
	WebElement Plan ;
	
	@FindBy(xpath="//div[@class='MAmI3 _2_jEW']")
	WebElement Plusmembership;
	
	@FindBy(xpath="//div[text()='Apply']")
	WebElement Apply;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	WebElement Addcart;
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus_s;
	
	@FindBy(xpath="//div[@class='_2aIr3']")
	WebElement Not_sure;
	
	@FindBy(xpath="//span[text()='What are the benefits of PharmEasy Plus?']")
	WebElement q1;
	
	@FindBy(xpath="//span[text()='What is the validity of the cashback?']")
	WebElement q4;
	
	@FindBy(xpath="//span[text()='Are there any products where plus benefits are not eligible?']")
	WebElement q6;
	
	@FindBy(xpath="//span[text()='Jsidjsa']")
	WebElement user;
	
	@FindBy(xpath="//a[text()='Save for Later']")
	WebElement save;
	
	@FindBy(xpath="//a[text()='Wallet']")
	WebElement wallet;
	
	@FindBy(xpath="//div[@class='TopSection_container__3Lzw2']")
	WebElement  Balance;
	
	@FindBy(xpath="//div[@class='WalletTransactionsHistory_containerInner__DA0aK']")
	WebElement  Cashback;
	
	@FindBy(xpath="//div[text()='How it works']")
	WebElement  Work;
	
	@FindBy(xpath="//div[text()='Frequently Asked Questions']")
	WebElement q;
	

	public Pharmeasy_page()
	{
		PageFactory.initElements(driver, this);
	}

	public void plus() throws InterruptedException
	{
		Plus.click();
		String url=driver.getCurrentUrl();
		Thread.sleep(1000);
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=homecard");
		System.out.println(url);
	}
	
	public void Logo()
	{
		boolean status= Logoplus.isDisplayed();
		System.out.println("The logo is visible= "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Exlusive() throws InterruptedException
	{
		String data= Exclusive.getText();
		System.out.println("The data of get eclusive access= "+data);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=homecard");
	}
	
	public void Apply_coupon() throws InterruptedException
	{
		Applycoupon.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Login() throws InterruptedException
	{
		Mobileno.sendKeys("8533904286");
		Thread.sleep(1000);
		Sendotp.click();
		Thread.sleep(20000);
		Submit.click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Plan() throws InterruptedException
	{
		String plan_view=Plan.getText();
		System.out.println("The plan will be = "+plan_view);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void PharmEasy_plus() throws InterruptedException
	{
		String plan_text=Plusmembership.getText();
		System.out.println("The plan will be = "+plan_text);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Apply_click() throws InterruptedException
	{
		Apply.click();
		Thread.sleep(1000);
		Addcart.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/cart");
	}
	
	public void Plus_S() throws InterruptedException
	{
		Plus_s.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
	}
	
	public void Spending()
	{
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//div[@class='_19mNE']"));
		ac.dragAndDropBy(w1,2000,3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
	}
	
	public void Still_sure() throws InterruptedException	
	{
		String plan_text=Not_sure.getText();
		System.out.println("The plan will be = "+plan_text);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void Frequent() throws InterruptedException
	{
		q1.click();
		Thread.sleep(1000);
		q4.click();
		Thread.sleep(1000);
		q6.click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy Plus");
	}
	
	public void User() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		save.click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	public void Wallet() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		wallet.click();
		Thread.sleep(1000);
		String viewbalance=Balance.getText();
		System.out.println("The viewed balance= "+viewbalance);
		Thread.sleep(1000);
		String balance=Cashback.getText();
		System.out.println("The viewed balance= "+balance);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public void Works() throws InterruptedException
	{
		Work.click();
		Thread.sleep(1000);
		q.click();
		String title=driver.getTitle();
		System.out.println(title);
	}
}
