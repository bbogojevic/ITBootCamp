package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jobs {
		static WebDriver driver;
		 public Jobs (WebDriver driver) {
			this.driver = driver;
		 }
		
	//Elements		
		
//		public static List<WebElement> amountButtons() {
//		    return driver.findElements(By.cssSelector("ul.donation-radio-list donationlevel span.hit-area"));
//	    }
		 
		 private WebElement jobsSearch() {
			 return driver.findElement(By.cssSelector("input#q"));
		 }
		 
		 private WebElement searchButtonJobs() {
			 return driver.findElement(By.cssSelector("a#btn_search_jobs"));
		 }
		 
		 
		 
		
		
}
