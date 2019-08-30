package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Blog {
	static WebDriver driver;
	
	public Blog (WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Elements
	
	public static List<WebElement> blogNav() {
    return driver.findElements(By.cssSelector("div#access"));
    }
	
	public static List<WebElement> socialNav() {
	    return driver.findElements(By.cssSelector("li#archive_sharing_widget-4 div.archive-sharing-widget"));
    }
	
	public static List<WebElement> archBlogList() {
	    return driver.findElements(By.cssSelector("#archives-dropdown-2"));
    }
	
	private WebElement searchFieldBlog() {
		return driver.findElement(By.xpath("//*[@id=\"s\"]"));
	}
	
	private WebElement searchButtonBlog() {
		return driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]"));
	}
	
	//Actions
	
	
	private WebElement fbButton() {
    	return socialNav().get(0);
    } 
	
	private WebElement tweetButton() {
    	return socialNav().get(1);
    } 
	
	public void clickFB() {
		fbButton().click();
	}
	
	public void clickTweet() {
		tweetButton().click();
	}
	
	public void enterTextSearchFieldBlog() {
		searchFieldBlog().sendKeys("");
	}
	
	public void clickSearchButtonBblog() {
		searchButtonBlog().click();		
	}
	
//	public void archiveBlogList(String month_year) {
//		Select archiveBlogList = new Select(driver.findElement(By));
//		archiveBlogList.selectByVisibleText(month_year);
//	}
	
	
	
	
	
	
	
}
