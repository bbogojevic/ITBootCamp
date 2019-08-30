package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Donate {	
		static WebDriver driver;
		 public Donate (WebDriver driver) {
			this.driver = driver;
		 }
		
	//Elements		
		
		public static List<WebElement> amountButtons() {
		    return driver.findElements(By.cssSelector("ul.donation-radio-list donationlevel span.hit-area"));
	    }
}
