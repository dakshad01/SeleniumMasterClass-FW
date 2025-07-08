package RedBusResultPage2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import redbus2.abstractcomponents.abstractComponets2;

public class busSearchResultPage extends abstractComponets2 {
	
		public WebDriver driver;
		
		public busSearchResultPage(WebDriver driver) {
			super (driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		By BusesBy = By.xpath("//div[contains(@class,'travelsName___')]");
		
		@FindBy(xpath="//div[text()='Departure time']")
		WebElement sortingDepartureTime;
		
		@FindBy(xpath="//div[contains(@class,'travelsName___')]")
		List<WebElement> busLists;
		
		public void seatSelectingAction() {
			WaitForElementVisibility(BusesBy);
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(BusesBy));
			sortingDepartureTime.click();
		}
	
		public void ScrollingAndFindingBueses(String busname, int x, int y) throws InterruptedException {
		int i=0;
		Thread.sleep(1500);
		outer:
		while(i<500) {
			
	
			javaScriptExecutor("window.scrollBy("+x+","+y+")");
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,75)");
			
			
			List<WebElement>busLists=driver.findElements(By.xpath("//div[contains(@class,'travelsName___')]"));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(BusesBy));
			int index=1;
			
			inner:
			for(WebElement busList:busLists) {
				
				if(busList.getText().equalsIgnoreCase(busname)) {
					Thread.sleep(1500);
					javaScriptExecutorscrollToView("arguments[0].scrollIntoView(false);",busList);
					
					driver.findElement(By.xpath("(//button[text()='View seats'])["+index+"]")).click();
					
					break outer;
				}
				
				index++;
			}
			
			i++;
		}

}
}
