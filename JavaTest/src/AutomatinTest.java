import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatinTest {
	public static void main(String args[]) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Jars\\Jars\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseurl=("https://ethiodash.staging.wwcny.com/MTSWEBAPP/index.aspx");
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		//driver.quit();
	}

}
