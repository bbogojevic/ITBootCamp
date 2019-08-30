package Tests;

import org.testng.annotations.Test;

import iconsMenu.ArchiveURLs;
import iconsMenu.BaseClass;
import iconsMenu.DropDownMenu;
import iconsMenu.IconsMenu;
import iconsMenu.NavMenu;
import iconsMenu.TopCollections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
public class Test_Navigation extends BaseClass{

	public static final String SEARCH_TERM = "nesto";
	
	WebDriver driver;
	
	DropDownMenu dropMenu;
	IconsMenu iconsMenu;
	NavMenu navigationMenu;
	TopCollections topColl;
	
	
	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		iconsMenu = new IconsMenu(driver);
		dropMenu = new DropDownMenu(driver);
		navigationMenu = new NavMenu(driver);	
		topColl = new TopCollections(driver);		
	}
		
	@Test
	
	public void ArchiveTest() throws Exception {
		driver.navigate().to(ArchiveURLs.ARCHIVE_MAIN_PAGE);
		
	
		iconsMenu.clickOnLogo();
		dropMenu.searchArchiveBox(SEARCH_TERM);
		dropMenu.pressEnterArchiveBox();	
		
				
		iconsMenu.clickOnImage();
		iconsMenu.wait(2000);
		dropMenu.clickMetMuseum();		
		dropMenu.clickBrookMuseum();		
		dropMenu.clickMetMuseumLink();				
		}
     }


