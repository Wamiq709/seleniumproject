package Seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice9 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//handle webtables
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")); //no. of rows
		System.out.println(rows.size());
		int rowsize = rows.size(); //storing row size in rowsize to use in iteration
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")); //no. of columns
		System.out.println(cols.size());
		int colsize = cols.size(); //storing row size in colsize to use in iteration
		
		for(int i=2; i<=rowsize;i++) {
			for(int j=1;j<=colsize;j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td["+ j +"]")).getText()+ "  ");
			}
			System.out.println();
		}
		
		
	}

}
