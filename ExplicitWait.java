package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		//fatch inpiut box attribute value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));

		//get height for input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		
		//get width of input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//use ExplicitWait to check if password field is visible
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
		
		
		
		
	}

}
