package redbus2.testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class baseTest {
	
	WebDriver driver;

	public WebDriver initilizeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ndeva\\eclipse-workspace\\SeleniumMasterClass-FW\\src\\main\\java\\redbus2\\resources\\GlobalProp.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public WebDriver launchTheSiteName(String URL) throws IOException {
		
		driver=initilizeDriver();
		driver.get(URL);
		return driver; 
		
		
		
		
	}
	
}
