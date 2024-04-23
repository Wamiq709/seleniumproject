package Seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice10screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement um=driver.findElement(By.name("username"));
		um.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin1234");		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();  //click on login
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\hp\\OneDrive\\Desktop\\New folder (3)\\New Volume\\uncodemy\\loginhrmscreenshot.png");
		FileUtils.copyFile(src,file);
		Thread.sleep(2000);

	}

}
