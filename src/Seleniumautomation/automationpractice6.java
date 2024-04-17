package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//right click
		/*
		WebElement rightclick=driver.findElement(By.xpath("//button[normalize-space()='Alert']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform(); //it will right click in alert button
		//act.contextClick().perform(); // it will right click any where the mouse is
    	 */
		
		//double click
		WebElement doubleclick=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		

	}

}
