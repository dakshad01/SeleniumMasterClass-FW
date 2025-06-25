package redbus.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponents {
	
	WebDriver driver;
	
	public abstractComponents(WebDriver driver) {
		
		this.driver=driver;
	}

	public void WaitForElementVisibility(By FindBy) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	}
	
	public void javaScriptExecutor(String jsCommand) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsCommand);
	}
	
	public void actionMoveToElement(WebElement we, int x, int y ) {
		Actions a = new Actions (driver);
		a.moveToElement( we, x, y).click().build().perform();
	}
}
