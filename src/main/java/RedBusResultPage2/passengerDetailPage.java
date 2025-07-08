package RedBusResultPage2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redbus.abstractComponents.abstractComponents;
import redbus2.abstractcomponents.abstractComponets2;

public class passengerDetailPage extends abstractComponets2 {
	
	WebDriver driver;
	
	public passengerDetailPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="7L")
	WebElement selectSeat;
	
	@FindBy(xpath="//button[text()='Select boarding & dropping points']")
	WebElement selectBoardingAndDroppingPoint;
	
	@FindBy(xpath="(//label[contains(@class,'customRadio___')])[2]")
	WebElement selectBoardingPoint;
	
	@FindBy(xpath="(//label[contains(@class,'customRadio___')])[21]")
	WebElement selectDroppingPoint;
	
	@FindBy(xpath="//input[@placeHolder='Email']")
	WebElement PassengerEmailId;
	
	@FindBy(xpath="//input[@name='Phone']")
	WebElement PassengerPhonneNumber;
	
	@FindBy(xpath="//input[@class='inputField___00a73c   ']")
	WebElement stateSelectionClick;
	@FindBy(xpath="//div[text()='Tamil Nadu']")
	WebElement selectstateSelectionClick;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement passengerName; 
	
	@FindBy(xpath="//input[@placeholder='Enter Age']")
	WebElement passengerAge; 
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement GenderSelection; 
	
	@FindBy(xpath="//div[@id='fcRejectText']")
	WebElement dontAddFreeCancellation;
	
	@FindBy(xpath="//div[text()='No, I would like to proceed without insurance']")
	WebElement AssuranceInRedbus; 
	
	@FindBy(xpath="//button[text()='Continue booking']")
	WebElement continueTObooking;
	
	
	public void seatsAndBoardndDropPoint() { 
	selectSeat.click();
	selectBoardingAndDroppingPoint.click();
	selectBoardingPoint.click();
	selectDroppingPoint.click();
	}
	public void passengerDetail(String EmailId, String phoneNumber, String name,String age ) throws InterruptedException {
	PassengerEmailId.sendKeys(EmailId);
	PassengerPhonneNumber.sendKeys(phoneNumber);
	stateSelectionClick.click();
	selectstateSelectionClick.click();
	passengerName.sendKeys(name);
	passengerAge.sendKeys(age);
	GenderSelection.click(); 
	dontAddFreeCancellation.click();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	AssuranceInRedbus.click();
	continueTObooking.click();
	Thread.sleep(6000);
	driver.quit();}

}
