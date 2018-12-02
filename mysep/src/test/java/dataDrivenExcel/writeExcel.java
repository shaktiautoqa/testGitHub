package dataDrivenExcel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class writeExcel {

	@Test
	public void excelWriter() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\Automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		List<WebElement> colList = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
		int colCount = colList.size();
		for (int i = 0; i < colCount; i++) {
			WebElement companyName= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td[1]"));
			System.out.println(companyName);
		} 
		
	}

}
