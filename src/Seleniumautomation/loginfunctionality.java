package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginfunctionality {
	WebDriver driver=new ChromeDriver();

	void login_navigate() throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	}	
	void buzz() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();  //click on buzz
		Thread.sleep(3000);
		WebElement post= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.click();
		post.sendKeys("Lets start");
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //click on post
		Thread.sleep(3000);
	}
	
}
