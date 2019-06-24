package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	
	public WebDriver driver;
	public void waiFor(WebElement element) {
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(element));
	}
	
	public basepage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

}
