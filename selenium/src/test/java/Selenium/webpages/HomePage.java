package Selenium.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
  
	@FindBy(id = "Nick")
	private WebElement welcomeText;

   //Page URL
   private static String PAGE_URL="http://localhost:8080";

   //Locators
   
   //Sweet Alert
   @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[6]/p")
   private WebElement errorMessage;
   
   @FindBy(how = How.XPATH, using = "/html/body/div[3]/fieldset/input")
   private WebElement nickName;
   
   //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[7]/div/button")
   //private WebElement OkButton;
   
   @FindBy(how = How.CLASS_NAME, using = "confirm")
   private WebElement OkButton;
   
   //Home Button
   @FindBy(how = How.LINK_TEXT, using = "Home")
   private WebElement HomeButton;

   //About Button
   @FindBy(how = How.LINK_TEXT, using = "About")
   private WebElement AboutButton;
   
   //Constructor
   public HomePage(WebDriver driver){
       this.driver=driver;
       driver.get(PAGE_URL);
       //Initialise Elements
       PageFactory.initElements(driver, this);
   }
   
   public void setNickname(String nick){
       nickName.clear();
       nickName.sendKeys(nick);
   }
   
   public void clickOnOkButton(){
       OkButton.click();
   }

   public void clickOnHomeButton(){
       HomeButton.click();
   }
   
   public void clickOnAboutButton(){
       AboutButton.click();
   }
	
	public boolean isNickDefault(){
		return welcomeText.getText().toString().contains("Welcome Stranger !");
	}
	
	public boolean isErrorVisible(){
		return errorMessage.getText().toString().contains("You need to write something!");
	}

}
