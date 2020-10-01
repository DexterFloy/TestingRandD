package research.TestingRandD.assist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waiters {

//	https://devqa.io/webdriver-explicit-implicit-fluent-wait/
	
	
//	 implicit wait ----------------------------------------------------------------------------------
	WebDriver driverI = new FirefoxDriver();
	driverI.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driverI.get("http://somedomain/slow_loading_url");
	WebElement dynamicElementI = driverI.findElement(By.id("dynamicElement"));

	
	
//	 fluent wait ----------------------------------------------------------------------------------
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	WebDriver driverF = new FirefoxDriver();
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driverF)
	    .withTimeout(30, SECONDS)
	    .pollingEvery(5, SECONDS)
	    .ignoring(NoSuchElementException.class);

	WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
	{
	    public WebElement apply(WebDriver driver) {
	    return driver.findElement(By.id("foo"));
	}
	});


//	 explicit wait ----------------------------------------------------------------------------------
	WebDriver driverE = new FirefoxDriver();
	driver.get("http://somedomain/someurl");
	WebElement dynamicElementE = (new WebDriverWait(driverE, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement")));
	
	
}
