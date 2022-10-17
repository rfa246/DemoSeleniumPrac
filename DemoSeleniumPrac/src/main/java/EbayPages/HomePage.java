package EbayPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//*[@type='text']")WebElement sreachbox;
	@FindBy(xpath = "//*[@type='submit']")WebElement sreachicon;
	
	public void SreachIcon() {
		sreachbox.sendKeys("computer");
	}
	public void SreachButton() {
		sreachicon.click();
	}
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
