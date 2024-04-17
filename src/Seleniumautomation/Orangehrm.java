package Seleniumautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		//System.out.print(driver.getCurrentUrl());
		//driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement um=driver.findElement(By.name("username"));
		um.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();  //click on login
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();  //click on buzz
		Thread.sleep(3000);
		WebElement post= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.click();
		post.sendKeys("Lets start wamique");
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //click on post
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
				
		//driver.quit();
	}

}
