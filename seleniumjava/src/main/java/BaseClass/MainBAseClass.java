package BaseClass;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainBAseClass {

	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeClass
	public void loadData() throws IOException {
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("./Config/configr");
		prop.load(fis);
		
	}
	
	public void launchWebsite() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		System.out.println("Browser launches successfully");
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("baseURL"));
	}
	
	@AfterClass
	public void quit() {
		//driver.quit();
	}
}
