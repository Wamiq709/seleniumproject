package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		//Perform keyboard events
		WebElement copyarea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		//WebElement copyarea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[6]/pre")); //we can use xpath like this also(removed multiple div)
		Actions act= new Actions(driver);
		act.keyDown(copyarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform(); //copy text
		Thread.sleep(3000);
		WebElement pastearea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		act.keyDown(pastearea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();  //paste copied text
		
		
		

	}

}
