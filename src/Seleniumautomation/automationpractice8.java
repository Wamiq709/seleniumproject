package Seleniumautomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationpractice8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//mouse hover	
		WebElement electr=driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[3]/a[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(electr).perform();
		
		//explicit wait
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Electronic Sales']"))).click();
		//WebElement electsale=driver.findElement(By.xpath("//a[normalize-space()='Electronic Sales']")); //error -- element not interactable,we need to use time wait
		//electsale.click();
	}

}
