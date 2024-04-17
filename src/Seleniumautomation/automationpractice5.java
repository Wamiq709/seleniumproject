package Seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.ebay.com.au/"); //used for mouse hover
		driver.manage().window().maximize();
		
		//mouse hover
		/*
		WebElement electr=driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[3]/a[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(electr).perform();
		*/
		
		//drag and drop
		/*
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		*/
		
		//Handle Resize boxes
		driver.get("https://testautomationpractice.blogspot.com/");
		/*
		WebElement resize=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.dragAndDropBy(resize, 150, 99).perform();
		*/
		
		//Slider
		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(slider, 100, 0).perform();
		
		
		

	}

}
