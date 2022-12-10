package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.StepBase;

public class UtilityClass extends StepBase{

	WebDriverWait wait;

	public void sendKeysOnWebElement(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);

	}

	public void clickOnWebElement(WebElement element, long waitTimeInSec) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSec));
		WebElement elements = null;
		elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();

	}
	
	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	
	public void mouseHoverAndClickElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

}
