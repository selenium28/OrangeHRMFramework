package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import util.UtilityClass;

public class LoginPage extends StepBase{
	
	UtilityClass util;
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement username_TextBox;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement password_TextBox;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login_Button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		util = new UtilityClass();
		util.sendKeysOnWebElement(username_TextBox, "Admin");
		util.sendKeysOnWebElement(password_TextBox, "admin123");
		util.clickOnWebElement(login_Button, 5);
	}
	

}
