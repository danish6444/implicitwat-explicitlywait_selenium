package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
    // setting the property of chrome browser and passing chromedriver path
    System.setProperty("webdriver.chrome.driver","D:\\Training Materials\\workspace\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
    
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuf works");
    
    //handling auto suggetion
    List<WebElement> AllSuggetions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
    
    for (int i = 0; i< AllSuggetions.size(); i++) {
    	String expResult = "how stuff works quiz";
	if (AllSuggetions.get(i).getText().equalsIgnoreCase(expResult)) {
	AllSuggetions.get(i).click();
	break;
	}
	
	
	}
}
}
