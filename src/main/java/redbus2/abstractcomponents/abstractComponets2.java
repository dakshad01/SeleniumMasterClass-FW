package redbus2.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class abstractComponets2 {
	WebDriver driver;
	
	public abstractComponets2(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void WaitForElementVisibility(By FindBy) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindBy));
	}
	public void javaScriptExecutor(String jscommand) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(jscommand);
	}
	public void javaScriptExecutorscrollToView(String jscommands,WebElement WE) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(jscommands,WE);
	}

}
