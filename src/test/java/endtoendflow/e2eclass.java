package endtoendflow;
// 
//import java.time.Duration;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import RedBusResultPage.PassengerDetailPage;
//import RedBusResultPage.busSearchResultPage;
//import RedBusResultPage.homepage;
//import RedBusResultPage.paymentPage;
//
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;  
//import org.openqa.selenium.interactions.Actions;
// 
//public class e2eclass
//{
//
//			public static void main(String[] args)
//			{
//				
//		    	ChromeOptions options=new ChromeOptions();
//				WebDriver driver = new ChromeDriver(options);
//				
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				
//				driver.get("https://www.redbus.in/");
//				
//				driver.manage().window().maximize();
//				
//				homepage homepageobject = new homepage(driver);
//				
//				homepageobject.busSearchAction("Chennai","Bangalore");
//				
////				driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
////				
////				driver.findElement(By.xpath("//text[text()='Chennai']")).click();
////				
////				driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
////				
////				driver.findElement(By.xpath("//text[text()='Bangalore']")).click();
////				
////				driver.findElement(By.xpath("//span[text()='30']")).click();
////				
////				driver.findElement(By.xpath("//button[@id='search_button']")).click();
//				
//				busSearchResultPage busSearchResultPage = new busSearchResultPage(driver);
//				
//				busSearchResultPage.seatSelectingAction();
//				
////				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
////				
////				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix bus-item  ']")));
////				
////				driver.findElement(By.xpath("//span[text()='Departure']")).click(); 	
//				
//				busSearchResultPage.ScrollingAndFindingBuses("Swamy Ayyappa Travels", 95, 1500);
////				int j=0;
////				
////				outer:
////			
////				while(j<50) 
////				{
////					
////					JavascriptExecutor js = (JavascriptExecutor)driver;
////					
////					js.executeScript("window.scrollBy(0,1500)");
////					
////					List<WebElement>  buslists =driver.findElements(By.xpath("//div[@class='clearfix bus-item  ']"));
////					
////					System.out.println(buslists.size());
////					
////					//driver.findElement(By.xpath("//div[@class='clearfix bus-item  ']["+i+"]/div[1]/div[1]/div[1]/div[1]"));
////					
////					inner:
////						for(int i=1;i<=buslists.size();i++)
////						{
////							String busName=driver.findElement(By.xpath("(//div[@class='clearfix bus-item  '])["+i+ "]/div[1]/div[1]/div[1]/div[1]")).getText();
////							
////							if(busName.equalsIgnoreCase("IntrCity SmartBus")) 
////							{
////								driver.findElement(By.xpath("(//li[@class='row-sec clearfix'])["+i+"]/div[1]/following-sibling::div[1]")).click();
////								
////								break outer;
////							}
////						
////						}
////					
////					j++;
////				}
//				
//				busSearchResultPage.SeatSelecting(95, 60);
//				
////				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//canvas[@data-type='lower']")));
////				
////				WebElement canvas = driver.findElement(By.xpath("//canvas[@data-type='lower']"));
////				
////				Actions a = new Actions (driver);
////				a.moveToElement(canvas, 95,60).click().build().perform();
//				
//				
//				busSearchResultPage.SelectingBoardingAndDroppongPoint();
//				
////				driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[1]")).click();
////				
////				driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[25]")).click();
////				
////				driver.findElement(By.xpath("//button[text()='Proceed to book']")).click();
//				
//				PassengerDetailPage PassengerDetailPage = new PassengerDetailPage(driver);
//				
//				PassengerDetailPage.passengerDetailPage("DAKSHAD S","21","TAMIL NADU","dakshaddakshad@gmail.com", "9976797271");
//				
////				driver.findElement(By.xpath("//input[@Placeholder='Name']")).sendKeys("dakshad");
////				
////				driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("21");
////				
////				driver.findElement(By.xpath("//div[@id='div_22_0']")).click();
////				
////				driver.findElement(By.xpath("//input[@id='201']")).sendKeys("Tamil Nadu");
////				
////				driver.findElement(By.xpath("//li[@value='Tamil Nadu']")).click();
////				
////				driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("dakshaddakshad@gmail.com");
////				
////				driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9976797271");
////				
////				driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[2]")).click();
////				
////				driver.findElement(By.xpath("(//label[@class='checkmark'])[2]")).click();
////				
////				driver.findElement(By.xpath("(//input[@value='Proceed to pay'])")).click();
//				
//				paymentPage paymentPage = new paymentPage(driver);
//				paymentPage.paymentPage();
//			}
//
//		}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class e2eclass {
    public static void main(String[] args) throws InterruptedException {

        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Open Amazon
        driver.get("https://www.amazon.in");

        // Step 2: Search for 'headphones'
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000); // Wait for page to load

        // Step 3: Apply filter – 4 stars & up
        WebElement fourStarFilter = driver.findElement(By.xpath("//span[text()='4 Stars & Up']"));
        fourStarFilter.click();

        Thread.sleep(3000); // Wait for filter to apply

        // Step 4: Get product titles after filter
        List<WebElement> productTitles = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

        System.out.println("🔍 Products after applying 4-star filter:");
        int count = 0;
        for (WebElement title : productTitles) {
            System.out.println(" - " + title.getText());
            count++;
            if (count == 5) break; // Just print first 5
        }

        // Step 5: Close the browser
        driver.quit();
    }
}
