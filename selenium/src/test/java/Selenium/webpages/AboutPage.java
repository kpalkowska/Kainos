package Selenium.webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	private WebDriver driver;

	@FindBy(xpath = "/html/body/div/h2")
	private WebElement heading;

	//Constructor
	public AboutPage (WebDriver driver){
		this.driver=driver;
	    //Initialise Elements
	    PageFactory.initElements(driver, this);
	}

	//We will use this boolean for assertion. To check if page is opened
	public boolean isPageOpened(){
		return heading.getText().toString().contains("How to play");
	}
}
