package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy(xpath= "//a[contains(text(),' Signup / Login')]")
	WebElement LOginLink;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement NameTextField;
	
	@FindBy(xpath = "//h2[text()='New User Signup!']//following::input[3]")
	WebElement EmailTextField;
	
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//WebDriver driver = this.driver;
	}
	
	public void clickSignUpLink() throws Exception {
		Thread.sleep(2000);
		LOginLink.click();
	}
	
	public void enterUserName() throws Exception {
		Thread.sleep(1000);
		NameTextField.sendKeys("Vijay");
	}
	
	public void enterUserMailId() throws Exception {
		Thread.sleep(1000);
		EmailTextField.sendKeys("abghyt@gmail.com");
	}

}
