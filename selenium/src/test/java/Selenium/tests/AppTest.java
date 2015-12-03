package Selenium.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.webpages.AboutPage;
import Selenium.webpages.HomePage;

import static org.testng.Assert.*;
 
public class AppTest {
 
    static WebDriver driver;
 
    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void withNickname() {
    	
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        
        home.setNickname("klaudia");
        home.clickOnOkButton();
        home.clickOnOkButton();
        
        //Check if page is opened
        Assert.assertEquals(driver.getTitle(), "Tron Game");
        
        //Check if nickname is set
        Assert.assertFalse(home.isNickDefault());

        home.clickOnAboutButton();

        //Create object of AboutPage
        AboutPage about = new AboutPage(driver);

        //Check if page is opened
        Assert.assertTrue(about.isPageOpened());

    }
    
    @Test
    public void withErrorNickname() {
    	
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        
        home.setNickname("");
        home.clickOnOkButton();
        
        //Check if page is opened
        Assert.assertEquals(driver.getTitle(), "Tron Game");
        
        //Check if nickname is null
        Assert.assertTrue(home.isErrorVisible());
        
        Assert.assertEquals(driver.findElements(By.id("mainContent")).size(), 1);

    }
    
    @Test
    public void withoutNickname() {

        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        
        home.clickOnCancelButton();
        
        //Check if page is opened
        Assert.assertEquals(driver.getTitle(), "Tron Game");
        
        //Check if nickname is set
        Assert.assertTrue(home.isNickDefault());

    }
    
    @AfterMethod
    public void deleteCookies() throws InterruptedException{
    	driver.manage().deleteAllCookies();
    }
    
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
    
}