package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy(xpath= "//a[contains(text(),' Signup / Login')]")
	WebElement LOginLink;
	
	
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//WebDriver driver = this.driver;
	}
	
	public void clickSignUpLink() throws Exception {
		Thread.sleep(2000);
		LOginLink.click();
	}

}
