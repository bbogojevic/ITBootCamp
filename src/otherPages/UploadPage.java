package otherPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	static WebDriver driver;
	public UploadPage (WebDriver driver) {
		this.driver = driver;
	}

		public WebElement logInButton() {
			return driver.findElement(By.cssSelector("a.buttonG btn btn-success"));
		}
		
		public WebElement liveLogInButton() {
			return driver.findElement(By.cssSelector("a.btn btn-primary"));
		}
		
		public WebElement questionMarkButton() {
			return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
		}

}
