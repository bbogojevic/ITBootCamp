package iconsMenu;

import java.sql.DriverPropertyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownMenu {
	
		WebDriver driver;
		
		public DropDownMenu(WebDriver driver) {
			this.driver = driver;
		}
		
		private WebElement DropSearchText() {
			return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div/div[1]"));
		}
		
		private WebElement searchLogo() {
			return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div/div[2]/div/div[1]/a"));
		}
		
		private WebElement dropSearchBox() {
			return driver.findElement(By.cssSelector("input#nav-wb-url"));
		}
		
		private WebElement metMuseum() {
			return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/div/a"));
		}
		
		private WebElement brookMuseum() {
			return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/div/a"));
		}

		private WebElement metMuseumLink() {
			return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/a"));
		}
		
		private WebElement brookMuseumLink() {
			return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[6]/div[4]/div/center/a"));
		}

	//Actions

	
		
		public void searchArchiveBox(String searchTerm) {
			dropSearchBox().sendKeys(searchTerm);
		}
		
		public void pressEnterArchiveBox() {
			dropSearchBox().sendKeys(Keys.ENTER);
		}
		
		public void clickMetMuseum() {
			metMuseum().click();
		}	
		
		public void clickBrookMuseum() {
			brookMuseum().click();
		}
		
		public void clickMetMuseumLink() {
			metMuseumLink().click();		
		}
		
		public void clickBrookMuseumLink() {
			brookMuseumLink().click();		
		}
		
		public void windowBack() {
			driver.navigate().back();
		}
}
