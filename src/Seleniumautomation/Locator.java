package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://firstcrystore.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/ul/a[1]/li/span")).click();
		driver.findElement(By.name("email")).sendKeys("virat123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("virat123");
		//driver.findElement(By.className("submit-btn")).click();
		driver.navigate().back();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.quit();
	}

}
