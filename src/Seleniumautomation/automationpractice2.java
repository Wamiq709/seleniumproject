package Seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationpractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//selecting dropdown
		WebElement dropdown =driver.findElement(By.id("country"));
		Select select= new Select(dropdown);
		WebElement firstoption=select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByValue("india");
		Thread.sleep(2000);
		select.selectByVisibleText("Australia");
		
		//selecting multiple dropdown
		/*WebElement dropdown =driver.findElement(By.id("colors"));
		Select select= new Select(dropdown);
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByValue("green");
		Thread.sleep(2000);
		List<WebElement> drpdwnsize=select.getAllSelectedOptions();
		System.out.println(drpdwnsize.size());
		select.deselectAll();
		
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByValue("green");
		Thread.sleep(2000);
		select.deselectByIndex(4);
		List<WebElement> drpdwnsize1=select.getAllSelectedOptions();
		System.out.println(drpdwnsize1.size());
		*/
		//auto suggest dropdown
		/*driver.get("https://www.youtube.com/");
		WebElement from=driver.findElement(By.xpath("//input[@id='search']"));
		from.click();
		Thread.sleep(2000);
		from.sendKeys("movie");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		*/
		//total no. of links in a page
		/*List<WebElement> alltags=driver.findElements(By.tagName("a"));
		System.out.println("Total tags: " + alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("Links on page url: "+alltags.get(i).getAttribute("href"));
			System.out.println("Links on page name: "+alltags.get(i).getText());
		}
		*/
		
		
		
		

	}

}
