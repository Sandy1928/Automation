package travelssearch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.*;
import org.junit.runner.RunWith;

//import travelspages.mainpage;
import travelspages.hotels;


@RunWith(TestRunner.class)


public class searchpositive {
	
	public WebDriver driver;
	
	
	@Before
	public void onBefore() {
		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get("https://www.phptravels.net");
	//	driver.get("https://www.phptravels.net/login");
		
		}
	
	@Test
	
	public void onTest() throws InterruptedException{
	//mainpage objmain = new mainpage(driver);
	//	objmain.register();
		
		hotels objmain = new hotels(driver);
		objmain.bookhotel();
		
		
	}
	
	@After
	public void onAfter() {
		driver.close();
		driver.quit();
	}

}
