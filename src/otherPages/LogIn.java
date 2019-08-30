package otherPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	static WebDriver driver;
	public LogIn (WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	
	private WebElement emailField() {
		return driver.findElement(By.cssSelector("form.iaform login-form input.form-element input-email"));
	}
	
	private WebElement passwordField() {
		return driver.findElement(By.cssSelector("form.iaform login-form input.form-element input-password"));
	}
	
	private WebElement keepLogInCheckBox() {
		return driver.findElement(By.cssSelector("form.iaform login-form input.input-checkboxs"));
	}
	
	private WebElement showPasswordIcon() {
		return driver.findElement(By.cssSelector("form.iaform login-form img.password_icon"));
	}
	
	private WebElement logInButton() {
		return driver.findElement(By.cssSelector("form.iaform login-form img.password_icon"));
	}

	
//Actions
	
	public void enterEmail() {
		emailField().sendKeys("mirko.mirkovic@yahoo.com");
	}
	
	public void enterPassword() {
		passwordField().sendKeys("markovic");
	}
	
	public void clickOnCheckBox() {
		keepLogInCheckBox().click();	
	}
	
	public void clickLogInButton() {
		logInButton().click();
	}
	
}
