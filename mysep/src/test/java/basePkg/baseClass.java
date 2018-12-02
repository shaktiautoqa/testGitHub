package basePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	public WebDriver driver;
	
	@BeforeSuite
	public void toInvokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gsure.in");
		
	}
	
}
