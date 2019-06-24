package travelspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.basepage;

public class hotels extends basepage{

	public hotels(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement btnlogin;
	
	@FindBy(xpath="//span[contains(text(),'Hotels')]")
	WebElement lnkhotels;
	
	@FindBy(id="s2id_autogen8")
	WebElement cityto;
	
	@FindBy(id="travellersInput")
	WebElement travellersinput;
	
	
	

	public void bookhotel() throws InterruptedException {
	//login en pagina de inicio	
	//	user.click();
	//	user.sendKeys("user@phptravels.com" + Keys.TAB);
	//	pass.sendKeys("demouser"+Keys.ENTER);
	//	btnlogin.click();
		
	//booking en un hotel	
	//	lnkhotels.click();
		WebElement cityto = driver.findElement(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]"));
		cityto.click();
		WebElement inputCity = driver.findElement(By.xpath("//input[@class='select2-input select2-focused']"));
		inputCity.sendKeys("London");
		Thread.sleep(2000);
		inputCity.sendKeys(Keys.ENTER);
		WebElement datein = driver.findElement(By.xpath("//input[@placeholder='Check in']"));
		datein.click();
		datein.sendKeys("13/03/2019" + Keys.TAB );
		WebElement dateout = driver.findElement(By.xpath("//input[@placeholder='Check out']"));
		dateout.sendKeys("16/03/2019");
		travellersinput.click();
		WebElement adults = driver.findElement(By.id("adultInput"));
//		adults.sendKeys("2");
		if(adults.getText().equals("2"));
		WebElement childs = driver.findElement(By.id("childInput"));
		childs.click();
		childs.clear();
		childs.sendKeys("2");
		WebElement search = driver.findElement(By.xpath("//form[@name='fCustomHotelSearch']//button[@type='submit'][contains(text(),'Search')]"));
		search.click();
		
		WebElement swissotel = driver.findElement(By.xpath("//b[contains(text(),'Swissotel Le Plaza Basel')]"));
		swissotel.click();
		WebElement chkboxdelux = driver.findElement(By.xpath("//tbody//tr[1]//td[1]//div[2]//div[2]//div[1]//div[3]//div[1]//label[1]//div[1]"));
		chkboxdelux.click();
		WebElement booknow = driver.findElement(By.xpath("//button[contains(text(),'Book Now')]"));
		booknow.click();
		
		WebElement signin = driver.findElement(By.id("signintab"));
		signin.click();
		user.click();
		user.sendKeys("user@phptravels.com" + Keys.TAB);
		pass.sendKeys("demouser"+Keys.ENTER);
		WebElement ckbxnotes = driver.findElement(By.xpath("//div[@class='tab-pane fade active in']//div[@class='control__indicator']")); 
		ckbxnotes.click();		
		WebElement notes = driver.findElement(By.name("additionalnotes"));
		notes.click();
		notes.sendKeys("Wine and flowers");
		WebElement switch4 = driver.findElement(By.id("4"));
		switch4.click();
		WebElement confirm = driver.findElement(By.name("logged"));
		confirm.click();
		WebElement pdf = driver.findElement(By.id("btn"));
		pdf.click();
		
		
		
		Thread.sleep(5000);
		
	}

}
