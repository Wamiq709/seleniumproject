package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodemy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions act = new Actions(driver);
		act.moveToElement(cat).perform(); // move cursor to categories
		
		WebElement softtest=driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		act.moveToElement(softtest).perform();
		
		WebElement manualtest=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
		manualtest.click();
	}

}
