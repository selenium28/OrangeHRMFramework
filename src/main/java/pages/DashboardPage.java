package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import util.UtilityClass;

public class DashboardPage extends StepBase{
	UtilityClass util;
	
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement admin_Section;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void dashboard() { 
		util = new UtilityClass();
		util.mouseHoverAndClickElement(admin_Section);
	}

}
