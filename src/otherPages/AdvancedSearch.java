package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch {
	static WebDriver driver;
	public AdvancedSearch (WebDriver driver) {
		this.driver = driver;
	}
	
	public static List<WebElement>anyFieldDropDown() {
	    return driver.findElements(By.name("any_type"));
    }
	
	public static List<WebElement>titleDropDown() {
	    return driver.findElements(By.name("title_type"));
    }
	
	public static List<WebElement>creatorDropDown() {
	    return driver.findElements(By.name("creator_type"));
    }
	
	public static List<WebElement>descriptionDropDown() {
	    return driver.findElements(By.name("description_type"));
    }
	
	public static List<WebElement>mediaDropDown() {
	    return driver.findElements(By.name("mediatype_type"));
    }
	
	public static List<WebElement>allMediaDropDown() {
	    return driver.findElements(By.name("mediatype_query"));
    }
	
	public static List<WebElement>contains1DropDown() {
	    return driver.findElements(By.name("optional_field1_type"));
    }
	
	public static List<WebElement>contains2DropDown() {
	    return driver.findElements(By.name("optional_field2_type"));
    }
	
	public static List<WebElement>contains3DropDown() {
	    return driver.findElements(By.name("optional_field3_type"));
    }
	
	public static List<WebElement>dateYearDropDown() {
	    return driver.findElements(By.name("date_year"));
    }
	
	public static List<WebElement>dateMonthDropDown() {
	    return driver.findElements(By.name("date_month"));
    }
	
	public static List<WebElement>dateDayDropDown() {
	    return driver.findElements(By.name("date_day"));
    }
	
	public static List<WebElement>yearRangeDropDown() {
	    return driver.findElements(By.name("date_from_year"));
    }
	
	public static List<WebElement>monthRangeDropDown() {
	    return driver.findElements(By.name("date_from_month"));
    }
	
	public static List<WebElement>dayRangeDropDown() {
	    return driver.findElements(By.name("date_from_day"));
    }
	
	public static List<WebElement>yearToRangeDropDown() {
	    return driver.findElements(By.name("date_to_year"));
    }
	
	public static List<WebElement>monthToRangeDropDown() {
	    return driver.findElements(By.name("date_to_month"));
    }
	
	public static List<WebElement>dayToRangeDropDown() {
	    return driver.findElements(By.name("date_to_day"));
    }
	
	private WebElement searchButton() {
		return driver.findElement(By.cssSelector("input.btn:nth-child(2)"));
	}
	
}
