package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Frames
		/*
		//driver.switchTo().frame(0); //selecting frame by index
		//driver.switchTo().frame("frame-one796456169"); //selecting frame by id
		WebElement iframe=driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(iframe);  //selecting frame by webelement
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("hello"); //this element is in selected frame
		//driver.switchTo().parentFrame();  //to move back to parent frame
		System.out.println(driver.getTitle()); 
		*/
		
		//Alerts
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click(); //alert with ok button only
		System.out.println(driver.switchTo().alert().getText()); //print text in alert box
		driver.switchTo().alert().accept(); //click ok
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click(); //alert with ok and cancel button
		System.out.println(driver.switchTo().alert().getText()); //print text in alert box
		driver.switchTo().alert().accept(); //click ok
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss(); //click cancel
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click(); // alert with input option and ok/cancel button
		System.out.println(driver.switchTo().alert().getText()); //print text in alert box
		driver.switchTo().alert().sendKeys("Wamique");
		driver.switchTo().alert().accept();
		
		
	}

}
