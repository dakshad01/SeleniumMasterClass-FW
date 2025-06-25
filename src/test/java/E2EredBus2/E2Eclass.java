package E2EredBus2;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RedBusResultPage2.busSearchResultPage;
import RedBusResultPage2.homepage;
import RedBusResultPage2.passengerDetailPage;
import redbus2.testComponents.baseTest;

public class E2Eclass {
	@Test
	public static void busTicketBooking() throws InterruptedException, IOException {
		
	
		baseTest baseTestObject = new baseTest();
		WebDriver driver = baseTestObject.launchTheSiteName("https://www.redbus.in/"); 
		
		homepage homepageObject = new homepage(driver);
		
		homepageObject.busSearchAction("Chennai", "Bangalore");
		
		busSearchResultPage busSearchResultPage = new busSearchResultPage(driver);
		
		busSearchResultPage.seatSelectingAction();
		
		busSearchResultPage.ScrollingAndFindingBueses("Royal Travels", 0, 90);
		
		passengerDetailPage passengerDetailPageObject = new passengerDetailPage(driver);
		
		passengerDetailPageObject.seatsAndBoardndDropPoint();
		
		passengerDetailPageObject.passengerDetail("dakshaddakshad@gmail.com", "9976797271", "DAKSHAD", "21");
		
	}
	
}
		
