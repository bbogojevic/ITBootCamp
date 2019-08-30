package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
	static WebDriver driver;
	
	public Contact (WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	


	private WebElement map1() {
		return driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/a[1]/img"));
	}
	
	private WebElement map2() {
		return driver.findElement(By.linkText("/html/body/div/main/div/div/div[2]/font/font/font/font/font/a[1]/img"));
	}
	
	//Actions
	
	public void clickMap1() {
		map1().click();
	}
	
	public void clickMap2() {
		map2().click();
	}
	
}
