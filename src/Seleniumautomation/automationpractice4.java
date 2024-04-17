package Seleniumautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String mainwindowid= driver.getWindowHandle();
		System.out.println(mainwindowid);
		
		//Handle multiple windows
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click(); //move to new window opencart
		
		//to work on multiple windows we have to use windowhandles and iterator to move in windows and automate them 
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(driver.getWindowHandles());
		
		Iterator<String> iterator=windowhandles.iterator();
		String parentwindow=iterator.next();
		System.out.println(parentwindow);
		
		String childwindow=iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow); 
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		

	}

}
