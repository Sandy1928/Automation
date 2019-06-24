package travelspages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.basepage;

public class mainpage extends basepage{

	public mainpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
		WebElement myaccount;
	
	@FindBy (xpath="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")
	WebElement optsignup;
	
	@FindBy(linkText="Login")
		WebElement login;
	
	@FindBy(name="firstname")
		WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="confirmpassword")
	WebElement cpass;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement btnsignup;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'Zara')]")
	WebElement username;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void register() throws InterruptedException {
		
		myaccount.click();
		optsignup.click();
		fname.click();
		fname.sendKeys("Zara" + Keys.TAB);
		lname.sendKeys("Larios" + Keys.TAB);
		phone.sendKeys("34234567" + Keys.TAB);
		email.sendKeys("zara3@phptravels.com"+ Keys.TAB);
		pass.sendKeys("demouser" + Keys.TAB);
		cpass.sendKeys("demouser");
		btnsignup.click();
		System.out.println("zara@phptravels.com se ha registrado correctamente");
		username.click();
		logout.click();
		System.out.println("el usuario cerró sesión correctamente");
		
Thread.sleep(5000);

	}

	

}
