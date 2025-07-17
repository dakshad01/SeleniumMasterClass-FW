package RedBusResultPage2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redbus2.abstractcomponents.abstractComponets2;

public class homepage extends abstractComponets2 {
	
	WebDriver driver;

	public homepage(WebDriver driver) {
		
		super (driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[text()='From']")
	WebElement fromLocationTextBoxclick;
	
	@FindBy(id="srcDest")
	WebElement sendKeytoFrom;
	
	@FindBy(xpath="//div[text()='Koyambedu, Chennai']")
	WebElement fromLocationClick;
	
	@FindBy(id="srcDest")
	WebElement sendkeystoTOlocation;
	
	@FindBy(xpath="//div[text()='Madiwala, Bangalore']")
	WebElement toLocatinClick;
	
	@FindBy(xpath="//span[text()='Date of Journey']")
	WebElement chooseDate;
	
	@FindBy(xpath="//i[@class='icon icon-arrow arrow___4df7ff right___90a032 ']")
	WebElement selectForwardButton;
	
	@FindBy(xpath="//span[text()='30']")
	WebElement dateSelection;
	
	@FindBy(xpath="//button[text()='Search buses']")
	WebElement searchBuses;
	
	public void busSearchAction(String fromLocation, String toLocation) {
		
		fromLocationTextBoxclick.click();
		sendKeytoFrom.sendKeys("Chennai");
		fromLocationClick.click();
		sendkeystoTOlocation.sendKeys("Bangalore");
		toLocatinClick.click();
		chooseDate.click();
		selectForwardButton.click();
		dateSelection.click();
		searchBuses.click();
	}

}
