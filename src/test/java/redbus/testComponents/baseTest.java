package redbus.testComponents;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class baseTest {
	
	public WebDriver driver;
	
	public WebDriver initializeDrive () throws IOException {
		
		Properties properties = new Properties(); 
		FileInputStream  file = new FileInputStream("C:\\Users\\ndeva\\eclipse-workspace\\SeleniumMasterClass-FW\\src\\main\\java\\redbus\\resources\\global.properties");
		properties.load(file);
		String browserName= properties.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Microsoft Edge")) {
			
			driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
